import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.datafixers.util.Pair;
import java.util.function.Consumer;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class eny extends esq {
   private static final aex s = new aex("widget/slot_frame");
   private static final aex t = new aex("icon/checkmark");
   public static final aex a = new aex("textures/gui/realms/empty_frame.png");
   public static final aex b = new aex("minecraft", "textures/gui/title/background/panorama_0.png");
   public static final aex c = new aex("minecraft", "textures/gui/title/background/panorama_2.png");
   public static final aex d = new aex("minecraft", "textures/gui/title/background/panorama_3.png");
   private static final tl u = tl.c("mco.configure.world.slot.tooltip.active");
   private static final tl v = tl.c("mco.configure.world.slot.tooltip.minigame");
   private static final tl w = tl.c("mco.configure.world.slot.tooltip");
   private static final tl x = tl.c("mco.worldSlot.minigame");
   private final Supplier<emw> y;
   private final Consumer<tl> z;
   private final int A;
   @Nullable
   private eny.b B;

   public eny(int $$0, int $$1, int $$2, int $$3, Supplier<emw> $$4, Consumer<tl> $$5, int $$6, esq.c $$7) {
      super($$0, $$1, $$2, $$3, tk.a, $$7, o);
      this.y = $$4;
      this.A = $$6;
      this.z = $$5;
   }

   @Nullable
   public eny.b a() {
      return this.B;
   }

   public void b() {
      emw $$0 = this.y.get();
      if ($$0 != null) {
         end $$1 = $$0.i.get(this.A);
         boolean $$2 = this.A == 4;
         boolean $$3;
         String $$4;
         long $$5;
         String $$6;
         boolean $$7;
         if ($$2) {
            $$3 = $$0.m == emw.c.b;
            $$4 = x.getString();
            $$5 = (long)$$0.p;
            $$6 = $$0.q;
            $$7 = $$0.p == -1;
         } else {
            $$3 = $$0.n == this.A && $$0.m != emw.c.b;
            $$4 = $$1.a(this.A);
            $$5 = $$1.j;
            $$6 = $$1.k;
            $$7 = $$1.l;
         }

         eny.a $$13 = a($$0, $$3, $$2);
         Pair<tl, tl> $$14 = this.a($$0, $$4, $$7, $$2, $$13);
         this.B = new eny.b($$3, $$4, $$5, $$6, $$7, $$2, $$13, (tl)$$14.getFirst());
         this.b((tl)$$14.getSecond());
      }
   }

   private static eny.a a(emw $$0, boolean $$1, boolean $$2) {
      if ($$1) {
         if (!$$0.j && $$0.e != emw.b.c) {
            return eny.a.c;
         }
      } else {
         if (!$$2) {
            return eny.a.b;
         }

         if (!$$0.j) {
            return eny.a.b;
         }
      }

      return eny.a.a;
   }

   private Pair<tl, tl> a(emw $$0, String $$1, boolean $$2, boolean $$3, eny.a $$4) {
      if ($$4 == eny.a.a) {
         return Pair.of(null, tl.b($$1));
      } else {
         tl $$5;
         if ($$3) {
            if ($$2) {
               $$5 = tk.a;
            } else {
               $$5 = tk.a().f($$1).b(tk.u).f($$0.o);
            }
         } else {
            $$5 = tk.a().f($$1);
         }

         tl $$8;
         if ($$4 == eny.a.c) {
            $$8 = u;
         } else {
            $$8 = $$3 ? v : w;
         }

         tl $$10 = $$8.e().b($$5);
         return Pair.of($$8, $$10);
      }
   }

   @Override
   public void b(esf $$0, int $$1, int $$2, float $$3) {
      if (this.B != null) {
         this.a($$0, this.r(), this.t(), $$1, $$2, this.B.d, this.B.e, this.A, this.B.f, this.B.g, this.B.a, this.B.b, this.B.c, this.B.h);
      }
   }

   private void a(
      esf $$0,
      int $$1,
      int $$2,
      int $$3,
      int $$4,
      boolean $$5,
      String $$6,
      int $$7,
      long $$8,
      @Nullable String $$9,
      boolean $$10,
      boolean $$11,
      eny.a $$12,
      @Nullable tl $$13
   ) {
      boolean $$14 = this.o();
      if (this.a_((double)$$3, (double)$$4) && $$13 != null) {
         this.z.accept($$13);
      }

      eqv $$15 = eqv.O();
      aex $$16;
      if ($$11) {
         $$16 = epl.a(String.valueOf($$8), $$9);
      } else if ($$10) {
         $$16 = a;
      } else if ($$9 != null && $$8 != -1L) {
         $$16 = epl.a(String.valueOf($$8), $$9);
      } else if ($$7 == 1) {
         $$16 = b;
      } else if ($$7 == 2) {
         $$16 = c;
      } else if ($$7 == 3) {
         $$16 = d;
      } else {
         $$16 = a;
      }

      if ($$5) {
         $$0.a(0.56F, 0.56F, 0.56F, 1.0F);
      }

      $$0.a($$16, $$1 + 3, $$2 + 3, 0.0F, 0.0F, 74, 74, 74, 74);
      boolean $$23 = $$14 && $$12 != eny.a.a;
      if ($$23) {
         $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      } else if ($$5) {
         $$0.a(0.8F, 0.8F, 0.8F, 1.0F);
      } else {
         $$0.a(0.56F, 0.56F, 0.56F, 1.0F);
      }

      $$0.a(s, $$1, $$2, 80, 80);
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      if ($$5) {
         this.a($$0, $$1, $$2);
      }

      $$0.a($$15.h, $$6, $$1 + 40, $$2 + 66, -1);
   }

   private void a(esf $$0, int $$1, int $$2) {
      RenderSystem.enableBlend();
      $$0.a(t, $$1 + 67, $$2 + 4, 9, 8);
      RenderSystem.disableBlend();
   }

   public static enum a {
      a,
      b,
      c;
   }

   public static class b {
      final boolean d;
      final String e;
      final long f;
      @Nullable
      final String g;
      public final boolean a;
      public final boolean b;
      public final eny.a c;
      @Nullable
      final tl h;

      b(boolean $$0, String $$1, long $$2, @Nullable String $$3, boolean $$4, boolean $$5, eny.a $$6, @Nullable tl $$7) {
         this.d = $$0;
         this.e = $$1;
         this.f = $$2;
         this.g = $$3;
         this.a = $$4;
         this.b = $$5;
         this.c = $$6;
         this.h = $$7;
      }
   }
}
