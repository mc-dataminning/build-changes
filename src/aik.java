public class aik implements zw<agw> {
   public static final zn<wm, aik> a = zw.a(aik::a, aik::new);
   private static final int b = 1;
   private static final int c = 2;
   private static final int d = 4;
   private final iz e;
   private final String f;
   private final boolean g;
   private final boolean h;
   private final boolean i;
   private final dps.a j;

   public aik(iz $$0, String $$1, dps.a $$2, boolean $$3, boolean $$4, boolean $$5) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
      this.j = $$2;
   }

   private aik(wm $$0) {
      this.e = $$0.e();
      this.f = $$0.p();
      this.j = $$0.b(dps.a.class);
      int $$1 = $$0.readByte();
      this.g = ($$1 & 1) != 0;
      this.h = ($$1 & 2) != 0;
      this.i = ($$1 & 4) != 0;
   }

   private void a(wm $$0) {
      $$0.a(this.e);
      $$0.a(this.f);
      $$0.a(this.j);
      int $$1 = 0;
      if (this.g) {
         $$1 |= 1;
      }

      if (this.h) {
         $$1 |= 2;
      }

      if (this.i) {
         $$1 |= 4;
      }

      $$0.k($$1);
   }

   @Override
   public zy<aik> a() {
      return agu.bU;
   }

   public void a(agw $$0) {
      $$0.a(this);
   }

   public iz b() {
      return this.e;
   }

   public String e() {
      return this.f;
   }

   public boolean f() {
      return this.g;
   }

   public boolean g() {
      return this.h;
   }

   public boolean h() {
      return this.i;
   }

   public dps.a i() {
      return this.j;
   }
}
