public class aew implements xf<adj> {
   private static final int a = 1;
   private static final int b = 2;
   private static final int c = 4;
   private final hx d;
   private final String e;
   private final boolean f;
   private final boolean g;
   private final boolean h;
   private final dhe.a i;

   public aew(hx $$0, String $$1, dhe.a $$2, boolean $$3, boolean $$4, boolean $$5) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$3;
      this.g = $$4;
      this.h = $$5;
      this.i = $$2;
   }

   public aew(ui $$0) {
      this.d = $$0.e();
      this.e = $$0.s();
      this.i = $$0.b(dhe.a.class);
      int $$1 = $$0.readByte();
      this.f = ($$1 & 1) != 0;
      this.g = ($$1 & 2) != 0;
      this.h = ($$1 & 4) != 0;
   }

   @Override
   public void a(ui $$0) {
      $$0.a(this.d);
      $$0.a(this.e);
      $$0.a(this.i);
      int $$1 = 0;
      if (this.f) {
         $$1 |= 1;
      }

      if (this.g) {
         $$1 |= 2;
      }

      if (this.h) {
         $$1 |= 4;
      }

      $$0.k($$1);
   }

   public void a(adj $$0) {
      $$0.a(this);
   }

   public hx a() {
      return this.d;
   }

   public String d() {
      return this.e;
   }

   public boolean e() {
      return this.f;
   }

   public boolean f() {
      return this.g;
   }

   public boolean g() {
      return this.h;
   }

   public dhe.a h() {
      return this.i;
   }
}
