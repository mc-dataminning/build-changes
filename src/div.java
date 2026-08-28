import com.mojang.serialization.MapCodec;

public abstract class div extends djq {
   private final cwe a;

   protected div(cwe $$0, dxp.d $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   protected abstract MapCodec<? extends div> a();

   @Override
   public boolean a(dxq $$0) {
      return true;
   }

   @Override
   public dus a(ji $$0, dxq $$1) {
      return new duh($$0, $$1, this.a);
   }

   @Override
   protected cxh a(dhc $$0, ji $$1, dxq $$2, boolean $$3) {
      return $$0.c_($$1) instanceof duh $$4 ? $$4.c() : super.a($$0, $$1, $$2, $$3);
   }

   public cwe b() {
      return this.a;
   }
}
