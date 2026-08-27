public class abk implements wk<yd> {
   public static final int a = 0;
   public static final int b = 1;
   public static final int c = 2;
   private final String d;
   private final ur e;
   private final ekk.a f;
   private final int g;

   public abk(eke $$0, int $$1) {
      this.d = $$0.b();
      this.e = $$0.d();
      this.f = $$0.f();
      this.g = $$1;
   }

   public abk(tu $$0) {
      this.d = $$0.s();
      this.g = $$0.readByte();
      if (this.g != 0 && this.g != 2) {
         this.e = uq.a;
         this.f = ekk.a.a;
      } else {
         this.e = $$0.m();
         this.f = $$0.b(ekk.a.class);
      }
   }

   @Override
   public void a(tu $$0) {
      $$0.a(this.d);
      $$0.k(this.g);
      if (this.g == 0 || this.g == 2) {
         $$0.a(this.e);
         $$0.a(this.f);
      }
   }

   public void a(yd $$0) {
      $$0.a(this);
   }

   public String a() {
      return this.d;
   }

   public ur d() {
      return this.e;
   }

   public int e() {
      return this.g;
   }

   public ekk.a f() {
      return this.f;
   }
}
