import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dgh extends deg implements dlv {
   public static final MapCodec<dgh> a = b(dgh::new);
   public static final dso b = dsn.C;
   private static final int d = 3;
   protected static final ewf c = deu.a(5.0, 5.0, 5.0, 11.0, 11.0, 11.0);

   @Override
   public MapCodec<dgh> a() {
      return a;
   }

   public dgh(drw.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(true)));
   }

   @Override
   protected void a(dry.a<deu, drx> $$0) {
      $$0.a(b);
   }

   @Override
   public dpc a(iz $$0, drx $$1) {
      return new dpo($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpc> dpd<T> a(dbt $$0, drx $$1, dpe<T> $$2) {
      return a($$2, dpe.z, $$0.B ? dpo::a : dpo::b);
   }

   @Override
   protected dla a_(drx $$0) {
      return dla.b;
   }

   @Override
   protected enq b_(drx $$0) {
      return $$0.c(b) ? enr.c.a(false) : super.b_($$0);
   }

   @Override
   protected drx a(drx $$0, je $$1, drx $$2, dbu $$3, iz $$4, iz $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, enr.c, enr.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected ewf a(drx $$0, daz $$1, iz $$2, evr $$3) {
      return c;
   }

   @Nullable
   @Override
   public drx a(cxv $$0) {
      enq $$1 = $$0.q().b_($$0.a());
      return this.n().a(b, Boolean.valueOf($$1.a(awr.a) && $$1.e() == 8));
   }

   @Override
   protected boolean a(drx $$0, eof $$1) {
      return false;
   }
}
