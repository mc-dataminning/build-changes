import java.util.function.Function;

public abstract class flb<E extends blw> extends fkj<E> {
   public flb() {
      this(fub::e);
   }

   public flb(Function<ahh, fub> $$0) {
      super($$0);
   }

   @Override
   public void a(eqk $$0, eqo $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
      this.d().forEach($$8 -> $$8.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7));
   }

   public abstract Iterable<fnj> d();
}
