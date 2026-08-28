import com.mojang.serialization.MapCodec;

public abstract class div extends djq {
   private final cwh a;

   protected div(cwh $$0, dxm.d $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   protected abstract MapCodec<? extends div> a();

   @Override
   public boolean a(dxn $$0) {
      return true;
   }

   @Override
   public dup a(jh $$0, dxn $$1) {
      return new due($$0, $$1, this.a);
   }

   @Override
   public cxk a(dhd $$0, jh $$1, dxn $$2) {
      return $$0.c_($$1) instanceof due $$3 ? $$3.c() : super.a($$0, $$1, $$2);
   }

   public cwh b() {
      return this.a;
   }
}
