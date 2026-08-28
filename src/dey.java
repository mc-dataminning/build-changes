import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dey extends deg {
   public static final MapCodec<dey> a = b(dey::new);
   public static final dso[] b = new dso[]{dsn.k, dsn.l, dsn.m};
   protected static final ewf c = ewc.a(deu.a(1.0, 0.0, 1.0, 15.0, 2.0, 15.0), deu.a(7.0, 0.0, 7.0, 9.0, 14.0, 9.0));

   @Override
   public MapCodec<dey> a() {
      return a;
   }

   public dey(drw.d $$0) {
      super($$0);
      this.k(this.E.b().a(b[0], Boolean.valueOf(false)).a(b[1], Boolean.valueOf(false)).a(b[2], Boolean.valueOf(false)));
   }

   @Override
   protected dla a_(drx $$0) {
      return dla.c;
   }

   @Override
   public dpc a(iz $$0, drx $$1) {
      return new dpf($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpc> dpd<T> a(dbt $$0, drx $$1, dpe<T> $$2) {
      return $$0.B ? null : a($$2, dpe.l, dpf::a);
   }

   @Override
   protected ewf a(drx $$0, daz $$1, iz $$2, evr $$3) {
      return c;
   }

   @Override
   protected bqp a(drx $$0, dbt $$1, iz $$2, cms $$3, evi $$4) {
      if ($$1.B) {
         return bqp.a;
      } else {
         dpc $$5 = $$1.c_($$2);
         if ($$5 instanceof dpf) {
            $$3.a((dpf)$$5);
            $$3.a(awg.aa);
         }

         return bqp.c;
      }
   }

   @Override
   public void a(drx $$0, dbt $$1, iz $$2, azc $$3) {
      double $$4 = (double)$$2.u() + 0.4 + (double)$$3.i() * 0.2;
      double $$5 = (double)$$2.v() + 0.7 + (double)$$3.i() * 0.3;
      double $$6 = (double)$$2.w() + 0.4 + (double)$$3.i() * 0.2;
      $$1.a(lj.ae, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }

   @Override
   protected void a(drx $$0, dbt $$1, iz $$2, drx $$3, boolean $$4) {
      bql.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
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
   protected void a(dry.a<deu, drx> $$0) {
      $$0.a(b[0], b[1], b[2]);
   }

   @Override
   protected boolean a(drx $$0, eof $$1) {
      return false;
   }
}
