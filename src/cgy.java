import javax.annotation.Nullable;

public class cgy extends brv {
   public final cha b;
   public final String c;
   private final bry d;

   public cgy(cha $$0, String $$1, float $$2, float $$3) {
      super($$0.ak(), $$0.dU());
      this.d = bry.b($$2, $$3);
      this.i_();
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   protected void a(akc.a $$0) {
   }

   @Override
   protected void a(uk $$0) {
   }

   @Override
   protected void b(uk $$0) {
   }

   @Override
   public boolean bE() {
      return true;
   }

   @Nullable
   @Override
   public cuh dH() {
      return this.b.dH();
   }

   @Override
   public boolean a(bqt $$0, float $$1) {
      return this.b($$0) ? false : this.b.a(this, $$0, $$1);
   }

   @Override
   public boolean t(brv $$0) {
      return this == $$0 || this.b == $$0;
   }

   @Override
   public zl<abw> dq() {
      throw new UnsupportedOperationException();
   }

   @Override
   public bry a(bsz $$0) {
      return this.d;
   }

   @Override
   public boolean dS() {
      return false;
   }
}
