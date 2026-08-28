import java.util.List;

public record dag(axp<dlu> g, int h, float i, float j, int k, axp<cyo> l) {
   public static final dag a = new dag(axa.bQ, 59, 2.0F, 0.0F, 15, axi.bb);
   public static final dag b = new dag(axa.bO, 131, 4.0F, 1.0F, 5, axi.bc);
   public static final dag c = new dag(axa.bN, 250, 6.0F, 2.0F, 14, axi.bd);
   public static final dag d = new dag(axa.bM, 1561, 8.0F, 3.0F, 10, axi.bf);
   public static final dag e = new dag(axa.bP, 32, 12.0F, 0.0F, 22, axi.be);
   public static final dag f = new dag(axa.bL, 2031, 9.0F, 4.0F, 15, axi.bg);

   private cyo.a a(cyo.a $$0) {
      return $$0.b(this.h).a(this.l).c(this.k);
   }

   public cyo.a a(cyo.a $$0, axp<dlu> $$1, float $$2, float $$3, float $$4) {
      jf<dlu> $$5 = mf.a(mf.e);
      return this.a($$0)
         .a(kj.A, new dbv(List.of(dbv.a.a($$5.b(this.g)), dbv.a.a($$5.b($$1), this.i)), 1.0F, 1, true))
         .a(this.a($$2, $$3))
         .a(kj.B, new dca(2, $$4));
   }

   private dbj a(float $$0, float $$1) {
      return dbj.a().a(byf.c, new byd(cyo.h, (double)($$0 + this.j), byd.a.a), bwl.b).a(byf.e, new byd(cyo.i, (double)$$1, byd.a.a), bwl.b).a();
   }

   public cyo.a a(cyo.a $$0, float $$1, float $$2) {
      jf<dlu> $$3 = mf.a(mf.e);
      return this.a($$0)
         .a(kj.A, new dbv(List.of(dbv.a.a(ji.a(dlw.bz.p()), 15.0F), dbv.a.b($$3.b(axa.bH), Float.MAX_VALUE), dbv.a.b($$3.b(axa.bG), 1.5F)), 1.0F, 2, false))
         .a(this.b($$1, $$2))
         .a(kj.B, new dca(1));
   }

   private dbj b(float $$0, float $$1) {
      return dbj.a().a(byf.c, new byd(cyo.h, (double)($$0 + this.j), byd.a.a), bwl.b).a(byf.e, new byd(cyo.i, (double)$$1, byd.a.a), bwl.b).a();
   }

   public axp<dlu> a() {
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

   public axp<cyo> f() {
      return this.l;
   }
}
