import com.mojang.serialization.MapCodec;

public class dmm extends dma {
   public static final MapCodec<dmm> a = b(dmm::new);
   public static final eaz b = eap.az;
   public static final int c = 15;
   private static final ffc d = dma.b(14.0, 0.0, 16.0);
   private static final ffc e = dma.b(14.0, 0.0, 15.0);

   @Override
   public MapCodec<dmm> a() {
      return a;
   }

   protected dmm(dzy.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, Integer.valueOf(0)));
   }

   @Override
   protected void a(dzz $$0, arq $$1, iu $$2, azv $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected void b(dzz $$0, arq $$1, iu $$2, azv $$3) {
      iu $$4 = $$2.d();
      if ($$1.v($$4)) {
         int $$5 = 1;

         while ($$1.a_($$2.c($$5)).a(this)) {
            $$5++;
         }

         if ($$5 < 3) {
            int $$6 = $$0.c(b);
            if ($$6 == 15) {
               $$1.b($$4, this.m());
               dzz $$7 = $$0.b(b, Integer.valueOf(0));
               $$1.a($$2, $$7, 260);
               $$1.a($$7, $$4, this, null, false);
            } else {
               $$1.a($$2, $$0.b(b, Integer.valueOf($$6 + 1)), 260);
            }
         }
      }
   }

   @Override
   protected ffc b(dzz $$0, dib $$1, iu $$2, fen $$3) {
      return e;
   }

   @Override
   protected ffc a(dzz $$0, dib $$1, iu $$2, fen $$3) {
      return d;
   }

   @Override
   protected dzz a(dzz $$0, diy $$1, djk $$2, iu $$3, ja $$4, iu $$5, dzz $$6, azv $$7) {
      if (!$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dzz $$0, diy $$1, iu $$2) {
      for (ja $$3 : ja.c.a) {
         dzz $$4 = $$1.a_($$2.a($$3));
         if ($$4.e() || $$1.b_($$2.a($$3)).a(axh.b)) {
            return false;
         }
      }

      dzz $$5 = $$1.a_($$2.e());
      return ($$5.a(dmc.ee) || $$5.a(axc.J)) && !$$1.a_($$2.d()).n();
   }

   @Override
   protected void a(dzz $$0, div $$1, iu $$2, bwd $$3) {
      $$3.a($$1.al().k(), 1.0F);
   }

   @Override
   protected void a(eaa.a<dma, dzz> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(dzz $$0, ewv $$1) {
      return false;
   }
}
