import java.util.List;

public record cxe(axi<dgv> g, int h, float i, float j, int k, axi<cvg> l) {
   public static final cxe a = new cxe(aws.bO, 59, 2.0F, 0.0F, 15, axb.aX);
   public static final cxe b = new cxe(aws.bM, 131, 4.0F, 1.0F, 5, axb.aY);
   public static final cxe c = new cxe(aws.bL, 250, 6.0F, 2.0F, 14, axb.aZ);
   public static final cxe d = new cxe(aws.bK, 1561, 8.0F, 3.0F, 10, axb.bb);
   public static final cxe e = new cxe(aws.bN, 32, 12.0F, 0.0F, 22, axb.ba);
   public static final cxe f = new cxe(aws.bJ, 2031, 9.0F, 4.0F, 15, axb.bc);

   private cvg.a a(cvg.a $$0) {
      return $$0.b(this.h).a(this.l).c(this.k);
   }

   public cvg.a a(cvg.a $$0, axi<dgv> $$1, float $$2, float $$3) {
      jo<dgv> $$4 = lu.a(lu.e);
      return this.a($$0).a(kr.x, new cyq(List.of(cyq.a.a($$4.b(this.g)), cyq.a.a($$4.b($$1), this.i)), 1.0F, 1)).a(this.a($$2, $$3));
   }

   private cyg a(float $$0, float $$1) {
      return cyg.a().a(bvm.c, new bvk(cvg.f, (double)($$0 + this.j), bvk.a.a), bts.b).a(bvm.e, new bvk(cvg.g, (double)$$1, bvk.a.a), bts.b).a();
   }

   public cvg.a a(cvg.a $$0, float $$1, float $$2) {
      jo<dgv> $$3 = lu.a(lu.e);
      return this.a($$0).a(kr.x, new cyq(List.of(cyq.a.a(jr.a(dgx.bs.s()), 15.0F), cyq.a.b($$3.b(aws.bF), 1.5F)), 1.0F, 2)).a(this.b($$1, $$2));
   }

   private cyg b(float $$0, float $$1) {
      return cyg.a().a(bvm.c, new bvk(cvg.f, (double)($$0 + this.j), bvk.a.a), bts.b).a(bvm.e, new bvk(cvg.g, (double)$$1, bvk.a.a), bts.b).a();
   }

   public axi<dgv> a() {
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

   public axi<cvg> f() {
      return this.l;
   }
}
