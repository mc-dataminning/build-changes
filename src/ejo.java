import java.util.Optional;

public abstract class ejo extends ejp {
   private final ejo.a d;
   private final int e;
   private final int f;

   protected ejo(ejo.a $$0, int $$1, int $$2, ejp.c $$3) {
      super($$3);
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public Optional<ejp.b> a(ejp.a $$0) {
      return a($$0, this.e, this.f) < $$0.b().f() ? Optional.empty() : a($$0, dyy.a.a, $$1 -> this.a($$1, $$0));
   }

   private void a(ekh $$0, ejp.a $$1) {
      dcd $$2 = $$1.h();
      $$0.a(this.d.construct($$1.f(), $$2.d(), $$2.e()));
   }

   @FunctionalInterface
   protected interface a {
      ejt construct(dzx var1, int var2, int var3);
   }
}
