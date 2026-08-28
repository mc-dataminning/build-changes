public class aih implements zl<agr> {
   public static final zc<wb, aih> a = zl.a(aih::a, aih::new);
   private static final int b = 1;
   private static final int c = 2;
   private static final int d = 4;
   private final jf e;
   private final String f;
   private final boolean g;
   private final boolean h;
   private final boolean i;
   private final dsf.a j;

   public aih(jf $$0, String $$1, dsf.a $$2, boolean $$3, boolean $$4, boolean $$5) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
      this.j = $$2;
   }

   private aih(wb $$0) {
      this.e = $$0.e();
      this.f = $$0.p();
      this.j = $$0.b(dsf.a.class);
      int $$1 = $$0.readByte();
      this.g = ($$1 & 1) != 0;
      this.h = ($$1 & 2) != 0;
      this.i = ($$1 & 4) != 0;
   }

   private void a(wb $$0) {
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

      $$0.l($$1);
   }

   @Override
   public zn<aih> a() {
      return agp.bX;
   }

   public void a(agr $$0) {
      $$0.a(this);
   }

   public jf b() {
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

   public dsf.a i() {
      return this.j;
   }
}
