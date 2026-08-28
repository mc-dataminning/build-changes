import com.mojang.serialization.MapCodec;

public class dou extends dqr implements drj {
   public static final MapCodec<dou> b = b(dou::new);
   public static final dyf c = dye.J;
   public static final dyf d = dye.B;
   private static final int k = 8;
   public static final int e = 128;
   private static final int l = 200;

   @Override
   public MapCodec<dou> a() {
      return b;
   }

   public dou(dxn.d $$0) {
      super($$0);
      this.l(this.F.b().b(a, jm.b).b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   public dxo a(dax $$0) {
      etq $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == etr.c;
      return this.m().b(a, $$0.k()).b(c, Boolean.valueOf($$2));
   }

   @Override
   protected dxo a(dxo $$0, dhc $$1, dho $$2, jh $$3, jm $$4, jh $$5, dxo $$6, bac $$7) {
      if ($$0.c(c)) {
         $$2.a($$3, etr.c, etr.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected etq b_(dxo $$0) {
      return $$0.c(c) ? etr.c.a(false) : super.b_($$0);
   }

   @Override
   protected int a(dxo $$0, dge $$1, jh $$2, jm $$3) {
      return $$0.c(d) ? 15 : 0;
   }

   @Override
   protected int b(dxo $$0, dge $$1, jh $$2, jm $$3) {
      return $$0.c(d) && $$0.c(a) == $$3 ? 15 : 0;
   }

   public void e(dxo $$0, dgz $$1, jh $$2) {
      $$1.a($$2, $$0.b(d, Boolean.valueOf(true)), 3);
      this.f($$0, $$1, $$2);
      $$1.a($$2, this, 8);
      $$1.c(3002, $$2, $$0.c(a).o().ordinal());
   }

   private void f(dxo $$0, dgz $$1, jh $$2) {
      jm $$3 = $$0.c(a).g();
      $$1.a($$2.a($$3), this, euu.a($$1, $$3, null));
   }

   @Override
   protected void a(dxo $$0, arx $$1, jh $$2, bac $$3) {
      $$1.a($$2, $$0.b(d, Boolean.valueOf(false)), 3);
      this.f($$0, $$1, $$2);
   }

   @Override
   public void a(dxo $$0, dgz $$1, jh $$2, bac $$3) {
      if ($$1.af() && (long)$$1.A.a(200) <= $$1.ad() % 200L && $$2.v() == $$1.a(edj.a.b, $$2.u(), $$2.w()) - 1) {
         azy.a($$0.c(a).o(), $$1, $$2, 0.125, ls.aV, bsl.a(1, 2));
      }
   }

   @Override
   protected void a(dxo $$0, dgz $$1, jh $$2, dxo $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$0.c(d)) {
            this.f($$0, $$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected void b(dxo $$0, dgz $$1, jh $$2, dxo $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$0.c(d) && !$$1.U().a($$2, this)) {
            $$1.a($$2, $$0.b(d, Boolean.valueOf(false)), 18);
         }
      }
   }

   @Override
   protected void a(dxp.a<dkd, dxo> $$0) {
      $$0.a(a, d, c);
   }

   @Override
   protected boolean f_(dxo $$0) {
      return true;
   }
}
