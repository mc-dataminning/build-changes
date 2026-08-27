import javax.annotation.Nullable;

public class byi extends bjt {
   public final byk b;
   public final String c;
   private final bju d;

   public byi(byk $$0, String $$1, float $$2, float $$3) {
      super($$0.ag(), $$0.dL());
      this.d = bju.b($$2, $$3);
      this.j_();
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   protected void b_() {
   }

   @Override
   protected void a(rt $$0) {
   }

   @Override
   protected void b(rt $$0) {
   }

   @Override
   public boolean br() {
      return true;
   }

   @Nullable
   @Override
   public ckj dy() {
      return this.b.dy();
   }

   @Override
   public boolean a(bir $$0, float $$1) {
      return this.b($$0) ? false : this.b.a(this, $$0, $$1);
   }

   @Override
   public boolean t(bjt $$0) {
      return this == $$0 || this.b == $$0;
   }

   @Override
   public wb<xu> di() {
      throw new UnsupportedOperationException();
   }

   @Override
   public bju a(bkv $$0) {
      return this.d;
   }

   @Override
   public boolean dJ() {
      return false;
   }
}
