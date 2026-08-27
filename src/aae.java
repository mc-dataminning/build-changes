public class aae implements ve<wx> {
   public static final int a = 0;
   public static final int b = 1;
   public static final int c = 2;
   private final String d;
   private final tm e;
   private final eip.a f;
   private final int g;

   public aae(eij $$0, int $$1) {
      this.d = $$0.b();
      this.e = $$0.d();
      this.f = $$0.f();
      this.g = $$1;
   }

   public aae(sp $$0) {
      this.d = $$0.r();
      this.g = $$0.readByte();
      if (this.g != 0 && this.g != 2) {
         this.e = tl.a;
         this.f = eip.a.a;
      } else {
         this.e = $$0.l();
         this.f = $$0.b(eip.a.class);
      }
   }

   @Override
   public void a(sp $$0) {
      $$0.a(this.d);
      $$0.k(this.g);
      if (this.g == 0 || this.g == 2) {
         $$0.a(this.e);
         $$0.a(this.f);
      }
   }

   public void a(wx $$0) {
      $$0.a(this);
   }

   public String a() {
      return this.d;
   }

   public tm d() {
      return this.e;
   }

   public int e() {
      return this.g;
   }

   public eip.a f() {
      return this.f;
   }
}
