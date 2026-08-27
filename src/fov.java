import java.util.function.Function;

public abstract class fov<E extends bow> extends foc<E> {
   public fov() {
      this(fxy::e);
   }

   public fov(Function<ajh, fxy> $$0) {
      super($$0);
   }

   @Override
   public void a(etz $$0, eud $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
      this.d().forEach($$8 -> $$8.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7));
   }

   public abstract Iterable<frd> d();
}
