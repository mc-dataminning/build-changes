import com.mojang.serialization.MapCodec;

public abstract class dgd extends dgy {
   private final cum a;

   protected dgd(cum $$0, dur.d $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   protected abstract MapCodec<? extends dgd> a();

   @Override
   public boolean a(dus $$0) {
      return true;
   }

   @Override
   public drv a(jf $$0, dus $$1) {
      return new drk($$0, $$1, this.a);
   }

   @Override
   public cvs a(dem $$0, jf $$1, dus $$2) {
      return $$0.c_($$1) instanceof drk $$3 ? $$3.c() : super.a($$0, $$1, $$2);
   }

   public cum b() {
      return this.a;
   }
}
