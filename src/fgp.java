import java.util.function.Function;

public abstract class fgp<E extends bjt> extends ffx<E> {
   public fgp() {
      this(fpj::e);
   }

   public fgp(Function<afw, fpj> $$0) {
      super($$0);
   }

   @Override
   public void a(emh $$0, eml $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
      this.d().forEach($$8 -> $$8.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7));
   }

   public abstract Iterable<fiw> d();
}
