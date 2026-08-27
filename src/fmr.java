import javax.annotation.Nullable;

public class fmr implements clp {
   private final int c;
   private final int d;
   protected final fmq[][] a;
   protected final cmm b;

   fmr(cmm $$0, int $$1, int $$2, fmq[][] $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.a = $$3;
   }

   @Override
   public dcb a_(gu $$0) {
      int $$1 = hx.a($$0.u()) - this.c;
      int $$2 = hx.a($$0.w()) - this.d;
      return this.a[$$1][$$2].b($$0);
   }

   @Override
   public dxe b_(gu $$0) {
      int $$1 = hx.a($$0.u()) - this.c;
      int $$2 = hx.a($$0.w()) - this.d;
      return this.a[$$1][$$2].b($$0).u();
   }

   @Override
   public float a(ha $$0, boolean $$1) {
      return this.b.a($$0, $$1);
   }

   @Override
   public dwt s_() {
      return this.b.s_();
   }

   @Nullable
   @Override
   public czn c_(gu $$0) {
      int $$1 = hx.a($$0.u()) - this.c;
      int $$2 = hx.a($$0.w()) - this.d;
      return this.a[$$1][$$2].a($$0);
   }

   @Override
   public int a(gu $$0, clx $$1) {
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
