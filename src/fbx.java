import java.util.function.Function;

public abstract class fbx<E extends bfj> extends fbf<E> {
   public fbx() {
      this(fkf::d);
   }

   public fbx(Function<acq, fkf> $$0) {
      super($$0);
   }

   @Override
   public void a(eij $$0, ein $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
      this.d().forEach($$8 -> $$8.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7));
   }

   public abstract Iterable<fee> d();
}
