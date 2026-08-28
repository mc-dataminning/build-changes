import com.mojang.serialization.MapCodec;

public class dpc extends dgh {
   public static final MapCodec<dpc> a = b(dpc::new);
   protected static final ext b = dfy.a(1.0, 0.0, 1.0, 15.0, 1.5, 15.0);

   @Override
   public MapCodec<dpc> a() {
      return a;
   }

   protected dpc(dtb.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dtc $$0, dcw $$1, jd $$2, bsr $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$1 instanceof aqu && $$3 instanceof cov) {
         $$1.a(new jd($$2), true, $$3);
      }
   }

   @Override
   protected ext a(dtc $$0, dcc $$1, jd $$2, exf $$3) {
      return b;
   }

   @Override
   protected boolean b(dtc $$0, dcc $$1, jd $$2) {
      epc $$3 = $$1.b_($$2);
      epc $$4 = $$1.b_($$2.d());
      return ($$3.a() == epd.c || $$0.b() instanceof djw) && $$4.a() == epd.a;
   }
}
