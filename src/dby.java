import java.util.List;

public record dby(ayc<dno> g, int h, float i, float j, int k, ayc<dag> l) {
   public static final dby a = new dby(axn.bR, 59, 2.0F, 0.0F, 15, axv.bd);
   public static final dby b = new dby(axn.bP, 131, 4.0F, 1.0F, 5, axv.be);
   public static final dby c = new dby(axn.bO, 250, 6.0F, 2.0F, 14, axv.bf);
   public static final dby d = new dby(axn.bN, 1561, 8.0F, 3.0F, 10, axv.bh);
   public static final dby e = new dby(axn.bQ, 32, 12.0F, 0.0F, 22, axv.bg);
   public static final dby f = new dby(axn.bM, 2031, 9.0F, 4.0F, 15, axv.bi);

   private dag.a a(dag.a $$0) {
      return $$0.b(this.h).a(this.l).c(this.k);
   }

   public dag.a a(dag.a $$0, ayc<dno> $$1, float $$2, float $$3, float $$4) {
      jh<dno> $$5 = mh.a(mh.e);
      return this.a($$0)
         .a(kl.A, new ddn(List.of(ddn.a.a($$5.b(this.g)), ddn.a.a($$5.b($$1), this.i)), 1.0F, 1, true))
         .a(this.a($$2, $$3))
         .a(kl.B, new dds(2, $$4));
   }

   private ddb a(float $$0, float $$1) {
      return ddb.a().a(bzl.c, new bzj(dag.h, (double)($$0 + this.j), bzj.a.a), bxp.b).a(bzl.e, new bzj(dag.i, (double)$$1, bzj.a.a), bxp.b).a();
   }

   public dag.a a(dag.a $$0, float $$1, float $$2) {
      jh<dno> $$3 = mh.a(mh.e);
      return this.a($$0)
         .a(kl.A, new ddn(List.of(ddn.a.a(jk.a(dnq.bz.p()), 15.0F), ddn.a.b($$3.b(axn.bI), Float.MAX_VALUE), ddn.a.b($$3.b(axn.bH), 1.5F)), 1.0F, 2, false))
         .a(this.b($$1, $$2))
         .a(kl.B, new dds(1));
   }

   private ddb b(float $$0, float $$1) {
      return ddb.a().a(bzl.c, new bzj(dag.h, (double)($$0 + this.j), bzj.a.a), bxp.b).a(bzl.e, new bzj(dag.i, (double)$$1, bzj.a.a), bxp.b).a();
   }

   public ayc<dno> a() {
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

   public ayc<dag> f() {
      return this.l;
   }
}
