import java.util.Optional;

public class dan extends daq {
   private final bru a;

   public dan(bru $$0) {
      this.a = $$0;
   }

   @Override
   public Optional<Float> a(dap $$0, dad $$1, io $$2, drb $$3, emu $$4) {
      return super.a($$0, $$1, $$2, $$3, $$4).map($$5 -> this.a.a($$0, $$1, $$2, $$3, $$4, $$5));
   }

   @Override
   public boolean a(dap $$0, dad $$1, io $$2, drb $$3, float $$4) {
      return this.a.a($$0, $$1, $$2, $$3, $$4);
   }
}
