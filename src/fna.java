import java.util.function.Function;

public abstract class fna<E extends bnq> extends fmi<E> {
   public fna() {
      this(fwb::e);
   }

   public fna(Function<aiy, fwb> $$0) {
      super($$0);
   }

   @Override
   public void a(esh $$0, esl $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
      this.d().forEach($$8 -> $$8.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7));
   }

   public abstract Iterable<fpj> d();
}
