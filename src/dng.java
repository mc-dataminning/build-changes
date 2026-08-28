import com.mojang.serialization.MapCodec;

public class dng extends drt {
   public static final MapCodec<dng> a = b(dng::new);

   @Override
   public MapCodec<dng> a() {
      return a;
   }

   protected dng(dzy.d $$0) {
      super(10.0F, $$0);
      this.l(
         this.B
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
   public dzz a(dcr $$0) {
      return a($$0.q(), $$0.a(), this.m());
   }

   public static dzz a(dib $$0, iu $$1, dzz $$2) {
      dzz $$3 = $$0.a_($$1.e());
      dzz $$4 = $$0.a_($$1.d());
      dzz $$5 = $$0.a_($$1.f());
      dzz $$6 = $$0.a_($$1.i());
      dzz $$7 = $$0.a_($$1.g());
      dzz $$8 = $$0.a_($$1.h());
      dma $$9 = $$2.b();
      return $$2.c(g, Boolean.valueOf($$3.a($$9) || $$3.a(dmc.kY) || $$3.a(dmc.fV)))
         .c(f, Boolean.valueOf($$4.a($$9) || $$4.a(dmc.kY)))
         .c(b, Boolean.valueOf($$5.a($$9) || $$5.a(dmc.kY)))
         .c(c, Boolean.valueOf($$6.a($$9) || $$6.a(dmc.kY)))
         .c(d, Boolean.valueOf($$7.a($$9) || $$7.a(dmc.kY)))
         .c(e, Boolean.valueOf($$8.a($$9) || $$8.a(dmc.kY)));
   }

   @Override
   protected dzz a(dzz $$0, diy $$1, djk $$2, iu $$3, ja $$4, iu $$5, dzz $$6, azv $$7) {
      if (!$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else {
         boolean $$8 = $$6.a(this) || $$6.a(dmc.kY) || $$4 == ja.a && $$6.a(dmc.fV);
         return $$0.b(h.get($$4), Boolean.valueOf($$8));
      }
   }

   @Override
   protected void a(dzz $$0, arq $$1, iu $$2, azv $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected boolean a(dzz $$0, diy $$1, iu $$2) {
      dzz $$3 = $$1.a_($$2.e());
      boolean $$4 = !$$1.a_($$2.d()).l() && !$$3.l();

      for (ja $$5 : ja.c.a) {
         iu $$6 = $$2.a($$5);
         dzz $$7 = $$1.a_($$6);
         if ($$7.a(this)) {
            if ($$4) {
               return false;
            }

            dzz $$8 = $$1.a_($$6.e());
            if ($$8.a(this) || $$8.a(dmc.fV)) {
               return true;
            }
         }
      }

      return $$3.a(this) || $$3.a(dmc.fV);
   }

   @Override
   protected void a(eaa.a<dma, dzz> $$0) {
      $$0.a(b, c, d, e, f, g);
   }

   @Override
   protected boolean a(dzz $$0, ewv $$1) {
      return false;
   }
}
