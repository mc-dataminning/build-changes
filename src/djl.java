import com.mojang.serialization.MapCodec;

public abstract class djl extends dkg {
   private final cwv a;

   protected djl(cwv $$0, dyl.d $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   protected abstract MapCodec<? extends djl> a();

   @Override
   public boolean a(dym $$0) {
      return true;
   }

   @Override
   public dvl a(jj $$0, dym $$1) {
      return new duz($$0, $$1, this.a);
   }

   @Override
   protected cxy a(dhs $$0, jj $$1, dym $$2, boolean $$3) {
      return $$0.c_($$1) instanceof duz $$4 ? $$4.c() : super.a($$0, $$1, $$2, $$3);
   }

   public cwv b() {
      return this.a;
   }
}
