import javax.annotation.Nullable;

public class bxf extends biq {
   public final bxh b;
   public final String c;
   private final bir d;

   public bxf(bxh $$0, String $$1, float $$2, float $$3) {
      super($$0.ag(), $$0.dL());
      this.d = bir.b($$2, $$3);
      this.i_();
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   protected void a_() {
   }

   @Override
   protected void a(qw $$0) {
   }

   @Override
   protected void b(qw $$0) {
   }

   @Override
   public boolean br() {
      return true;
   }

   @Nullable
   @Override
   public cjf dy() {
      return this.b.dy();
   }

   @Override
   public boolean a(bho $$0, float $$1) {
      return this.b($$0) ? false : this.b.a(this, $$0, $$1);
   }

   @Override
   public boolean t(biq $$0) {
      return this == $$0 || this.b == $$0;
   }

   @Override
   public vd<ww> di() {
      throw new UnsupportedOperationException();
   }

   @Override
   public bir a(bjs $$0) {
      return this.d;
   }

   @Override
   public boolean dJ() {
      return false;
   }
}
