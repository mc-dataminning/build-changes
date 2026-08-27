public class ahb implements yn<afl> {
   public static final ye<vg, ahb> a = yn.a(ahb::a, ahb::new);
   private final ib b;
   private final ajt c;
   private final ajt d;
   private final ajt e;
   private final String f;
   private final dnf.a g;
   private final int h;
   private final int i;

   public ahb(ib $$0, ajt $$1, ajt $$2, ajt $$3, String $$4, dnf.a $$5, int $$6, int $$7) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
      this.i = $$7;
   }

   private ahb(vg $$0) {
      this.b = $$0.e();
      this.c = $$0.q();
      this.d = $$0.q();
      this.e = $$0.q();
      this.f = $$0.p();
      this.g = dnf.a.a($$0.p()).orElse(dnf.a.b);
      this.h = $$0.l();
      this.i = $$0.l();
   }

   private void a(vg $$0) {
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
   public yp<ahb> a() {
      return afj.bV;
   }

   public void a(afl $$0) {
      $$0.a(this);
   }

   public ib b() {
      return this.b;
   }

   public ajt e() {
      return this.c;
   }

   public ajt f() {
      return this.d;
   }

   public ajt g() {
      return this.e;
   }

   public String h() {
      return this.f;
   }

   public dnf.a i() {
      return this.g;
   }

   public int j() {
      return this.h;
   }

   public int k() {
      return this.i;
   }
}
