import javax.annotation.Nullable;

public class ftd implements cqv {
   private final int c;
   private final int d;
   protected final ftc[][] a;
   protected final crs b;

   ftd(crs $$0, int $$1, int $$2, ftc[][] $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.a = $$3;
   }

   @Override
   public dgw a_(ht $$0) {
      int $$1 = iu.a($$0.u()) - this.c;
      int $$2 = iu.a($$0.w()) - this.d;
      return this.a[$$1][$$2].b($$0);
   }

   @Override
   public ecg b_(ht $$0) {
      int $$1 = iu.a($$0.u()) - this.c;
      int $$2 = iu.a($$0.w()) - this.d;
      return this.a[$$1][$$2].b($$0).u();
   }

   @Override
   public float a(hx $$0, boolean $$1) {
      return this.b.a($$0, $$1);
   }

   @Override
   public ebv y_() {
      return this.b.y_();
   }

   @Nullable
   @Override
   public der c_(ht $$0) {
      int $$1 = iu.a($$0.u()) - this.c;
      int $$2 = iu.a($$0.w()) - this.d;
      return this.a[$$1][$$2].a($$0);
   }

   @Override
   public int a(ht $$0, crd $$1) {
      return this.b.a($$0, $$1);
   }

   @Override
   public int I_() {
      return this.b.I_();
   }

   @Override
   public int J_() {
      return this.b.J_();
   }
}
