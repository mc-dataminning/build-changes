import java.util.List;

public record czm(axp<dku> g, int h, float i, float j, int k, axp<cxu> l) {
   public static final czm a = new czm(awz.bQ, 59, 2.0F, 0.0F, 15, axi.bb);
   public static final czm b = new czm(awz.bO, 131, 4.0F, 1.0F, 5, axi.bc);
   public static final czm c = new czm(awz.bN, 250, 6.0F, 2.0F, 14, axi.bd);
   public static final czm d = new czm(awz.bM, 1561, 8.0F, 3.0F, 10, axi.bf);
   public static final czm e = new czm(awz.bP, 32, 12.0F, 0.0F, 22, axi.be);
   public static final czm f = new czm(awz.bL, 2031, 9.0F, 4.0F, 15, axi.bg);

   private cxu.a a(cxu.a $$0) {
      return $$0.b(this.h).a(this.l).c(this.k);
   }

   public cxu.a a(cxu.a $$0, axp<dku> $$1, float $$2, float $$3, boolean $$4) {
      jt<dku> $$5 = md.a(md.e);
      return this.a($$0)
         .a(kx.B, new dax(List.of(dax.a.a($$5.b(this.g)), dax.a.a($$5.b($$1), this.i)), 1.0F, 1, true))
         .a(this.a($$2, $$3))
         .a(kx.C, new dbc(2, $$4));
   }

   private dam a(float $$0, float $$1) {
      return dam.a().a(bxx.c, new bxv(cxu.h, (double)($$0 + this.j), bxv.a.a), bwd.b).a(bxx.e, new bxv(cxu.i, (double)$$1, bxv.a.a), bwd.b).a();
   }

   public cxu.a a(cxu.a $$0, float $$1, float $$2) {
      jt<dku> $$3 = md.a(md.e);
      return this.a($$0)
         .a(kx.B, new dax(List.of(dax.a.a(jw.a(dkw.bz.p()), 15.0F), dax.a.b($$3.b(awz.bH), Float.MAX_VALUE), dax.a.b($$3.b(awz.bG), 1.5F)), 1.0F, 2, false))
         .a(this.b($$1, $$2))
         .a(kx.C, new dbc(1, false));
   }

   private dam b(float $$0, float $$1) {
      return dam.a().a(bxx.c, new bxv(cxu.h, (double)($$0 + this.j), bxv.a.a), bwd.b).a(bxx.e, new bxv(cxu.i, (double)$$1, bxv.a.a), bwd.b).a();
   }

   public axp<dku> a() {
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

   public axp<cxu> f() {
      return this.l;
   }
}
