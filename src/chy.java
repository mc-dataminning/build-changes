import javax.annotation.Nullable;

public class chy extends bsr {
   public final cia b;
   public final String c;
   private final bsu d;

   public chy(cia $$0, String $$1, float $$2, float $$3) {
      super($$0.am(), $$0.dP());
      this.d = bsu.b($$2, $$3);
      this.i_();
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   protected void a(aka.a $$0) {
   }

   @Override
   protected void a(ub $$0) {
   }

   @Override
   protected void b(ub $$0) {
   }

   @Override
   public boolean bA() {
      return true;
   }

   @Nullable
   @Override
   public cuq dC() {
      return this.b.dC();
   }

   @Override
   public boolean a(brk $$0, float $$1) {
      return this.b($$0) ? false : this.b.a(this, $$0, $$1);
   }

   @Override
   public boolean t(bsr $$0) {
      return this == $$0 || this.b == $$0;
   }

   @Override
   public zg<abu> a(aqt $$0) {
      throw new UnsupportedOperationException();
   }

   @Override
   public bsu a(bua $$0) {
      return this.d;
   }

   @Override
   public boolean dN() {
      return false;
   }
}
