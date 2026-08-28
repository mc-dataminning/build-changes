import javax.annotation.Nullable;

public class clt extends bwd {
   public final clw a;
   public final String b;
   private final bwg c;

   public clt(clw $$0, String $$1, float $$2, float $$3) {
      super($$0.aq(), $$0.dV());
      this.c = bwg.b($$2, $$3);
      this.i_();
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   protected void a(akn.a $$0) {
   }

   @Override
   protected void a(tz $$0) {
   }

   @Override
   protected void b(tz $$0) {
   }

   @Override
   public boolean bG() {
      return true;
   }

   @Nullable
   @Override
   public cyy dI() {
      return this.a.dI();
   }

   @Override
   public final boolean a(arq $$0, bus $$1, float $$2) {
      return this.d($$1) ? false : this.a.a($$0, this, $$1, $$2);
   }

   @Override
   public boolean u(bwd $$0) {
      return this == $$0 || this.a == $$0;
   }

   @Override
   public zf<abu> a(aro $$0) {
      throw new UnsupportedOperationException();
   }

   @Override
   public bwg a(bxo $$0) {
      return this.c;
   }

   @Override
   public boolean dT() {
      return false;
   }
}
