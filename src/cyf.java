import java.util.List;

public record cyf(axf<djl> g, int h, float i, float j, int k, axf<cwk> l) {
   public static final cyf a = new cyf(awp.bP, 59, 2.0F, 0.0F, 15, awy.bb);
   public static final cyf b = new cyf(awp.bN, 131, 4.0F, 1.0F, 5, awy.bc);
   public static final cyf c = new cyf(awp.bM, 250, 6.0F, 2.0F, 14, awy.bd);
   public static final cyf d = new cyf(awp.bL, 1561, 8.0F, 3.0F, 10, awy.bf);
   public static final cyf e = new cyf(awp.bO, 32, 12.0F, 0.0F, 22, awy.be);
   public static final cyf f = new cyf(awp.bK, 2031, 9.0F, 4.0F, 15, awy.bg);

   private cwk.a a(cwk.a $$0) {
      return $$0.b(this.h).a(this.l).c(this.k);
   }

   public cwk.a a(cwk.a $$0, axf<djl> $$1, float $$2, float $$3) {
      js<djl> $$4 = mb.a(mb.e);
      return this.a($$0).a(kv.B, new czq(List.of(czq.a.a($$4.b(this.g)), czq.a.a($$4.b($$1), this.i)), 1.0F, 1)).a(this.a($$2, $$3));
   }

   private czf a(float $$0, float $$1) {
      return czf.a().a(bwo.c, new bwm(cwk.g, (double)($$0 + this.j), bwm.a.a), but.b).a(bwo.e, new bwm(cwk.h, (double)$$1, bwm.a.a), but.b).a();
   }

   public cwk.a a(cwk.a $$0, float $$1, float $$2) {
      js<djl> $$3 = mb.a(mb.e);
      return this.a($$0).a(kv.B, new czq(List.of(czq.a.a(jv.a(djn.bz.p()), 15.0F), czq.a.b($$3.b(awp.bG), 1.5F)), 1.0F, 2)).a(this.b($$1, $$2));
   }

   private czf b(float $$0, float $$1) {
      return czf.a().a(bwo.c, new bwm(cwk.g, (double)($$0 + this.j), bwm.a.a), but.b).a(bwo.e, new bwm(cwk.h, (double)$$1, bwm.a.a), but.b).a();
   }

   public axf<djl> a() {
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

   public axf<cwk> f() {
      return this.l;
   }
}
