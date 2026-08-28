import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dnf extends djg<dvu> implements drq {
   public static final MapCodec<dnf> b = b(dnf::new);
   public static final dys<jm> c = dok.aF;
   public static final dym d = dyl.D;
   protected static final fcs e = dkm.a(1.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   private static final xv f = xv.c("container.enderchest");

   @Override
   public MapCodec<dnf> a() {
      return b;
   }

   protected dnf(dxu.d $$0) {
      super($$0, () -> duz.d);
      this.l(this.F.b().b(c, jm.c).b(d, Boolean.valueOf(false)));
   }

   @Override
   public dmv.c<? extends dve> a(dxv $$0, dhi $$1, jh $$2, boolean $$3) {
      return dmv.b::b;
   }

   @Override
   protected fcs a(dxv $$0, dgn $$1, jh $$2, fcd $$3) {
      return e;
   }

   @Override
   protected dqv a_(dxv $$0) {
      return dqv.b;
   }

   @Override
   public dxv a(dbg $$0) {
      etx $$1 = $$0.q().b_($$0.a());
      return this.m().b(c, $$0.g().g()).b(d, Boolean.valueOf($$1.a() == ety.c));
   }

   @Override
   protected btj a(dxv $$0, dhi $$1, jh $$2, cpx $$3, fbu $$4) {
      cuq $$5 = $$3.gw();
      if ($$5 != null && $$1.c_($$2) instanceof dvu $$7) {
         jh $$9 = $$2.d();
         if ($$1.a_($$9).d($$1, $$9)) {
            return btj.a;
         } else {
            if ($$1 instanceof ash $$10) {
               $$5.a($$7);
               $$3.a(new btr(($$1x, $$2x, $$3x) -> ctl.a($$1x, $$2x, $$5), f));
               $$3.a(axp.aj);
               com.a($$10, $$3, true);
            }

            return btj.a;
         }
      } else {
         return btj.a;
      }
   }

   @Override
   public dux a(jh $$0, dxv $$1) {
      return new dvu($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dux> duy<T> a(dhi $$0, dxv $$1, duz<T> $$2) {
      return $$0.C ? a($$2, duz.d, dvu::a) : null;
   }

   @Override
   public void a(dxv $$0, dhi $$1, jh $$2, bam $$3) {
      for (int $$4 = 0; $$4 < 3; $$4++) {
         int $$5 = $$3.a(2) * 2 - 1;
         int $$6 = $$3.a(2) * 2 - 1;
         double $$7 = (double)$$2.u() + 0.5 + 0.25 * (double)$$5;
         double $$8 = (double)((float)$$2.v() + $$3.i());
         double $$9 = (double)$$2.w() + 0.5 + 0.25 * (double)$$6;
         double $$10 = (double)($$3.i() * (float)$$5);
         double $$11 = ((double)$$3.i() - 0.5) * 0.125;
         double $$12 = (double)($$3.i() * (float)$$6);
         $$1.a(ls.ad, $$7, $$8, $$9, $$10, $$11, $$12);
      }
   }

   @Override
   protected dxv a(dxv $$0, drc $$1) {
      return $$0.b(c, $$1.a($$0.c(c)));
   }

   @Override
   protected dxv a(dxv $$0, dpl $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(dxw.a<dkm, dxv> $$0) {
      $$0.a(c, d);
   }

   @Override
   protected etx b_(dxv $$0) {
      return $$0.c(d) ? ety.c.a(false) : super.b_($$0);
   }

   @Override
   protected dxv a(dxv $$0, dhl $$1, dhx $$2, jh $$3, jm $$4, jh $$5, dxv $$6, bam $$7) {
      if ($$0.c(d)) {
         $$2.a($$3, ety.c, ety.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dxv $$0, eum $$1) {
      return false;
   }

   @Override
   protected void a(dxv $$0, ash $$1, jh $$2, bam $$3) {
      dux $$4 = $$1.c_($$2);
      if ($$4 instanceof dvu) {
         ((dvu)$$4).b();
      }
   }
}
