import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dne extends djf<dvt> implements drp {
   public static final MapCodec<dne> b = b(dne::new);
   public static final dyr<jm> c = doj.aF;
   public static final dyl d = dyk.D;
   protected static final fcr e = dkl.a(1.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   private static final xv f = xv.c("container.enderchest");

   @Override
   public MapCodec<dne> a() {
      return b;
   }

   protected dne(dxt.d $$0) {
      super($$0, () -> duy.d);
      this.l(this.F.b().b(c, jm.c).b(d, Boolean.valueOf(false)));
   }

   @Override
   public dmu.c<? extends dvd> a(dxu $$0, dhh $$1, jh $$2, boolean $$3) {
      return dmu.b::b;
   }

   @Override
   protected fcr a(dxu $$0, dgm $$1, jh $$2, fcc $$3) {
      return e;
   }

   @Override
   protected dqu a_(dxu $$0) {
      return dqu.b;
   }

   @Override
   public dxu a(dbf $$0) {
      etw $$1 = $$0.q().b_($$0.a());
      return this.m().b(c, $$0.g().g()).b(d, Boolean.valueOf($$1.a() == etx.c));
   }

   @Override
   protected bti a(dxu $$0, dhh $$1, jh $$2, cpw $$3, fbt $$4) {
      cup $$5 = $$3.gu();
      if ($$5 != null && $$1.c_($$2) instanceof dvt $$7) {
         jh $$9 = $$2.d();
         if ($$1.a_($$9).d($$1, $$9)) {
            return bti.a;
         } else {
            if ($$1 instanceof ash $$10) {
               $$5.a($$7);
               $$3.a(new btq(($$1x, $$2x, $$3x) -> ctk.a($$1x, $$2x, $$5), f));
               $$3.a(axp.aj);
               col.a($$10, $$3, true);
            }

            return bti.a;
         }
      } else {
         return bti.a;
      }
   }

   @Override
   public duw a(jh $$0, dxu $$1) {
      return new dvt($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends duw> dux<T> a(dhh $$0, dxu $$1, duy<T> $$2) {
      return $$0.C ? a($$2, duy.d, dvt::a) : null;
   }

   @Override
   public void a(dxu $$0, dhh $$1, jh $$2, bam $$3) {
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
   protected dxu a(dxu $$0, drb $$1) {
      return $$0.b(c, $$1.a($$0.c(c)));
   }

   @Override
   protected dxu a(dxu $$0, dpk $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(dxv.a<dkl, dxu> $$0) {
      $$0.a(c, d);
   }

   @Override
   protected etw b_(dxu $$0) {
      return $$0.c(d) ? etx.c.a(false) : super.b_($$0);
   }

   @Override
   protected dxu a(dxu $$0, dhk $$1, dhw $$2, jh $$3, jm $$4, jh $$5, dxu $$6, bam $$7) {
      if ($$0.c(d)) {
         $$2.a($$3, etx.c, etx.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dxu $$0, eul $$1) {
      return false;
   }

   @Override
   protected void a(dxu $$0, ash $$1, jh $$2, bam $$3) {
      duw $$4 = $$1.c_($$2);
      if ($$4 instanceof dvt) {
         ((dvt)$$4).b();
      }
   }
}
