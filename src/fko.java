import java.util.function.Function;

public abstract class fko<E extends blu> extends fjw<E> {
   public fko() {
      this(fto::e);
   }

   public fko(Function<ahg, fto> $$0) {
      super($$0);
   }

   @Override
   public void a(eqa $$0, eqe $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
      this.d().forEach($$8 -> $$8.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7));
   }

   public abstract Iterable<fmw> d();
}
