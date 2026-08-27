import javax.annotation.Nullable;

public class cck extends bno {
   public final ccm b;
   public final String c;
   private final bnr d;

   public cck(ccm $$0, String $$1, float $$2, float $$3) {
      super($$0.ai(), $$0.dM());
      this.d = bnr.b($$2, $$3);
      this.k_();
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   protected void c_() {
   }

   @Override
   protected void a(sw $$0) {
   }

   @Override
   protected void b(sw $$0) {
   }

   @Override
   public boolean bt() {
      return true;
   }

   @Nullable
   @Override
   public coz dz() {
      return this.b.dz();
   }

   @Override
   public boolean a(bmn $$0, float $$1) {
      return this.b($$0) ? false : this.b.a(this, $$0, $$1);
   }

   @Override
   public boolean s(bno $$0) {
      return this == $$0 || this.b == $$0;
   }

   @Override
   public xx<aag> di() {
      throw new UnsupportedOperationException();
   }

   @Override
   public bnr a(bor $$0) {
      return this.d;
   }

   @Override
   public boolean dK() {
      return false;
   }
}
