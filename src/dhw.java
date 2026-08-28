import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dhw extends ddz<dqi> implements dmg {
   public static final MapCodec<dhw> b = b(dhw::new);
   public static final dtb c = djb.aE;
   public static final dsy d = dsx.C;
   protected static final ews e = dff.a(1.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   private static final wu f = wu.c("container.enderchest");

   @Override
   public MapCodec<dhw> a() {
      return b;
   }

   protected dhw(dsg.d $$0) {
      super($$0, () -> dpp.d);
      this.k(this.E.b().a(c, jf.c).a(d, Boolean.valueOf(false)));
   }

   @Override
   public dhm.c<? extends dpu> a(dsh $$0, dcd $$1, ja $$2, boolean $$3) {
      return dhm.b::b;
   }

   @Override
   protected ews a(dsh $$0, dbj $$1, ja $$2, ewe $$3) {
      return e;
   }

   @Override
   protected dll a_(dsh $$0) {
      return dll.b;
   }

   @Override
   public dsh a(cxk $$0) {
      eob $$1 = $$0.q().b_($$0.a());
      return this.o().a(c, $$0.g().g()).a(d, Boolean.valueOf($$1.a() == eoc.c));
   }

   @Override
   protected bqd a(dsh $$0, dcd $$1, ja $$2, cmh $$3, evv $$4) {
      cqr $$5 = $$3.gl();
      dpn $$6 = $$1.c_($$2);
      if ($$5 != null && $$6 instanceof dqi) {
         ja $$7 = $$2.c();
         if ($$1.a_($$7).g($$1, $$7)) {
            return bqd.a($$1.B);
         } else if ($$1.B) {
            return bqd.a;
         } else {
            dqi $$8 = (dqi)$$6;
            $$5.a($$8);
            $$3.a(new bqn(($$1x, $$2x, $$3x) -> cpm.a($$1x, $$2x, $$5), f));
            $$3.a(avp.aj);
            cky.a($$3, true);
            return bqd.c;
         }
      } else {
         return bqd.a($$1.B);
      }
   }

   @Override
   public dpn a(ja $$0, dsh $$1) {
      return new dqi($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpn> dpo<T> a(dcd $$0, dsh $$1, dpp<T> $$2) {
      return $$0.B ? a($$2, dpp.d, dqi::a) : null;
   }

   @Override
   public void a(dsh $$0, dcd $$1, ja $$2, aym $$3) {
      for (int $$4 = 0; $$4 < 3; $$4++) {
         int $$5 = $$3.a(2) * 2 - 1;
         int $$6 = $$3.a(2) * 2 - 1;
         double $$7 = (double)$$2.u() + 0.5 + 0.25 * (double)$$5;
         double $$8 = (double)((float)$$2.v() + $$3.i());
         double $$9 = (double)$$2.w() + 0.5 + 0.25 * (double)$$6;
         double $$10 = (double)($$3.i() * (float)$$5);
         double $$11 = ((double)$$3.i() - 0.5) * 0.125;
         double $$12 = (double)($$3.i() * (float)$$6);
         $$1.a(lj.ac, $$7, $$8, $$9, $$10, $$11, $$12);
      }
   }

   @Override
   protected dsh a(dsh $$0, dls $$1) {
      return $$0.a(c, $$1.a($$0.c(c)));
   }

   @Override
   protected dsh a(dsh $$0, dkc $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(dsi.a<dff, dsh> $$0) {
      $$0.a(c, d);
   }

   @Override
   protected eob b_(dsh $$0) {
      return $$0.c(d) ? eoc.c.a(false) : super.b_($$0);
   }

   @Override
   protected dsh a(dsh $$0, jf $$1, dsh $$2, dce $$3, ja $$4, ja $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, eoc.c, eoc.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dsh $$0, eoq $$1) {
      return false;
   }

   @Override
   protected void a(dsh $$0, aqk $$1, ja $$2, aym $$3) {
      dpn $$4 = $$1.c_($$2);
      if ($$4 instanceof dqi) {
         ((dqi)$$4).b();
      }
   }
}
