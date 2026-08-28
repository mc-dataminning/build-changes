import javax.annotation.Nullable;

public class fns extends fty {
   private static final alr u = alr.b("widget/slot_frame");
   private static final alr v = alr.b("icon/checkmark");
   public static final alr a = alr.b("textures/gui/realms/empty_frame.png");
   public static final alr b = alr.b("textures/gui/title/background/panorama_0.png");
   public static final alr c = alr.b("textures/gui/title/background/panorama_2.png");
   public static final alr d = alr.b("textures/gui/title/background/panorama_3.png");
   private static final xg w = xg.c("mco.configure.world.slot.tooltip.active");
   private static final xg x = xg.c("mco.configure.world.slot.tooltip.minigame");
   private static final xg y = xg.c("mco.configure.world.slot.tooltip");
   static final xg z = xg.c("mco.worldSlot.minigame");
   private static final int A = 64;
   private static final String B = "...";
   private final int C;
   @Nullable
   private fns.b D;

   public fns(int $$0, int $$1, int $$2, int $$3, int $$4, fty.c $$5) {
      super($$0, $$1, $$2, $$3, xf.a, $$5, q);
      this.C = $$4;
   }

   @Nullable
   public fns.b a() {
      return this.D;
   }

   public void a(fmr $$0) {
      this.D = new fns.b($$0, this.C);
      this.a(this.D, $$0.q);
   }

   private void a(fns.b $$0, @Nullable String $$1) {
      xg $$2 = switch ($$0.c) {
         case b -> $$0.b ? x : y;
         case c -> w;
         default -> null;
      };
      if ($$2 != null) {
         this.a(fvj.a($$2));
      }

      xu $$3 = xg.b($$0.f);
      if ($$0.b && $$1 != null) {
         $$3 = $$3.b(xf.v).f($$1);
      }

      this.b($$3);
   }

   static fns.a a(fmr $$0, boolean $$1, boolean $$2) {
      if ($$1 && !$$0.j && $$0.e != fmr.c.c) {
         return fns.a.c;
      } else {
         return $$1 || $$2 && $$0.j ? fns.a.a : fns.a.b;
      }
   }

   @Override
   public void b(ftk $$0, int $$1, int $$2, float $$3) {
      if (this.D != null) {
         int $$4 = this.F();
         int $$5 = this.G();
         boolean $$6 = this.D();
         alr $$7;
         if (this.D.b) {
            $$7 = fpf.a(String.valueOf(this.D.i), this.D.j);
         } else if (this.D.a) {
            $$7 = a;
         } else if (this.D.j != null && this.D.i != -1L) {
            $$7 = fpf.a(String.valueOf(this.D.i), this.D.j);
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
            $$14 = ayh.a(1.0F, 0.56F, 0.56F, 0.56F);
         }

         $$0.a(gry::H, $$7, $$4 + 3, $$5 + 3, 0.0F, 0.0F, 74, 74, 74, 74, 74, 74, $$14);
         if ($$6 && this.D.c != fns.a.a) {
            $$0.a(gry::H, u, $$4, $$5, 80, 80);
         } else if (this.D.e) {
            $$0.a(gry::H, u, $$4, $$5, 80, 80, ayh.a(1.0F, 0.8F, 0.8F, 0.8F));
         } else {
            $$0.a(gry::H, u, $$4, $$5, 80, 80, ayh.a(1.0F, 0.56F, 0.56F, 0.56F));
         }

         if (this.D.e) {
            $$0.a(gry::H, v, $$4 + 67, $$5 + 4, 9, 8);
         }

         if (this.D.d) {
            $$0.a(gry::H, fll.a, $$4 + 3, $$5 + 4, 9, 8);
         }

         fti $$15 = fqq.Q().h;
         String $$16 = this.D.f;
         if ($$15.b($$16) > 64) {
            $$16 = $$15.a($$16, 64 - $$15.b("...")) + "...";
         }

         $$0.a($$15, $$16, $$4 + 40, $$5 + 66, -1);
         $$0.a($$15, fll.a(this.D.g, this.D.h.a()), $$4 + 40, $$5 + 80 + 2, -1);
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
      final fmr.a h;
      final long i;
      @Nullable
      final String j;
      public final boolean a;
      public final boolean b;
      public final fns.a c;
      public final boolean d;

      public b(fmr $$0, int $$1) {
         this.b = $$1 == 4;
         if (this.b) {
            this.e = $$0.i();
            this.f = fns.z.getString();
            this.i = (long)$$0.r;
            this.j = $$0.s;
            this.a = $$0.r == -1;
            this.g = "";
            this.h = fmr.a.a;
            this.d = false;
         } else {
            fmx $$2 = $$0.i.get($$1);
            this.e = $$0.p == $$1 && !$$0.i();
            this.f = $$2.a($$1);
            this.i = $$2.k;
            this.j = $$2.l;
            this.a = $$2.m;
            this.g = $$2.i;
            this.h = $$2.j;
            this.d = $$2.h;
         }

         this.c = fns.a($$0, this.e, this.b);
      }
   }
}
