import java.util.Optional;

public abstract class elb extends elc {
   private final elb.a d;
   private final int e;
   private final int f;

   protected elb(elb.a $$0, int $$1, int $$2, elc.c $$3) {
      super($$3);
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public Optional<elc.b> a(elc.a $$0) {
      return a($$0, this.e, this.f) < $$0.b().f() ? Optional.empty() : a($$0, eak.a.a, $$1 -> this.a($$1, $$0));
   }

   private void a(elu $$0, elc.a $$1) {
      ddm $$2 = $$1.h();
      $$0.a(this.d.construct($$1.f(), $$2.d(), $$2.e()));
   }

   @FunctionalInterface
   protected interface a {
      elg construct(ebj var1, int var2, int var3);
   }
}
