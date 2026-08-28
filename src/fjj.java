import javax.annotation.Nullable;

public class fjj extends fpq {
   private static final aku u = aku.b("widget/slot_frame");
   private static final aku v = aku.b("icon/checkmark");
   public static final aku a = aku.b("textures/gui/realms/empty_frame.png");
   public static final aku b = aku.b("textures/gui/title/background/panorama_0.png");
   public static final aku c = aku.b("textures/gui/title/background/panorama_2.png");
   public static final aku d = aku.b("textures/gui/title/background/panorama_3.png");
   private static final wp w = wp.c("mco.configure.world.slot.tooltip.active");
   private static final wp x = wp.c("mco.configure.world.slot.tooltip.minigame");
   private static final wp y = wp.c("mco.configure.world.slot.tooltip");
   static final wp z = wp.c("mco.worldSlot.minigame");
   private static final int A = 64;
   private static final String B = "...";
   private final int C;
   @Nullable
   private fjj.b D;

   public fjj(int $$0, int $$1, int $$2, int $$3, int $$4, fpq.c $$5) {
      super($$0, $$1, $$2, $$3, wo.a, $$5, q);
      this.C = $$4;
   }

   @Nullable
   public fjj.b a() {
      return this.D;
   }

   public void a(fii $$0) {
      this.D = new fjj.b($$0, this.C);
      this.a(this.D, $$0.q);
   }

   private void a(fjj.b $$0, @Nullable String $$1) {
      wp $$2 = switch ($$0.c) {
         case b -> $$0.b ? x : y;
         case c -> w;
         default -> null;
      };
      if ($$2 != null) {
         this.a(frb.a($$2));
      }

      xd $$3 = wp.b($$0.f);
      if ($$0.b && $$1 != null) {
         $$3 = $$3.b(wo.v).f($$1);
      }

      this.b($$3);
   }

   static fjj.a a(fii $$0, boolean $$1, boolean $$2) {
      if ($$1 && !$$0.j && $$0.e != fii.c.c) {
         return fjj.a.c;
      } else {
         return $$1 || $$2 && $$0.j ? fjj.a.a : fjj.a.b;
      }
   }

   @Override
   public void b(fpc $$0, int $$1, int $$2, float $$3) {
      if (this.D != null) {
         int $$4 = this.F();
         int $$5 = this.G();
         boolean $$6 = this.D();
         aku $$7;
         if (this.D.b) {
            $$7 = fkv.a(String.valueOf(this.D.i), this.D.j);
         } else if (this.D.a) {
            $$7 = a;
         } else if (this.D.j != null && this.D.i != -1L) {
            $$7 = fkv.a(String.valueOf(this.D.i), this.D.j);
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
            $$14 = axk.a(1.0F, 0.56F, 0.56F, 0.56F);
         }

         $$0.a(gnh::H, $$7, $$4 + 3, $$5 + 3, 0.0F, 0.0F, 74, 74, 74, 74, 74, 74, $$14);
         if ($$6 && this.D.c != fjj.a.a) {
            $$0.a(gnh::H, u, $$4, $$5, 80, 80);
         } else if (this.D.e) {
            $$0.a(gnh::H, u, $$4, $$5, 80, 80, axk.a(1.0F, 0.8F, 0.8F, 0.8F));
         } else {
            $$0.a(gnh::H, u, $$4, $$5, 80, 80, axk.a(1.0F, 0.56F, 0.56F, 0.56F));
         }

         if (this.D.e) {
            $$0.a(gnh::H, v, $$4 + 67, $$5 + 4, 9, 8);
         }

         if (this.D.d) {
            $$0.a(gnh::H, fhc.a, $$4 + 3, $$5 + 4, 9, 8);
         }

         fpa $$15 = fmg.Q().h;
         String $$16 = this.D.f;
         if ($$15.b($$16) > 64) {
            $$16 = $$15.a($$16, 64 - $$15.b("...")) + "...";
         }

         $$0.a($$15, $$16, $$4 + 40, $$5 + 66, -1);
         $$0.a($$15, fhc.a(this.D.g, this.D.h.a()), $$4 + 40, $$5 + 80 + 2, -1);
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
      final fii.a h;
      final long i;
      @Nullable
      final String j;
      public final boolean a;
      public final boolean b;
      public final fjj.a c;
      public final boolean d;

      public b(fii $$0, int $$1) {
         this.b = $$1 == 4;
         if (this.b) {
            this.e = $$0.i();
            this.f = fjj.z.getString();
            this.i = (long)$$0.r;
            this.j = $$0.s;
            this.a = $$0.r == -1;
            this.g = "";
            this.h = fii.a.a;
            this.d = false;
         } else {
            fio $$2 = $$0.i.get($$1);
            this.e = $$0.p == $$1 && !$$0.i();
            this.f = $$2.a($$1);
            this.i = $$2.k;
            this.j = $$2.l;
            this.a = $$2.m;
            this.g = $$2.i;
            this.h = $$2.j;
            this.d = $$2.h;
         }

         this.c = fjj.a($$0, this.e, this.b);
      }
   }
}
