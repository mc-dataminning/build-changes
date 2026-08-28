import java.util.Optional;

public abstract class ekn extends eko {
   private final ekn.a d;
   private final int e;
   private final int f;

   protected ekn(ekn.a $$0, int $$1, int $$2, eko.c $$3) {
      super($$3);
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public Optional<eko.b> a(eko.a $$0) {
      return a($$0, this.e, this.f) < $$0.b().f() ? Optional.empty() : a($$0, dzw.a.a, $$1 -> this.a($$1, $$0));
   }

   private void a(elg $$0, eko.a $$1) {
      dcy $$2 = $$1.h();
      $$0.a(this.d.construct($$1.f(), $$2.d(), $$2.e()));
   }

   @FunctionalInterface
   protected interface a {
      eks construct(eav var1, int var2, int var3);
   }
}
