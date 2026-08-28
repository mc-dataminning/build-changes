import java.util.List;

public record dar(axr<dmf> g, int h, float i, float j, int k, axr<cyz> l) {
   public static final dar a = new dar(axc.bR, 59, 2.0F, 0.0F, 15, axk.bc);
   public static final dar b = new dar(axc.bP, 131, 4.0F, 1.0F, 5, axk.bd);
   public static final dar c = new dar(axc.bO, 250, 6.0F, 2.0F, 14, axk.be);
   public static final dar d = new dar(axc.bN, 1561, 8.0F, 3.0F, 10, axk.bg);
   public static final dar e = new dar(axc.bQ, 32, 12.0F, 0.0F, 22, axk.bf);
   public static final dar f = new dar(axc.bM, 2031, 9.0F, 4.0F, 15, axk.bh);

   private cyz.a a(cyz.a $$0) {
      return $$0.b(this.h).a(this.l).c(this.k);
   }

   public cyz.a a(cyz.a $$0, axr<dmf> $$1, float $$2, float $$3, float $$4) {
      jf<dmf> $$5 = mf.a(mf.e);
      return this.a($$0)
         .a(kj.A, new dcg(List.of(dcg.a.a($$5.b(this.g)), dcg.a.a($$5.b($$1), this.i)), 1.0F, 1, true))
         .a(this.a($$2, $$3))
         .a(kj.B, new dcl(2, $$4));
   }

   private dbu a(float $$0, float $$1) {
      return dbu.a().a(byk.c, new byi(cyz.h, (double)($$0 + this.j), byi.a.a), bwq.b).a(byk.e, new byi(cyz.i, (double)$$1, byi.a.a), bwq.b).a();
   }

   public cyz.a a(cyz.a $$0, float $$1, float $$2) {
      jf<dmf> $$3 = mf.a(mf.e);
      return this.a($$0)
         .a(kj.A, new dcg(List.of(dcg.a.a(ji.a(dmh.bz.p()), 15.0F), dcg.a.b($$3.b(axc.bI), Float.MAX_VALUE), dcg.a.b($$3.b(axc.bH), 1.5F)), 1.0F, 2, false))
         .a(this.b($$1, $$2))
         .a(kj.B, new dcl(1));
   }

   private dbu b(float $$0, float $$1) {
      return dbu.a().a(byk.c, new byi(cyz.h, (double)($$0 + this.j), byi.a.a), bwq.b).a(byk.e, new byi(cyz.i, (double)$$1, byi.a.a), bwq.b).a();
   }

   public axr<dmf> a() {
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

   public axr<cyz> f() {
      return this.l;
   }
}
