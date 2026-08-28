import com.mojang.serialization.MapCodec;

public class dpc extends dqx implements drp {
   public static final MapCodec<dpc> b = b(dpc::new);
   public static final dyl c = dyk.D;
   public static final dyl d = dyk.x;
   private static final int k = 8;
   public static final int e = 128;
   private static final int l = 200;

   @Override
   public MapCodec<dpc> a() {
      return b;
   }

   public dpc(dxt.d $$0) {
      super($$0);
      this.l(this.F.b().b(a, jm.b).b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   public dxu a(dbf $$0) {
      etw $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == etx.c;
      return this.m().b(a, $$0.k()).b(c, Boolean.valueOf($$2));
   }

   @Override
   protected dxu a(dxu $$0, dhk $$1, dhw $$2, jh $$3, jm $$4, jh $$5, dxu $$6, bam $$7) {
      if ($$0.c(c)) {
         $$2.a($$3, etx.c, etx.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected etw b_(dxu $$0) {
      return $$0.c(c) ? etx.c.a(false) : super.b_($$0);
   }

   @Override
   protected int a(dxu $$0, dgm $$1, jh $$2, jm $$3) {
      return $$0.c(d) ? 15 : 0;
   }

   @Override
   protected int b(dxu $$0, dgm $$1, jh $$2, jm $$3) {
      return $$0.c(d) && $$0.c(a) == $$3 ? 15 : 0;
   }

   public void e(dxu $$0, dhh $$1, jh $$2) {
      $$1.a($$2, $$0.b(d, Boolean.valueOf(true)), 3);
      this.f($$0, $$1, $$2);
      $$1.a($$2, this, 8);
      $$1.c(3002, $$2, $$0.c(a).o().ordinal());
   }

   private void f(dxu $$0, dhh $$1, jh $$2) {
      jm $$3 = $$0.c(a).g();
      $$1.a($$2.a($$3), this, eva.a($$1, $$3, null));
   }

   @Override
   protected void a(dxu $$0, ash $$1, jh $$2, bam $$3) {
      $$1.a($$2, $$0.b(d, Boolean.valueOf(false)), 3);
      this.f($$0, $$1, $$2);
   }

   @Override
   public void a(dxu $$0, dhh $$1, jh $$2, bam $$3) {
      if ($$1.ae() && (long)$$1.A.a(200) <= $$1.ac() % 200L && $$2.v() == $$1.a(edp.a.b, $$2.u(), $$2.w()) - 1) {
         bai.a($$0.c(a).o(), $$1, $$2, 0.125, ls.aU, bst.a(1, 2));
      }
   }

   @Override
   protected void a(dxu $$0, dhh $$1, jh $$2, dxu $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$0.c(d)) {
            this.f($$0, $$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected void b(dxu $$0, dhh $$1, jh $$2, dxu $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$0.c(d) && !$$1.T().a($$2, this)) {
            $$1.a($$2, $$0.b(d, Boolean.valueOf(false)), 18);
         }
      }
   }

   @Override
   protected void a(dxv.a<dkl, dxu> $$0) {
      $$0.a(a, d, c);
   }

   @Override
   protected boolean f_(dxu $$0) {
      return true;
   }
}
