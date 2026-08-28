import java.util.Optional;

public abstract class elw extends elx {
   private final elw.a d;
   private final int e;
   private final int f;

   protected elw(elw.a $$0, int $$1, int $$2, elx.c $$3) {
      super($$3);
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public Optional<elx.b> a(elx.a $$0) {
      return a($$0, this.e, this.f) < $$0.b().f() ? Optional.empty() : a($$0, ebf.a.a, $$1 -> this.a($$1, $$0));
   }

   private void a(emp $$0, elx.a $$1) {
      deh $$2 = $$1.h();
      $$0.a(this.d.construct($$1.f(), $$2.d(), $$2.e()));
   }

   @FunctionalInterface
   protected interface a {
      emb construct(ece var1, int var2, int var3);
   }
}
