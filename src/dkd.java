import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dkd extends dgg<dsr> implements doo {
   public static final MapCodec<dkd> b = b(dkd::new);
   public static final dvm c = dli.aF;
   public static final dvj d = dvi.C;
   protected static final ezq e = dhm.a(1.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   private static final xe f = xe.c("container.enderchest");

   @Override
   public MapCodec<dkd> a() {
      return b;
   }

   protected dkd(dur.d $$0) {
      super($$0, () -> drx.d);
      this.l(this.F.b().b(c, jk.c).b(d, Boolean.valueOf(false)));
   }

   @Override
   public djt.c<? extends dsc> a(dus $$0, dej $$1, jf $$2, boolean $$3) {
      return djt.b::b;
   }

   @Override
   protected ezq a(dus $$0, ddo $$1, jf $$2, ezb $$3) {
      return e;
   }

   @Override
   protected dnt a_(dus $$0) {
      return dnt.b;
   }

   @Override
   public dus a(czn $$0) {
      eqt $$1 = $$0.q().b_($$0.a());
      return this.n().b(c, $$0.g().g()).b(d, Boolean.valueOf($$1.a() == equ.c));
   }

   @Override
   protected brs a(dus $$0, dej $$1, jf $$2, cnx $$3, eys $$4) {
      csn $$5 = $$3.gq();
      if ($$5 != null && $$1.c_($$2) instanceof dsr $$7) {
         jf $$9 = $$2.d();
         if ($$1.a_($$9).d($$1, $$9)) {
            return brs.a;
         } else {
            if (!$$1.B) {
               $$5.a($$7);
               $$3.a(new bsa(($$1x, $$2x, $$3x) -> cri.a($$1x, $$2x, $$5), f));
               $$3.a(awq.aj);
               cmo.a($$3, true);
            }

            return brs.a;
         }
      } else {
         return brs.a;
      }
   }

   @Override
   public drv a(jf $$0, dus $$1) {
      return new dsr($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends drv> drw<T> a(dej $$0, dus $$1, drx<T> $$2) {
      return $$0.B ? a($$2, drx.d, dsr::a) : null;
   }

   @Override
   public void a(dus $$0, dej $$1, jf $$2, azn $$3) {
      for (int $$4 = 0; $$4 < 3; $$4++) {
         int $$5 = $$3.a(2) * 2 - 1;
         int $$6 = $$3.a(2) * 2 - 1;
         double $$7 = (double)$$2.u() + 0.5 + 0.25 * (double)$$5;
         double $$8 = (double)((float)$$2.v() + $$3.i());
         double $$9 = (double)$$2.w() + 0.5 + 0.25 * (double)$$6;
         double $$10 = (double)($$3.i() * (float)$$5);
         double $$11 = ((double)$$3.i() - 0.5) * 0.125;
         double $$12 = (double)($$3.i() * (float)$$6);
         $$1.a(lo.ac, $$7, $$8, $$9, $$10, $$11, $$12);
      }
   }

   @Override
   protected dus a(dus $$0, doa $$1) {
      return $$0.b(c, $$1.a($$0.c(c)));
   }

   @Override
   protected dus a(dus $$0, dmj $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(dut.a<dhm, dus> $$0) {
      $$0.a(c, d);
   }

   @Override
   protected eqt b_(dus $$0) {
      return $$0.c(d) ? equ.c.a(false) : super.b_($$0);
   }

   @Override
   protected dus a(dus $$0, jk $$1, dus $$2, dek $$3, jf $$4, jf $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, equ.c, equ.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dus $$0, eri $$1) {
      return false;
   }

   @Override
   protected void a(dus $$0, arj $$1, jf $$2, azn $$3) {
      drv $$4 = $$1.c_($$2);
      if ($$4 instanceof dsr) {
         ((dsr)$$4).b();
      }
   }
}
