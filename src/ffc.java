import java.util.function.Function;

public abstract class ffc<E extends big> extends fek<E> {
   public ffc() {
      this(fno::d);
   }

   public ffc(Function<aep, fno> $$0) {
      super($$0);
   }

   @Override
   public void a(elh $$0, ell $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
      this.d().forEach($$8 -> $$8.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7));
   }

   public abstract Iterable<fhj> d();
}
