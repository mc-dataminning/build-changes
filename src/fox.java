import java.util.function.Function;

public abstract class fox<E extends box> extends foe<E> {
   public fox() {
      this(fya::e);
   }

   public fox(Function<ajh, fya> $$0) {
      super($$0);
   }

   @Override
   public void a(eub $$0, euf $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
      this.d().forEach($$8 -> $$8.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7));
   }

   public abstract Iterable<frf> d();
}
