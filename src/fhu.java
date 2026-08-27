import java.util.function.Function;

public abstract class fhu<E extends bki> extends fhc<E> {
   public fhu() {
      this(fqp::e);
   }

   public fhu(Function<agg, fqp> $$0) {
      super($$0);
   }

   @Override
   public void a(enk $$0, eno $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
      this.d().forEach($$8 -> $$8.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7));
   }

   public abstract Iterable<fkb> d();
}
