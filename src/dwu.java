import java.util.Optional;

public abstract class dwu extends dwv {
   private final dwu.a d;
   private final int e;
   private final int f;

   protected dwu(dwu.a $$0, int $$1, int $$2, dwv.c $$3) {
      super($$3);
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public Optional<dwv.b> a(dwv.a $$0) {
      return a($$0, this.e, this.f) < $$0.b().e() ? Optional.empty() : a($$0, dmf.a.a, $$1 -> this.a($$1, $$0));
   }

   private void a(dxn $$0, dwv.a $$1) {
      cqz $$2 = $$1.h();
      $$0.a(this.d.construct($$1.f(), $$2.d(), $$2.e()));
   }

   @FunctionalInterface
   protected interface a {
      dwz construct(dne var1, int var2, int var3);
   }
}
