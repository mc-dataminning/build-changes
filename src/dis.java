import com.mojang.serialization.MapCodec;

public class dis extends dez implements dma {
   public static final MapCodec<dis> a = b(dis::new);
   private static final ewk b = dez.a(4.0, 0.0, 4.0, 12.0, 8.0, 12.0);

   public dis(dsb.d $$0) {
      super($$0);
      this.k(this.E.b().a(dss.C, Boolean.valueOf(false)));
   }

   @Override
   public MapCodec<dis> a() {
      return a;
   }

   @Override
   protected void a(dsd.a<dez, dsc> $$0) {
      $$0.a(dss.C);
   }

   @Override
   protected dsc a(dsc $$0, je $$1, dsc $$2, dbz $$3, iz $$4, iz $$5) {
      if ($$0.c(dss.C)) {
         $$3.a($$4, enw.c, enw.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected env b_(dsc $$0) {
      return $$0.c(dss.C) ? enw.c.a(false) : super.b_($$0);
   }

   @Override
   public dsc a(cya $$0) {
      env $$1 = $$0.q().b_($$0.a());
      return this.o().a(dss.C, Boolean.valueOf($$1.b(enw.c)));
   }

   @Override
   protected ewk a(dsc $$0, dbe $$1, iz $$2, evw $$3) {
      return b;
   }

   @Override
   protected boolean a(dsc $$0, eok $$1) {
      return false;
   }
}
