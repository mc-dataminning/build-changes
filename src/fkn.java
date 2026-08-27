import java.util.function.Function;

public abstract class fkn<E extends blu> extends fjv<E> {
   public fkn() {
      this(ftn::e);
   }

   public fkn(Function<ahg, ftn> $$0) {
      super($$0);
   }

   @Override
   public void a(epz $$0, eqd $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
      this.d().forEach($$8 -> $$8.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7));
   }

   public abstract Iterable<fmv> d();
}
