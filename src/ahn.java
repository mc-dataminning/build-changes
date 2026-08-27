public class ahn implements yz<afx> {
   public static final yq<vs, ahn> a = yz.a(ahn::a, ahn::new);
   private final im b;
   private final akf c;
   private final akf d;
   private final akf e;
   private final String f;
   private final dod.a g;
   private final int h;
   private final int i;

   public ahn(im $$0, akf $$1, akf $$2, akf $$3, String $$4, dod.a $$5, int $$6, int $$7) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
      this.i = $$7;
   }

   private ahn(vs $$0) {
      this.b = $$0.e();
      this.c = $$0.q();
      this.d = $$0.q();
      this.e = $$0.q();
      this.f = $$0.p();
      this.g = dod.a.a($$0.p()).orElse(dod.a.b);
      this.h = $$0.l();
      this.i = $$0.l();
   }

   private void a(vs $$0) {
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
   public zb<ahn> a() {
      return afv.bV;
   }

   public void a(afx $$0) {
      $$0.a(this);
   }

   public im b() {
      return this.b;
   }

   public akf e() {
      return this.c;
   }

   public akf f() {
      return this.d;
   }

   public akf g() {
      return this.e;
   }

   public String h() {
      return this.f;
   }

   public dod.a i() {
      return this.g;
   }

   public int j() {
      return this.h;
   }

   public int k() {
      return this.i;
   }
}
