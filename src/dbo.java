import java.util.List;

public record dbo(axv<dne> g, int h, float i, float j, int k, axv<czw> l) {
   public static final dbo a = new dbo(axg.bR, 59, 2.0F, 0.0F, 15, axo.bd);
   public static final dbo b = new dbo(axg.bP, 131, 4.0F, 1.0F, 5, axo.be);
   public static final dbo c = new dbo(axg.bO, 250, 6.0F, 2.0F, 14, axo.bf);
   public static final dbo d = new dbo(axg.bN, 1561, 8.0F, 3.0F, 10, axo.bh);
   public static final dbo e = new dbo(axg.bQ, 32, 12.0F, 0.0F, 22, axo.bg);
   public static final dbo f = new dbo(axg.bM, 2031, 9.0F, 4.0F, 15, axo.bi);

   private czw.a a(czw.a $$0) {
      return $$0.b(this.h).a(this.l).c(this.k);
   }

   public czw.a a(czw.a $$0, axv<dne> $$1, float $$2, float $$3, float $$4) {
      jh<dne> $$5 = mh.a(mh.e);
      return this.a($$0)
         .a(kl.A, new ddd(List.of(ddd.a.a($$5.b(this.g)), ddd.a.a($$5.b($$1), this.i)), 1.0F, 1, true))
         .a(this.a($$2, $$3))
         .a(kl.B, new ddi(2, $$4));
   }

   private dcr a(float $$0, float $$1) {
      return dcr.a().a(bzc.c, new bza(czw.h, (double)($$0 + this.j), bza.a.a), bxg.b).a(bzc.e, new bza(czw.i, (double)$$1, bza.a.a), bxg.b).a();
   }

   public czw.a a(czw.a $$0, float $$1, float $$2) {
      jh<dne> $$3 = mh.a(mh.e);
      return this.a($$0)
         .a(kl.A, new ddd(List.of(ddd.a.a(jk.a(dng.bz.p()), 15.0F), ddd.a.b($$3.b(axg.bI), Float.MAX_VALUE), ddd.a.b($$3.b(axg.bH), 1.5F)), 1.0F, 2, false))
         .a(this.b($$1, $$2))
         .a(kl.B, new ddi(1));
   }

   private dcr b(float $$0, float $$1) {
      return dcr.a().a(bzc.c, new bza(czw.h, (double)($$0 + this.j), bza.a.a), bxg.b).a(bzc.e, new bza(czw.i, (double)$$1, bza.a.a), bxg.b).a();
   }

   public axv<dne> a() {
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

   public axv<czw> f() {
      return this.l;
   }
}
