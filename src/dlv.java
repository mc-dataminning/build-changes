import com.mojang.serialization.MapCodec;

public abstract class dlv extends dmq {
   private final cyy a;

   protected dlv(cyy $$0, ebf.d $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   protected abstract MapCodec<? extends dlv> a();

   @Override
   public boolean a(ebg $$0) {
      return true;
   }

   @Override
   public dye a(iw $$0, ebg $$1) {
      return new dxs($$0, $$1, this.a);
   }

   @Override
   protected daa a(dkc $$0, iw $$1, ebg $$2, boolean $$3) {
      return $$0.c_($$1) instanceof dxs $$4 ? $$4.c() : super.a($$0, $$1, $$2, $$3);
   }

   public cyy b() {
      return this.a;
   }
}
