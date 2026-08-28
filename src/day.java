import java.util.List;

public record day(axr<dmm> g, int h, float i, float j, int k, axr<czg> l) {
   public static final day a = new day(axc.bR, 59, 2.0F, 0.0F, 15, axk.bc);
   public static final day b = new day(axc.bP, 131, 4.0F, 1.0F, 5, axk.bd);
   public static final day c = new day(axc.bO, 250, 6.0F, 2.0F, 14, axk.be);
   public static final day d = new day(axc.bN, 1561, 8.0F, 3.0F, 10, axk.bg);
   public static final day e = new day(axc.bQ, 32, 12.0F, 0.0F, 22, axk.bf);
   public static final day f = new day(axc.bM, 2031, 9.0F, 4.0F, 15, axk.bh);

   private czg.a a(czg.a $$0) {
      return $$0.b(this.h).a(this.l).c(this.k);
   }

   public czg.a a(czg.a $$0, axr<dmm> $$1, float $$2, float $$3, float $$4) {
      jg<dmm> $$5 = mg.a(mg.e);
      return this.a($$0)
         .a(kk.A, new dcn(List.of(dcn.a.a($$5.b(this.g)), dcn.a.a($$5.b($$1), this.i)), 1.0F, 1, true))
         .a(this.a($$2, $$3))
         .a(kk.B, new dcs(2, $$4));
   }

   private dcb a(float $$0, float $$1) {
      return dcb.a().a(byp.c, new byn(czg.h, (double)($$0 + this.j), byn.a.a), bwt.b).a(byp.e, new byn(czg.i, (double)$$1, byn.a.a), bwt.b).a();
   }

   public czg.a a(czg.a $$0, float $$1, float $$2) {
      jg<dmm> $$3 = mg.a(mg.e);
      return this.a($$0)
         .a(kk.A, new dcn(List.of(dcn.a.a(jj.a(dmo.bz.p()), 15.0F), dcn.a.b($$3.b(axc.bI), Float.MAX_VALUE), dcn.a.b($$3.b(axc.bH), 1.5F)), 1.0F, 2, false))
         .a(this.b($$1, $$2))
         .a(kk.B, new dcs(1));
   }

   private dcb b(float $$0, float $$1) {
      return dcb.a().a(byp.c, new byn(czg.h, (double)($$0 + this.j), byn.a.a), bwt.b).a(byp.e, new byn(czg.i, (double)$$1, byn.a.a), bwt.b).a();
   }

   public axr<dmm> a() {
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

   public axr<czg> f() {
      return this.l;
   }
}
