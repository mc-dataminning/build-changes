import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dnp extends deg {
   public static final MapCodec<dnp> a = b(dnp::new);
   public static final dta<drk> b = dsn.bz;
   public static final dsr c = diq.aE;
   public static final dso d = dsn.bA;

   @Override
   public MapCodec<dnp> a() {
      return a;
   }

   public dnp(drw.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, je.c).a(b, drk.a).a(d, Boolean.valueOf(false)));
   }

   @Override
   public bqr a(cuk $$0, drx $$1, dbt $$2, iz $$3, cms $$4, bqo $$5, evi $$6) {
      if ($$0.e() || $$1.c(b) != drk.b) {
         return bqr.d;
      } else if ($$2 instanceof arb $$7) {
         if ($$7.c_($$3) instanceof drf $$9) {
            drf.b.a($$7, $$3, $$1, $$9.f(), $$9.b(), $$9.c(), $$4, $$0);
            return bqr.a;
         } else {
            return bqr.d;
         }
      } else {
         return bqr.b;
      }
   }

   @Nullable
   @Override
   public dpc a(iz $$0, drx $$1) {
      return new drf($$0, $$1);
   }

   @Override
   protected void a(dry.a<deu, drx> $$0) {
      $$0.a(c, b, d);
   }

   @Nullable
   @Override
   public <T extends dpc> dpd<T> a(dbt $$0, drx $$1, dpe<T> $$2) {
      return $$0 instanceof arb $$3
         ? a($$2, dpe.R, ($$1x, $$2x, $$3x, $$4) -> drf.b.a($$3, $$2x, $$3x, $$4.f(), $$4.b(), $$4.c()))
         : a($$2, dpe.R, ($$0x, $$1x, $$2x, $$3x) -> drf.a.a($$0x, $$1x, $$2x, $$3x.d(), $$3x.c()));
   }

   @Override
   public drx a(cxv $$0) {
      return this.n().a(c, $$0.g().g());
   }

   @Override
   public drx a(drx $$0, dlh $$1) {
      return $$0.a(c, $$1.a($$0.c(c)));
   }

   @Override
   public drx a(drx $$0, djr $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   public dla a_(drx $$0) {
      return dla.c;
   }
}
