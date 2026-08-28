import com.mojang.serialization.MapCodec;

public abstract class dic extends dix {
   private final cvl a;

   protected dic(cvl $$0, dwv.d $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   protected abstract MapCodec<? extends dic> a();

   @Override
   public boolean a(dww $$0) {
      return true;
   }

   @Override
   public dty a(ji $$0, dww $$1) {
      return new dtn($$0, $$1, this.a);
   }

   @Override
   protected cwo a(dgk $$0, ji $$1, dww $$2, boolean $$3) {
      return $$0.c_($$1) instanceof dtn $$4 ? $$4.c() : super.a($$0, $$1, $$2, $$3);
   }

   public cvl b() {
      return this.a;
   }
}
