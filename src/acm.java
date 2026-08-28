import com.google.common.collect.Queues;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import com.mojang.brigadier.tree.ArgumentCommandNode;
import com.mojang.brigadier.tree.CommandNode;
import com.mojang.brigadier.tree.LiteralCommandNode;
import com.mojang.brigadier.tree.RootCommandNode;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import it.unimi.dsi.fastutil.ints.IntSet;
import it.unimi.dsi.fastutil.ints.IntSets;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntMaps;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import java.util.List;
import java.util.Queue;
import java.util.function.BiPredicate;
import javax.annotation.Nullable;

public class acm implements zf<abu> {
   public static final yw<vu, acm> a = zf.a(acm::a, acm::new);
   private static final byte b = 3;
   private static final byte c = 4;
   private static final byte d = 8;
   private static final byte e = 16;
   private static final byte f = 0;
   private static final byte g = 1;
   private static final byte h = 2;
   private final int i;
   private final List<acm.b> j;

   public acm(RootCommandNode<eo> $$0) {
      Object2IntMap<CommandNode<eo>> $$1 = a($$0);
      this.j = a($$1);
      this.i = $$1.getInt($$0);
   }

   private acm(vu $$0) {
      this.j = $$0.a(acm::b);
      this.i = $$0.l();
      a(this.j);
   }

   private void a(vu $$0) {
      $$0.a(this.j, ($$0x, $$1) -> $$1.a($$0x));
      $$0.c(this.i);
   }

   private static void a(List<acm.b> $$0, BiPredicate<acm.b, IntSet> $$1) {
      IntSet $$2 = new IntOpenHashSet(IntSets.fromTo(0, $$0.size()));

      while (!$$2.isEmpty()) {
         boolean $$3 = $$2.removeIf($$3x -> $$1.test($$0.get($$3x), $$2));
         if (!$$3) {
            throw new IllegalStateException("Server sent an impossible command tree");
         }
      }
   }

   private static void a(List<acm.b> $$0) {
      a($$0, acm.b::a);
      a($$0, acm.b::b);
   }

   private static Object2IntMap<CommandNode<eo>> a(RootCommandNode<eo> $$0) {
      Object2IntMap<CommandNode<eo>> $$1 = new Object2IntOpenHashMap();
      Queue<CommandNode<eo>> $$2 = Queues.newArrayDeque();
      $$2.add($$0);

      CommandNode<eo> $$3;
      while (($$3 = $$2.poll()) != null) {
         if (!$$1.containsKey($$3)) {
            int $$4 = $$1.size();
            $$1.put($$3, $$4);
            $$2.addAll($$3.getChildren());
            if ($$3.getRedirect() != null) {
               $$2.add($$3.getRedirect());
            }
         }
      }

      return $$1;
   }

   private static List<acm.b> a(Object2IntMap<CommandNode<eo>> $$0) {
      ObjectArrayList<acm.b> $$1 = new ObjectArrayList($$0.size());
      $$1.size($$0.size());
      ObjectIterator var2 = Object2IntMaps.fastIterable($$0).iterator();

      while (var2.hasNext()) {
         Entry<CommandNode<eo>> $$2 = (Entry<CommandNode<eo>>)var2.next();
         $$1.set($$2.getIntValue(), a((CommandNode<eo>)$$2.getKey(), $$0));
      }

      return $$1;
   }

   private static acm.b b(vu $$0) {
      byte $$1 = $$0.readByte();
      int[] $$2 = $$0.c();
      int $$3 = ($$1 & 8) != 0 ? $$0.l() : 0;
      acm.e $$4 = a($$0, $$1);
      return new acm.b($$4, $$1, $$3, $$2);
   }

   @Nullable
   private static acm.e a(vu $$0, byte $$1) {
      int $$2 = $$1 & 3;
      if ($$2 == 2) {
         String $$3 = $$0.p();
         int $$4 = $$0.l();
         ig<?, ?> $$5 = mg.u.a($$4);
         if ($$5 == null) {
            return null;
         } else {
            ig.a<?> $$6 = $$5.b($$0);
            alg $$7 = ($$1 & 16) != 0 ? $$0.q() : null;
            return new acm.a($$3, $$6, $$7);
         }
      } else if ($$2 == 1) {
         String $$8 = $$0.p();
         return new acm.c($$8);
      } else {
         return null;
      }
   }

   private static acm.b a(CommandNode<eo> $$0, Object2IntMap<CommandNode<eo>> $$1) {
      int $$2 = 0;
      int $$3;
      if ($$0.getRedirect() != null) {
         $$2 |= 8;
         $$3 = $$1.getInt($$0.getRedirect());
      } else {
         $$3 = 0;
      }

      if ($$0.getCommand() != null) {
         $$2 |= 4;
      }

      acm.e $$5;
      if ($$0 instanceof RootCommandNode) {
         $$2 |= 0;
         $$5 = null;
      } else if ($$0 instanceof ArgumentCommandNode<eo, ?> $$6) {
         $$5 = new acm.a($$6);
         $$2 |= 2;
         if ($$6.getCustomSuggestions() != null) {
            $$2 |= 16;
         }
      } else {
         if (!($$0 instanceof LiteralCommandNode $$8)) {
            throw new UnsupportedOperationException("Unknown node type " + $$0);
         }

         $$5 = new acm.c($$8.getLiteral());
         $$2 |= 1;
      }

      int[] $$11 = $$0.getChildren().stream().mapToInt($$1::getInt).toArray();
      return new acm.b($$5, $$2, $$3, $$11);
   }

   @Override
   public zh<acm> a() {
      return agn.r;
   }

   public void a(abu $$0) {
      $$0.a(this);
   }

   public RootCommandNode<eo> a(ef $$0) {
      return (RootCommandNode<eo>)new acm.d($$0, this.j).a(this.i);
   }

   static class a implements acm.e {
      private final String a;
      private final ig.a<?> b;
      @Nullable
      private final alg c;

      @Nullable
      private static alg a(@Nullable SuggestionProvider<eo> $$0) {
         return $$0 != null ? ik.a($$0) : null;
      }

      a(String $$0, ig.a<?> $$1, @Nullable alg $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public a(ArgumentCommandNode<eo, ?> $$0) {
         this($$0.getName(), ih.b($$0.getType()), a($$0.getCustomSuggestions()));
      }

      @Override
      public ArgumentBuilder<eo, ?> a(ef $$0) {
         ArgumentType<?> $$1 = this.b.b($$0);
         RequiredArgumentBuilder<eo, ?> $$2 = RequiredArgumentBuilder.argument(this.a, $$1);
         if (this.c != null) {
            $$2.suggests(ik.a(this.c));
         }

         return $$2;
      }

      @Override
      public void a(vu $$0) {
         $$0.a(this.a);
         a($$0, this.b);
         if (this.c != null) {
            $$0.a(this.c);
         }
      }

      private static <A extends ArgumentType<?>> void a(vu $$0, ig.a<A> $$1) {
         a($$0, $$1.a(), $$1);
      }

      private static <A extends ArgumentType<?>, T extends ig.a<A>> void a(vu $$0, ig<A, T> $$1, ig.a<A> $$2) {
         $$0.c(mg.u.a($$1));
         $$1.a((T)$$2, $$0);
      }
   }

   static class b {
      @Nullable
      final acm.e a;
      final int b;
      final int c;
      final int[] d;

      b(@Nullable acm.e $$0, int $$1, int $$2, int[] $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public void a(vu $$0) {
         $$0.l(this.b);
         $$0.a(this.d);
         if ((this.b & 8) != 0) {
            $$0.c(this.c);
         }

         if (this.a != null) {
            this.a.a($$0);
         }
      }

      public boolean a(IntSet $$0) {
         return (this.b & 8) != 0 ? !$$0.contains(this.c) : true;
      }

      public boolean b(IntSet $$0) {
         for (int $$1 : this.d) {
            if ($$0.contains($$1)) {
               return false;
            }
         }

         return true;
      }
   }

   static class c implements acm.e {
      private final String a;

      c(String $$0) {
         this.a = $$0;
      }

      @Override
      public ArgumentBuilder<eo, ?> a(ef $$0) {
         return LiteralArgumentBuilder.literal(this.a);
      }

      @Override
      public void a(vu $$0) {
         $$0.a(this.a);
      }
   }

   static class d {
      private final ef a;
      private final List<acm.b> b;
      private final List<CommandNode<eo>> c;

      d(ef $$0, List<acm.b> $$1) {
         this.a = $$0;
         this.b = $$1;
         ObjectArrayList<CommandNode<eo>> $$2 = new ObjectArrayList();
         $$2.size($$1.size());
         this.c = $$2;
      }

      public CommandNode<eo> a(int $$0) {
         CommandNode<eo> $$1 = this.c.get($$0);
         if ($$1 != null) {
            return $$1;
         } else {
            acm.b $$2 = this.b.get($$0);
            CommandNode<eo> $$3;
            if ($$2.a == null) {
               $$3 = new RootCommandNode();
            } else {
               ArgumentBuilder<eo, ?> $$4 = $$2.a.a(this.a);
               if (($$2.b & 8) != 0) {
                  $$4.redirect(this.a($$2.c));
               }

               if (($$2.b & 4) != 0) {
                  $$4.executes($$0x -> 0);
               }

               $$3 = $$4.build();
            }

            this.c.set($$0, $$3);

            for (int $$6 : $$2.d) {
               CommandNode<eo> $$7 = this.a($$6);
               if (!($$7 instanceof RootCommandNode)) {
                  $$3.addChild($$7);
               }
            }

            return $$3;
         }
      }
   }

   interface e {
      ArgumentBuilder<eo, ?> a(ef var1);

      void a(vu var1);
   }
}
