import javax.annotation.Nullable;

public class fqv implements cot {
   private final int c;
   private final int d;
   protected final fqu[][] a;
   protected final cpq b;

   fqv(cpq $$0, int $$1, int $$2, fqu[][] $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.a = $$3;
   }

   @Override
   public dfe a_(gw $$0) {
      int $$1 = hz.a($$0.u()) - this.c;
      int $$2 = hz.a($$0.w()) - this.d;
      return this.a[$$1][$$2].b($$0);
   }

   @Override
   public eah b_(gw $$0) {
      int $$1 = hz.a($$0.u()) - this.c;
      int $$2 = hz.a($$0.w()) - this.d;
      return this.a[$$1][$$2].b($$0).u();
   }

   @Override
   public float a(hc $$0, boolean $$1) {
      return this.b.a($$0, $$1);
   }

   @Override
   public dzw s_() {
      return this.b.s_();
   }

   @Nullable
   @Override
   public dcq c_(gw $$0) {
      int $$1 = hz.a($$0.u()) - this.c;
      int $$2 = hz.a($$0.w()) - this.d;
      return this.a[$$1][$$2].a($$0);
   }

   @Override
   public int a(gw $$0, cpb $$1) {
      return this.b.a($$0, $$1);
   }

   @Override
   public int C_() {
      return this.b.C_();
   }

   @Override
   public int D_() {
      return this.b.D_();
   }
}
