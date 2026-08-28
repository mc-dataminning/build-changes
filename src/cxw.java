import java.util.List;

public record cxw(axt<dij> g, int h, float i, float j, int k, axt<cwb> l) {
   public static final cxw a = new cxw(axd.bO, 59, 2.0F, 0.0F, 15, axm.bc);
   public static final cxw b = new cxw(axd.bM, 131, 4.0F, 1.0F, 5, axm.bd);
   public static final cxw c = new cxw(axd.bL, 250, 6.0F, 2.0F, 14, axm.be);
   public static final cxw d = new cxw(axd.bK, 1561, 8.0F, 3.0F, 10, axm.bg);
   public static final cxw e = new cxw(axd.bN, 32, 12.0F, 0.0F, 22, axm.bf);
   public static final cxw f = new cxw(axd.bJ, 2031, 9.0F, 4.0F, 15, axm.bh);

   private cwb.a a(cwb.a $$0) {
      return $$0.b(this.h).a(this.l).c(this.k);
   }

   public cwb.a a(cwb.a $$0, axt<dij> $$1, float $$2, float $$3) {
      jr<dij> $$4 = lz.a(lz.e);
      return this.a($$0).a(ku.B, new czh(List.of(czh.a.a($$4.b(this.g)), czh.a.a($$4.b($$1), this.i)), 1.0F, 1)).a(this.a($$2, $$3));
   }

   private cyw a(float $$0, float $$1) {
      return cyw.a().a(bwm.c, new bwk(cwb.f, (double)($$0 + this.j), bwk.a.a), bur.b).a(bwm.e, new bwk(cwb.g, (double)$$1, bwk.a.a), bur.b).a();
   }

   public cwb.a a(cwb.a $$0, float $$1, float $$2) {
      jr<dij> $$3 = lz.a(lz.e);
      return this.a($$0).a(ku.B, new czh(List.of(czh.a.a(ju.a(dil.bs.p()), 15.0F), czh.a.b($$3.b(axd.bF), 1.5F)), 1.0F, 2)).a(this.b($$1, $$2));
   }

   private cyw b(float $$0, float $$1) {
      return cyw.a().a(bwm.c, new bwk(cwb.f, (double)($$0 + this.j), bwk.a.a), bur.b).a(bwm.e, new bwk(cwb.g, (double)$$1, bwk.a.a), bur.b).a();
   }

   public axt<dij> a() {
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

   public axt<cwb> f() {
      return this.l;
   }
}
