import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dvy extends dmr {
   public static final MapCodec<dvy> a = b(dvy::new);
   public static final ebt b = ebj.aH;
   public static final ebt c = ebj.aG;
   public static final int d = 2;
   public static final int e = 1;
   public static final int f = 4;
   private static final ffw g = dmr.a(3.0, 0.0, 3.0, 12.0, 7.0, 12.0);
   private static final ffw h = dmr.b(14.0, 0.0, 7.0);

   @Override
   public MapCodec<dvy> a() {
      return a;
   }

   public dvy(eas.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, Integer.valueOf(0)).b(c, Integer.valueOf(1)));
   }

   @Override
   public void a(djm $$0, iv $$1, eat $$2, bwi $$3) {
      if (!$$3.cc()) {
         this.a($$0, $$2, $$1, $$3, 100);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(djm $$0, eat $$1, iv $$2, bwi $$3, double $$4) {
      if (!($$3 instanceof cph)) {
         this.a($$0, $$1, $$2, $$3, 3);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   private void a(djm $$0, eat $$1, iv $$2, bwi $$3, int $$4) {
      if ($$1.a(dmt.mL) && $$0 instanceof arq $$5 && this.a($$5, $$3) && $$0.A.a($$4) == 0) {
         this.a($$5, $$2, $$1);
      }
   }

   private void a(djm $$0, iv $$1, eat $$2) {
      $$0.a(null, $$1, awn.Bm, awo.e, 0.7F, 0.9F + $$0.A.i() * 0.2F);
      int $$3 = $$2.c(c);
      if ($$3 <= 1) {
         $$0.b($$1, false);
      } else {
         $$0.a($$1, $$2.b(c, Integer.valueOf($$3 - 1)), 2);
         $$0.a(eft.f, $$1, eft.a.a($$2));
         $$0.c(2001, $$1, dmr.j($$2));
      }
   }

   @Override
   protected void b(eat $$0, arq $$1, iv $$2, azv $$3) {
      if (this.a($$1) && a($$1, $$2)) {
         int $$4 = $$0.c(b);
         if ($$4 < 2) {
            $$1.a(null, $$2, awn.Bn, awo.e, 0.7F, 0.9F + $$3.i() * 0.2F);
            $$1.a($$2, $$0.b(b, Integer.valueOf($$4 + 1)), 2);
            $$1.a(eft.c, $$2, eft.a.a($$0));
         } else {
            $$1.a(null, $$2, awn.Bo, awo.e, 0.7F, 0.9F + $$3.i() * 0.2F);
            $$1.a($$2, false);
            $$1.a(eft.f, $$2, eft.a.a($$0));

            for (int $$5 = 0; $$5 < $$0.c(c); $$5++) {
               $$1.c(2001, $$2, dmr.j($$0));
               ckg $$6 = bwr.bB.a($$1, bwq.e);
               if ($$6 != null) {
                  $$6.c_(-24000);
                  $$6.h($$2);
                  $$6.b((double)$$2.u() + 0.3 + (double)$$5 * 0.2, (double)$$2.v(), (double)$$2.w() + 0.3, 0.0F, 0.0F);
                  $$1.b($$6);
               }
            }
         }
      }
   }

   public static boolean a(diq $$0, iv $$1) {
      return b($$0, $$1.e());
   }

   public static boolean b(diq $$0, iv $$1) {
      return $$0.a_($$1).a(axc.J);
   }

   @Override
   protected void a(eat $$0, djm $$1, iv $$2, eat $$3, boolean $$4) {
      if (a($$1, $$2) && !$$1.C) {
         $$1.c(2012, $$2, 15);
      }
   }

   private boolean a(djm $$0) {
      float $$1 = $$0.f(1.0F);
      return (double)$$1 < 0.69 && (double)$$1 > 0.65 ? true : $$0.A.a(500) == 0;
   }

   @Override
   public void a(djm $$0, crm $$1, iv $$2, eat $$3, @Nullable dxr $$4, czn $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      this.a($$0, $$2, $$3);
   }

   @Override
   protected boolean a(eat $$0, ddg $$1) {
      return !$$1.h() && $$1.n().a(this.h()) && $$0.c(c) < 4 ? true : super.a($$0, $$1);
   }

   @Nullable
   @Override
   public eat a(ddg $$0) {
      eat $$1 = $$0.q().a_($$0.a());
      return $$1.a(this) ? $$1.b(c, Integer.valueOf(Math.min(4, $$1.c(c) + 1))) : super.a($$0);
   }

   @Override
   protected ffw a(eat $$0, diq $$1, iv $$2, ffh $$3) {
      return $$0.c(c) == 1 ? g : h;
   }

   @Override
   protected void a(eau.a<dmr, eat> $$0) {
      $$0.a(b, c);
   }

   private boolean a(arq $$0, bwi $$1) {
      if ($$1 instanceof ckg || $$1 instanceof cis) {
         return false;
      } else {
         return !($$1 instanceof bxj) ? false : $$1 instanceof crm || $$0.O().c(dji.d);
      }
   }
}
