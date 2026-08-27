import javax.annotation.Nullable;

public class cfn extends bql {
   public final cfp b;
   public final String c;
   private final bqo d;

   public cfn(cfp $$0, String $$1, float $$2, float $$3) {
      super($$0.ai(), $$0.dN());
      this.d = bqo.b($$2, $$3);
      this.j_();
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   protected void a(ajo.a $$0) {
   }

   @Override
   protected void a(ty $$0) {
   }

   @Override
   protected void b(ty $$0) {
   }

   @Override
   public boolean bx() {
      return true;
   }

   @Nullable
   @Override
   public csd dA() {
      return this.b.dA();
   }

   @Override
   public boolean a(bpj $$0, float $$1) {
      return this.b($$0) ? false : this.b.a(this, $$0, $$1);
   }

   @Override
   public boolean t(bql $$0) {
      return this == $$0 || this.b == $$0;
   }

   @Override
   public yz<abk> dj() {
      throw new UnsupportedOperationException();
   }

   @Override
   public bqo a(brp $$0) {
      return this.d;
   }

   @Override
   public boolean dL() {
      return false;
   }
}
