import java.util.List;

public record cyg(axf<djm> g, int h, float i, float j, int k, axf<cwl> l) {
   public static final cyg a = new cyg(awp.bP, 59, 2.0F, 0.0F, 15, awy.bb);
   public static final cyg b = new cyg(awp.bN, 131, 4.0F, 1.0F, 5, awy.bc);
   public static final cyg c = new cyg(awp.bM, 250, 6.0F, 2.0F, 14, awy.bd);
   public static final cyg d = new cyg(awp.bL, 1561, 8.0F, 3.0F, 10, awy.bf);
   public static final cyg e = new cyg(awp.bO, 32, 12.0F, 0.0F, 22, awy.be);
   public static final cyg f = new cyg(awp.bK, 2031, 9.0F, 4.0F, 15, awy.bg);

   private cwl.a a(cwl.a $$0) {
      return $$0.b(this.h).a(this.l).c(this.k);
   }

   public cwl.a a(cwl.a $$0, axf<djm> $$1, float $$2, float $$3) {
      js<djm> $$4 = mb.a(mb.e);
      return this.a($$0).a(kv.B, new czr(List.of(czr.a.a($$4.b(this.g)), czr.a.a($$4.b($$1), this.i)), 1.0F, 1)).a(this.a($$2, $$3));
   }

   private czg a(float $$0, float $$1) {
      return czg.a().a(bwp.c, new bwn(cwl.g, (double)($$0 + this.j), bwn.a.a), buu.b).a(bwp.e, new bwn(cwl.h, (double)$$1, bwn.a.a), buu.b).a();
   }

   public cwl.a a(cwl.a $$0, float $$1, float $$2) {
      js<djm> $$3 = mb.a(mb.e);
      return this.a($$0).a(kv.B, new czr(List.of(czr.a.a(jv.a(djo.bz.p()), 15.0F), czr.a.b($$3.b(awp.bG), 1.5F)), 1.0F, 2)).a(this.b($$1, $$2));
   }

   private czg b(float $$0, float $$1) {
      return czg.a().a(bwp.c, new bwn(cwl.g, (double)($$0 + this.j), bwn.a.a), buu.b).a(bwp.e, new bwn(cwl.h, (double)$$1, bwn.a.a), buu.b).a();
   }

   public axf<djm> a() {
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

   public axf<cwl> f() {
      return this.l;
   }
}
