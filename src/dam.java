import java.util.List;

public record dam(axr<dma> g, int h, float i, float j, int k, axr<cyu> l) {
   public static final dam a = new dam(axc.bQ, 59, 2.0F, 0.0F, 15, axk.bb);
   public static final dam b = new dam(axc.bO, 131, 4.0F, 1.0F, 5, axk.bc);
   public static final dam c = new dam(axc.bN, 250, 6.0F, 2.0F, 14, axk.bd);
   public static final dam d = new dam(axc.bM, 1561, 8.0F, 3.0F, 10, axk.bf);
   public static final dam e = new dam(axc.bP, 32, 12.0F, 0.0F, 22, axk.be);
   public static final dam f = new dam(axc.bL, 2031, 9.0F, 4.0F, 15, axk.bg);

   private cyu.a a(cyu.a $$0) {
      return $$0.b(this.h).a(this.l).c(this.k);
   }

   public cyu.a a(cyu.a $$0, axr<dma> $$1, float $$2, float $$3, float $$4) {
      jf<dma> $$5 = mf.a(mf.e);
      return this.a($$0)
         .a(kj.A, new dcb(List.of(dcb.a.a($$5.b(this.g)), dcb.a.a($$5.b($$1), this.i)), 1.0F, 1, true))
         .a(this.a($$2, $$3))
         .a(kj.B, new dcg(2, $$4));
   }

   private dbp a(float $$0, float $$1) {
      return dbp.a().a(byi.c, new byg(cyu.h, (double)($$0 + this.j), byg.a.a), bwo.b).a(byi.e, new byg(cyu.i, (double)$$1, byg.a.a), bwo.b).a();
   }

   public cyu.a a(cyu.a $$0, float $$1, float $$2) {
      jf<dma> $$3 = mf.a(mf.e);
      return this.a($$0)
         .a(kj.A, new dcb(List.of(dcb.a.a(ji.a(dmc.bz.p()), 15.0F), dcb.a.b($$3.b(axc.bH), Float.MAX_VALUE), dcb.a.b($$3.b(axc.bG), 1.5F)), 1.0F, 2, false))
         .a(this.b($$1, $$2))
         .a(kj.B, new dcg(1));
   }

   private dbp b(float $$0, float $$1) {
      return dbp.a().a(byi.c, new byg(cyu.h, (double)($$0 + this.j), byg.a.a), bwo.b).a(byi.e, new byg(cyu.i, (double)$$1, byg.a.a), bwo.b).a();
   }

   public axr<dma> a() {
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

   public axr<cyu> f() {
      return this.l;
   }
}
