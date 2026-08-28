import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dla extends dhd<dtn> implements dpk {
   public static final MapCodec<dla> b = b(dla::new);
   public static final dwl<jm> c = dme.aF;
   public static final dwf d = dwe.C;
   protected static final fal e = dij.a(1.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   private static final xl f = xl.c("container.enderchest");

   @Override
   public MapCodec<dla> a() {
      return b;
   }

   protected dla(dvn.d $$0) {
      super($$0, () -> dst.d);
      this.l(this.F.b().b(c, jm.c).b(d, Boolean.valueOf(false)));
   }

   @Override
   public dkq.c<? extends dsy> a(dvo $$0, dff $$1, jh $$2, boolean $$3) {
      return dkq.b::b;
   }

   @Override
   protected fal a(dvo $$0, dek $$1, jh $$2, ezw $$3) {
      return e;
   }

   @Override
   protected dop a_(dvo $$0) {
      return dop.b;
   }

   @Override
   public dvo a(czw $$0) {
      ero $$1 = $$0.q().b_($$0.a());
      return this.m().b(c, $$0.g().g()).b(d, Boolean.valueOf($$1.a() == erp.c));
   }

   @Override
   protected bsh a(dvo $$0, dff $$1, jh $$2, cor $$3, ezn $$4) {
      ctg $$5 = $$3.gz();
      if ($$5 != null && $$1.c_($$2) instanceof dtn $$7) {
         jh $$9 = $$2.d();
         if ($$1.a_($$9).d($$1, $$9)) {
            return bsh.a;
         } else {
            if (!$$1.C) {
               $$5.a($$7);
               $$3.a(new bsp(($$1x, $$2x, $$3x) -> csb.a($$1x, $$2x, $$5), f));
               $$3.a(awy.aj);
               cng.a($$3, true);
            }

            return bsh.a;
         }
      } else {
         return bsh.a;
      }
   }

   @Override
   public dsr a(jh $$0, dvo $$1) {
      return new dtn($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dsr> dss<T> a(dff $$0, dvo $$1, dst<T> $$2) {
      return $$0.C ? a($$2, dst.d, dtn::a) : null;
   }

   @Override
   public void a(dvo $$0, dff $$1, jh $$2, azv $$3) {
      for (int $$4 = 0; $$4 < 3; $$4++) {
         int $$5 = $$3.a(2) * 2 - 1;
         int $$6 = $$3.a(2) * 2 - 1;
         double $$7 = (double)$$2.u() + 0.5 + 0.25 * (double)$$5;
         double $$8 = (double)((float)$$2.v() + $$3.i());
         double $$9 = (double)$$2.w() + 0.5 + 0.25 * (double)$$6;
         double $$10 = (double)($$3.i() * (float)$$5);
         double $$11 = ((double)$$3.i() - 0.5) * 0.125;
         double $$12 = (double)($$3.i() * (float)$$6);
         $$1.a(ls.ac, $$7, $$8, $$9, $$10, $$11, $$12);
      }
   }

   @Override
   protected dvo a(dvo $$0, dow $$1) {
      return $$0.b(c, $$1.a($$0.c(c)));
   }

   @Override
   protected dvo a(dvo $$0, dnf $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(dvp.a<dij, dvo> $$0) {
      $$0.a(c, d);
   }

   @Override
   protected ero b_(dvo $$0) {
      return $$0.c(d) ? erp.c.a(false) : super.b_($$0);
   }

   @Override
   protected dvo a(dvo $$0, dfi $$1, dfu $$2, jh $$3, jm $$4, jh $$5, dvo $$6, azv $$7) {
      if ($$0.c(d)) {
         $$2.a($$3, erp.c, erp.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dvo $$0, esd $$1) {
      return false;
   }

   @Override
   protected void a(dvo $$0, arq $$1, jh $$2, azv $$3) {
      dsr $$4 = $$1.c_($$2);
      if ($$4 instanceof dtn) {
         ((dtn)$$4).b();
      }
   }
}
