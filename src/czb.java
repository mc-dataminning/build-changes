import java.util.List;

public record czb(ayk<dke> g, int h, float i, float j, int k, ayk<cxg> l) {
   public static final czb a = new czb(axu.bP, 59, 2.0F, 0.0F, 15, ayd.bd);
   public static final czb b = new czb(axu.bN, 131, 4.0F, 1.0F, 5, ayd.be);
   public static final czb c = new czb(axu.bM, 250, 6.0F, 2.0F, 14, ayd.bf);
   public static final czb d = new czb(axu.bL, 1561, 8.0F, 3.0F, 10, ayd.bh);
   public static final czb e = new czb(axu.bO, 32, 12.0F, 0.0F, 22, ayd.bg);
   public static final czb f = new czb(axu.bK, 2031, 9.0F, 4.0F, 15, ayd.bi);

   private cxg.a a(cxg.a $$0) {
      return $$0.b(this.h).a(this.l).c(this.k);
   }

   public cxg.a a(cxg.a $$0, ayk<dke> $$1, float $$2, float $$3) {
      jr<dke> $$4 = ma.a(ma.e);
      return this.a($$0).a(ku.B, new dam(List.of(dam.a.a($$4.b(this.g)), dam.a.a($$4.b($$1), this.i)), 1.0F, 1)).a(this.a($$2, $$3));
   }

   private dab a(float $$0, float $$1) {
      return dab.a().a(bxj.c, new bxh(cxg.f, (double)($$0 + this.j), bxh.a.a), bvo.b).a(bxj.e, new bxh(cxg.g, (double)$$1, bxh.a.a), bvo.b).a();
   }

   public cxg.a a(cxg.a $$0, float $$1, float $$2) {
      jr<dke> $$3 = ma.a(ma.e);
      return this.a($$0).a(ku.B, new dam(List.of(dam.a.a(ju.a(dkg.bz.p()), 15.0F), dam.a.b($$3.b(axu.bG), 1.5F)), 1.0F, 2)).a(this.b($$1, $$2));
   }

   private dab b(float $$0, float $$1) {
      return dab.a().a(bxj.c, new bxh(cxg.f, (double)($$0 + this.j), bxh.a.a), bvo.b).a(bxj.e, new bxh(cxg.g, (double)$$1, bxh.a.a), bvo.b).a();
   }

   public ayk<dke> a() {
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

   public ayk<cxg> f() {
      return this.l;
   }
}
