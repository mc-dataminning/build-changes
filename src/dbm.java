import java.util.List;

public record dbm(axt<dnc> g, int h, float i, float j, int k, axt<czu> l) {
   public static final dbm a = new dbm(axe.bR, 59, 2.0F, 0.0F, 15, axm.bc);
   public static final dbm b = new dbm(axe.bP, 131, 4.0F, 1.0F, 5, axm.bd);
   public static final dbm c = new dbm(axe.bO, 250, 6.0F, 2.0F, 14, axm.be);
   public static final dbm d = new dbm(axe.bN, 1561, 8.0F, 3.0F, 10, axm.bg);
   public static final dbm e = new dbm(axe.bQ, 32, 12.0F, 0.0F, 22, axm.bf);
   public static final dbm f = new dbm(axe.bM, 2031, 9.0F, 4.0F, 15, axm.bh);

   private czu.a a(czu.a $$0) {
      return $$0.b(this.h).a(this.l).c(this.k);
   }

   public czu.a a(czu.a $$0, axt<dnc> $$1, float $$2, float $$3, float $$4) {
      jg<dnc> $$5 = mg.a(mg.e);
      return this.a($$0)
         .a(kk.A, new ddb(List.of(ddb.a.a($$5.b(this.g)), ddb.a.a($$5.b($$1), this.i)), 1.0F, 1, true))
         .a(this.a($$2, $$3))
         .a(kk.B, new ddg(2, $$4));
   }

   private dcp a(float $$0, float $$1) {
      return dcp.a().a(bza.c, new byy(czu.h, (double)($$0 + this.j), byy.a.a), bxe.b).a(bza.e, new byy(czu.i, (double)$$1, byy.a.a), bxe.b).a();
   }

   public czu.a a(czu.a $$0, float $$1, float $$2) {
      jg<dnc> $$3 = mg.a(mg.e);
      return this.a($$0)
         .a(kk.A, new ddb(List.of(ddb.a.a(jj.a(dne.bz.p()), 15.0F), ddb.a.b($$3.b(axe.bI), Float.MAX_VALUE), ddb.a.b($$3.b(axe.bH), 1.5F)), 1.0F, 2, false))
         .a(this.b($$1, $$2))
         .a(kk.B, new ddg(1));
   }

   private dcp b(float $$0, float $$1) {
      return dcp.a().a(bza.c, new byy(czu.h, (double)($$0 + this.j), byy.a.a), bxe.b).a(bza.e, new byy(czu.i, (double)$$1, byy.a.a), bxe.b).a();
   }

   public axt<dnc> a() {
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

   public axt<czu> f() {
      return this.l;
   }
}
