import java.util.Optional;

public abstract class enm extends enn {
   private final enm.a d;
   private final int e;
   private final int f;

   protected enm(enm.a $$0, int $$1, int $$2, enn.c $$3) {
      super($$3);
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public Optional<enn.b> a(enn.a $$0) {
      return a($$0, this.e, this.f) < $$0.b().f() ? Optional.empty() : a($$0, ect.a.a, $$1 -> this.a($$1, $$0));
   }

   private void a(eof $$0, enn.a $$1) {
      dfp $$2 = $$1.h();
      $$0.a(this.d.construct($$1.f(), $$2.d(), $$2.e()));
   }

   @FunctionalInterface
   protected interface a {
      enr construct(eds var1, int var2, int var3);
   }
}
