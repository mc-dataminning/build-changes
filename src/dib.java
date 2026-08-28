import com.mojang.serialization.MapCodec;

public abstract class dib extends diw {
   private final cvk a;

   protected dib(cvk $$0, dwu.d $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   protected abstract MapCodec<? extends dib> a();

   @Override
   public boolean a(dwv $$0) {
      return true;
   }

   @Override
   public dtx a(ji $$0, dwv $$1) {
      return new dtm($$0, $$1, this.a);
   }

   @Override
   protected cwn a(dgj $$0, ji $$1, dwv $$2, boolean $$3) {
      return $$0.c_($$1) instanceof dtm $$4 ? $$4.c() : super.a($$0, $$1, $$2, $$3);
   }

   public cvk b() {
      return this.a;
   }
}
