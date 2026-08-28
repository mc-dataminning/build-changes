import com.mojang.serialization.MapCodec;

public class dmc extends deu {
   public static final MapCodec<dmc> a = b(dmc::new);
   public static final int b = 2;
   public static final dsx c = dsn.aE;
   private static final int d = 24000;
   private static final int e = 12000;
   private static final int f = 300;
   private static final ewf g = deu.a(1.0, 0.0, 2.0, 15.0, 16.0, 14.0);

   @Override
   public MapCodec<dmc> a() {
      return a;
   }

   public dmc(drw.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   protected void a(dry.a<deu, drx> $$0) {
      $$0.a(c);
   }

   @Override
   public ewf a(drx $$0, daz $$1, iz $$2, evr $$3) {
      return g;
   }

   public int m(drx $$0) {
      return $$0.c(c);
   }

   private boolean n(drx $$0) {
      return this.m($$0) == 2;
   }

   @Override
   public void a(drx $$0, arb $$1, iz $$2, azc $$3) {
      if (!this.n($$0)) {
         $$1.a(null, $$2, avw.yv, avx.e, 0.7F, 0.9F + $$3.i() * 0.2F);
         $$1.a($$2, $$0.a(c, Integer.valueOf(this.m($$0) + 1)), 2);
      } else {
         $$1.a(null, $$2, avw.yw, avx.e, 0.7F, 0.9F + $$3.i() * 0.2F);
         $$1.b($$2, false);
         chr $$4 = bsv.aR.a((dbt)$$1);
         if ($$4 != null) {
            evm $$5 = $$2.b();
            $$4.a(true);
            $$4.b($$5.a(), $$5.b(), $$5.c(), ayu.g($$1.z.i() * 360.0F), 0.0F);
            $$1.b($$4);
         }
      }
   }

   @Override
   public void b(drx $$0, dbt $$1, iz $$2, drx $$3, boolean $$4) {
      boolean $$5 = a($$1, $$2);
      if (!$$1.x_() && $$5) {
         $$1.c(3009, $$2, 0);
      }

      int $$6 = $$5 ? 12000 : 24000;
      int $$7 = $$6 / 3;
      $$1.a(dwq.i, $$2, dwq.a.a($$0));
      $$1.a($$2, this, $$7 + $$1.z.a(300));
   }

   @Override
   public boolean a(drx $$0, eof $$1) {
      return false;
   }

   public static boolean a(daz $$0, iz $$1) {
      return $$0.a_($$1.d()).a(awl.cs);
   }
}
