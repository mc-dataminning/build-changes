import javax.annotation.Nullable;

public class chm extends bsh {
   public final cho b;
   public final String c;
   private final bsk d;

   public chm(cho $$0, String $$1, float $$2, float $$3) {
      super($$0.am(), $$0.dR());
      this.d = bsk.b($$2, $$3);
      this.i_();
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   protected void a(ajt.a $$0) {
   }

   @Override
   protected void a(tx $$0) {
   }

   @Override
   protected void b(tx $$0) {
   }

   @Override
   public boolean bB() {
      return true;
   }

   @Nullable
   @Override
   public cud dE() {
      return this.b.dE();
   }

   @Override
   public boolean a(bra $$0, float $$1) {
      return this.b($$0) ? false : this.b.a(this, $$0, $$1);
   }

   @Override
   public boolean t(bsh $$0) {
      return this == $$0 || this.b == $$0;
   }

   @Override
   public zb<abn> dn() {
      throw new UnsupportedOperationException();
   }

   @Override
   public bsk a(bto $$0) {
      return this.d;
   }

   @Override
   public boolean dP() {
      return false;
   }
}
