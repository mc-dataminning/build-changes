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

public class aaz implements xx<aag> {
   public static final xo<uq, aaz> a = xx.a(aaz::a, aaz::new);
   private static final byte b = 3;
   private static final byte c = 4;
   private static final byte d = 8;
   private static final byte e = 16;
   private static final byte f = 0;
   private static final byte g = 1;
   private static final byte h = 2;
   private final int i;
   private final List<aaz.b> j;

   public aaz(RootCommandNode<dz> $$0) {
      Object2IntMap<CommandNode<dz>> $$1 = a($$0);
      this.j = a($$1);
      this.i = $$1.getInt($$0);
   }

   private aaz(uq $$0) {
      this.j = $$0.a(aaz::b);
      this.i = $$0.n();
      a(this.j);
   }

   private void a(uq $$0) {
      $$0.a(this.j, ($$0x, $$1) -> $$1.a($$0x));
      $$0.c(this.i);
   }

   private static void a(List<aaz.b> $$0, BiPredicate<aaz.b, IntSet> $$1) {
      IntSet $$2 = new IntOpenHashSet(IntSets.fromTo(0, $$0.size()));

      while (!$$2.isEmpty()) {
         boolean $$3 = $$2.removeIf($$3x -> $$1.test($$0.get($$3x), $$2));
         if (!$$3) {
            throw new IllegalStateException("Server sent an impossible command tree");
         }
      }
   }

   private static void a(List<aaz.b> $$0) {
      a($$0, aaz.b::a);
      a($$0, aaz.b::b);
   }

   private static Object2IntMap<CommandNode<dz>> a(RootCommandNode<dz> $$0) {
      Object2IntMap<CommandNode<dz>> $$1 = new Object2IntOpenHashMap();
      Queue<CommandNode<dz>> $$2 = Queues.newArrayDeque();
      $$2.add($$0);

      CommandNode<dz> $$3;
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

   private static List<aaz.b> a(Object2IntMap<CommandNode<dz>> $$0) {
      ObjectArrayList<aaz.b> $$1 = new ObjectArrayList($$0.size());
      $$1.size($$0.size());
      ObjectIterator var2 = Object2IntMaps.fastIterable($$0).iterator();

      while (var2.hasNext()) {
         Entry<CommandNode<dz>> $$2 = (Entry<CommandNode<dz>>)var2.next();
         $$1.set($$2.getIntValue(), a((CommandNode<dz>)$$2.getKey(), $$0));
      }

      return $$1;
   }

   private static aaz.b b(uq $$0) {
      byte $$1 = $$0.readByte();
      int[] $$2 = $$0.c();
      int $$3 = ($$1 & 8) != 0 ? $$0.n() : 0;
      aaz.e $$4 = a($$0, $$1);
      return new aaz.b($$4, $$1, $$3, $$2);
   }

   @Nullable
   private static aaz.e a(uq $$0, byte $$1) {
      int $$2 = $$1 & 3;
      if ($$2 == 2) {
         String $$3 = $$0.r();
         int $$4 = $$0.n();
         hl<?, ?> $$5 = kf.w.a($$4);
         if ($$5 == null) {
            return null;
         } else {
            hl.a<?> $$6 = $$5.b($$0);
            aiy $$7 = ($$1 & 16) != 0 ? $$0.s() : null;
            return new aaz.a($$3, $$6, $$7);
         }
      } else if ($$2 == 1) {
         String $$8 = $$0.r();
         return new aaz.c($$8);
      } else {
         return null;
      }
   }

   private static aaz.b a(CommandNode<dz> $$0, Object2IntMap<CommandNode<dz>> $$1) {
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

      aaz.e $$5;
      if ($$0 instanceof RootCommandNode) {
         $$2 |= 0;
         $$5 = null;
      } else if ($$0 instanceof ArgumentCommandNode<dz, ?> $$6) {
         $$5 = new aaz.a($$6);
         $$2 |= 2;
         if ($$6.getCustomSuggestions() != null) {
            $$2 |= 16;
         }
      } else {
         if (!($$0 instanceof LiteralCommandNode $$8)) {
            throw new UnsupportedOperationException("Unknown node type " + $$0);
         }

         $$5 = new aaz.c($$8.getLiteral());
         $$2 |= 1;
      }

      int[] $$11 = $$0.getChildren().stream().mapToInt($$1::getInt).toArray();
      return new aaz.b($$5, $$2, $$3, $$11);
   }

   @Override
   public xz<aaz> a() {
      return aeq.s;
   }

   public void a(aag $$0) {
      $$0.a(this);
   }

   public RootCommandNode<dz> a(dq $$0) {
      return (RootCommandNode<dz>)new aaz.d($$0, this.j).a(this.i);
   }

   static class a implements aaz.e {
      private final String a;
      private final hl.a<?> b;
      @Nullable
      private final aiy c;

      @Nullable
      private static aiy a(@Nullable SuggestionProvider<dz> $$0) {
         return $$0 != null ? hp.a($$0) : null;
      }

      a(String $$0, hl.a<?> $$1, @Nullable aiy $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public a(ArgumentCommandNode<dz, ?> $$0) {
         this($$0.getName(), hm.b($$0.getType()), a($$0.getCustomSuggestions()));
      }

      @Override
      public ArgumentBuilder<dz, ?> a(dq $$0) {
         ArgumentType<?> $$1 = this.b.b($$0);
         RequiredArgumentBuilder<dz, ?> $$2 = RequiredArgumentBuilder.argument(this.a, $$1);
         if (this.c != null) {
            $$2.suggests(hp.a(this.c));
         }

         return $$2;
      }

      @Override
      public void a(uq $$0) {
         $$0.a(this.a);
         a($$0, this.b);
         if (this.c != null) {
            $$0.a(this.c);
         }
      }

      private static <A extends ArgumentType<?>> void a(uq $$0, hl.a<A> $$1) {
         a($$0, $$1.a(), $$1);
      }

      private static <A extends ArgumentType<?>, T extends hl.a<A>> void a(uq $$0, hl<A, T> $$1, hl.a<A> $$2) {
         $$0.c(kf.w.a($$1));
         $$1.a((T)$$2, $$0);
      }
   }

   static class b {
      @Nullable
      final aaz.e a;
      final int b;
      final int c;
      final int[] d;

      b(@Nullable aaz.e $$0, int $$1, int $$2, int[] $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public void a(uq $$0) {
         $$0.k(this.b);
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

   static class c implements aaz.e {
      private final String a;

      c(String $$0) {
         this.a = $$0;
      }

      @Override
      public ArgumentBuilder<dz, ?> a(dq $$0) {
         return LiteralArgumentBuilder.literal(this.a);
      }

      @Override
      public void a(uq $$0) {
         $$0.a(this.a);
      }
   }

   static class d {
      private final dq a;
      private final List<aaz.b> b;
      private final List<CommandNode<dz>> c;

      d(dq $$0, List<aaz.b> $$1) {
         this.a = $$0;
         this.b = $$1;
         ObjectArrayList<CommandNode<dz>> $$2 = new ObjectArrayList();
         $$2.size($$1.size());
         this.c = $$2;
      }

      public CommandNode<dz> a(int $$0) {
         CommandNode<dz> $$1 = this.c.get($$0);
         if ($$1 != null) {
            return $$1;
         } else {
            aaz.b $$2 = this.b.get($$0);
            CommandNode<dz> $$3;
            if ($$2.a == null) {
               $$3 = new RootCommandNode();
            } else {
               ArgumentBuilder<dz, ?> $$4 = $$2.a.a(this.a);
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
               CommandNode<dz> $$7 = this.a($$6);
               if (!($$7 instanceof RootCommandNode)) {
                  $$3.addChild($$7);
               }
            }

            return $$3;
         }
      }
   }

   interface e {
      ArgumentBuilder<dz, ?> a(dq var1);

      void a(uq var1);
   }
}
