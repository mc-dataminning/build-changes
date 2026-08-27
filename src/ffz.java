import java.util.function.Function;

public abstract class ffz<E extends bki> extends fhl<E> {
   private final float a;
   private final float b;

   public ffz(float $$0, float $$1) {
      this($$0, $$1, fqp::e);
   }

   public ffz(float $$0, float $$1, Function<agg, fqp> $$2) {
      super($$2);
      this.b = $$1;
      this.a = $$0;
   }

   @Override
   public void a(enk $$0, eno $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
      if (this.e) {
         $$0.a();
         $$0.b(this.a, this.a, this.a);
         $$0.a(0.0F, this.b / 16.0F, 0.0F);
         this.a().a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
         $$0.b();
      } else {
         this.a().a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }
}
