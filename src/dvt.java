import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dvt extends dmm {
   public static final MapCodec<dvt> a = b(dvt::new);
   public static final ebo b = ebe.aH;
   public static final ebo c = ebe.aG;
   public static final int d = 2;
   public static final int e = 1;
   public static final int f = 4;
   private static final ffr g = dmm.a(3.0, 0.0, 3.0, 12.0, 7.0, 12.0);
   private static final ffr h = dmm.b(14.0, 0.0, 7.0);

   @Override
   public MapCodec<dvt> a() {
      return a;
   }

   public dvt(ean.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, Integer.valueOf(0)).b(c, Integer.valueOf(1)));
   }

   @Override
   public void a(djh $$0, iv $$1, eao $$2, bwi $$3) {
      if (!$$3.cc()) {
         this.a($$0, $$2, $$1, $$3, 100);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(djh $$0, eao $$1, iv $$2, bwi $$3, double $$4) {
      if (!($$3 instanceof cpe)) {
         this.a($$0, $$1, $$2, $$3, 3);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   private void a(djh $$0, eao $$1, iv $$2, bwi $$3, int $$4) {
      if ($$1.a(dmo.mL) && $$0 instanceof arq $$5 && this.a($$5, $$3) && $$0.A.a($$4) == 0) {
         this.a($$5, $$2, $$1);
      }
   }

   private void a(djh $$0, iv $$1, eao $$2) {
      $$0.a(null, $$1, awn.Bm, awo.e, 0.7F, 0.9F + $$0.A.i() * 0.2F);
      int $$3 = $$2.c(c);
      if ($$3 <= 1) {
         $$0.b($$1, false);
      } else {
         $$0.a($$1, $$2.b(c, Integer.valueOf($$3 - 1)), 2);
         $$0.a(efo.f, $$1, efo.a.a($$2));
         $$0.c(2001, $$1, dmm.j($$2));
      }
   }

   @Override
   protected void b(eao $$0, arq $$1, iv $$2, azv $$3) {
      if (this.a($$1) && a($$1, $$2)) {
         int $$4 = $$0.c(b);
         if ($$4 < 2) {
            $$1.a(null, $$2, awn.Bn, awo.e, 0.7F, 0.9F + $$3.i() * 0.2F);
            $$1.a($$2, $$0.b(b, Integer.valueOf($$4 + 1)), 2);
            $$1.a(efo.c, $$2, efo.a.a($$0));
         } else {
            $$1.a(null, $$2, awn.Bo, awo.e, 0.7F, 0.9F + $$3.i() * 0.2F);
            $$1.a($$2, false);
            $$1.a(efo.f, $$2, efo.a.a($$0));

            for (int $$5 = 0; $$5 < $$0.c(c); $$5++) {
               $$1.c(2001, $$2, dmm.j($$0));
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

   public static boolean a(din $$0, iv $$1) {
      return b($$0, $$1.e());
   }

   public static boolean b(din $$0, iv $$1) {
      return $$0.a_($$1).a(axc.J);
   }

   @Override
   protected void a(eao $$0, djh $$1, iv $$2, eao $$3, boolean $$4) {
      if (a($$1, $$2) && !$$1.C) {
         $$1.c(2012, $$2, 15);
      }
   }

   private boolean a(djh $$0) {
      float $$1 = $$0.f(1.0F);
      return (double)$$1 < 0.69 && (double)$$1 > 0.65 ? true : $$0.A.a(500) == 0;
   }

   @Override
   public void a(djh $$0, crj $$1, iv $$2, eao $$3, @Nullable dxm $$4, czk $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      this.a($$0, $$2, $$3);
   }

   @Override
   protected boolean a(eao $$0, ddd $$1) {
      return !$$1.h() && $$1.n().a(this.h()) && $$0.c(c) < 4 ? true : super.a($$0, $$1);
   }

   @Nullable
   @Override
   public eao a(ddd $$0) {
      eao $$1 = $$0.q().a_($$0.a());
      return $$1.a(this) ? $$1.b(c, Integer.valueOf(Math.min(4, $$1.c(c) + 1))) : super.a($$0);
   }

   @Override
   protected ffr a(eao $$0, din $$1, iv $$2, ffc $$3) {
      return $$0.c(c) == 1 ? g : h;
   }

   @Override
   protected void a(eap.a<dmm, eao> $$0) {
      $$0.a(b, c);
   }

   private boolean a(arq $$0, bwi $$1) {
      if ($$1 instanceof ckg || $$1 instanceof cis) {
         return false;
      } else {
         return !($$1 instanceof bxj) ? false : $$1 instanceof crj || $$0.O().c(djd.d);
      }
   }
}
