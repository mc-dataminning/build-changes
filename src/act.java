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

public class act implements zl<aca> {
   public static final zc<wb, act> a = zl.a(act::a, act::new);
   private static final byte b = 3;
   private static final byte c = 4;
   private static final byte d = 8;
   private static final byte e = 16;
   private static final byte f = 0;
   private static final byte g = 1;
   private static final byte h = 2;
   private final int i;
   private final List<act.b> j;

   public act(RootCommandNode<ez> $$0) {
      Object2IntMap<CommandNode<ez>> $$1 = a($$0);
      this.j = a($$1);
      this.i = $$1.getInt($$0);
   }

   private act(wb $$0) {
      this.j = $$0.a(act::b);
      this.i = $$0.l();
      a(this.j);
   }

   private void a(wb $$0) {
      $$0.a(this.j, ($$0x, $$1) -> $$1.a($$0x));
      $$0.c(this.i);
   }

   private static void a(List<act.b> $$0, BiPredicate<act.b, IntSet> $$1) {
      IntSet $$2 = new IntOpenHashSet(IntSets.fromTo(0, $$0.size()));

      while (!$$2.isEmpty()) {
         boolean $$3 = $$2.removeIf($$3x -> $$1.test($$0.get($$3x), $$2));
         if (!$$3) {
            throw new IllegalStateException("Server sent an impossible command tree");
         }
      }
   }

   private static void a(List<act.b> $$0) {
      a($$0, act.b::a);
      a($$0, act.b::b);
   }

   private static Object2IntMap<CommandNode<ez>> a(RootCommandNode<ez> $$0) {
      Object2IntMap<CommandNode<ez>> $$1 = new Object2IntOpenHashMap();
      Queue<CommandNode<ez>> $$2 = Queues.newArrayDeque();
      $$2.add($$0);

      CommandNode<ez> $$3;
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

   private static List<act.b> a(Object2IntMap<CommandNode<ez>> $$0) {
      ObjectArrayList<act.b> $$1 = new ObjectArrayList($$0.size());
      $$1.size($$0.size());
      ObjectIterator var2 = Object2IntMaps.fastIterable($$0).iterator();

      while (var2.hasNext()) {
         Entry<CommandNode<ez>> $$2 = (Entry<CommandNode<ez>>)var2.next();
         $$1.set($$2.getIntValue(), a((CommandNode<ez>)$$2.getKey(), $$0));
      }

      return $$1;
   }

   private static act.b b(wb $$0) {
      byte $$1 = $$0.readByte();
      int[] $$2 = $$0.c();
      int $$3 = ($$1 & 8) != 0 ? $$0.l() : 0;
      act.e $$4 = a($$0, $$1);
      return new act.b($$4, $$1, $$3, $$2);
   }

   @Nullable
   private static act.e a(wb $$0, byte $$1) {
      int $$2 = $$1 & 3;
      if ($$2 == 2) {
         String $$3 = $$0.p();
         int $$4 = $$0.l();
         iq<?, ?> $$5 = lv.u.a($$4);
         if ($$5 == null) {
            return null;
         } else {
            iq.a<?> $$6 = $$5.b($$0);
            ale $$7 = ($$1 & 16) != 0 ? $$0.q() : null;
            return new act.a($$3, $$6, $$7);
         }
      } else if ($$2 == 1) {
         String $$8 = $$0.p();
         return new act.c($$8);
      } else {
         return null;
      }
   }

   private static act.b a(CommandNode<ez> $$0, Object2IntMap<CommandNode<ez>> $$1) {
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

      act.e $$5;
      if ($$0 instanceof RootCommandNode) {
         $$2 |= 0;
         $$5 = null;
      } else if ($$0 instanceof ArgumentCommandNode<ez, ?> $$6) {
         $$5 = new act.a($$6);
         $$2 |= 2;
         if ($$6.getCustomSuggestions() != null) {
            $$2 |= 16;
         }
      } else {
         if (!($$0 instanceof LiteralCommandNode $$8)) {
            throw new UnsupportedOperationException("Unknown node type " + $$0);
         }

         $$5 = new act.c($$8.getLiteral());
         $$2 |= 1;
      }

      int[] $$11 = $$0.getChildren().stream().mapToInt($$1::getInt).toArray();
      return new act.b($$5, $$2, $$3, $$11);
   }

   @Override
   public zn<act> a() {
      return agp.s;
   }

   public void a(aca $$0) {
      $$0.a(this);
   }

   public RootCommandNode<ez> a(eq $$0) {
      return (RootCommandNode<ez>)new act.d($$0, this.j).a(this.i);
   }

   static class a implements act.e {
      private final String a;
      private final iq.a<?> b;
      @Nullable
      private final ale c;

      @Nullable
      private static ale a(@Nullable SuggestionProvider<ez> $$0) {
         return $$0 != null ? iu.a($$0) : null;
      }

      a(String $$0, iq.a<?> $$1, @Nullable ale $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public a(ArgumentCommandNode<ez, ?> $$0) {
         this($$0.getName(), ir.b($$0.getType()), a($$0.getCustomSuggestions()));
      }

      @Override
      public ArgumentBuilder<ez, ?> a(eq $$0) {
         ArgumentType<?> $$1 = this.b.b($$0);
         RequiredArgumentBuilder<ez, ?> $$2 = RequiredArgumentBuilder.argument(this.a, $$1);
         if (this.c != null) {
            $$2.suggests(iu.a(this.c));
         }

         return $$2;
      }

      @Override
      public void a(wb $$0) {
         $$0.a(this.a);
         a($$0, this.b);
         if (this.c != null) {
            $$0.a(this.c);
         }
      }

      private static <A extends ArgumentType<?>> void a(wb $$0, iq.a<A> $$1) {
         a($$0, $$1.a(), $$1);
      }

      private static <A extends ArgumentType<?>, T extends iq.a<A>> void a(wb $$0, iq<A, T> $$1, iq.a<A> $$2) {
         $$0.c(lv.u.a($$1));
         $$1.a((T)$$2, $$0);
      }
   }

   static class b {
      @Nullable
      final act.e a;
      final int b;
      final int c;
      final int[] d;

      b(@Nullable act.e $$0, int $$1, int $$2, int[] $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public void a(wb $$0) {
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

   static class c implements act.e {
      private final String a;

      c(String $$0) {
         this.a = $$0;
      }

      @Override
      public ArgumentBuilder<ez, ?> a(eq $$0) {
         return LiteralArgumentBuilder.literal(this.a);
      }

      @Override
      public void a(wb $$0) {
         $$0.a(this.a);
      }
   }

   static class d {
      private final eq a;
      private final List<act.b> b;
      private final List<CommandNode<ez>> c;

      d(eq $$0, List<act.b> $$1) {
         this.a = $$0;
         this.b = $$1;
         ObjectArrayList<CommandNode<ez>> $$2 = new ObjectArrayList();
         $$2.size($$1.size());
         this.c = $$2;
      }

      public CommandNode<ez> a(int $$0) {
         CommandNode<ez> $$1 = this.c.get($$0);
         if ($$1 != null) {
            return $$1;
         } else {
            act.b $$2 = this.b.get($$0);
            CommandNode<ez> $$3;
            if ($$2.a == null) {
               $$3 = new RootCommandNode();
            } else {
               ArgumentBuilder<ez, ?> $$4 = $$2.a.a(this.a);
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
               CommandNode<ez> $$7 = this.a($$6);
               if (!($$7 instanceof RootCommandNode)) {
                  $$3.addChild($$7);
               }
            }

            return $$3;
         }
      }
   }

   interface e {
      ArgumentBuilder<ez, ?> a(eq var1);

      void a(wb var1);
   }
}
