import com.mojang.serialization.MapCodec;

public class dlj extends dpv {
   public static final MapCodec<dlj> a = b(dlj::new);

   @Override
   public MapCodec<dlj> a() {
      return a;
   }

   protected dlj(dxn.d $$0) {
      super(0.3125F, $$0);
      this.l(
         this.F
            .b()
            .b(b, Boolean.valueOf(false))
            .b(c, Boolean.valueOf(false))
            .b(d, Boolean.valueOf(false))
            .b(e, Boolean.valueOf(false))
            .b(f, Boolean.valueOf(false))
            .b(g, Boolean.valueOf(false))
      );
   }

   @Override
   public dxo a(dax $$0) {
      return a($$0.q(), $$0.a(), this.m());
   }

   public static dxo a(dge $$0, jh $$1, dxo $$2) {
      dxo $$3 = $$0.a_($$1.e());
      dxo $$4 = $$0.a_($$1.d());
      dxo $$5 = $$0.a_($$1.f());
      dxo $$6 = $$0.a_($$1.i());
      dxo $$7 = $$0.a_($$1.g());
      dxo $$8 = $$0.a_($$1.h());
      dkd $$9 = $$2.b();
      return $$2.c(g, Boolean.valueOf($$3.a($$9) || $$3.a(dkf.kX) || $$3.a(dkf.fU)))
         .c(f, Boolean.valueOf($$4.a($$9) || $$4.a(dkf.kX)))
         .c(b, Boolean.valueOf($$5.a($$9) || $$5.a(dkf.kX)))
         .c(c, Boolean.valueOf($$6.a($$9) || $$6.a(dkf.kX)))
         .c(d, Boolean.valueOf($$7.a($$9) || $$7.a(dkf.kX)))
         .c(e, Boolean.valueOf($$8.a($$9) || $$8.a(dkf.kX)));
   }

   @Override
   protected dxo a(dxo $$0, dhc $$1, dho $$2, jh $$3, jm $$4, jh $$5, dxo $$6, bac $$7) {
      if (!$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else {
         boolean $$8 = $$6.a(this) || $$6.a(dkf.kX) || $$4 == jm.a && $$6.a(dkf.fU);
         return $$0.b(h.get($$4), Boolean.valueOf($$8));
      }
   }

   @Override
   protected void a(dxo $$0, arx $$1, jh $$2, bac $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected boolean a(dxo $$0, dhc $$1, jh $$2) {
      dxo $$3 = $$1.a_($$2.e());
      boolean $$4 = !$$1.a_($$2.d()).l() && !$$3.l();

      for (jm $$5 : jm.c.a) {
         jh $$6 = $$2.a($$5);
         dxo $$7 = $$1.a_($$6);
         if ($$7.a(this)) {
            if ($$4) {
               return false;
            }

            dxo $$8 = $$1.a_($$6.e());
            if ($$8.a(this) || $$8.a(dkf.fU)) {
               return true;
            }
         }
      }

      return $$3.a(this) || $$3.a(dkf.fU);
   }

   @Override
   protected void a(dxp.a<dkd, dxo> $$0) {
      $$0.a(b, c, d, e, f, g);
   }

   @Override
   protected boolean a(dxo $$0, euf $$1) {
      return false;
   }
}
