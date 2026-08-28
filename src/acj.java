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

public class acj implements zc<abr> {
   public static final yt<vr, acj> a = zc.a(acj::a, acj::new);
   private static final byte b = 3;
   private static final byte c = 4;
   private static final byte d = 8;
   private static final byte e = 16;
   private static final byte f = 0;
   private static final byte g = 1;
   private static final byte h = 2;
   private final int i;
   private final List<acj.b> j;

   public acj(RootCommandNode<fc> $$0) {
      Object2IntMap<CommandNode<fc>> $$1 = a($$0);
      this.j = a($$1);
      this.i = $$1.getInt($$0);
   }

   private acj(vr $$0) {
      this.j = $$0.a(acj::b);
      this.i = $$0.l();
      a(this.j);
   }

   private void a(vr $$0) {
      $$0.a(this.j, ($$0x, $$1) -> $$1.a($$0x));
      $$0.c(this.i);
   }

   private static void a(List<acj.b> $$0, BiPredicate<acj.b, IntSet> $$1) {
      IntSet $$2 = new IntOpenHashSet(IntSets.fromTo(0, $$0.size()));

      while (!$$2.isEmpty()) {
         boolean $$3 = $$2.removeIf($$3x -> $$1.test($$0.get($$3x), $$2));
         if (!$$3) {
            throw new IllegalStateException("Server sent an impossible command tree");
         }
      }
   }

   private static void a(List<acj.b> $$0) {
      a($$0, acj.b::a);
      a($$0, acj.b::b);
   }

   private static Object2IntMap<CommandNode<fc>> a(RootCommandNode<fc> $$0) {
      Object2IntMap<CommandNode<fc>> $$1 = new Object2IntOpenHashMap();
      Queue<CommandNode<fc>> $$2 = Queues.newArrayDeque();
      $$2.add($$0);

      CommandNode<fc> $$3;
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

   private static List<acj.b> a(Object2IntMap<CommandNode<fc>> $$0) {
      ObjectArrayList<acj.b> $$1 = new ObjectArrayList($$0.size());
      $$1.size($$0.size());
      ObjectIterator var2 = Object2IntMaps.fastIterable($$0).iterator();

      while (var2.hasNext()) {
         Entry<CommandNode<fc>> $$2 = (Entry<CommandNode<fc>>)var2.next();
         $$1.set($$2.getIntValue(), a((CommandNode<fc>)$$2.getKey(), $$0));
      }

      return $$1;
   }

   private static acj.b b(vr $$0) {
      byte $$1 = $$0.readByte();
      int[] $$2 = $$0.c();
      int $$3 = ($$1 & 8) != 0 ? $$0.l() : 0;
      acj.e $$4 = a($$0, $$1);
      return new acj.b($$4, $$1, $$3, $$2);
   }

   @Nullable
   private static acj.e a(vr $$0, byte $$1) {
      int $$2 = $$1 & 3;
      if ($$2 == 2) {
         String $$3 = $$0.p();
         int $$4 = $$0.l();
         iu<?, ?> $$5 = md.u.a($$4);
         if ($$5 == null) {
            return null;
         } else {
            iu.a<?> $$6 = $$5.b($$0);
            ald $$7 = ($$1 & 16) != 0 ? $$0.q() : null;
            return new acj.a($$3, $$6, $$7);
         }
      } else if ($$2 == 1) {
         String $$8 = $$0.p();
         return new acj.c($$8);
      } else {
         return null;
      }
   }

   private static acj.b a(CommandNode<fc> $$0, Object2IntMap<CommandNode<fc>> $$1) {
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

      acj.e $$5;
      if ($$0 instanceof RootCommandNode) {
         $$2 |= 0;
         $$5 = null;
      } else if ($$0 instanceof ArgumentCommandNode<fc, ?> $$6) {
         $$5 = new acj.a($$6);
         $$2 |= 2;
         if ($$6.getCustomSuggestions() != null) {
            $$2 |= 16;
         }
      } else {
         if (!($$0 instanceof LiteralCommandNode $$8)) {
            throw new UnsupportedOperationException("Unknown node type " + $$0);
         }

         $$5 = new acj.c($$8.getLiteral());
         $$2 |= 1;
      }

      int[] $$11 = $$0.getChildren().stream().mapToInt($$1::getInt).toArray();
      return new acj.b($$5, $$2, $$3, $$11);
   }

   @Override
   public ze<acj> a() {
      return agk.r;
   }

   public void a(abr $$0) {
      $$0.a(this);
   }

   public RootCommandNode<fc> a(et $$0) {
      return (RootCommandNode<fc>)new acj.d($$0, this.j).a(this.i);
   }

   static class a implements acj.e {
      private final String a;
      private final iu.a<?> b;
      @Nullable
      private final ald c;

      @Nullable
      private static ald a(@Nullable SuggestionProvider<fc> $$0) {
         return $$0 != null ? iy.a($$0) : null;
      }

      a(String $$0, iu.a<?> $$1, @Nullable ald $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public a(ArgumentCommandNode<fc, ?> $$0) {
         this($$0.getName(), iv.b($$0.getType()), a($$0.getCustomSuggestions()));
      }

      @Override
      public ArgumentBuilder<fc, ?> a(et $$0) {
         ArgumentType<?> $$1 = this.b.b($$0);
         RequiredArgumentBuilder<fc, ?> $$2 = RequiredArgumentBuilder.argument(this.a, $$1);
         if (this.c != null) {
            $$2.suggests(iy.a(this.c));
         }

         return $$2;
      }

      @Override
      public void a(vr $$0) {
         $$0.a(this.a);
         a($$0, this.b);
         if (this.c != null) {
            $$0.a(this.c);
         }
      }

      private static <A extends ArgumentType<?>> void a(vr $$0, iu.a<A> $$1) {
         a($$0, $$1.a(), $$1);
      }

      private static <A extends ArgumentType<?>, T extends iu.a<A>> void a(vr $$0, iu<A, T> $$1, iu.a<A> $$2) {
         $$0.c(md.u.a($$1));
         $$1.a((T)$$2, $$0);
      }
   }

   static class b {
      @Nullable
      final acj.e a;
      final int b;
      final int c;
      final int[] d;

      b(@Nullable acj.e $$0, int $$1, int $$2, int[] $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public void a(vr $$0) {
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

   static class c implements acj.e {
      private final String a;

      c(String $$0) {
         this.a = $$0;
      }

      @Override
      public ArgumentBuilder<fc, ?> a(et $$0) {
         return LiteralArgumentBuilder.literal(this.a);
      }

      @Override
      public void a(vr $$0) {
         $$0.a(this.a);
      }
   }

   static class d {
      private final et a;
      private final List<acj.b> b;
      private final List<CommandNode<fc>> c;

      d(et $$0, List<acj.b> $$1) {
         this.a = $$0;
         this.b = $$1;
         ObjectArrayList<CommandNode<fc>> $$2 = new ObjectArrayList();
         $$2.size($$1.size());
         this.c = $$2;
      }

      public CommandNode<fc> a(int $$0) {
         CommandNode<fc> $$1 = this.c.get($$0);
         if ($$1 != null) {
            return $$1;
         } else {
            acj.b $$2 = this.b.get($$0);
            CommandNode<fc> $$3;
            if ($$2.a == null) {
               $$3 = new RootCommandNode();
            } else {
               ArgumentBuilder<fc, ?> $$4 = $$2.a.a(this.a);
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
               CommandNode<fc> $$7 = this.a($$6);
               if (!($$7 instanceof RootCommandNode)) {
                  $$3.addChild($$7);
               }
            }

            return $$3;
         }
      }
   }

   interface e {
      ArgumentBuilder<fc, ?> a(et var1);

      void a(vr var1);
   }
}
