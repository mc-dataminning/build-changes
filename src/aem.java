public class aem implements wu<acw> {
   private final hv a;
   private final agt b;
   private final agt c;
   private final agt d;
   private final String e;
   private final dhd.a f;
   private final int g;
   private final int h;

   public aem(hv $$0, agt $$1, agt $$2, agt $$3, String $$4, dhd.a $$5, int $$6, int $$7) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
      this.g = $$6;
      this.h = $$7;
   }

   public aem(ue $$0) {
      this.a = $$0.e();
      this.b = $$0.t();
      this.c = $$0.t();
      this.d = $$0.t();
      this.e = $$0.s();
      this.f = dhd.a.a($$0.s()).orElse(dhd.a.b);
      this.g = $$0.n();
      this.h = $$0.n();
   }

   @Override
   public void a(ue $$0) {
      $$0.a(this.a);
      $$0.a(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
      $$0.a(this.e);
      $$0.a(this.f.c());
      $$0.c(this.g);
      $$0.c(this.h);
   }

   public void a(acw $$0) {
      $$0.a(this);
   }

   public hv a() {
      return this.a;
   }

   public agt d() {
      return this.b;
   }

   public agt e() {
      return this.c;
   }

   public agt f() {
      return this.d;
   }

   public String g() {
      return this.e;
   }

   public dhd.a h() {
      return this.f;
   }

   public int i() {
      return this.g;
   }

   public int j() {
      return this.h;
   }
}
