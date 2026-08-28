import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dms extends deg implements dic {
   public static final MapCodec<dms> a = b(dms::new);
   public static final dsv<dth> b = dsn.bj;

   @Override
   public MapCodec<dms> a() {
      return a;
   }

   protected dms(drw.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, dth.b));
   }

   @Override
   public dpc a(iz $$0, drx $$1) {
      return new dqr($$0, $$1);
   }

   @Override
   protected bqp a(drx $$0, dbt $$1, iz $$2, cms $$3, evi $$4) {
      dpc $$5 = $$1.c_($$2);
      if ($$5 instanceof dqr) {
         return ((dqr)$$5).a($$3) ? bqp.a($$1.B) : bqp.e;
      } else {
         return bqp.e;
      }
   }

   @Override
   public void a(dbt $$0, iz $$1, drx $$2, @Nullable btk $$3, cuk $$4) {
      if (!$$0.B) {
         if ($$3 != null) {
            dpc $$5 = $$0.c_($$1);
            if ($$5 instanceof dqr) {
               ((dqr)$$5).a($$3);
            }
         }
      }
   }

   @Override
   protected dla a_(drx $$0) {
      return dla.c;
   }

   @Override
   protected void a(dry.a<deu, drx> $$0) {
      $$0.a(b);
   }

   @Override
   protected void a(drx $$0, dbt $$1, iz $$2, deu $$3, iz $$4, boolean $$5) {
      if ($$1 instanceof arb) {
         if ($$1.c_($$2) instanceof dqr $$7) {
            boolean $$8 = $$1.C($$2);
            boolean $$9 = $$7.D();
            if ($$8 && !$$9) {
               $$7.c(true);
               this.a((arb)$$1, $$7);
            } else if (!$$8 && $$9) {
               $$7.c(false);
            }
         }
      }
   }

   private void a(arb $$0, dqr $$1) {
      switch ($$1.v()) {
         case a:
            $$1.b(false);
            break;
         case b:
            $$1.c($$0);
            break;
         case c:
            $$1.B();
         case d:
      }
   }
}
