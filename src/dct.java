import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dct extends cyw<dld> implements dhc {
   public static final MapCodec<dct> b = b(dct::new);
   public static final dnv c = ddx.aE;
   public static final dns d = dnr.C;
   protected static final eqm e = dac.a(1.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   private static final vu f = vu.c("container.enderchest");

   @Override
   public MapCodec<dct> a() {
      return b;
   }

   protected dct(dna.d $$0) {
      super($$0, () -> dkk.d);
      this.k(this.E.b().a(c, ih.c).a(d, Boolean.valueOf(false)));
   }

   @Override
   public dcj.c<? extends dkp> a(dnb $$0, cxb $$1, ib $$2, boolean $$3) {
      return dcj.b::b;
   }

   @Override
   protected eqm a(dnb $$0, cwh $$1, ib $$2, epy $$3) {
      return e;
   }

   @Override
   protected dgh b_(dnb $$0) {
      return dgh.b;
   }

   @Override
   public dnb a(csu $$0) {
      eip $$1 = $$0.q().b_($$0.a());
      return this.o().a(c, $$0.g().g()).a(d, Boolean.valueOf($$1.a() == eiq.c));
   }

   @Override
   protected bnd a(dnb $$0, cxb $$1, ib $$2, ciu $$3, epp $$4) {
      cnc $$5 = $$3.gm();
      dki $$6 = $$1.c_($$2);
      if ($$5 != null && $$6 instanceof dld) {
         ib $$7 = $$2.c();
         if ($$1.a_($$7).g($$1, $$7)) {
            return bnd.a($$1.B);
         } else if ($$1.B) {
            return bnd.a;
         } else {
            dld $$8 = (dld)$$6;
            $$5.a($$8);
            $$3.a(new bnn(($$1x, $$2x, $$3x) -> clx.a($$1x, $$2x, $$5), f));
            $$3.a(aui.aj);
            chl.a($$3, true);
            return bnd.b;
         }
      } else {
         return bnd.a($$1.B);
      }
   }

   @Override
   public dki a(ib $$0, dnb $$1) {
      return new dld($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dki> dkj<T> a(cxb $$0, dnb $$1, dkk<T> $$2) {
      return $$0.B ? a($$2, dkk.d, dld::a) : null;
   }

   @Override
   public void a(dnb $$0, cxb $$1, ib $$2, axd $$3) {
      for (int $$4 = 0; $$4 < 3; $$4++) {
         int $$5 = $$3.a(2) * 2 - 1;
         int $$6 = $$3.a(2) * 2 - 1;
         double $$7 = (double)$$2.u() + 0.5 + 0.25 * (double)$$5;
         double $$8 = (double)((float)$$2.v() + $$3.i());
         double $$9 = (double)$$2.w() + 0.5 + 0.25 * (double)$$6;
         double $$10 = (double)($$3.i() * (float)$$5);
         double $$11 = ((double)$$3.i() - 0.5) * 0.125;
         double $$12 = (double)($$3.i() * (float)$$6);
         $$1.a(kc.aa, $$7, $$8, $$9, $$10, $$11, $$12);
      }
   }

   @Override
   protected dnb a(dnb $$0, dgo $$1) {
      return $$0.a(c, $$1.a($$0.c(c)));
   }

   @Override
   protected dnb a(dnb $$0, dey $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(dnc.a<dac, dnb> $$0) {
      $$0.a(c, d);
   }

   @Override
   protected eip c_(dnb $$0) {
      return $$0.c(d) ? eiq.c.a(false) : super.c_($$0);
   }

   @Override
   protected dnb a(dnb $$0, ih $$1, dnb $$2, cxc $$3, ib $$4, ib $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, eiq.c, eiq.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dnb $$0, cwh $$1, ib $$2, eje $$3) {
      return false;
   }

   @Override
   protected void a(dnb $$0, apf $$1, ib $$2, axd $$3) {
      dki $$4 = $$1.c_($$2);
      if ($$4 instanceof dld) {
         ((dld)$$4).b();
      }
   }
}
