import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dhv extends ddv<dqx> implements dmr {
   public static final MapCodec<dhv> b = b(dhv::new);
   public static final dtw c = djc.aE;
   public static final dtt d = dts.C;
   protected static final exn e = dfc.a(1.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   private static final xe f = xe.c("container.enderchest");

   @Override
   public MapCodec<dhv> a() {
      return b;
   }

   protected dhv(dtb.d $$0) {
      super($$0, () -> dqe.e);
      this.k(this.E.b().a(c, iw.c).a(d, Boolean.valueOf(false)));
   }

   @Override
   public dhk.c<? extends dqj> a(dtc $$0, dca $$1, ir $$2, boolean $$3) {
      return dhk.b::b;
   }

   @Override
   protected exn a(dtc $$0, dbg $$1, ir $$2, ewz $$3) {
      return e;
   }

   @Override
   protected dlw a_(dtc $$0) {
      return dlw.b;
   }

   @Override
   public dtc a(cyd $$0) {
      epe $$1 = $$0.q().b_($$0.a());
      return this.n().a(c, $$0.g().g()).a(d, Boolean.valueOf($$1.a() == epf.c));
   }

   @Override
   protected bqa a(dtc $$0, dca $$1, ir $$2, cly $$3, ewq $$4) {
      cqt $$5 = $$3.gA();
      dqc $$6 = $$1.c_($$2);
      if ($$5 != null && $$6 instanceof dqx) {
         ir $$7 = $$2.c();
         if ($$1.a_($$7).g($$1, $$7)) {
            return bqa.a($$1.C);
         } else if ($$1.C) {
            return bqa.a;
         } else {
            dqx $$8 = (dqx)$$6;
            $$5.a($$8);
            $$3.a(new bqk(($$1x, $$2x, $$3x) -> cpn.a($$1x, $$2x, $$5), f));
            $$3.a(avz.ak);
            ckp.a($$3, true);
            return bqa.b;
         }
      } else {
         return bqa.a($$1.C);
      }
   }

   @Override
   public dqc a(ir $$0, dtc $$1) {
      return new dqx($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dqc> dqd<T> a(dca $$0, dtc $$1, dqe<T> $$2) {
      return $$0.C ? a($$2, dqe.e, dqx::a) : null;
   }

   @Override
   public void a(dtc $$0, dca $$1, ir $$2, ayt $$3) {
      for (int $$4 = 0; $$4 < 3; $$4++) {
         int $$5 = $$3.a(2) * 2 - 1;
         int $$6 = $$3.a(2) * 2 - 1;
         double $$7 = (double)$$2.u() + 0.5 + 0.25 * (double)$$5;
         double $$8 = (double)((float)$$2.v() + $$3.i());
         double $$9 = (double)$$2.w() + 0.5 + 0.25 * (double)$$6;
         double $$10 = (double)($$3.i() * (float)$$5);
         double $$11 = ((double)$$3.i() - 0.5) * 0.125;
         double $$12 = (double)($$3.i() * (float)$$6);
         $$1.a(lb.aa, $$7, $$8, $$9, $$10, $$11, $$12);
      }
   }

   @Override
   protected dtc a(dtc $$0, dmd $$1) {
      return $$0.a(c, $$1.a($$0.c(c)));
   }

   @Override
   protected dtc a(dtc $$0, dke $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(dtd.a<dfc, dtc> $$0) {
      $$0.a(c, d);
   }

   @Override
   protected epe b_(dtc $$0) {
      return $$0.c(d) ? epf.c.a(false) : super.b_($$0);
   }

   @Override
   protected dtc a(dtc $$0, iw $$1, dtc $$2, dcb $$3, ir $$4, ir $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, epf.c, epf.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dtc $$0, ept $$1) {
      return false;
   }

   @Override
   protected void a(dtc $$0, aqt $$1, ir $$2, ayt $$3) {
      dqc $$4 = $$1.c_($$2);
      if ($$4 instanceof dqx) {
         ((dqx)$$4).b();
      }
   }
}
