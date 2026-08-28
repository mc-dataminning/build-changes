import javax.annotation.Nullable;

public class chz extends bsu {
   public final cib b;
   public final String c;
   private final bsx d;

   public chz(cib $$0, String $$1, float $$2, float $$3) {
      super($$0.ak(), $$0.dP());
      this.d = bsx.b($$2, $$3);
      this.j_();
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   protected void a(ako.a $$0) {
   }

   @Override
   protected void a(us $$0) {
   }

   @Override
   protected void b(us $$0) {
   }

   @Override
   public boolean bz() {
      return true;
   }

   @Nullable
   @Override
   public cup dC() {
      return this.b.dC();
   }

   @Override
   public boolean a(brn $$0, float $$1) {
      return this.b($$0) ? false : this.b.a(this, $$0, $$1);
   }

   @Override
   public boolean t(bsu $$0) {
      return this == $$0 || this.b == $$0;
   }

   @Override
   public zw<aci> dl() {
      throw new UnsupportedOperationException();
   }

   @Override
   public bsx a(bub $$0) {
      return this.d;
   }

   @Override
   public boolean dN() {
      return false;
   }
}
