import javax.annotation.Nullable;

public class cjl extends bue {
   public final cjo b;
   public final String c;
   private final buh d;

   public cjl(cjo $$0, String $$1, float $$2, float $$3) {
      super($$0.ar(), $$0.dX());
      this.d = buh.b($$2, $$3);
      this.j_();
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   protected void a(akp.a $$0) {
   }

   @Override
   protected void a(uk $$0) {
   }

   @Override
   protected void b(uk $$0) {
   }

   @Override
   public boolean bI() {
      return true;
   }

   @Nullable
   @Override
   public cwb dK() {
      return this.b.dK();
   }

   @Override
   public boolean a(bsu $$0, float $$1) {
      return this.b($$0) ? false : this.b.a(this, $$0, $$1);
   }

   @Override
   public boolean u(bue $$0) {
      return this == $$0 || this.b == $$0;
   }

   @Override
   public zp<ace> a(arm $$0) {
      throw new UnsupportedOperationException();
   }

   @Override
   public buh a(bvm $$0) {
      return this.d;
   }

   @Override
   public boolean dV() {
      return false;
   }
}
