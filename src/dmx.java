import com.mojang.serialization.MapCodec;

public class dmx extends dos implements dpk {
   public static final MapCodec<dmx> b = b(dmx::new);
   public static final dwf c = dwe.C;
   public static final dwf d = dwe.w;
   private static final int k = 8;
   public static final int e = 128;
   private static final int l = 200;

   @Override
   public MapCodec<dmx> a() {
      return b;
   }

   public dmx(dvn.d $$0) {
      super($$0);
      this.l(this.F.b().b(a, jm.b).b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   public dvo a(czw $$0) {
      ero $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == erp.c;
      return this.m().b(a, $$0.k()).b(c, Boolean.valueOf($$2));
   }

   @Override
   protected dvo a(dvo $$0, dfi $$1, dfu $$2, jh $$3, jm $$4, jh $$5, dvo $$6, azv $$7) {
      if ($$0.c(c)) {
         $$2.a($$3, erp.c, erp.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected ero b_(dvo $$0) {
      return $$0.c(c) ? erp.c.a(false) : super.b_($$0);
   }

   @Override
   protected int a(dvo $$0, dek $$1, jh $$2, jm $$3) {
      return $$0.c(d) ? 15 : 0;
   }

   @Override
   protected int b(dvo $$0, dek $$1, jh $$2, jm $$3) {
      return $$0.c(d) && $$0.c(a) == $$3 ? 15 : 0;
   }

   public void e(dvo $$0, dff $$1, jh $$2) {
      $$1.a($$2, $$0.b(d, Boolean.valueOf(true)), 3);
      this.f($$0, $$1, $$2);
      $$1.a($$2, this, 8);
      $$1.c(3002, $$2, $$0.c(a).o().ordinal());
   }

   private void f(dvo $$0, dff $$1, jh $$2) {
      jm $$3 = $$0.c(a).g();
      $$1.a($$2.a($$3), this, ess.a($$1, $$3, null));
   }

   @Override
   protected void a(dvo $$0, arq $$1, jh $$2, azv $$3) {
      $$1.a($$2, $$0.b(d, Boolean.valueOf(false)), 3);
      this.f($$0, $$1, $$2);
   }

   @Override
   public void a(dvo $$0, dff $$1, jh $$2, azv $$3) {
      if ($$1.ad() && (long)$$1.A.a(200) <= $$1.aa() % 200L && $$2.v() == $$1.a(ebj.a.b, $$2.u(), $$2.w()) - 1) {
         azr.a($$0.c(a).o(), $$1, $$2, 0.125, ls.aT, brs.a(1, 2));
      }
   }

   @Override
   protected void a(dvo $$0, dff $$1, jh $$2, dvo $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$0.c(d)) {
            this.f($$0, $$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected void b(dvo $$0, dff $$1, jh $$2, dvo $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$0.c(d) && !$$1.R().a($$2, this)) {
            $$1.a($$2, $$0.b(d, Boolean.valueOf(false)), 18);
         }
      }
   }

   @Override
   protected void a(dvp.a<dij, dvo> $$0) {
      $$0.a(a, d, c);
   }

   @Override
   protected boolean f_(dvo $$0) {
      return true;
   }
}
