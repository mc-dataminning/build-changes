import java.util.List;

public record cyw(axf<dke> g, int h, float i, float j, int k, axf<cxd> l) {
   public static final cyw a = new cyw(awp.bQ, 59, 2.0F, 0.0F, 15, awy.bb);
   public static final cyw b = new cyw(awp.bO, 131, 4.0F, 1.0F, 5, awy.bc);
   public static final cyw c = new cyw(awp.bN, 250, 6.0F, 2.0F, 14, awy.bd);
   public static final cyw d = new cyw(awp.bM, 1561, 8.0F, 3.0F, 10, awy.bf);
   public static final cyw e = new cyw(awp.bP, 32, 12.0F, 0.0F, 22, awy.be);
   public static final cyw f = new cyw(awp.bL, 2031, 9.0F, 4.0F, 15, awy.bg);

   private cxd.a a(cxd.a $$0) {
      return $$0.b(this.h).a(this.l).c(this.k);
   }

   public cxd.a a(cxd.a $$0, axf<dke> $$1, float $$2, float $$3, boolean $$4) {
      js<dke> $$5 = mb.a(mb.e);
      return this.a($$0)
         .a(kv.B, new dah(List.of(dah.a.a($$5.b(this.g)), dah.a.a($$5.b($$1), this.i)), 1.0F, 1, true))
         .a(this.a($$2, $$3))
         .a(kv.C, new dam(2, $$4));
   }

   private czw a(float $$0, float $$1) {
      return czw.a().a(bxg.c, new bxe(cxd.h, (double)($$0 + this.j), bxe.a.a), bvk.b).a(bxg.e, new bxe(cxd.i, (double)$$1, bxe.a.a), bvk.b).a();
   }

   public cxd.a a(cxd.a $$0, float $$1, float $$2) {
      js<dke> $$3 = mb.a(mb.e);
      return this.a($$0)
         .a(kv.B, new dah(List.of(dah.a.a(jv.a(dkg.bz.p()), 15.0F), dah.a.b($$3.b(awp.bH), Float.MAX_VALUE), dah.a.b($$3.b(awp.bG), 1.5F)), 1.0F, 2, false))
         .a(this.b($$1, $$2))
         .a(kv.C, new dam(1, false));
   }

   private czw b(float $$0, float $$1) {
      return czw.a().a(bxg.c, new bxe(cxd.h, (double)($$0 + this.j), bxe.a.a), bvk.b).a(bxg.e, new bxe(cxd.i, (double)$$1, bxe.a.a), bvk.b).a();
   }

   public axf<dke> a() {
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

   public axf<cxd> f() {
      return this.l;
   }
}
