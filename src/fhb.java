import javax.annotation.Nullable;

public class fhb extends flw {
   private static final all u = all.b("widget/slot_frame");
   private static final all v = all.b("icon/checkmark");
   public static final all a = all.b("textures/gui/realms/empty_frame.png");
   public static final all b = all.b("textures/gui/title/background/panorama_0.png");
   public static final all c = all.b("textures/gui/title/background/panorama_2.png");
   public static final all d = all.b("textures/gui/title/background/panorama_3.png");
   private static final xl w = xl.c("mco.configure.world.slot.tooltip.active");
   private static final xl x = xl.c("mco.configure.world.slot.tooltip.minigame");
   private static final xl y = xl.c("mco.configure.world.slot.tooltip");
   static final xl z = xl.c("mco.worldSlot.minigame");
   private final int A;
   @Nullable
   private fhb.b B;

   public fhb(int $$0, int $$1, int $$2, int $$3, int $$4, flw.c $$5) {
      super($$0, $$1, $$2, $$3, xk.a, $$5, q);
      this.A = $$4;
   }

   @Nullable
   public fhb.b a() {
      return this.B;
   }

   public void a(fgb $$0) {
      this.B = new fhb.b($$0, this.A);
      this.a(this.B, $$0.o);
   }

   private void a(fhb.b $$0, @Nullable String $$1) {
      xl $$2 = switch ($$0.c) {
         case b -> $$0.b ? x : y;
         case c -> w;
         default -> null;
      };
      if ($$2 != null) {
         this.a(fnh.a($$2));
      }

      xz $$3 = xl.b($$0.e);
      if ($$0.b && $$1 != null) {
         $$3 = $$3.b(xk.v).f($$1);
      }

      this.b($$3);
   }

   static fhb.a a(fgb $$0, boolean $$1, boolean $$2) {
      if ($$1 && !$$0.j && $$0.e != fgb.c.c) {
         return fhb.a.c;
      } else {
         return $$1 || $$2 && $$0.j ? fhb.a.a : fhb.a.b;
      }
   }

   @Override
   public void b(flj $$0, int $$1, int $$2, float $$3) {
      if (this.B != null) {
         int $$4 = this.D();
         int $$5 = this.E();
         boolean $$6 = this.B();
         all $$7;
         if (this.B.b) {
            $$7 = fin.a(String.valueOf(this.B.h), this.B.i);
         } else if (this.B.a) {
            $$7 = a;
         } else if (this.B.i != null && this.B.h != -1L) {
            $$7 = fin.a(String.valueOf(this.B.h), this.B.i);
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
            $$14 = axy.a(1.0F, 0.56F, 0.56F, 0.56F);
         }

         $$0.a(gjh::B, $$7, $$4 + 3, $$5 + 3, 0.0F, 0.0F, 74, 74, 74, 74, 74, 74, $$14);
         if ($$6 && this.B.c != fhb.a.a) {
            $$0.a(gjh::B, u, $$4, $$5, 80, 80);
         } else if (this.B.d) {
            $$0.a(gjh::B, u, $$4, $$5, 80, 80, axy.a(1.0F, 0.8F, 0.8F, 0.8F));
         } else {
            $$0.a(gjh::B, u, $$4, $$5, 80, 80, axy.a(1.0F, 0.56F, 0.56F, 0.56F));
         }

         if (this.B.d) {
            $$0.a(gjh::B, v, $$4 + 67, $$5 + 4, 9, 8);
         }

         flh $$15 = fjx.Q().h;
         $$0.a($$15, this.B.e, $$4 + 40, $$5 + 66, -1);
         $$0.a($$15, fev.a(this.B.f, this.B.g.a()), $$4 + 40, $$5 + 80 + 2, -1);
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
      final fgb.a g;
      final long h;
      @Nullable
      final String i;
      public final boolean a;
      public final boolean b;
      public final fhb.a c;

      public b(fgb $$0, int $$1) {
         this.b = $$1 == 4;
         if (this.b) {
            this.d = $$0.i();
            this.e = fhb.z.getString();
            this.h = (long)$$0.p;
            this.i = $$0.q;
            this.a = $$0.p == -1;
            this.f = "";
            this.g = fgb.a.a;
         } else {
            fgg $$2 = $$0.i.get($$1);
            this.d = $$0.n == $$1 && !$$0.i();
            this.e = $$2.a($$1);
            this.h = $$2.k;
            this.i = $$2.l;
            this.a = $$2.m;
            this.f = $$2.i;
            this.g = $$2.j;
         }

         this.c = fhb.a($$0, this.d, this.b);
      }
   }
}
