import javax.annotation.Nullable;

public class btz extends bfj {
   public final bub b;
   public final String c;
   private final bfk d;

   public btz(bub $$0, String $$1, float $$2, float $$3) {
      super($$0.ae(), $$0.dI());
      this.d = bfk.b($$2, $$3);
      this.d_();
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   protected void a_() {
   }

   @Override
   protected void a(qr $$0) {
   }

   @Override
   protected void b(qr $$0) {
   }

   @Override
   public boolean bo() {
      return true;
   }

   @Nullable
   @Override
   public cfz dv() {
      return this.b.dv();
   }

   @Override
   public boolean a(ben $$0, float $$1) {
      return this.b($$0) ? false : this.b.a(this, $$0, $$1);
   }

   @Override
   public boolean q(bfj $$0) {
      return this == $$0 || this.b == $$0;
   }

   @Override
   public uo<ur> S() {
      throw new UnsupportedOperationException();
   }

   @Override
   public bfk a(bgl $$0) {
      return this.d;
   }

   @Override
   public boolean dG() {
      return false;
   }
}
