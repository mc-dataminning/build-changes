import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dqh extends dmi<dzm> implements duz {
   public static final MapCodec<dqh> b = b(dqh::new);
   public static final eco<jc> c = drp.e;
   public static final ech d = ecg.I;
   private static final fgw e = dno.b(14.0, 0.0, 14.0);
   private static final xg f = xg.c("container.enderchest");

   @Override
   public MapCodec<dqh> a() {
      return b;
   }

   protected dqh(ebp.d $$0) {
      super($$0, () -> dyq.d);
      this.l(this.C.b().b(c, jc.c).b(d, Boolean.valueOf(false)));
   }

   @Override
   public dpw.c<? extends dyw> a(ebq $$0, dkj $$1, iw $$2, boolean $$3) {
      return dpw.b::b;
   }

   @Override
   protected fgw a(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      return e;
   }

   @Override
   public ebq a(ded $$0) {
      eya $$1 = $$0.q().b_($$0.a());
      return this.m().b(c, $$0.g().g()).b(d, Boolean.valueOf($$1.a() == eyb.c));
   }

   @Override
   protected bvc a(ebq $$0, dkj $$1, iw $$2, csi $$3, ffy $$4) {
      cxp $$5 = $$3.gx();
      if ($$5 != null && $$1.c_($$2) instanceof dzm $$7) {
         iw $$9 = $$2.d();
         if ($$1.a_($$9).d($$1, $$9)) {
            return bvc.a;
         } else {
            if ($$1 instanceof asb $$10) {
               $$5.a($$7);
               $$3.a(new bvk(($$1x, $$2x, $$3x) -> cwk.a($$1x, $$2x, $$5), f));
               $$3.a(axi.aj);
               cqy.a($$10, $$3, true);
            }

            return bvc.a;
         }
      } else {
         return bvc.a;
      }
   }

   @Override
   public dyo a(iw $$0, ebq $$1) {
      return new dzm($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dyo> dyp<T> a(dkj $$0, ebq $$1, dyq<T> $$2) {
      return $$0.C ? a($$2, dyq.d, dzm::a) : null;
   }

   @Override
   public void a(ebq $$0, dkj $$1, iw $$2, bai $$3) {
      for (int $$4 = 0; $$4 < 3; $$4++) {
         int $$5 = $$3.a(2) * 2 - 1;
         int $$6 = $$3.a(2) * 2 - 1;
         double $$7 = (double)$$2.u() + 0.5 + 0.25 * (double)$$5;
         double $$8 = (double)((float)$$2.v() + $$3.i());
         double $$9 = (double)$$2.w() + 0.5 + 0.25 * (double)$$6;
         double $$10 = (double)($$3.i() * (float)$$5);
         double $$11 = ((double)$$3.i() - 0.5) * 0.125;
         double $$12 = (double)($$3.i() * (float)$$6);
         $$1.a(lz.af, $$7, $$8, $$9, $$10, $$11, $$12);
      }
   }

   @Override
   protected ebq a(ebq $$0, dui $$1) {
      return $$0.b(c, $$1.a($$0.c(c)));
   }

   @Override
   protected ebq a(ebq $$0, dsr $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(ebr.a<dno, ebq> $$0) {
      $$0.a(c, d);
   }

   @Override
   protected eya b_(ebq $$0) {
      return $$0.c(d) ? eyb.c.a(false) : super.b_($$0);
   }

   @Override
   protected ebq a(ebq $$0, dkm $$1, dky $$2, iw $$3, jc $$4, iw $$5, ebq $$6, bai $$7) {
      if ($$0.c(d)) {
         $$2.a($$3, eyb.c, eyb.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(ebq $$0, eyp $$1) {
      return false;
   }

   @Override
   protected void a(ebq $$0, asb $$1, iw $$2, bai $$3) {
      dyo $$4 = $$1.c_($$2);
      if ($$4 instanceof dzm) {
         ((dzm)$$4).a();
      }
   }
}
