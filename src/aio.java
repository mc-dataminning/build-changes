public class aio implements zp<agv> {
   public static final zg<wf, aio> a = zp.a(aio::a, aio::new);
   private final jh b;
   private final ali c;
   private final ali d;
   private final ali e;
   private final String f;
   private final dto.a g;
   private final int h;
   private final int i;

   public aio(jh $$0, ali $$1, ali $$2, ali $$3, String $$4, dto.a $$5, int $$6, int $$7) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
      this.i = $$7;
   }

   private aio(wf $$0) {
      this.b = $$0.e();
      this.c = $$0.q();
      this.d = $$0.q();
      this.e = $$0.q();
      this.f = $$0.p();
      this.g = dto.a.a($$0.p()).orElse(dto.a.b);
      this.h = $$0.l();
      this.i = $$0.l();
   }

   private void a(wf $$0) {
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
   public zr<aio> a() {
      return agt.ca;
   }

   public void a(agv $$0) {
      $$0.a(this);
   }

   public jh b() {
      return this.b;
   }

   public ali e() {
      return this.c;
   }

   public ali f() {
      return this.d;
   }

   public ali g() {
      return this.e;
   }

   public String h() {
      return this.f;
   }

   public dto.a i() {
      return this.g;
   }

   public int j() {
      return this.h;
   }

   public int k() {
      return this.i;
   }
}
