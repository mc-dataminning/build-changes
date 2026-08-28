import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dea extends deg {
   public static final MapCodec<dea> a = b(dea::new);
   public static final dsr b = dsn.P;
   public static final dso c = dsn.u;

   @Override
   public MapCodec<dea> a() {
      return a;
   }

   public dea(drw.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, je.c).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected bqp a(drx $$0, dbt $$1, iz $$2, cms $$3, evi $$4) {
      if ($$1.B) {
         return bqp.a;
      } else {
         dpc $$5 = $$1.c_($$2);
         if ($$5 instanceof dov) {
            $$3.a((dov)$$5);
            $$3.a(awg.ar);
            clj.a($$3, true);
         }

         return bqp.c;
      }
   }

   @Override
   protected void a(drx $$0, dbt $$1, iz $$2, drx $$3, boolean $$4) {
      bql.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(drx $$0, arb $$1, iz $$2, azc $$3) {
      dpc $$4 = $$1.c_($$2);
      if ($$4 instanceof dov) {
         ((dov)$$4).l();
      }
   }

   @Nullable
   @Override
   public dpc a(iz $$0, drx $$1) {
      return new dov($$0, $$1);
   }

   @Override
   protected dla a_(drx $$0) {
      return dla.c;
   }

   @Override
   protected boolean c_(drx $$0) {
      return true;
   }

   @Override
   protected int a(drx $$0, dbt $$1, iz $$2) {
      return cpp.a($$1.c_($$2));
   }

   @Override
   protected drx a(drx $$0, dlh $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected drx a(drx $$0, djr $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dry.a<deu, drx> $$0) {
      $$0.a(b, c);
   }

   @Override
   public drx a(cxv $$0) {
      return this.n().a(b, $$0.d().g());
   }
}
