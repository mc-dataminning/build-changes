import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dhl extends ddo<dpx> implements dlv {
   public static final MapCodec<dhl> b = b(dhl::new);
   public static final dsr c = diq.aE;
   public static final dso d = dsn.C;
   protected static final ewf e = deu.a(1.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   private static final xl f = xl.c("container.enderchest");

   @Override
   public MapCodec<dhl> a() {
      return b;
   }

   protected dhl(drw.d $$0) {
      super($$0, () -> dpe.d);
      this.k(this.E.b().a(c, je.c).a(d, Boolean.valueOf(false)));
   }

   @Override
   public dhb.c<? extends dpj> a(drx $$0, dbt $$1, iz $$2, boolean $$3) {
      return dhb.b::b;
   }

   @Override
   protected ewf a(drx $$0, daz $$1, iz $$2, evr $$3) {
      return e;
   }

   @Override
   protected dla a_(drx $$0) {
      return dla.b;
   }

   @Override
   public drx a(cxv $$0) {
      enq $$1 = $$0.q().b_($$0.a());
      return this.n().a(c, $$0.g().g()).a(d, Boolean.valueOf($$1.a() == enr.c));
   }

   @Override
   protected bqp a(drx $$0, dbt $$1, iz $$2, cms $$3, evi $$4) {
      crb $$5 = $$3.gp();
      dpc $$6 = $$1.c_($$2);
      if ($$5 != null && $$6 instanceof dpx) {
         iz $$7 = $$2.c();
         if ($$1.a_($$7).g($$1, $$7)) {
            return bqp.a($$1.B);
         } else if ($$1.B) {
            return bqp.a;
         } else {
            dpx $$8 = (dpx)$$6;
            $$5.a($$8);
            $$3.a(new bqz(($$1x, $$2x, $$3x) -> cpw.a($$1x, $$2x, $$5), f));
            $$3.a(awg.aj);
            clj.a($$3, true);
            return bqp.c;
         }
      } else {
         return bqp.a($$1.B);
      }
   }

   @Override
   public dpc a(iz $$0, drx $$1) {
      return new dpx($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpc> dpd<T> a(dbt $$0, drx $$1, dpe<T> $$2) {
      return $$0.B ? a($$2, dpe.d, dpx::a) : null;
   }

   @Override
   public void a(drx $$0, dbt $$1, iz $$2, azc $$3) {
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
   protected drx a(drx $$0, dlh $$1) {
      return $$0.a(c, $$1.a($$0.c(c)));
   }

   @Override
   protected drx a(drx $$0, djr $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(dry.a<deu, drx> $$0) {
      $$0.a(c, d);
   }

   @Override
   protected enq b_(drx $$0) {
      return $$0.c(d) ? enr.c.a(false) : super.b_($$0);
   }

   @Override
   protected drx a(drx $$0, je $$1, drx $$2, dbu $$3, iz $$4, iz $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, enr.c, enr.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(drx $$0, eof $$1) {
      return false;
   }

   @Override
   protected void a(drx $$0, arb $$1, iz $$2, azc $$3) {
      dpc $$4 = $$1.c_($$2);
      if ($$4 instanceof dpx) {
         ((dpx)$$4).b();
      }
   }
}
