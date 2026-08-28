import com.mojang.serialization.MapCodec;

public abstract class diu extends djp {
   private final cwd a;

   protected diu(cwd $$0, dxn.d $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   protected abstract MapCodec<? extends diu> a();

   @Override
   public boolean a(dxo $$0) {
      return true;
   }

   @Override
   public duq a(jh $$0, dxo $$1) {
      return new duf($$0, $$1, this.a);
   }

   @Override
   protected cxg a(dhc $$0, jh $$1, dxo $$2) {
      return $$0.c_($$1) instanceof duf $$3 ? $$3.c() : super.a($$0, $$1, $$2);
   }

   public cwd b() {
      return this.a;
   }
}
