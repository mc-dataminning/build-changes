import java.util.function.Function;

public abstract class fnw<E extends bof> extends fne<E> {
   public fnw() {
      this(fwy::e);
   }

   public fnw(Function<ajc, fwy> $$0) {
      super($$0);
   }

   @Override
   public void a(etd $$0, eth $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
      this.d().forEach($$8 -> $$8.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7));
   }

   public abstract Iterable<fqf> d();
}
