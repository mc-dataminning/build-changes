import java.util.Optional;

public abstract class erh extends eri {
   private final erh.a d;
   private final int e;
   private final int f;

   protected erh(erh.a $$0, int $$1, int $$2, eri.c $$3) {
      super($$3);
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public Optional<eri.b> a(eri.a $$0) {
      return a($$0, this.e, this.f) < $$0.b().f() ? Optional.empty() : a($$0, egn.a.a, $$1 -> this.a($$1, $$0));
   }

   private void a(esa $$0, eri.a $$1) {
      dio $$2 = $$1.h();
      $$0.a(this.d.construct($$1.f(), $$2.d(), $$2.e()));
   }

   @FunctionalInterface
   protected interface a {
      erm construct(ehm var1, int var2, int var3);
   }
}
