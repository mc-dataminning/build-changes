import java.util.Optional;

public class dap extends das {
   private final brw a;

   public dap(brw $$0) {
      this.a = $$0;
   }

   @Override
   public Optional<Float> a(dar $$0, daf $$1, io $$2, drd $$3, emw $$4) {
      return super.a($$0, $$1, $$2, $$3, $$4).map($$5 -> this.a.a($$0, $$1, $$2, $$3, $$4, $$5));
   }

   @Override
   public boolean a(dar $$0, daf $$1, io $$2, drd $$3, float $$4) {
      return this.a.a($$0, $$1, $$2, $$3, $$4);
   }
}
