import javax.annotation.Nullable;

public class ftv implements cri {
   private final int c;
   private final int d;
   protected final ftu[][] a;
   protected final csf b;

   ftv(csf $$0, int $$1, int $$2, ftu[][] $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.a = $$3;
   }

   @Override
   public dhn a_(hx $$0) {
      int $$1 = iy.a($$0.u()) - this.c;
      int $$2 = iy.a($$0.w()) - this.d;
      return this.a[$$1][$$2].b($$0);
   }

   @Override
   public ecx b_(hx $$0) {
      int $$1 = iy.a($$0.u()) - this.c;
      int $$2 = iy.a($$0.w()) - this.d;
      return this.a[$$1][$$2].b($$0).u();
   }

   @Override
   public float a(ib $$0, boolean $$1) {
      return this.b.a($$0, $$1);
   }

   @Override
   public ecm z_() {
      return this.b.z_();
   }

   @Nullable
   @Override
   public dfi c_(hx $$0) {
      int $$1 = iy.a($$0.u()) - this.c;
      int $$2 = iy.a($$0.w()) - this.d;
      return this.a[$$1][$$2].a($$0);
   }

   @Override
   public int a(hx $$0, crq $$1) {
      return this.b.a($$0, $$1);
   }

   @Override
   public int J_() {
      return this.b.J_();
   }

   @Override
   public int K_() {
      return this.b.K_();
   }
}
