import com.mojang.serialization.MapCodec;

public abstract class dep extends dfk {
   private final cti a;

   protected dep(cti $$0, dtb.d $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   protected abstract MapCodec<? extends dep> a();

   @Override
   public boolean a(dtc $$0) {
      return true;
   }

   @Override
   public dqh a(jd $$0, dtc $$1) {
      return new dpw($$0, $$1, this.a);
   }

   @Override
   public cuq a(dcz $$0, jd $$1, dtc $$2) {
      return $$0.c_($$1) instanceof dpw $$3 ? $$3.c() : super.a($$0, $$1, $$2);
   }

   public cti b() {
      return this.a;
   }
}
