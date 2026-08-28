import com.mojang.serialization.MapCodec;

public class doo extends dkz {
   public static final MapCodec<doo> a = b(doo::new);

   @Override
   public MapCodec<doo> a() {
      return a;
   }

   public doo(dun.d $$0) {
      super($$0);
   }

   @Override
   public void a(deg $$0, duo $$1, je $$2, bto $$3, float $$4) {
      if ($$3.cc()) {
         super.a($$0, $$1, $$2, $$3, $$4);
      } else {
         $$3.a($$4, 0.0F, $$0.ak().l());
      }
   }

   @Override
   public void a(ddl $$0, bto $$1) {
      if ($$1.cc()) {
         super.a($$0, $$1);
      } else {
         this.a($$1);
      }
   }

   private void a(bto $$0) {
      eys $$1 = $$0.dv();
      if ($$1.e < 0.0) {
         double $$2 = $$0 instanceof buk ? 1.0 : 0.8;
         $$0.n($$1.d, -$$1.e * $$2, $$1.f);
      }
   }

   @Override
   public void a(deg $$0, je $$1, duo $$2, bto $$3) {
      double $$4 = Math.abs($$3.dv().e);
      if ($$4 < 0.1 && !$$3.cb()) {
         double $$5 = 0.4 + $$4 * 0.2;
         $$3.h($$3.dv().d($$5, 1.0, $$5));
      }

      super.a($$0, $$1, $$2, $$3);
   }
}
