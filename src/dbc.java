import com.mojang.serialization.MapCodec;

public class dbc extends cxp {
   public static final MapCodec<dbc> a = b(dbc::new);

   @Override
   public MapCodec<dbc> a() {
      return a;
   }

   public dbc(dga.d $$0) {
      super($$0);
   }

   @Override
   public void a(cqz $$0, dgb $$1, ht $$2, bjt $$3, float $$4) {
      if ($$3.bT()) {
         super.a($$0, $$1, $$2, $$3, $$4);
      } else {
         $$3.a($$4, 0.0F, $$0.ag().k());
      }
   }

   @Override
   public void a(cqf $$0, bjt $$1) {
      if ($$1.bT()) {
         super.a($$0, $$1);
      } else {
         this.a($$1);
      }
   }

   private void a(bjt $$0) {
      eif $$1 = $$0.do();
      if ($$1.d < 0.0) {
         double $$2 = $$0 instanceof bkj ? 1.0 : 0.8;
         $$0.o($$1.c, -$$1.d * $$2, $$1.e);
      }
   }

   @Override
   public void a(cqz $$0, ht $$1, dgb $$2, bjt $$3) {
      double $$4 = Math.abs($$3.do().d);
      if ($$4 < 0.1 && !$$3.bS()) {
         double $$5 = 0.4 + $$4 * 0.2;
         $$3.f($$3.do().d($$5, 1.0, $$5));
      }

      super.a($$0, $$1, $$2, $$3);
   }
}
