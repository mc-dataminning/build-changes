public class abb implements wb<xu> {
   public static final int a = 0;
   public static final int b = 1;
   public static final int c = 2;
   private final String d;
   private final ui e;
   private final ejh.a f;
   private final int g;

   public abb(ejb $$0, int $$1) {
      this.d = $$0.b();
      this.e = $$0.d();
      this.f = $$0.f();
      this.g = $$1;
   }

   public abb(tl $$0) {
      this.d = $$0.s();
      this.g = $$0.readByte();
      if (this.g != 0 && this.g != 2) {
         this.e = uh.a;
         this.f = ejh.a.a;
      } else {
         this.e = $$0.m();
         this.f = $$0.b(ejh.a.class);
      }
   }

   @Override
   public void a(tl $$0) {
      $$0.a(this.d);
      $$0.k(this.g);
      if (this.g == 0 || this.g == 2) {
         $$0.a(this.e);
         $$0.a(this.f);
      }
   }

   public void a(xu $$0) {
      $$0.a(this);
   }

   public String a() {
      return this.d;
   }

   public ui d() {
      return this.e;
   }

   public int e() {
      return this.g;
   }

   public ejh.a f() {
      return this.f;
   }
}
