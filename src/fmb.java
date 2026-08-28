import javax.annotation.Nullable;

public class fmb extends fsj {
   private static final alg u = alg.b("widget/slot_frame");
   private static final alg v = alg.b("icon/checkmark");
   public static final alg a = alg.b("textures/gui/realms/empty_frame.png");
   public static final alg b = alg.b("textures/gui/title/background/panorama_0.png");
   public static final alg c = alg.b("textures/gui/title/background/panorama_2.png");
   public static final alg d = alg.b("textures/gui/title/background/panorama_3.png");
   private static final wy w = wy.c("mco.configure.world.slot.tooltip.active");
   private static final wy x = wy.c("mco.configure.world.slot.tooltip.minigame");
   private static final wy y = wy.c("mco.configure.world.slot.tooltip");
   static final wy z = wy.c("mco.worldSlot.minigame");
   private static final int A = 64;
   private static final String B = "...";
   private final int C;
   @Nullable
   private fmb.b D;

   public fmb(int $$0, int $$1, int $$2, int $$3, int $$4, fsj.c $$5) {
      super($$0, $$1, $$2, $$3, wx.a, $$5, q);
      this.C = $$4;
   }

   @Nullable
   public fmb.b a() {
      return this.D;
   }

   public void a(fla $$0) {
      this.D = new fmb.b($$0, this.C);
      this.a(this.D, $$0.q);
   }

   private void a(fmb.b $$0, @Nullable String $$1) {
      wy $$2 = switch ($$0.c) {
         case b -> $$0.b ? x : y;
         case c -> w;
         default -> null;
      };
      if ($$2 != null) {
         this.a(ftu.a($$2));
      }

      xm $$3 = wy.b($$0.f);
      if ($$0.b && $$1 != null) {
         $$3 = $$3.b(wx.v).f($$1);
      }

      this.b($$3);
   }

   static fmb.a a(fla $$0, boolean $$1, boolean $$2) {
      if ($$1 && !$$0.j && $$0.e != fla.c.c) {
         return fmb.a.c;
      } else {
         return $$1 || $$2 && $$0.j ? fmb.a.a : fmb.a.b;
      }
   }

   @Override
   public void b(frv $$0, int $$1, int $$2, float $$3) {
      if (this.D != null) {
         int $$4 = this.F();
         int $$5 = this.G();
         boolean $$6 = this.D();
         alg $$7;
         if (this.D.b) {
            $$7 = fnn.a(String.valueOf(this.D.i), this.D.j);
         } else if (this.D.a) {
            $$7 = a;
         } else if (this.D.j != null && this.D.i != -1L) {
            $$7 = fnn.a(String.valueOf(this.D.i), this.D.j);
         } else if (this.C == 1) {
            $$7 = b;
         } else if (this.C == 2) {
            $$7 = c;
         } else if (this.C == 3) {
            $$7 = d;
         } else {
            $$7 = a;
         }

         int $$14 = -1;
         if (this.D.e) {
            $$14 = axw.a(1.0F, 0.56F, 0.56F, 0.56F);
         }

         $$0.a(gqk::H, $$7, $$4 + 3, $$5 + 3, 0.0F, 0.0F, 74, 74, 74, 74, 74, 74, $$14);
         if ($$6 && this.D.c != fmb.a.a) {
            $$0.a(gqk::H, u, $$4, $$5, 80, 80);
         } else if (this.D.e) {
            $$0.a(gqk::H, u, $$4, $$5, 80, 80, axw.a(1.0F, 0.8F, 0.8F, 0.8F));
         } else {
            $$0.a(gqk::H, u, $$4, $$5, 80, 80, axw.a(1.0F, 0.56F, 0.56F, 0.56F));
         }

         if (this.D.e) {
            $$0.a(gqk::H, v, $$4 + 67, $$5 + 4, 9, 8);
         }

         if (this.D.d) {
            $$0.a(gqk::H, fju.a, $$4 + 3, $$5 + 4, 9, 8);
         }

         frt $$15 = foz.Q().h;
         String $$16 = this.D.f;
         if ($$15.b($$16) > 64) {
            $$16 = $$15.a($$16, 64 - $$15.b("...")) + "...";
         }

         $$0.a($$15, $$16, $$4 + 40, $$5 + 66, -1);
         $$0.a($$15, fju.a(this.D.g, this.D.h.a()), $$4 + 40, $$5 + 80 + 2, -1);
      }
   }

   public static enum a {
      a,
      b,
      c;
   }

   public static class b {
      final boolean e;
      final String f;
      final String g;
      final fla.a h;
      final long i;
      @Nullable
      final String j;
      public final boolean a;
      public final boolean b;
      public final fmb.a c;
      public final boolean d;

      public b(fla $$0, int $$1) {
         this.b = $$1 == 4;
         if (this.b) {
            this.e = $$0.i();
            this.f = fmb.z.getString();
            this.i = (long)$$0.r;
            this.j = $$0.s;
            this.a = $$0.r == -1;
            this.g = "";
            this.h = fla.a.a;
            this.d = false;
         } else {
            flg $$2 = $$0.i.get($$1);
            this.e = $$0.p == $$1 && !$$0.i();
            this.f = $$2.a($$1);
            this.i = $$2.k;
            this.j = $$2.l;
            this.a = $$2.m;
            this.g = $$2.i;
            this.h = $$2.j;
            this.d = $$2.h;
         }

         this.c = fmb.a($$0, this.e, this.b);
      }
   }
}
