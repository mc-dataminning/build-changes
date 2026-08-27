import javax.annotation.Nullable;

public class fqc implements com {
   private final int c;
   private final int d;
   protected final fqb[][] a;
   protected final cpk b;

   fqc(cpk $$0, int $$1, int $$2, fqb[][] $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.a = $$3;
   }

   @Override
   public dey a_(gv $$0) {
      int $$1 = hy.a($$0.u()) - this.c;
      int $$2 = hy.a($$0.w()) - this.d;
      return this.a[$$1][$$2].b($$0);
   }

   @Override
   public eab b_(gv $$0) {
      int $$1 = hy.a($$0.u()) - this.c;
      int $$2 = hy.a($$0.w()) - this.d;
      return this.a[$$1][$$2].b($$0).u();
   }

   @Override
   public float a(hb $$0, boolean $$1) {
      return this.b.a($$0, $$1);
   }

   @Override
   public dzq s_() {
      return this.b.s_();
   }

   @Nullable
   @Override
   public dck c_(gv $$0) {
      int $$1 = hy.a($$0.u()) - this.c;
      int $$2 = hy.a($$0.w()) - this.d;
      return this.a[$$1][$$2].a($$0);
   }

   @Override
   public int a(gv $$0, cov $$1) {
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
