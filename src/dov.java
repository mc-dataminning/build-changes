import com.mojang.serialization.MapCodec;

public class dov extends dqq implements dri {
   public static final MapCodec<dov> b = b(dov::new);
   public static final dye c = dyd.D;
   public static final dye d = dyd.x;
   private static final int k = 8;
   public static final int e = 128;
   private static final int l = 200;

   @Override
   public MapCodec<dov> a() {
      return b;
   }

   public dov(dxm.d $$0) {
      super($$0);
      this.l(this.F.b().b(a, jm.b).b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   public dxn a(dbb $$0) {
      etp $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == etq.c;
      return this.m().b(a, $$0.k()).b(c, Boolean.valueOf($$2));
   }

   @Override
   protected dxn a(dxn $$0, dhd $$1, dhp $$2, jh $$3, jm $$4, jh $$5, dxn $$6, bam $$7) {
      if ($$0.c(c)) {
         $$2.a($$3, etq.c, etq.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected etp b_(dxn $$0) {
      return $$0.c(c) ? etq.c.a(false) : super.b_($$0);
   }

   @Override
   protected int a(dxn $$0, dgf $$1, jh $$2, jm $$3) {
      return $$0.c(d) ? 15 : 0;
   }

   @Override
   protected int b(dxn $$0, dgf $$1, jh $$2, jm $$3) {
      return $$0.c(d) && $$0.c(a) == $$3 ? 15 : 0;
   }

   public void e(dxn $$0, dha $$1, jh $$2) {
      $$1.a($$2, $$0.b(d, Boolean.valueOf(true)), 3);
      this.f($$0, $$1, $$2);
      $$1.a($$2, this, 8);
      $$1.c(3002, $$2, $$0.c(a).o().ordinal());
   }

   private void f(dxn $$0, dha $$1, jh $$2) {
      jm $$3 = $$0.c(a).g();
      $$1.a($$2.a($$3), this, eut.a($$1, $$3, null));
   }

   @Override
   protected void a(dxn $$0, ash $$1, jh $$2, bam $$3) {
      $$1.a($$2, $$0.b(d, Boolean.valueOf(false)), 3);
      this.f($$0, $$1, $$2);
   }

   @Override
   public void a(dxn $$0, dha $$1, jh $$2, bam $$3) {
      if ($$1.ae() && (long)$$1.A.a(200) <= $$1.ac() % 200L && $$2.v() == $$1.a(edi.a.b, $$2.u(), $$2.w()) - 1) {
         bai.a($$0.c(a).o(), $$1, $$2, 0.125, ls.aU, bsp.a(1, 2));
      }
   }

   @Override
   protected void a(dxn $$0, dha $$1, jh $$2, dxn $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$0.c(d)) {
            this.f($$0, $$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected void b(dxn $$0, dha $$1, jh $$2, dxn $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$0.c(d) && !$$1.T().a($$2, this)) {
            $$1.a($$2, $$0.b(d, Boolean.valueOf(false)), 18);
         }
      }
   }

   @Override
   protected void a(dxo.a<dke, dxn> $$0) {
      $$0.a(a, d, c);
   }

   @Override
   protected boolean f_(dxn $$0) {
      return true;
   }
}
