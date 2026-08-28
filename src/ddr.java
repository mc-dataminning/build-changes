import com.mojang.serialization.MapCodec;

public abstract class ddr extends dem {
   private final ctj a;

   protected ddr(ctj $$0, dsc.d $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   protected abstract MapCodec<? extends ddr> a();

   @Override
   public boolean a(dsd $$0) {
      return true;
   }

   @Override
   public dpi a(iz $$0, dsd $$1) {
      return new dox($$0, $$1, this.a);
   }

   @Override
   public cuq a(dcc $$0, iz $$1, dsd $$2) {
      return $$0.c_($$1) instanceof dox $$3 ? $$3.c() : super.a($$0, $$1, $$2);
   }

   public ctj b() {
      return this.a;
   }
}
