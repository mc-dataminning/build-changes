import java.util.function.Function;

public abstract class ffg<E extends bii> extends feo<E> {
   public ffg() {
      this(fnt::e);
   }

   public ffg(Function<aer, fnt> $$0) {
      super($$0);
   }

   @Override
   public void a(elg $$0, elk $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
      this.d().forEach($$8 -> $$8.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7));
   }

   public abstract Iterable<fhn> d();
}
