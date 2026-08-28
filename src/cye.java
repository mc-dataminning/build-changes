import java.util.List;

public record cye(axe<djk> g, int h, float i, float j, int k, axe<cwj> l) {
   public static final cye a = new cye(awo.bP, 59, 2.0F, 0.0F, 15, awx.bb);
   public static final cye b = new cye(awo.bN, 131, 4.0F, 1.0F, 5, awx.bc);
   public static final cye c = new cye(awo.bM, 250, 6.0F, 2.0F, 14, awx.bd);
   public static final cye d = new cye(awo.bL, 1561, 8.0F, 3.0F, 10, awx.bf);
   public static final cye e = new cye(awo.bO, 32, 12.0F, 0.0F, 22, awx.be);
   public static final cye f = new cye(awo.bK, 2031, 9.0F, 4.0F, 15, awx.bg);

   private cwj.a a(cwj.a $$0) {
      return $$0.b(this.h).a(this.l).c(this.k);
   }

   public cwj.a a(cwj.a $$0, axe<djk> $$1, float $$2, float $$3) {
      js<djk> $$4 = mb.a(mb.e);
      return this.a($$0).a(kv.B, new czp(List.of(czp.a.a($$4.b(this.g)), czp.a.a($$4.b($$1), this.i)), 1.0F, 1)).a(this.a($$2, $$3));
   }

   private cze a(float $$0, float $$1) {
      return cze.a().a(bwn.c, new bwl(cwj.g, (double)($$0 + this.j), bwl.a.a), bus.b).a(bwn.e, new bwl(cwj.h, (double)$$1, bwl.a.a), bus.b).a();
   }

   public cwj.a a(cwj.a $$0, float $$1, float $$2) {
      js<djk> $$3 = mb.a(mb.e);
      return this.a($$0).a(kv.B, new czp(List.of(czp.a.a(jv.a(djm.bz.p()), 15.0F), czp.a.b($$3.b(awo.bG), 1.5F)), 1.0F, 2)).a(this.b($$1, $$2));
   }

   private cze b(float $$0, float $$1) {
      return cze.a().a(bwn.c, new bwl(cwj.g, (double)($$0 + this.j), bwl.a.a), bus.b).a(bwn.e, new bwl(cwj.h, (double)$$1, bwl.a.a), bus.b).a();
   }

   public axe<djk> a() {
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

   public axe<cwj> f() {
      return this.l;
   }
}
