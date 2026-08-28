public class aim implements zv<agv> {
   public static final zm<wl, aim> a = zv.a(aim::a, aim::new);
   private final iz b;
   private final ale c;
   private final ale d;
   private final ale e;
   private final String f;
   private final dqg.a g;
   private final int h;
   private final int i;

   public aim(iz $$0, ale $$1, ale $$2, ale $$3, String $$4, dqg.a $$5, int $$6, int $$7) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
      this.i = $$7;
   }

   private aim(wl $$0) {
      this.b = $$0.e();
      this.c = $$0.q();
      this.d = $$0.q();
      this.e = $$0.q();
      this.f = $$0.p();
      this.g = dqg.a.a($$0.p()).orElse(dqg.a.b);
      this.h = $$0.l();
      this.i = $$0.l();
   }

   private void a(wl $$0) {
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
   public zx<aim> a() {
      return agt.bX;
   }

   public void a(agv $$0) {
      $$0.a(this);
   }

   public iz b() {
      return this.b;
   }

   public ale e() {
      return this.c;
   }

   public ale f() {
      return this.d;
   }

   public ale g() {
      return this.e;
   }

   public String h() {
      return this.f;
   }

   public dqg.a i() {
      return this.g;
   }

   public int j() {
      return this.h;
   }

   public int k() {
      return this.i;
   }
}
