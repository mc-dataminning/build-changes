import javax.annotation.Nullable;

public class bxl extends biw {
   public final bxn b;
   public final String c;
   private final bix d;

   public bxl(bxn $$0, String $$1, float $$2, float $$3) {
      super($$0.ag(), $$0.dL());
      this.d = bix.b($$2, $$3);
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
   public cjl dy() {
      return this.b.dy();
   }

   @Override
   public boolean a(bhu $$0, float $$1) {
      return this.b($$0) ? false : this.b.a(this, $$0, $$1);
   }

   @Override
   public boolean t(biw $$0) {
      return this == $$0 || this.b == $$0;
   }

   @Override
   public ve<wx> di() {
      throw new UnsupportedOperationException();
   }

   @Override
   public bix a(bjy $$0) {
      return this.d;
   }

   @Override
   public boolean dJ() {
      return false;
   }
}
