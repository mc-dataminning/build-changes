import java.util.List;

public record cxo(axp<dhy> g, int h, float i, float j, int k, axp<cvt> l) {
   public static final cxo a = new cxo(awz.bO, 59, 2.0F, 0.0F, 15, axi.aY);
   public static final cxo b = new cxo(awz.bM, 131, 4.0F, 1.0F, 5, axi.aZ);
   public static final cxo c = new cxo(awz.bL, 250, 6.0F, 2.0F, 14, axi.ba);
   public static final cxo d = new cxo(awz.bK, 1561, 8.0F, 3.0F, 10, axi.bc);
   public static final cxo e = new cxo(awz.bN, 32, 12.0F, 0.0F, 22, axi.bb);
   public static final cxo f = new cxo(awz.bJ, 2031, 9.0F, 4.0F, 15, axi.bd);

   private cvt.a a(cvt.a $$0) {
      return $$0.b(this.h).a(this.l).c(this.k);
   }

   public cvt.a a(cvt.a $$0, axp<dhy> $$1, float $$2, float $$3) {
      jq<dhy> $$4 = lx.a(lx.e);
      return this.a($$0).a(kt.B, new cyx(List.of(cyx.a.a($$4.b(this.g)), cyx.a.a($$4.b($$1), this.i)), 1.0F, 1)).a(this.a($$2, $$3));
   }

   private cym a(float $$0, float $$1) {
      return cym.a().a(bwd.c, new bwb(cvt.f, (double)($$0 + this.j), bwb.a.a), bui.b).a(bwd.e, new bwb(cvt.g, (double)$$1, bwb.a.a), bui.b).a();
   }

   public cvt.a a(cvt.a $$0, float $$1, float $$2) {
      jq<dhy> $$3 = lx.a(lx.e);
      return this.a($$0).a(kt.B, new cyx(List.of(cyx.a.a(jt.a(dia.bs.p()), 15.0F), cyx.a.b($$3.b(awz.bF), 1.5F)), 1.0F, 2)).a(this.b($$1, $$2));
   }

   private cym b(float $$0, float $$1) {
      return cym.a().a(bwd.c, new bwb(cvt.f, (double)($$0 + this.j), bwb.a.a), bui.b).a(bwd.e, new bwb(cvt.g, (double)$$1, bwb.a.a), bui.b).a();
   }

   public axp<dhy> a() {
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

   public axp<cvt> f() {
      return this.l;
   }
}
