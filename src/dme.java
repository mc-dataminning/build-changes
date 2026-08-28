import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dme extends dig<duw> implements dqs {
   public static final MapCodec<dme> b = b(dme::new);
   public static final dxu<jn> c = dnk.aF;
   public static final dxo d = dxn.J;
   protected static final fbu e = djm.a(1.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   private static final wo f = wo.c("container.enderchest");

   @Override
   public MapCodec<dme> a() {
      return b;
   }

   protected dme(dww.d $$0) {
      super($$0, () -> dub.d);
      this.l(this.F.b().b(c, jn.c).b(d, Boolean.valueOf(false)));
   }

   @Override
   public dlu.c<? extends dug> a(dwx $$0, dgi $$1, ji $$2, boolean $$3) {
      return dlu.b::b;
   }

   @Override
   protected fbu a(dwx $$0, dfn $$1, ji $$2, fbf $$3) {
      return e;
   }

   @Override
   protected dpx a_(dwx $$0) {
      return dpx.b;
   }

   @Override
   public dwx a(dag $$0) {
      esz $$1 = $$0.q().b_($$0.a());
      return this.m().b(c, $$0.g().g()).b(d, Boolean.valueOf($$1.a() == eta.c));
   }

   @Override
   protected bsj a(dwx $$0, dgi $$1, ji $$2, cox $$3, faw $$4) {
      ctq $$5 = $$3.gw();
      if ($$5 != null && $$1.c_($$2) instanceof duw $$7) {
         ji $$9 = $$2.d();
         if ($$1.a_($$9).d($$1, $$9)) {
            return bsj.a;
         } else {
            if ($$1 instanceof arc $$10) {
               $$5.a($$7);
               $$3.a(new bsr(($$1x, $$2x, $$3x) -> csl.a($$1x, $$2x, $$5), f));
               $$3.a(awk.aj);
               cnm.a($$10, $$3, true);
            }

            return bsj.a;
         }
      } else {
         return bsj.a;
      }
   }

   @Override
   public dtz a(ji $$0, dwx $$1) {
      return new duw($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dtz> dua<T> a(dgi $$0, dwx $$1, dub<T> $$2) {
      return $$0.C ? a($$2, dub.d, duw::a) : null;
   }

   @Override
   public void a(dwx $$0, dgi $$1, ji $$2, azh $$3) {
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
   protected dwx a(dwx $$0, dqe $$1) {
      return $$0.b(c, $$1.a($$0.c(c)));
   }

   @Override
   protected dwx a(dwx $$0, dol $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(dwy.a<djm, dwx> $$0) {
      $$0.a(c, d);
   }

   @Override
   protected esz b_(dwx $$0) {
      return $$0.c(d) ? eta.c.a(false) : super.b_($$0);
   }

   @Override
   protected dwx a(dwx $$0, dgl $$1, dgx $$2, ji $$3, jn $$4, ji $$5, dwx $$6, azh $$7) {
      if ($$0.c(d)) {
         $$2.a($$3, eta.c, eta.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dwx $$0, eto $$1) {
      return false;
   }

   @Override
   protected void a(dwx $$0, arc $$1, ji $$2, azh $$3) {
      dtz $$4 = $$1.c_($$2);
      if ($$4 instanceof duw) {
         ((duw)$$4).b();
      }
   }
}
