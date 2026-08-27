import com.mojang.serialization.MapCodec;

public class dov extends dfl {
   public static final MapCodec<dov> a = b(dov::new);
   protected static final exn b = dfc.a(1.0, 0.0, 1.0, 15.0, 1.5, 15.0);

   @Override
   public MapCodec<dov> a() {
      return a;
   }

   protected dov(dtb.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dtc $$0, dca $$1, ir $$2, brv $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$1 instanceof aqt && $$3 instanceof cny) {
         $$1.a(new ir($$2), true, $$3);
      }
   }

   @Override
   protected exn a(dtc $$0, dbg $$1, ir $$2, ewz $$3) {
      return b;
   }

   @Override
   protected boolean b(dtc $$0, dbg $$1, ir $$2) {
      epe $$3 = $$1.b_($$2);
      epe $$4 = $$1.b_($$2.c());
      return ($$3.a() == epf.c || $$0.b() instanceof dje) && $$4.a() == epf.a;
   }
}
