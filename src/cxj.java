import java.util.List;

public record cxj(axl<dhm> g, int h, float i, float j, int k, axl<cvn> l) {
   public static final cxj a = new cxj(awv.bO, 59, 2.0F, 0.0F, 15, axe.aX);
   public static final cxj b = new cxj(awv.bM, 131, 4.0F, 1.0F, 5, axe.aY);
   public static final cxj c = new cxj(awv.bL, 250, 6.0F, 2.0F, 14, axe.aZ);
   public static final cxj d = new cxj(awv.bK, 1561, 8.0F, 3.0F, 10, axe.bb);
   public static final cxj e = new cxj(awv.bN, 32, 12.0F, 0.0F, 22, axe.ba);
   public static final cxj f = new cxj(awv.bJ, 2031, 9.0F, 4.0F, 15, axe.bc);

   private cvn.a a(cvn.a $$0) {
      return $$0.b(this.h).a(this.l).c(this.k);
   }

   public cvn.a a(cvn.a $$0, axl<dhm> $$1, float $$2, float $$3) {
      jp<dhm> $$4 = lv.a(lv.e);
      return this.a($$0).a(ks.A, new cyy(List.of(cyy.a.a($$4.b(this.g)), cyy.a.a($$4.b($$1), this.i)), 1.0F, 1)).a(this.a($$2, $$3));
   }

   private cyn a(float $$0, float $$1) {
      return cyn.a().a(bvu.c, new bvs(cvn.f, (double)($$0 + this.j), bvs.a.a), bua.b).a(bvu.e, new bvs(cvn.g, (double)$$1, bvs.a.a), bua.b).a();
   }

   public cvn.a a(cvn.a $$0, float $$1, float $$2) {
      jp<dhm> $$3 = lv.a(lv.e);
      return this.a($$0).a(ks.A, new cyy(List.of(cyy.a.a(js.a(dho.bs.r()), 15.0F), cyy.a.b($$3.b(awv.bF), 1.5F)), 1.0F, 2)).a(this.b($$1, $$2));
   }

   private cyn b(float $$0, float $$1) {
      return cyn.a().a(bvu.c, new bvs(cvn.f, (double)($$0 + this.j), bvs.a.a), bua.b).a(bvu.e, new bvs(cvn.g, (double)$$1, bvs.a.a), bua.b).a();
   }

   public axl<dhm> a() {
      return this.g;
   }

   public int b() {
      return this.h;
   }

   public float c() {
      return this.i;
   }

   public float d() {
      return this.j;
   }

   public int e() {
      return this.k;
   }

   public axl<cvn> f() {
      return this.l;
   }
}
