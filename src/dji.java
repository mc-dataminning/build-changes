import com.mojang.serialization.MapCodec;
import java.util.function.ToIntFunction;

public class dji extends deu implements dlv {
   public static final MapCodec<dji> a = b(dji::new);
   public static final int b = 15;
   public static final dsx c = dsn.aP;
   public static final dso d = dsn.C;
   public static final ToIntFunction<drx> e = $$0 -> $$0.c(c);

   @Override
   public MapCodec<dji> a() {
      return a;
   }

   public dji(drw.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(15)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dry.a<deu, drx> $$0) {
      $$0.a(c, d);
   }

   @Override
   protected bqp a(drx $$0, dbt $$1, iz $$2, cms $$3, evi $$4) {
      if (!$$1.B && $$3.gz()) {
         $$1.a($$2, $$0.a(c), 2);
         return bqp.a;
      } else {
         return bqp.c;
      }
   }

   @Override
   protected ewf a(drx $$0, daz $$1, iz $$2, evr $$3) {
      return $$3.a(cun.hC) ? ewc.b() : ewc.a();
   }

   @Override
   protected boolean a_(drx $$0, daz $$1, iz $$2) {
      return true;
   }

   @Override
   protected dla a_(drx $$0) {
      return dla.a;
   }

   @Override
   protected float d(drx $$0, daz $$1, iz $$2) {
      return 1.0F;
   }

   @Override
   protected drx a(drx $$0, je $$1, drx $$2, dbu $$3, iz $$4, iz $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, enr.c, enr.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected enq b_(drx $$0) {
      return $$0.c(d) ? enr.c.a(false) : super.b_($$0);
   }

   @Override
   public cuk a(dbw $$0, iz $$1, drx $$2) {
      return a(super.a($$0, $$1, $$2), $$2.c(c));
   }

   public static cuk a(cuk $$0, int $$1) {
      if ($$1 != 15) {
         $$0.b(km.aa, cwv.a.a(c, $$1));
      }

      return $$0;
   }
}
