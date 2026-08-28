import javax.annotation.Nullable;

public class fga extends fkz {
   private static final alh u = alh.b("widget/slot_frame");
   private static final alh v = alh.b("icon/checkmark");
   public static final alh a = alh.b("textures/gui/realms/empty_frame.png");
   public static final alh b = alh.b("textures/gui/title/background/panorama_0.png");
   public static final alh c = alh.b("textures/gui/title/background/panorama_2.png");
   public static final alh d = alh.b("textures/gui/title/background/panorama_3.png");
   private static final xh w = xh.c("mco.configure.world.slot.tooltip.active");
   private static final xh x = xh.c("mco.configure.world.slot.tooltip.minigame");
   private static final xh y = xh.c("mco.configure.world.slot.tooltip");
   static final xh z = xh.c("mco.worldSlot.minigame");
   private final int A;
   @Nullable
   private fga.b B;

   public fga(int $$0, int $$1, int $$2, int $$3, int $$4, fkz.c $$5) {
      super($$0, $$1, $$2, $$3, xg.a, $$5, q);
      this.A = $$4;
   }

   @Nullable
   public fga.b a() {
      return this.B;
   }

   public void a(ffa $$0) {
      this.B = new fga.b($$0, this.A);
      this.a(this.B, $$0.o);
   }

   private void a(fga.b $$0, @Nullable String $$1) {
      xh $$2 = switch ($$0.c) {
         case b -> $$0.b ? x : y;
         case c -> w;
         default -> null;
      };
      if ($$2 != null) {
         this.a(fmk.a($$2));
      }

      xv $$3 = xh.b($$0.e);
      if ($$0.b && $$1 != null) {
         $$3 = $$3.b(xg.v).f($$1);
      }

      this.b($$3);
   }

   static fga.a a(ffa $$0, boolean $$1, boolean $$2) {
      if ($$1 && !$$0.j && $$0.e != ffa.c.c) {
         return fga.a.c;
      } else {
         return $$1 || $$2 && $$0.j ? fga.a.a : fga.a.b;
      }
   }

   @Override
   public void b(fkm $$0, int $$1, int $$2, float $$3) {
      if (this.B != null) {
         int $$4 = this.D();
         int $$5 = this.E();
         boolean $$6 = this.B();
         alh $$7;
         if (this.B.b) {
            $$7 = fhn.a(String.valueOf(this.B.h), this.B.i);
         } else if (this.B.a) {
            $$7 = a;
         } else if (this.B.i != null && this.B.h != -1L) {
            $$7 = fhn.a(String.valueOf(this.B.h), this.B.i);
         } else if (this.A == 1) {
            $$7 = b;
         } else if (this.A == 2) {
            $$7 = c;
         } else if (this.A == 3) {
            $$7 = d;
         } else {
            $$7 = a;
         }

         int $$14 = -1;
         if (this.B.d) {
            $$14 = axu.a(1.0F, 0.56F, 0.56F, 0.56F);
         }

         $$0.a(gig::B, $$7, $$4 + 3, $$5 + 3, 0.0F, 0.0F, 74, 74, 74, 74, 74, 74, $$14);
         if ($$6 && this.B.c != fga.a.a) {
            $$0.a(gig::B, u, $$4, $$5, 80, 80);
         } else if (this.B.d) {
            $$0.a(gig::B, u, $$4, $$5, 80, 80, axu.a(1.0F, 0.8F, 0.8F, 0.8F));
         } else {
            $$0.a(gig::B, u, $$4, $$5, 80, 80, axu.a(1.0F, 0.56F, 0.56F, 0.56F));
         }

         if (this.B.d) {
            $$0.a(gig::B, v, $$4 + 67, $$5 + 4, 9, 8);
         }

         fkk $$15 = fja.Q().h;
         $$0.a($$15, this.B.e, $$4 + 40, $$5 + 66, -1);
         $$0.a($$15, fee.a(this.B.f, this.B.g.a()), $$4 + 40, $$5 + 80 + 2, -1);
      }
   }

   public static enum a {
      a,
      b,
      c;
   }

   public static class b {
      final boolean d;
      final String e;
      final String f;
      final ffa.a g;
      final long h;
      @Nullable
      final String i;
      public final boolean a;
      public final boolean b;
      public final fga.a c;

      public b(ffa $$0, int $$1) {
         this.b = $$1 == 4;
         if (this.b) {
            this.d = $$0.i();
            this.e = fga.z.getString();
            this.h = (long)$$0.p;
            this.i = $$0.q;
            this.a = $$0.p == -1;
            this.f = "";
            this.g = ffa.a.a;
         } else {
            fff $$2 = $$0.i.get($$1);
            this.d = $$0.n == $$1 && !$$0.i();
            this.e = $$2.a($$1);
            this.h = $$2.j;
            this.i = $$2.k;
            this.a = $$2.l;
            this.f = $$2.h;
            this.g = $$2.i;
         }

         this.c = fga.a($$0, this.d, this.b);
      }
   }
}
