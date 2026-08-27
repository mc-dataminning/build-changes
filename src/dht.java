import com.mojang.serialization.MapCodec;

public class dht extends dea implements dlb {
   public static final MapCodec<dht> a = b(dht::new);
   private static final evf b = dea.a(4.0, 0.0, 4.0, 12.0, 8.0, 12.0);

   public dht(drc.d $$0) {
      super($$0);
      this.k(this.E.b().a(drt.C, Boolean.valueOf(false)));
   }

   @Override
   public MapCodec<dht> a() {
      return a;
   }

   @Override
   protected void a(dre.a<dea, drd> $$0) {
      $$0.a(drt.C);
   }

   @Override
   protected drd a(drd $$0, it $$1, drd $$2, dba $$3, io $$4, io $$5) {
      if ($$0.c(drt.C)) {
         $$3.a($$4, emx.c, emx.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected emw b_(drd $$0) {
      return $$0.c(drt.C) ? emx.c.a(false) : super.b_($$0);
   }

   @Override
   public drd a(cxb $$0) {
      emw $$1 = $$0.q().b_($$0.a());
      return this.n().a(drt.C, Boolean.valueOf($$1.b(emx.c)));
   }

   @Override
   protected evf a(drd $$0, daf $$1, io $$2, eur $$3) {
      return b;
   }

   @Override
   protected boolean a(drd $$0, enl $$1) {
      return false;
   }
}
