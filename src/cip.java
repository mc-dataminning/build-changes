import javax.annotation.Nullable;

public class cip extends btj {
   public final cis b;
   public final String c;
   private final btm d;

   public cip(cis $$0, String $$1, float $$2, float $$3) {
      super($$0.ao(), $$0.dS());
      this.d = btm.b($$2, $$3);
      this.i_();
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   protected void a(akk.a $$0) {
   }

   @Override
   protected void a(uf $$0) {
   }

   @Override
   protected void b(uf $$0) {
   }

   @Override
   public boolean bE() {
      return true;
   }

   @Nullable
   @Override
   public cvl dF() {
      return this.b.dF();
   }

   @Override
   public boolean a(bsb $$0, float $$1) {
      return this.b($$0) ? false : this.b.a(this, $$0, $$1);
   }

   @Override
   public boolean u(btj $$0) {
      return this == $$0 || this.b == $$0;
   }

   @Override
   public zk<abz> a(arf $$0) {
      throw new UnsupportedOperationException();
   }

   @Override
   public btm a(bur $$0) {
      return this.d;
   }

   @Override
   public boolean dQ() {
      return false;
   }
}
