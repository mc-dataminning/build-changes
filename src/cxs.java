import java.util.List;

public record cxs(axq<die> g, int h, float i, float j, int k, axq<cvx> l) {
   public static final cxs a = new cxs(axa.bO, 59, 2.0F, 0.0F, 15, axj.bb);
   public static final cxs b = new cxs(axa.bM, 131, 4.0F, 1.0F, 5, axj.bc);
   public static final cxs c = new cxs(axa.bL, 250, 6.0F, 2.0F, 14, axj.bd);
   public static final cxs d = new cxs(axa.bK, 1561, 8.0F, 3.0F, 10, axj.bf);
   public static final cxs e = new cxs(axa.bN, 32, 12.0F, 0.0F, 22, axj.be);
   public static final cxs f = new cxs(axa.bJ, 2031, 9.0F, 4.0F, 15, axj.bg);

   private cvx.a a(cvx.a $$0) {
      return $$0.b(this.h).a(this.l).c(this.k);
   }

   public cvx.a a(cvx.a $$0, axq<die> $$1, float $$2, float $$3) {
      jr<die> $$4 = ly.a(ly.e);
      return this.a($$0).a(ku.B, new czd(List.of(czd.a.a($$4.b(this.g)), czd.a.a($$4.b($$1), this.i)), 1.0F, 1)).a(this.a($$2, $$3));
   }

   private cys a(float $$0, float $$1) {
      return cys.a().a(bwi.c, new bwg(cvx.f, (double)($$0 + this.j), bwg.a.a), bun.b).a(bwi.e, new bwg(cvx.g, (double)$$1, bwg.a.a), bun.b).a();
   }

   public cvx.a a(cvx.a $$0, float $$1, float $$2) {
      jr<die> $$3 = ly.a(ly.e);
      return this.a($$0).a(ku.B, new czd(List.of(czd.a.a(ju.a(dig.bs.p()), 15.0F), czd.a.b($$3.b(axa.bF), 1.5F)), 1.0F, 2)).a(this.b($$1, $$2));
   }

   private cys b(float $$0, float $$1) {
      return cys.a().a(bwi.c, new bwg(cvx.f, (double)($$0 + this.j), bwg.a.a), bun.b).a(bwi.e, new bwg(cvx.g, (double)$$1, bwg.a.a), bun.b).a();
   }

   public axq<die> a() {
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

   public axq<cvx> f() {
      return this.l;
   }
}
