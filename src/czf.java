import java.util.List;

public record czf(ayk<dkl> g, int h, float i, float j, int k, ayk<cxk> l) {
   public static final czf a = new czf(axu.bP, 59, 2.0F, 0.0F, 15, ayd.bd);
   public static final czf b = new czf(axu.bN, 131, 4.0F, 1.0F, 5, ayd.be);
   public static final czf c = new czf(axu.bM, 250, 6.0F, 2.0F, 14, ayd.bf);
   public static final czf d = new czf(axu.bL, 1561, 8.0F, 3.0F, 10, ayd.bh);
   public static final czf e = new czf(axu.bO, 32, 12.0F, 0.0F, 22, ayd.bg);
   public static final czf f = new czf(axu.bK, 2031, 9.0F, 4.0F, 15, ayd.bi);

   private cxk.a a(cxk.a $$0) {
      return $$0.b(this.h).a(this.l).c(this.k);
   }

   public cxk.a a(cxk.a $$0, ayk<dkl> $$1, float $$2, float $$3) {
      jr<dkl> $$4 = ma.a(ma.e);
      return this.a($$0).a(ku.B, new daq(List.of(daq.a.a($$4.b(this.g)), daq.a.a($$4.b($$1), this.i)), 1.0F, 1)).a(this.a($$2, $$3));
   }

   private daf a(float $$0, float $$1) {
      return daf.a().a(bxn.c, new bxl(cxk.f, (double)($$0 + this.j), bxl.a.a), bvs.b).a(bxn.e, new bxl(cxk.g, (double)$$1, bxl.a.a), bvs.b).a();
   }

   public cxk.a a(cxk.a $$0, float $$1, float $$2) {
      jr<dkl> $$3 = ma.a(ma.e);
      return this.a($$0).a(ku.B, new daq(List.of(daq.a.a(ju.a(dkn.bz.p()), 15.0F), daq.a.b($$3.b(axu.bG), 1.5F)), 1.0F, 2)).a(this.b($$1, $$2));
   }

   private daf b(float $$0, float $$1) {
      return daf.a().a(bxn.c, new bxl(cxk.f, (double)($$0 + this.j), bxl.a.a), bvs.b).a(bxn.e, new bxl(cxk.g, (double)$$1, bxl.a.a), bvs.b).a();
   }

   public ayk<dkl> a() {
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

   public ayk<cxk> f() {
      return this.l;
   }
}
