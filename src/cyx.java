import java.util.List;

public record cyx(aya<dkd> g, int h, float i, float j, int k, aya<cxc> l) {
   public static final cyx a = new cyx(axk.bP, 59, 2.0F, 0.0F, 15, axt.bd);
   public static final cyx b = new cyx(axk.bN, 131, 4.0F, 1.0F, 5, axt.be);
   public static final cyx c = new cyx(axk.bM, 250, 6.0F, 2.0F, 14, axt.bf);
   public static final cyx d = new cyx(axk.bL, 1561, 8.0F, 3.0F, 10, axt.bh);
   public static final cyx e = new cyx(axk.bO, 32, 12.0F, 0.0F, 22, axt.bg);
   public static final cyx f = new cyx(axk.bK, 2031, 9.0F, 4.0F, 15, axt.bi);

   private cxc.a a(cxc.a $$0) {
      return $$0.b(this.h).a(this.l).c(this.k);
   }

   public cxc.a a(cxc.a $$0, aya<dkd> $$1, float $$2, float $$3) {
      jr<dkd> $$4 = ma.a(ma.e);
      return this.a($$0).a(ku.B, new dai(List.of(dai.a.a($$4.b(this.g)), dai.a.a($$4.b($$1), this.i)), 1.0F, 1)).a(this.a($$2, $$3));
   }

   private czx a(float $$0, float $$1) {
      return czx.a().a(bxf.c, new bxd(cxc.g, (double)($$0 + this.j), bxd.a.a), bvk.b).a(bxf.e, new bxd(cxc.h, (double)$$1, bxd.a.a), bvk.b).a();
   }

   public cxc.a a(cxc.a $$0, float $$1, float $$2) {
      jr<dkd> $$3 = ma.a(ma.e);
      return this.a($$0).a(ku.B, new dai(List.of(dai.a.a(ju.a(dkf.bz.p()), 15.0F), dai.a.b($$3.b(axk.bG), 1.5F)), 1.0F, 2)).a(this.b($$1, $$2));
   }

   private czx b(float $$0, float $$1) {
      return czx.a().a(bxf.c, new bxd(cxc.g, (double)($$0 + this.j), bxd.a.a), bvk.b).a(bxf.e, new bxd(cxc.h, (double)$$1, bxd.a.a), bvk.b).a();
   }

   public aya<dkd> a() {
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

   public aya<cxc> f() {
      return this.l;
   }
}
