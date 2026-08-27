import java.util.function.Function;

public abstract class fmt<E extends bno> extends fmb<E> {
   public fmt() {
      this(fvt::e);
   }

   public fmt(Function<aiy, fvt> $$0) {
      super($$0);
   }

   @Override
   public void a(esa $$0, ese $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
      this.d().forEach($$8 -> $$8.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7));
   }

   public abstract Iterable<fpc> d();
}
