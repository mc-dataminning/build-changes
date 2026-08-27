import java.util.function.Function;

public abstract class ffl<E extends bii> extends fet<E> {
   public ffl() {
      this(foc::e);
   }

   public ffl(Function<aer, foc> $$0) {
      super($$0);
   }

   @Override
   public void a(elf $$0, elj $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
      this.d().forEach($$8 -> $$8.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7));
   }

   public abstract Iterable<fhs> d();
}
