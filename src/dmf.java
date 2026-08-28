import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dmf extends dih<dux> implements dqt {
   public static final MapCodec<dmf> b = b(dmf::new);
   public static final dxv<jn> c = dnl.aF;
   public static final dxp d = dxo.J;
   protected static final fbv e = djn.a(1.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   private static final wp f = wp.c("container.enderchest");

   @Override
   public MapCodec<dmf> a() {
      return b;
   }

   protected dmf(dwx.d $$0) {
      super($$0, () -> duc.d);
      this.l(this.F.b().b(c, jn.c).b(d, Boolean.valueOf(false)));
   }

   @Override
   public dlv.c<? extends duh> a(dwy $$0, dgj $$1, ji $$2, boolean $$3) {
      return dlv.b::b;
   }

   @Override
   protected fbv a(dwy $$0, dfo $$1, ji $$2, fbg $$3) {
      return e;
   }

   @Override
   public dwy a(dah $$0) {
      eta $$1 = $$0.q().b_($$0.a());
      return this.m().b(c, $$0.g().g()).b(d, Boolean.valueOf($$1.a() == etb.c));
   }

   @Override
   protected bsl a(dwy $$0, dgj $$1, ji $$2, coy $$3, fax $$4) {
      ctr $$5 = $$3.gw();
      if ($$5 != null && $$1.c_($$2) instanceof dux $$7) {
         ji $$9 = $$2.d();
         if ($$1.a_($$9).d($$1, $$9)) {
            return bsl.a;
         } else {
            if ($$1 instanceof ard $$10) {
               $$5.a($$7);
               $$3.a(new bst(($$1x, $$2x, $$3x) -> csm.a($$1x, $$2x, $$5), f));
               $$3.a(awk.aj);
               cnn.a($$10, $$3, true);
            }

            return bsl.a;
         }
      } else {
         return bsl.a;
      }
   }

   @Override
   public dua a(ji $$0, dwy $$1) {
      return new dux($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dua> dub<T> a(dgj $$0, dwy $$1, duc<T> $$2) {
      return $$0.C ? a($$2, duc.d, dux::a) : null;
   }

   @Override
   public void a(dwy $$0, dgj $$1, ji $$2, azh $$3) {
      for (int $$4 = 0; $$4 < 3; $$4++) {
         int $$5 = $$3.a(2) * 2 - 1;
         int $$6 = $$3.a(2) * 2 - 1;
         double $$7 = (double)$$2.u() + 0.5 + 0.25 * (double)$$5;
         double $$8 = (double)((float)$$2.v() + $$3.i());
         double $$9 = (double)$$2.w() + 0.5 + 0.25 * (double)$$6;
         double $$10 = (double)($$3.i() * (float)$$5);
         double $$11 = ((double)$$3.i() - 0.5) * 0.125;
         double $$12 = (double)($$3.i() * (float)$$6);
         $$1.a(lt.ae, $$7, $$8, $$9, $$10, $$11, $$12);
      }
   }

   @Override
   protected dwy a(dwy $$0, dqf $$1) {
      return $$0.b(c, $$1.a($$0.c(c)));
   }

   @Override
   protected dwy a(dwy $$0, dom $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(dwz.a<djn, dwy> $$0) {
      $$0.a(c, d);
   }

   @Override
   protected eta b_(dwy $$0) {
      return $$0.c(d) ? etb.c.a(false) : super.b_($$0);
   }

   @Override
   protected dwy a(dwy $$0, dgm $$1, dgy $$2, ji $$3, jn $$4, ji $$5, dwy $$6, azh $$7) {
      if ($$0.c(d)) {
         $$2.a($$3, etb.c, etb.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dwy $$0, etp $$1) {
      return false;
   }

   @Override
   protected void a(dwy $$0, ard $$1, ji $$2, azh $$3) {
      dua $$4 = $$1.c_($$2);
      if ($$4 instanceof dux) {
         ((dux)$$4).b();
      }
   }
}
