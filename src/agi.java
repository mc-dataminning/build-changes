public class agi implements xz<aev> {
   public static final xq<us, agi> a = xz.a(agi::a, agi::new);
   private static final int b = 1;
   private static final int c = 2;
   private static final int d = 4;
   private final ib e;
   private final String f;
   private final boolean g;
   private final boolean h;
   private final boolean i;
   private final djv.a j;

   public agi(ib $$0, String $$1, djv.a $$2, boolean $$3, boolean $$4, boolean $$5) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
      this.j = $$2;
   }

   private agi(us $$0) {
      this.e = $$0.e();
      this.f = $$0.p();
      this.j = $$0.b(djv.a.class);
      int $$1 = $$0.readByte();
      this.g = ($$1 & 1) != 0;
      this.h = ($$1 & 2) != 0;
      this.i = ($$1 & 4) != 0;
   }

   private void a(us $$0) {
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
   public yb<agi> a() {
      return aet.bS;
   }

   public void a(aev $$0) {
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

   public djv.a i() {
      return this.j;
   }
}
