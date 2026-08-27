import java.util.Optional;

public abstract class ejs extends ejt {
   private final ejs.a d;
   private final int e;
   private final int f;

   protected ejs(ejs.a $$0, int $$1, int $$2, ejt.d $$3) {
      super($$3);
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public Optional<ejt.c> a(ejt.b $$0) {
      return a($$0, this.e, this.f) < $$0.b().e() ? Optional.empty() : a($$0, dyu.a.a, $$1 -> this.a($$1, $$0));
   }

   private void a(ekl $$0, ejt.b $$1) {
      dbh $$2 = $$1.h();
      $$0.a(this.d.construct($$1.f(), $$2.d(), $$2.e()));
   }

   @FunctionalInterface
   protected interface a {
      ejx construct(dzt var1, int var2, int var3);
   }
}
