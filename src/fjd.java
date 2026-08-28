import javax.annotation.Nullable;

public class fjd extends fny {
   private static final alp u = alp.b("widget/slot_frame");
   private static final alp v = alp.b("icon/checkmark");
   public static final alp a = alp.b("textures/gui/realms/empty_frame.png");
   public static final alp b = alp.b("textures/gui/title/background/panorama_0.png");
   public static final alp c = alp.b("textures/gui/title/background/panorama_2.png");
   public static final alp d = alp.b("textures/gui/title/background/panorama_3.png");
   private static final xk w = xk.c("mco.configure.world.slot.tooltip.active");
   private static final xk x = xk.c("mco.configure.world.slot.tooltip.minigame");
   private static final xk y = xk.c("mco.configure.world.slot.tooltip");
   static final xk z = xk.c("mco.worldSlot.minigame");
   private static final int A = 64;
   private static final String B = "...";
   private final int C;
   @Nullable
   private fjd.b D;

   public fjd(int $$0, int $$1, int $$2, int $$3, int $$4, fny.c $$5) {
      super($$0, $$1, $$2, $$3, xj.a, $$5, q);
      this.C = $$4;
   }

   @Nullable
   public fjd.b a() {
      return this.D;
   }

   public void a(fic $$0) {
      this.D = new fjd.b($$0, this.C);
      this.a(this.D, $$0.q);
   }

   private void a(fjd.b $$0, @Nullable String $$1) {
      xk $$2 = switch ($$0.c) {
         case b -> $$0.b ? x : y;
         case c -> w;
         default -> null;
      };
      if ($$2 != null) {
         this.a(fpk.a($$2));
      }

      xy $$3 = xk.b($$0.f);
      if ($$0.b && $$1 != null) {
         $$3 = $$3.b(xj.v).f($$1);
      }

      this.b($$3);
   }

   static fjd.a a(fic $$0, boolean $$1, boolean $$2) {
      if ($$1 && !$$0.j && $$0.e != fic.c.c) {
         return fjd.a.c;
      } else {
         return $$1 || $$2 && $$0.j ? fjd.a.a : fjd.a.b;
      }
   }

   @Override
   public void b(fnl $$0, int $$1, int $$2, float $$3) {
      if (this.D != null) {
         int $$4 = this.D();
         int $$5 = this.E();
         boolean $$6 = this.B();
         alp $$7;
         if (this.D.b) {
            $$7 = fkp.a(String.valueOf(this.D.i), this.D.j);
         } else if (this.D.a) {
            $$7 = a;
         } else if (this.D.j != null && this.D.i != -1L) {
            $$7 = fkp.a(String.valueOf(this.D.i), this.D.j);
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
            $$14 = ayf.a(1.0F, 0.56F, 0.56F, 0.56F);
         }

         $$0.a(glq::H, $$7, $$4 + 3, $$5 + 3, 0.0F, 0.0F, 74, 74, 74, 74, 74, 74, $$14);
         if ($$6 && this.D.c != fjd.a.a) {
            $$0.a(glq::H, u, $$4, $$5, 80, 80);
         } else if (this.D.e) {
            $$0.a(glq::H, u, $$4, $$5, 80, 80, ayf.a(1.0F, 0.8F, 0.8F, 0.8F));
         } else {
            $$0.a(glq::H, u, $$4, $$5, 80, 80, ayf.a(1.0F, 0.56F, 0.56F, 0.56F));
         }

         if (this.D.e) {
            $$0.a(glq::H, v, $$4 + 67, $$5 + 4, 9, 8);
         }

         if (this.D.d) {
            $$0.a(glq::H, fgw.a, $$4 + 3, $$5 + 4, 9, 8);
         }

         fnj $$15 = flz.Q().h;
         String $$16 = this.D.f;
         if ($$15.b($$16) > 64) {
            $$16 = $$15.a($$16, 64 - $$15.b("...")) + "...";
         }

         $$0.a($$15, $$16, $$4 + 40, $$5 + 66, -1);
         $$0.a($$15, fgw.a(this.D.g, this.D.h.a()), $$4 + 40, $$5 + 80 + 2, -1);
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
      final fic.a h;
      final long i;
      @Nullable
      final String j;
      public final boolean a;
      public final boolean b;
      public final fjd.a c;
      public final boolean d;

      public b(fic $$0, int $$1) {
         this.b = $$1 == 4;
         if (this.b) {
            this.e = $$0.i();
            this.f = fjd.z.getString();
            this.i = (long)$$0.r;
            this.j = $$0.s;
            this.a = $$0.r == -1;
            this.g = "";
            this.h = fic.a.a;
            this.d = false;
         } else {
            fii $$2 = $$0.i.get($$1);
            this.e = $$0.p == $$1 && !$$0.i();
            this.f = $$2.a($$1);
            this.i = $$2.k;
            this.j = $$2.l;
            this.a = $$2.m;
            this.g = $$2.i;
            this.h = $$2.j;
            this.d = $$2.h;
         }

         this.c = fjd.a($$0, this.e, this.b);
      }
   }
}
