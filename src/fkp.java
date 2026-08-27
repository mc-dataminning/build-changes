import java.util.function.Function;

public abstract class fkp<E extends blv> extends fjx<E> {
   public fkp() {
      this(ftp::e);
   }

   public fkp(Function<ahg, ftp> $$0) {
      super($$0);
   }

   @Override
   public void a(eqb $$0, eqf $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
      this.d().forEach($$8 -> $$8.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7));
   }

   public abstract Iterable<fmx> d();
}
