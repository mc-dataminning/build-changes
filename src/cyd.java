import java.util.List;

public record cyd(axs<diq> g, int h, float i, float j, int k, axs<cwi> l) {
   public static final cyd a = new cyd(axc.bO, 59, 2.0F, 0.0F, 15, axl.bc);
   public static final cyd b = new cyd(axc.bM, 131, 4.0F, 1.0F, 5, axl.bd);
   public static final cyd c = new cyd(axc.bL, 250, 6.0F, 2.0F, 14, axl.be);
   public static final cyd d = new cyd(axc.bK, 1561, 8.0F, 3.0F, 10, axl.bg);
   public static final cyd e = new cyd(axc.bN, 32, 12.0F, 0.0F, 22, axl.bf);
   public static final cyd f = new cyd(axc.bJ, 2031, 9.0F, 4.0F, 15, axl.bh);

   private cwi.a a(cwi.a $$0) {
      return $$0.b(this.h).a(this.l).c(this.k);
   }

   public cwi.a a(cwi.a $$0, axs<diq> $$1, float $$2, float $$3) {
      jr<diq> $$4 = lz.a(lz.e);
      return this.a($$0).a(ku.B, new czo(List.of(czo.a.a($$4.b(this.g)), czo.a.a($$4.b($$1), this.i)), 1.0F, 1)).a(this.a($$2, $$3));
   }

   private czd a(float $$0, float $$1) {
      return czd.a().a(bwp.c, new bwn(cwi.f, (double)($$0 + this.j), bwn.a.a), buu.b).a(bwp.e, new bwn(cwi.g, (double)$$1, bwn.a.a), buu.b).a();
   }

   public cwi.a a(cwi.a $$0, float $$1, float $$2) {
      jr<diq> $$3 = lz.a(lz.e);
      return this.a($$0).a(ku.B, new czo(List.of(czo.a.a(ju.a(dis.bs.p()), 15.0F), czo.a.b($$3.b(axc.bF), 1.5F)), 1.0F, 2)).a(this.b($$1, $$2));
   }

   private czd b(float $$0, float $$1) {
      return czd.a().a(bwp.c, new bwn(cwi.f, (double)($$0 + this.j), bwn.a.a), buu.b).a(bwp.e, new bwn(cwi.g, (double)$$1, bwn.a.a), buu.b).a();
   }

   public axs<diq> a() {
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

   public axs<cwi> f() {
      return this.l;
   }
}
