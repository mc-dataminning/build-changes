import java.util.Optional;

public abstract class ejl extends ejm {
   private final ejl.a d;
   private final int e;
   private final int f;

   protected ejl(ejl.a $$0, int $$1, int $$2, ejm.c $$3) {
      super($$3);
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public Optional<ejm.b> a(ejm.a $$0) {
      return a($$0, this.e, this.f) < $$0.b().f() ? Optional.empty() : a($$0, dyv.a.a, $$1 -> this.a($$1, $$0));
   }

   private void a(eke $$0, ejm.a $$1) {
      dcb $$2 = $$1.h();
      $$0.a(this.d.construct($$1.f(), $$2.d(), $$2.e()));
   }

   @FunctionalInterface
   protected interface a {
      ejq construct(dzu var1, int var2, int var3);
   }
}
