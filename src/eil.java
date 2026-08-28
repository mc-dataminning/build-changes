import java.util.Optional;

public abstract class eil extends eim {
   private final eil.a d;
   private final int e;
   private final int f;

   protected eil(eil.a $$0, int $$1, int $$2, eim.c $$3) {
      super($$3);
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public Optional<eim.b> a(eim.a $$0) {
      return a($$0, this.e, this.f) < $$0.b().f() ? Optional.empty() : a($$0, dxw.a.a, $$1 -> this.a($$1, $$0));
   }

   private void a(eje $$0, eim.a $$1) {
      dbh $$2 = $$1.h();
      $$0.a(this.d.construct($$1.f(), $$2.d(), $$2.e()));
   }

   @FunctionalInterface
   protected interface a {
      eiq construct(dyv var1, int var2, int var3);
   }
}
