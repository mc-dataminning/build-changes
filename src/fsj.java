import java.util.function.Function;

public abstract class fsj<E extends bql> extends frr<E> {
   public fsj() {
      this(gbm::e);
   }

   public fsj(Function<akf, gbm> $$0) {
      super($$0);
   }

   @Override
   public void a(exn $$0, exr $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
      this.d().forEach($$8 -> $$8.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7));
   }

   public abstract Iterable<fur> d();
}
