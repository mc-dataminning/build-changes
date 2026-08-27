import javax.annotation.Nullable;

public class bxh extends bis {
   public final bxj b;
   public final String c;
   private final bit d;

   public bxh(bxj $$0, String $$1, float $$2, float $$3) {
      super($$0.ag(), $$0.dL());
      this.d = bit.b($$2, $$3);
      this.i_();
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   protected void a_() {
   }

   @Override
   protected void a(qy $$0) {
   }

   @Override
   protected void b(qy $$0) {
   }

   @Override
   public boolean br() {
      return true;
   }

   @Nullable
   @Override
   public cjh dy() {
      return this.b.dy();
   }

   @Override
   public boolean a(bhq $$0, float $$1) {
      return this.b($$0) ? false : this.b.a(this, $$0, $$1);
   }

   @Override
   public boolean t(bis $$0) {
      return this == $$0 || this.b == $$0;
   }

   @Override
   public vf<wy> di() {
      throw new UnsupportedOperationException();
   }

   @Override
   public bit a(bju $$0) {
      return this.d;
   }

   @Override
   public boolean dJ() {
      return false;
   }
}
