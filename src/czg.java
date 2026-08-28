import java.util.List;

public record czg(ayk<dkm> g, int h, float i, float j, int k, ayk<cxl> l) {
   public static final czg a = new czg(axu.bP, 59, 2.0F, 0.0F, 15, ayd.bd);
   public static final czg b = new czg(axu.bN, 131, 4.0F, 1.0F, 5, ayd.be);
   public static final czg c = new czg(axu.bM, 250, 6.0F, 2.0F, 14, ayd.bf);
   public static final czg d = new czg(axu.bL, 1561, 8.0F, 3.0F, 10, ayd.bh);
   public static final czg e = new czg(axu.bO, 32, 12.0F, 0.0F, 22, ayd.bg);
   public static final czg f = new czg(axu.bK, 2031, 9.0F, 4.0F, 15, ayd.bi);

   private cxl.a a(cxl.a $$0) {
      return $$0.b(this.h).a(this.l).c(this.k);
   }

   public cxl.a a(cxl.a $$0, ayk<dkm> $$1, float $$2, float $$3) {
      jr<dkm> $$4 = ma.a(ma.e);
      return this.a($$0).a(ku.B, new dar(List.of(dar.a.a($$4.b(this.g)), dar.a.a($$4.b($$1), this.i)), 1.0F, 1)).a(this.a($$2, $$3));
   }

   private dag a(float $$0, float $$1) {
      return dag.a().a(bxo.c, new bxm(cxl.g, (double)($$0 + this.j), bxm.a.a), bvt.b).a(bxo.e, new bxm(cxl.h, (double)$$1, bxm.a.a), bvt.b).a();
   }

   public cxl.a a(cxl.a $$0, float $$1, float $$2) {
      jr<dkm> $$3 = ma.a(ma.e);
      return this.a($$0).a(ku.B, new dar(List.of(dar.a.a(ju.a(dko.bz.p()), 15.0F), dar.a.b($$3.b(axu.bG), 1.5F)), 1.0F, 2)).a(this.b($$1, $$2));
   }

   private dag b(float $$0, float $$1) {
      return dag.a().a(bxo.c, new bxm(cxl.g, (double)($$0 + this.j), bxm.a.a), bvt.b).a(bxo.e, new bxm(cxl.h, (double)$$1, bxm.a.a), bvt.b).a();
   }

   public ayk<dkm> a() {
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

   public ayk<cxl> f() {
      return this.l;
   }
}
