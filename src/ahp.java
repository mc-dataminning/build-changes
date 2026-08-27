public class ahp implements zb<afz> {
   public static final ys<vu, ahp> a = zb.a(ahp::a, ahp::new);
   private final in b;
   private final akh c;
   private final akh d;
   private final akh e;
   private final String f;
   private final dom.a g;
   private final int h;
   private final int i;

   public ahp(in $$0, akh $$1, akh $$2, akh $$3, String $$4, dom.a $$5, int $$6, int $$7) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
      this.i = $$7;
   }

   private ahp(vu $$0) {
      this.b = $$0.e();
      this.c = $$0.q();
      this.d = $$0.q();
      this.e = $$0.q();
      this.f = $$0.p();
      this.g = dom.a.a($$0.p()).orElse(dom.a.b);
      this.h = $$0.l();
      this.i = $$0.l();
   }

   private void a(vu $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
      $$0.a(this.e);
      $$0.a(this.f);
      $$0.a(this.g.c());
      $$0.c(this.h);
      $$0.c(this.i);
   }

   @Override
   public zd<ahp> a() {
      return afx.bV;
   }

   public void a(afz $$0) {
      $$0.a(this);
   }

   public in b() {
      return this.b;
   }

   public akh e() {
      return this.c;
   }

   public akh f() {
      return this.d;
   }

   public akh g() {
      return this.e;
   }

   public String h() {
      return this.f;
   }

   public dom.a i() {
      return this.g;
   }

   public int j() {
      return this.h;
   }

   public int k() {
      return this.i;
   }
}
