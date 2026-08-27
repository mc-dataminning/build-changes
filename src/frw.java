import javax.annotation.Nullable;

public class frw implements cqc {
   private final int c;
   private final int d;
   protected final frv[][] a;
   protected final cqz b;

   frw(cqz $$0, int $$1, int $$2, frv[][] $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.a = $$3;
   }

   @Override
   public dgb a_(ht $$0) {
      int $$1 = iu.a($$0.u()) - this.c;
      int $$2 = iu.a($$0.w()) - this.d;
      return this.a[$$1][$$2].b($$0);
   }

   @Override
   public ebe b_(ht $$0) {
      int $$1 = iu.a($$0.u()) - this.c;
      int $$2 = iu.a($$0.w()) - this.d;
      return this.a[$$1][$$2].b($$0).u();
   }

   @Override
   public float a(hx $$0, boolean $$1) {
      return this.b.a($$0, $$1);
   }

   @Override
   public eat y_() {
      return this.b.y_();
   }

   @Nullable
   @Override
   public ddx c_(ht $$0) {
      int $$1 = iu.a($$0.u()) - this.c;
      int $$2 = iu.a($$0.w()) - this.d;
      return this.a[$$1][$$2].a($$0);
   }

   @Override
   public int a(ht $$0, cqk $$1) {
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
