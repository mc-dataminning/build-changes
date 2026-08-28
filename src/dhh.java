import com.mojang.serialization.MapCodec;

public abstract class dhh extends dic {
   private final cvj a;

   protected dhh(cvj $$0, dvu.d $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   protected abstract MapCodec<? extends dhh> a();

   @Override
   public boolean a(dvv $$0) {
      return true;
   }

   @Override
   public dsy a(jh $$0, dvv $$1) {
      return new dsn($$0, $$1, this.a);
   }

   @Override
   public cwm a(dfp $$0, jh $$1, dvv $$2) {
      return $$0.c_($$1) instanceof dsn $$3 ? $$3.c() : super.a($$0, $$1, $$2);
   }

   public cvj b() {
      return this.a;
   }
}
