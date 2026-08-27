import java.util.function.Function;

public abstract class fkh<E extends blp> extends fjp<E> {
   public fkh() {
      this(fth::e);
   }

   public fkh(Function<ahd, fth> $$0) {
      super($$0);
   }

   @Override
   public void a(ept $$0, epx $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
      this.d().forEach($$8 -> $$8.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7));
   }

   public abstract Iterable<fmp> d();
}
