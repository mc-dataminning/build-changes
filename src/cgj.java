import javax.annotation.Nullable;

public class cgj extends brh {
   public final cgl b;
   public final String c;
   private final brk d;

   public cgj(cgl $$0, String $$1, float $$2, float $$3) {
      super($$0.ai(), $$0.dN());
      this.d = brk.b($$2, $$3);
      this.j_();
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   protected void a(ajq.a $$0) {
   }

   @Override
   protected void a(ua $$0) {
   }

   @Override
   protected void b(ua $$0) {
   }

   @Override
   public boolean bx() {
      return true;
   }

   @Nullable
   @Override
   public csz dA() {
      return this.b.dA();
   }

   @Override
   public boolean a(bqf $$0, float $$1) {
      return this.b($$0) ? false : this.b.a(this, $$0, $$1);
   }

   @Override
   public boolean t(brh $$0) {
      return this == $$0 || this.b == $$0;
   }

   @Override
   public zb<abm> dj() {
      throw new UnsupportedOperationException();
   }

   @Override
   public brk a(bsl $$0) {
      return this.d;
   }

   @Override
   public boolean dL() {
      return false;
   }
}
