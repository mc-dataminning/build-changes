public class aaa implements va<ws> {
   public static final int a = 0;
   public static final int b = 1;
   public static final int c = 2;
   private final String d;
   private final ti e;
   private final eik.a f;
   private final int g;

   public aaa(eie $$0, int $$1) {
      this.d = $$0.b();
      this.e = $$0.d();
      this.f = $$0.f();
      this.g = $$1;
   }

   public aaa(sl $$0) {
      this.d = $$0.r();
      this.g = $$0.readByte();
      if (this.g != 0 && this.g != 2) {
         this.e = th.a;
         this.f = eik.a.a;
      } else {
         this.e = $$0.l();
         this.f = $$0.b(eik.a.class);
      }
   }

   @Override
   public void a(sl $$0) {
      $$0.a(this.d);
      $$0.k(this.g);
      if (this.g == 0 || this.g == 2) {
         $$0.a(this.e);
         $$0.a(this.f);
      }
   }

   public void a(ws $$0) {
      $$0.a(this);
   }

   public String a() {
      return this.d;
   }

   public ti d() {
      return this.e;
   }

   public int e() {
      return this.g;
   }

   public eik.a f() {
      return this.f;
   }
}
