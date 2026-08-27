import com.mojang.serialization.MapCodec;

public abstract class dds extends den {
   private final csy a;

   protected dds(csy $$0, dtb.d $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   protected abstract MapCodec<? extends dds> a();

   @Override
   public boolean a(dtc $$0) {
      return true;
   }

   @Override
   public dqc a(ir $$0, dtc $$1) {
      return new dpq($$0, $$1, this.a);
   }

   @Override
   public cuh a(dcd $$0, ir $$1, dtc $$2) {
      return $$0.c_($$1) instanceof dpq $$3 ? $$3.c() : super.a($$0, $$1, $$2);
   }

   public csy b() {
      return this.a;
   }
}
