import com.mojang.serialization.MapCodec;

public abstract class djd extends djy {
   private final cwm a;

   protected djd(cwm $$0, dxu.d $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   protected abstract MapCodec<? extends djd> a();

   @Override
   public boolean a(dxv $$0) {
      return true;
   }

   @Override
   public dux a(jh $$0, dxv $$1) {
      return new dum($$0, $$1, this.a);
   }

   @Override
   public cxp a(dhl $$0, jh $$1, dxv $$2) {
      return $$0.c_($$1) instanceof dum $$3 ? $$3.c() : super.a($$0, $$1, $$2);
   }

   public cwm b() {
      return this.a;
   }
}
