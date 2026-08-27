import com.mojang.serialization.MapCodec;

public abstract class dap extends dbk {
   private final cqc a;

   protected dap(cqc $$0, doy.d $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   protected abstract MapCodec<? extends dap> a();

   @Override
   public boolean a(doz $$0) {
      return true;
   }

   @Override
   public dmf a(ib $$0, doz $$1) {
      return new dlu($$0, $$1, this.a);
   }

   @Override
   public crj a(cza $$0, ib $$1, doz $$2) {
      return $$0.c_($$1) instanceof dlu $$3 ? $$3.c() : super.a($$0, $$1, $$2);
   }

   public cqc b() {
      return this.a;
   }
}
