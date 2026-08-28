import java.util.Optional;

public abstract class eiw extends eix {
   private final eiw.a d;
   private final int e;
   private final int f;

   protected eiw(eiw.a $$0, int $$1, int $$2, eix.c $$3) {
      super($$3);
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public Optional<eix.b> a(eix.a $$0) {
      return a($$0, this.e, this.f) < $$0.b().f() ? Optional.empty() : a($$0, dyg.a.a, $$1 -> this.a($$1, $$0));
   }

   private void a(ejp $$0, eix.a $$1) {
      dbn $$2 = $$1.h();
      $$0.a(this.d.construct($$1.f(), $$2.d(), $$2.e()));
   }

   @FunctionalInterface
   protected interface a {
      ejb construct(dzf var1, int var2, int var3);
   }
}
