import java.util.function.Function;

public abstract class fto<E extends brw> extends fsw<E> {
   public fto() {
      this(gcs::e);
   }

   public fto(Function<akn, gcs> $$0) {
      super($$0);
   }

   @Override
   public void a(eyu $$0, eyy $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
      this.d().forEach($$8 -> $$8.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7));
   }

   public abstract Iterable<fvw> d();
}
