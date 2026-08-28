import com.mojang.serialization.MapCodec;

public abstract class dkr extends dlm {
   private final cxw a;

   protected dkr(cxw $$0, dzy.d $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   protected abstract MapCodec<? extends dkr> a();

   @Override
   public boolean a(dzz $$0) {
      return true;
   }

   @Override
   public dwx a(iu $$0, dzz $$1) {
      return new dwl($$0, $$1, this.a);
   }

   @Override
   protected cyy a(diy $$0, iu $$1, dzz $$2, boolean $$3) {
      return $$0.c_($$1) instanceof dwl $$4 ? $$4.c() : super.a($$0, $$1, $$2, $$3);
   }

   public cxw b() {
      return this.a;
   }
}
