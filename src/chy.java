import javax.annotation.Nullable;

public class chy extends bst {
   public final cia b;
   public final String c;
   private final bsw d;

   public chy(cia $$0, String $$1, float $$2, float $$3) {
      super($$0.ak(), $$0.dP());
      this.d = bsw.b($$2, $$3);
      this.j_();
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   protected void a(akn.a $$0) {
   }

   @Override
   protected void a(ur $$0) {
   }

   @Override
   protected void b(ur $$0) {
   }

   @Override
   public boolean bz() {
      return true;
   }

   @Nullable
   @Override
   public cuo dC() {
      return this.b.dC();
   }

   @Override
   public boolean a(brm $$0, float $$1) {
      return this.b($$0) ? false : this.b.a(this, $$0, $$1);
   }

   @Override
   public boolean t(bst $$0) {
      return this == $$0 || this.b == $$0;
   }

   @Override
   public zv<ach> dl() {
      throw new UnsupportedOperationException();
   }

   @Override
   public bsw a(bua $$0) {
      return this.d;
   }

   @Override
   public boolean dN() {
      return false;
   }
}
