public class agm implements yb<aez> {
   public static final xs<uu, agm> a = yb.a(agm::a, agm::new);
   private static final int b = 1;
   private static final int c = 2;
   private static final int d = 4;
   private final ib e;
   private final String f;
   private final boolean g;
   private final boolean h;
   private final boolean i;
   private final dkq.a j;

   public agm(ib $$0, String $$1, dkq.a $$2, boolean $$3, boolean $$4, boolean $$5) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
      this.j = $$2;
   }

   private agm(uu $$0) {
      this.e = $$0.e();
      this.f = $$0.p();
      this.j = $$0.b(dkq.a.class);
      int $$1 = $$0.readByte();
      this.g = ($$1 & 1) != 0;
      this.h = ($$1 & 2) != 0;
      this.i = ($$1 & 4) != 0;
   }

   private void a(uu $$0) {
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
   public yd<agm> a() {
      return aex.bS;
   }

   public void a(aez $$0) {
      $$0.a(this);
   }

   public ib b() {
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

   public dkq.a i() {
      return this.j;
   }
}
