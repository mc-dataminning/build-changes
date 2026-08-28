import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dlo extends deg implements dlv {
   public static final MapCodec<dlo> a = b(dlo::new);
   public static final dso b = dsn.F;
   public static final dso c = dsn.C;
   public static final dso d = dsn.G;
   protected static final ewf e = deu.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final double f = e.c(je.a.b);

   @Override
   public MapCodec<dlo> a() {
      return a;
   }

   public dlo(drw.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dry.a<deu, drx> $$0) {
      $$0.a(b);
      $$0.a(c);
      $$0.a(d);
   }

   @Override
   public void a(dbt $$0, iz $$1, drx $$2, bsp $$3) {
      if ($$0 instanceof arb $$4) {
         arc $$5 = dqk.a($$3);
         if ($$5 != null) {
            $$4.a($$1, dpe.L).ifPresent($$2x -> $$2x.a($$4, $$5));
         }
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(drx $$0, dbt $$1, iz $$2, drx $$3, boolean $$4) {
      if ($$1 instanceof arb $$5 && $$0.c(b) && !$$0.a($$3.b())) {
         $$5.a($$2, dpe.L).ifPresent($$1x -> $$1x.a($$5));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(drx $$0, arb $$1, iz $$2, azc $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf(false)), 3);
         $$1.a($$2, dpe.L).ifPresent($$1x -> $$1x.a($$1));
      }
   }

   @Override
   protected dla a_(drx $$0) {
      return dla.c;
   }

   @Override
   protected ewf b(drx $$0, daz $$1, iz $$2, evr $$3) {
      return e;
   }

   @Override
   protected ewf f(drx $$0, daz $$1, iz $$2) {
      return e;
   }

   @Override
   protected boolean f_(drx $$0) {
      return true;
   }

   @Nullable
   @Override
   public dpc a(iz $$0, drx $$1) {
      return new dqk($$0, $$1);
   }

   @Override
   protected drx a(drx $$0, je $$1, drx $$2, dbu $$3, iz $$4, iz $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, enr.c, enr.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public drx a(cxv $$0) {
      return this.n().a(c, Boolean.valueOf($$0.q().b_($$0.a()).a() == enr.c));
   }

   @Override
   protected enq b_(drx $$0) {
      return $$0.c(c) ? enr.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(drx $$0, arb $$1, iz $$2, cuk $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, bpr.a(5));
      }
   }

   @Nullable
   @Override
   public <T extends dpc> dpd<T> a(dbt $$0, drx $$1, dpe<T> $$2) {
      return !$$0.B ? deg.a($$2, dpe.L, ($$0x, $$1x, $$2x, $$3) -> dwz.c.a($$0x, $$3.gs(), $$3.gt())) : null;
   }
}
