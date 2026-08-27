import com.mojang.serialization.MapCodec;

public class dmu extends diw {
   public static final MapCodec<dmu> a = b(dmu::new);

   @Override
   public MapCodec<dmu> a() {
      return a;
   }

   public dmu(dtb.d $$0) {
      super($$0);
   }

   @Override
   public void a(dca $$0, dtc $$1, ir $$2, brv $$3, float $$4) {
      if ($$3.cc()) {
         super.a($$0, $$1, $$2, $$3, $$4);
      } else {
         $$3.a($$4, 0.0F, $$0.aj().l());
      }
   }

   @Override
   public void a(dbg $$0, brv $$1) {
      if ($$1.cc()) {
         super.a($$0, $$1);
      } else {
         this.a($$1);
      }
   }

   private void a(brv $$0) {
      ewu $$1 = $$0.dx();
      if ($$1.d < 0.0) {
         double $$2 = $$0 instanceof bso ? 1.0 : 0.8;
         $$0.o($$1.c, -$$1.d * $$2, $$1.e);
      }
   }

   @Override
   public void a(dca $$0, ir $$1, dtc $$2, brv $$3) {
      double $$4 = Math.abs($$3.dx().d);
      if ($$4 < 0.1 && !$$3.cb()) {
         double $$5 = 0.4 + $$4 * 0.2;
         $$3.g($$3.dx().d($$5, 1.0, $$5));
      }

      super.a($$0, $$1, $$2, $$3);
   }
}
