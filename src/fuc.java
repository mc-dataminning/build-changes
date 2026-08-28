import java.util.function.Function;

public abstract class fuc<E extends bsr> extends fvr<E> {
   private final float a;
   private final float b;

   public fuc(float $$0, float $$1) {
      this($$0, $$1, gff::e);
   }

   public fuc(float $$0, float $$1, Function<akr, gff> $$2) {
      super($$2);
      this.b = $$1;
      this.a = $$0;
   }

   @Override
   public void a(fbg $$0, fbk $$1, int $$2, int $$3, int $$4) {
      if (this.e) {
         $$0.a();
         $$0.b(this.a, this.a, this.a);
         $$0.a(0.0F, this.b / 16.0F, 0.0F);
         this.a().a($$0, $$1, $$2, $$3, $$4);
         $$0.b();
      } else {
         this.a().a($$0, $$1, $$2, $$3, $$4);
      }
   }
}
