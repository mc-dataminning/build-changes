import com.mojang.serialization.MapCodec;

public abstract class die extends diz {
   private final cvn a;

   protected die(cvn $$0, dwx.d $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   protected abstract MapCodec<? extends die> a();

   @Override
   public boolean a(dwy $$0) {
      return true;
   }

   @Override
   public dua a(ji $$0, dwy $$1) {
      return new dtp($$0, $$1, this.a);
   }

   @Override
   protected cwq a(dgm $$0, ji $$1, dwy $$2, boolean $$3) {
      return $$0.c_($$1) instanceof dtp $$4 ? $$4.c() : super.a($$0, $$1, $$2, $$3);
   }

   public cvn b() {
      return this.a;
   }
}
