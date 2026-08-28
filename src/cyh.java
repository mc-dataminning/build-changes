import java.util.List;

public record cyh(axf<djn> g, int h, float i, float j, int k, axf<cwm> l) {
   public static final cyh a = new cyh(awp.bP, 59, 2.0F, 0.0F, 15, awy.bb);
   public static final cyh b = new cyh(awp.bN, 131, 4.0F, 1.0F, 5, awy.bc);
   public static final cyh c = new cyh(awp.bM, 250, 6.0F, 2.0F, 14, awy.bd);
   public static final cyh d = new cyh(awp.bL, 1561, 8.0F, 3.0F, 10, awy.bf);
   public static final cyh e = new cyh(awp.bO, 32, 12.0F, 0.0F, 22, awy.be);
   public static final cyh f = new cyh(awp.bK, 2031, 9.0F, 4.0F, 15, awy.bg);

   private cwm.a a(cwm.a $$0) {
      return $$0.b(this.h).a(this.l).c(this.k);
   }

   public cwm.a a(cwm.a $$0, axf<djn> $$1, float $$2, float $$3) {
      js<djn> $$4 = mb.a(mb.e);
      return this.a($$0).a(kv.B, new czs(List.of(czs.a.a($$4.b(this.g)), czs.a.a($$4.b($$1), this.i)), 1.0F, 1)).a(this.a($$2, $$3));
   }

   private czh a(float $$0, float $$1) {
      return czh.a().a(bwq.c, new bwo(cwm.g, (double)($$0 + this.j), bwo.a.a), buv.b).a(bwq.e, new bwo(cwm.h, (double)$$1, bwo.a.a), buv.b).a();
   }

   public cwm.a a(cwm.a $$0, float $$1, float $$2) {
      js<djn> $$3 = mb.a(mb.e);
      return this.a($$0).a(kv.B, new czs(List.of(czs.a.a(jv.a(djp.bz.p()), 15.0F), czs.a.b($$3.b(awp.bG), 1.5F)), 1.0F, 2)).a(this.b($$1, $$2));
   }

   private czh b(float $$0, float $$1) {
      return czh.a().a(bwq.c, new bwo(cwm.g, (double)($$0 + this.j), bwo.a.a), buv.b).a(bwq.e, new bwo(cwm.h, (double)$$1, bwo.a.a), buv.b).a();
   }

   public axf<djn> a() {
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

   public axf<cwm> f() {
      return this.l;
   }
}
