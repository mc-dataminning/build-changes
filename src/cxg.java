import java.util.List;

public record cxg(axj<dhj> g, int h, float i, float j, int k, axj<cvk> l) {
   public static final cxg a = new cxg(awt.bO, 59, 2.0F, 0.0F, 15, axc.aX);
   public static final cxg b = new cxg(awt.bM, 131, 4.0F, 1.0F, 5, axc.aY);
   public static final cxg c = new cxg(awt.bL, 250, 6.0F, 2.0F, 14, axc.aZ);
   public static final cxg d = new cxg(awt.bK, 1561, 8.0F, 3.0F, 10, axc.bb);
   public static final cxg e = new cxg(awt.bN, 32, 12.0F, 0.0F, 22, axc.ba);
   public static final cxg f = new cxg(awt.bJ, 2031, 9.0F, 4.0F, 15, axc.bc);

   private cvk.a a(cvk.a $$0) {
      return $$0.b(this.h).a(this.l).c(this.k);
   }

   public cvk.a a(cvk.a $$0, axj<dhj> $$1, float $$2, float $$3) {
      jo<dhj> $$4 = lu.a(lu.e);
      return this.a($$0).a(kr.A, new cyv(List.of(cyv.a.a($$4.b(this.g)), cyv.a.a($$4.b($$1), this.i)), 1.0F, 1)).a(this.a($$2, $$3));
   }

   private cyk a(float $$0, float $$1) {
      return cyk.a().a(bvr.c, new bvp(cvk.f, (double)($$0 + this.j), bvp.a.a), btx.b).a(bvr.e, new bvp(cvk.g, (double)$$1, bvp.a.a), btx.b).a();
   }

   public cvk.a a(cvk.a $$0, float $$1, float $$2) {
      jo<dhj> $$3 = lu.a(lu.e);
      return this.a($$0).a(kr.A, new cyv(List.of(cyv.a.a(jr.a(dhl.bs.s()), 15.0F), cyv.a.b($$3.b(awt.bF), 1.5F)), 1.0F, 2)).a(this.b($$1, $$2));
   }

   private cyk b(float $$0, float $$1) {
      return cyk.a().a(bvr.c, new bvp(cvk.f, (double)($$0 + this.j), bvp.a.a), btx.b).a(bvr.e, new bvp(cvk.g, (double)$$1, bvp.a.a), btx.b).a();
   }

   public axj<dhj> a() {
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

   public axj<cvk> f() {
      return this.l;
   }
}
