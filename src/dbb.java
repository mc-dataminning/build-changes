import java.util.List;

public record dbb(axr<dmr> g, int h, float i, float j, int k, axr<czj> l) {
   public static final dbb a = new dbb(axc.bR, 59, 2.0F, 0.0F, 15, axk.bc);
   public static final dbb b = new dbb(axc.bP, 131, 4.0F, 1.0F, 5, axk.bd);
   public static final dbb c = new dbb(axc.bO, 250, 6.0F, 2.0F, 14, axk.be);
   public static final dbb d = new dbb(axc.bN, 1561, 8.0F, 3.0F, 10, axk.bg);
   public static final dbb e = new dbb(axc.bQ, 32, 12.0F, 0.0F, 22, axk.bf);
   public static final dbb f = new dbb(axc.bM, 2031, 9.0F, 4.0F, 15, axk.bh);

   private czj.a a(czj.a $$0) {
      return $$0.b(this.h).a(this.l).c(this.k);
   }

   public czj.a a(czj.a $$0, axr<dmr> $$1, float $$2, float $$3, float $$4) {
      jg<dmr> $$5 = mg.a(mg.e);
      return this.a($$0)
         .a(kk.A, new dcq(List.of(dcq.a.a($$5.b(this.g)), dcq.a.a($$5.b($$1), this.i)), 1.0F, 1, true))
         .a(this.a($$2, $$3))
         .a(kk.B, new dcv(2, $$4));
   }

   private dce a(float $$0, float $$1) {
      return dce.a().a(byp.c, new byn(czj.h, (double)($$0 + this.j), byn.a.a), bwt.b).a(byp.e, new byn(czj.i, (double)$$1, byn.a.a), bwt.b).a();
   }

   public czj.a a(czj.a $$0, float $$1, float $$2) {
      jg<dmr> $$3 = mg.a(mg.e);
      return this.a($$0)
         .a(kk.A, new dcq(List.of(dcq.a.a(jj.a(dmt.bz.p()), 15.0F), dcq.a.b($$3.b(axc.bI), Float.MAX_VALUE), dcq.a.b($$3.b(axc.bH), 1.5F)), 1.0F, 2, false))
         .a(this.b($$1, $$2))
         .a(kk.B, new dcv(1));
   }

   private dce b(float $$0, float $$1) {
      return dce.a().a(byp.c, new byn(czj.h, (double)($$0 + this.j), byn.a.a), bwt.b).a(byp.e, new byn(czj.i, (double)$$1, byn.a.a), bwt.b).a();
   }

   public axr<dmr> a() {
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

   public axr<czj> f() {
      return this.l;
   }
}
