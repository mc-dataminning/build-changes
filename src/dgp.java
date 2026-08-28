import com.mojang.serialization.MapCodec;

public abstract class dgp extends dhk {
   private final cuu a;

   protected dgp(cuu $$0, dvc.d $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   protected abstract MapCodec<? extends dgp> a();

   @Override
   public boolean a(dvd $$0) {
      return true;
   }

   @Override
   public dsg a(jg $$0, dvd $$1) {
      return new drv($$0, $$1, this.a);
   }

   @Override
   public cvx a(dey $$0, jg $$1, dvd $$2) {
      return $$0.c_($$1) instanceof drv $$3 ? $$3.c() : super.a($$0, $$1, $$2);
   }

   public cuu b() {
      return this.a;
   }
}
