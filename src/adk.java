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

public class adk implements aac<acr> {
   public static final zt<ws, adk> a = aac.a(adk::a, adk::new);
   private static final byte b = 3;
   private static final byte c = 4;
   private static final byte d = 8;
   private static final byte e = 16;
   private static final byte f = 0;
   private static final byte g = 1;
   private static final byte h = 2;
   private final int i;
   private final List<adk.b> j;

   public adk(RootCommandNode<fb> $$0) {
      Object2IntMap<CommandNode<fb>> $$1 = a($$0);
      this.j = a($$1);
      this.i = $$1.getInt($$0);
   }

   private adk(ws $$0) {
      this.j = $$0.a(adk::b);
      this.i = $$0.l();
      a(this.j);
   }

   private void a(ws $$0) {
      $$0.a(this.j, ($$0x, $$1) -> $$1.a($$0x));
      $$0.c(this.i);
   }

   private static void a(List<adk.b> $$0, BiPredicate<adk.b, IntSet> $$1) {
      IntSet $$2 = new IntOpenHashSet(IntSets.fromTo(0, $$0.size()));

      while (!$$2.isEmpty()) {
         boolean $$3 = $$2.removeIf($$3x -> $$1.test($$0.get($$3x), $$2));
         if (!$$3) {
            throw new IllegalStateException("Server sent an impossible command tree");
         }
      }
   }

   private static void a(List<adk.b> $$0) {
      a($$0, adk.b::a);
      a($$0, adk.b::b);
   }

   private static Object2IntMap<CommandNode<fb>> a(RootCommandNode<fb> $$0) {
      Object2IntMap<CommandNode<fb>> $$1 = new Object2IntOpenHashMap();
      Queue<CommandNode<fb>> $$2 = Queues.newArrayDeque();
      $$2.add($$0);

      CommandNode<fb> $$3;
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

   private static List<adk.b> a(Object2IntMap<CommandNode<fb>> $$0) {
      ObjectArrayList<adk.b> $$1 = new ObjectArrayList($$0.size());
      $$1.size($$0.size());
      ObjectIterator var2 = Object2IntMaps.fastIterable($$0).iterator();

      while (var2.hasNext()) {
         Entry<CommandNode<fb>> $$2 = (Entry<CommandNode<fb>>)var2.next();
         $$1.set($$2.getIntValue(), a((CommandNode<fb>)$$2.getKey(), $$0));
      }

      return $$1;
   }

   private static adk.b b(ws $$0) {
      byte $$1 = $$0.readByte();
      int[] $$2 = $$0.c();
      int $$3 = ($$1 & 8) != 0 ? $$0.l() : 0;
      adk.e $$4 = a($$0, $$1);
      return new adk.b($$4, $$1, $$3, $$2);
   }

   @Nullable
   private static adk.e a(ws $$0, byte $$1) {
      int $$2 = $$1 & 3;
      if ($$2 == 2) {
         String $$3 = $$0.p();
         int $$4 = $$0.l();
         is<?, ?> $$5 = ma.u.a($$4);
         if ($$5 == null) {
            return null;
         } else {
            is.a<?> $$6 = $$5.b($$0);
            alz $$7 = ($$1 & 16) != 0 ? $$0.q() : null;
            return new adk.a($$3, $$6, $$7);
         }
      } else if ($$2 == 1) {
         String $$8 = $$0.p();
         return new adk.c($$8);
      } else {
         return null;
      }
   }

   private static adk.b a(CommandNode<fb> $$0, Object2IntMap<CommandNode<fb>> $$1) {
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

      adk.e $$5;
      if ($$0 instanceof RootCommandNode) {
         $$2 |= 0;
         $$5 = null;
      } else if ($$0 instanceof ArgumentCommandNode<fb, ?> $$6) {
         $$5 = new adk.a($$6);
         $$2 |= 2;
         if ($$6.getCustomSuggestions() != null) {
            $$2 |= 16;
         }
      } else {
         if (!($$0 instanceof LiteralCommandNode $$8)) {
            throw new UnsupportedOperationException("Unknown node type " + $$0);
         }

         $$5 = new adk.c($$8.getLiteral());
         $$2 |= 1;
      }

      int[] $$11 = $$0.getChildren().stream().mapToInt($$1::getInt).toArray();
      return new adk.b($$5, $$2, $$3, $$11);
   }

   @Override
   public aae<adk> a() {
      return ahk.s;
   }

   public void a(acr $$0) {
      $$0.a(this);
   }

   public RootCommandNode<fb> a(es $$0) {
      return (RootCommandNode<fb>)new adk.d($$0, this.j).a(this.i);
   }

   static class a implements adk.e {
      private final String a;
      private final is.a<?> b;
      @Nullable
      private final alz c;

      @Nullable
      private static alz a(@Nullable SuggestionProvider<fb> $$0) {
         return $$0 != null ? iw.a($$0) : null;
      }

      a(String $$0, is.a<?> $$1, @Nullable alz $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public a(ArgumentCommandNode<fb, ?> $$0) {
         this($$0.getName(), it.b($$0.getType()), a($$0.getCustomSuggestions()));
      }

      @Override
      public ArgumentBuilder<fb, ?> a(es $$0) {
         ArgumentType<?> $$1 = this.b.b($$0);
         RequiredArgumentBuilder<fb, ?> $$2 = RequiredArgumentBuilder.argument(this.a, $$1);
         if (this.c != null) {
            $$2.suggests(iw.a(this.c));
         }

         return $$2;
      }

      @Override
      public void a(ws $$0) {
         $$0.a(this.a);
         a($$0, this.b);
         if (this.c != null) {
            $$0.a(this.c);
         }
      }

      private static <A extends ArgumentType<?>> void a(ws $$0, is.a<A> $$1) {
         a($$0, $$1.a(), $$1);
      }

      private static <A extends ArgumentType<?>, T extends is.a<A>> void a(ws $$0, is<A, T> $$1, is.a<A> $$2) {
         $$0.c(ma.u.a($$1));
         $$1.a((T)$$2, $$0);
      }
   }

   static class b {
      @Nullable
      final adk.e a;
      final int b;
      final int c;
      final int[] d;

      b(@Nullable adk.e $$0, int $$1, int $$2, int[] $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public void a(ws $$0) {
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

   static class c implements adk.e {
      private final String a;

      c(String $$0) {
         this.a = $$0;
      }

      @Override
      public ArgumentBuilder<fb, ?> a(es $$0) {
         return LiteralArgumentBuilder.literal(this.a);
      }

      @Override
      public void a(ws $$0) {
         $$0.a(this.a);
      }
   }

   static class d {
      private final es a;
      private final List<adk.b> b;
      private final List<CommandNode<fb>> c;

      d(es $$0, List<adk.b> $$1) {
         this.a = $$0;
         this.b = $$1;
         ObjectArrayList<CommandNode<fb>> $$2 = new ObjectArrayList();
         $$2.size($$1.size());
         this.c = $$2;
      }

      public CommandNode<fb> a(int $$0) {
         CommandNode<fb> $$1 = this.c.get($$0);
         if ($$1 != null) {
            return $$1;
         } else {
            adk.b $$2 = this.b.get($$0);
            CommandNode<fb> $$3;
            if ($$2.a == null) {
               $$3 = new RootCommandNode();
            } else {
               ArgumentBuilder<fb, ?> $$4 = $$2.a.a(this.a);
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
               CommandNode<fb> $$7 = this.a($$6);
               if (!($$7 instanceof RootCommandNode)) {
                  $$3.addChild($$7);
               }
            }

            return $$3;
         }
      }
   }

   interface e {
      ArgumentBuilder<fb, ?> a(es var1);

      void a(ws var1);
   }
}
