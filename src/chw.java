import javax.annotation.Nullable;

public class chw extends bsq {
   public final chy b;
   public final String c;
   private final bst d;

   public chw(chy $$0, String $$1, float $$2, float $$3) {
      super($$0.am(), $$0.dQ());
      this.d = bst.b($$2, $$3);
      this.i_();
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   protected void a(ajz.a $$0) {
   }

   @Override
   protected void a(ua $$0) {
   }

   @Override
   protected void b(ua $$0) {
   }

   @Override
   public boolean bA() {
      return true;
   }

   @Nullable
   @Override
   public cuo dD() {
      return this.b.dD();
   }

   @Override
   public boolean a(brj $$0, float $$1) {
      return this.b($$0) ? false : this.b.a(this, $$0, $$1);
   }

   @Override
   public boolean t(bsq $$0) {
      return this == $$0 || this.b == $$0;
   }

   @Override
   public zf<abt> dm() {
      throw new UnsupportedOperationException();
   }

   @Override
   public bst a(bty $$0) {
      return this.d;
   }

   @Override
   public boolean dO() {
      return false;
   }
}
