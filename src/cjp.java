import javax.annotation.Nullable;

public class cjp extends bui {
   public final cjs b;
   public final String c;
   private final bul d;

   public cjp(cjs $$0, String $$1, float $$2, float $$3) {
      super($$0.ar(), $$0.dY());
      this.d = bul.b($$2, $$3);
      this.j_();
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   protected void a(aks.a $$0) {
   }

   @Override
   protected void a(un $$0) {
   }

   @Override
   protected void b(un $$0) {
   }

   @Override
   public boolean bJ() {
      return true;
   }

   @Nullable
   @Override
   public cwf dL() {
      return this.b.dL();
   }

   @Override
   public boolean a(bsy $$0, float $$1) {
      return this.b($$0) ? false : this.b.a(this, $$0, $$1);
   }

   @Override
   public boolean u(bui $$0) {
      return this == $$0 || this.b == $$0;
   }

   @Override
   public zs<ach> a(arp $$0) {
      throw new UnsupportedOperationException();
   }

   @Override
   public bul a(bvq $$0) {
      return this.d;
   }

   @Override
   public boolean dW() {
      return false;
   }
}
