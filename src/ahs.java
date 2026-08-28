public class ahs implements zb<agb> {
   public static final ys<vr, ahs> a = zb.a(ahs::a, ahs::new);
   private final ja b;
   private final akk c;
   private final akk d;
   private final akk e;
   private final String f;
   private final dqq.a g;
   private final int h;
   private final int i;

   public ahs(ja $$0, akk $$1, akk $$2, akk $$3, String $$4, dqq.a $$5, int $$6, int $$7) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
      this.i = $$7;
   }

   private ahs(vr $$0) {
      this.b = $$0.e();
      this.c = $$0.q();
      this.d = $$0.q();
      this.e = $$0.q();
      this.f = $$0.p();
      this.g = dqq.a.a($$0.p()).orElse(dqq.a.b);
      this.h = $$0.l();
      this.i = $$0.l();
   }

   private void a(vr $$0) {
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
   public zd<ahs> a() {
      return afz.bX;
   }

   public void a(agb $$0) {
      $$0.a(this);
   }

   public ja b() {
      return this.b;
   }

   public akk e() {
      return this.c;
   }

   public akk f() {
      return this.d;
   }

   public akk g() {
      return this.e;
   }

   public String h() {
      return this.f;
   }

   public dqq.a i() {
      return this.g;
   }

   public int j() {
      return this.h;
   }

   public int k() {
      return this.i;
   }
}
