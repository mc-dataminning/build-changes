import java.util.Optional;

public abstract class dzf extends dzg {
   private final dzf.a d;
   private final int e;
   private final int f;

   protected dzf(dzf.a $$0, int $$1, int $$2, dzg.c $$3) {
      super($$3);
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public Optional<dzg.b> a(dzg.a $$0) {
      return a($$0, this.e, this.f) < $$0.b().e() ? Optional.empty() : a($$0, doq.a.a, $$1 -> this.a($$1, $$0));
   }

   private void a(dzy $$0, dzg.a $$1) {
      csw $$2 = $$1.h();
      $$0.a(this.d.construct($$1.f(), $$2.d(), $$2.e()));
   }

   @FunctionalInterface
   protected interface a {
      dzk construct(dpp var1, int var2, int var3);
   }
}
