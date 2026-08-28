import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dtr extends dma {
   public static final MapCodec<dtr> a = b(dtr::new);
   public static final int b = 8;
   public static final eaz c = eap.aI;
   private static final ffc[] e = dma.a(8, $$0 -> dma.b(16.0, 0.0, (double)($$0 * 2)));
   public static final int d = 5;

   @Override
   public MapCodec<dtr> a() {
      return a;
   }

   protected dtr(dzy.d $$0) {
      super($$0);
      this.l(this.B.b().b(c, Integer.valueOf(1)));
   }

   @Override
   protected boolean a(dzz $$0, ewv $$1) {
      return $$1 == ewv.a ? $$0.c(c) < 5 : false;
   }

   @Override
   protected ffc a(dzz $$0, dib $$1, iu $$2, fen $$3) {
      return e[$$0.c(c)];
   }

   @Override
   protected ffc b(dzz $$0, dib $$1, iu $$2, fen $$3) {
      return e[$$0.c(c) - 1];
   }

   @Override
   protected ffc b_(dzz $$0, dib $$1, iu $$2) {
      return e[$$0.c(c)];
   }

   @Override
   protected ffc c(dzz $$0, dib $$1, iu $$2, fen $$3) {
      return e[$$0.c(c)];
   }

   @Override
   protected boolean g_(dzz $$0) {
      return true;
   }

   @Override
   protected float c(dzz $$0, dib $$1, iu $$2) {
      return $$0.c(c) == 8 ? 0.2F : 1.0F;
   }

   @Override
   protected boolean a(dzz $$0, diy $$1, iu $$2) {
      dzz $$3 = $$1.a_($$2.e());
      if ($$3.a(axc.ct)) {
         return false;
      } else {
         return $$3.a(axc.cu) ? true : dma.a($$3.g($$1, $$2.e()), ja.b) || $$3.a(this) && $$3.c(c) == 8;
      }
   }

   @Override
   protected dzz a(dzz $$0, diy $$1, djk $$2, iu $$3, ja $$4, iu $$5, dzz $$6, azv $$7) {
      return !$$0.a($$1, $$3) ? dmc.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void b(dzz $$0, arq $$1, iu $$2, azv $$3) {
      if ($$1.a(dje.b, $$2) > 11) {
         c($$0, $$1, $$2);
         $$1.a($$2, false);
      }
   }

   @Override
   protected boolean a(dzz $$0, dcr $$1) {
      int $$2 = $$0.c(c);
      if (!$$1.n().a(this.h()) || $$2 >= 8) {
         return $$2 == 1;
      } else {
         return $$1.c() ? $$1.k() == ja.b : true;
      }
   }

   @Nullable
   @Override
   public dzz a(dcr $$0) {
      dzz $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         int $$2 = $$1.c(c);
         return $$1.b(c, Integer.valueOf(Math.min(8, $$2 + 1)));
      } else {
         return super.a($$0);
      }
   }

   @Override
   protected void a(eaa.a<dma, dzz> $$0) {
      $$0.a(c);
   }
}
