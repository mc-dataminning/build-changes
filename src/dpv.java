import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dpv extends dma implements dtj {
   public static final MapCodec<dpv> a = b(dpv::new);
   private static final eaq b = eap.I;
   private static final ffc c = dma.b(12.0, 10.0, 16.0);

   @Override
   public MapCodec<dpv> a() {
      return a;
   }

   protected dpv(dzy.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, Boolean.valueOf(false)));
   }

   @Override
   protected void a(eaa.a<dma, dzz> $$0) {
      $$0.a(b);
   }

   @Override
   protected ewg b_(dzz $$0) {
      return $$0.c(b) ? ewh.c.a(false) : super.b_($$0);
   }

   @Nullable
   @Override
   public dzz a(dcr $$0) {
      dzz $$1 = super.a($$0);
      if ($$1 != null) {
         ewg $$2 = $$0.q().b_($$0.a());
         return $$1.b(b, Boolean.valueOf($$2.a() == ewh.c));
      } else {
         return null;
      }
   }

   @Override
   protected boolean a(dzz $$0, diy $$1, iu $$2) {
      iu $$3 = $$2.d();
      dzz $$4 = $$1.a_($$3);
      return $$4.c($$1, $$3, ja.a);
   }

   @Override
   protected ffc a(dzz $$0, dib $$1, iu $$2, fen $$3) {
      return c;
   }

   @Override
   protected dzz a(dzz $$0, diy $$1, djk $$2, iu $$3, ja $$4, iu $$5, dzz $$6, azv $$7) {
      if ($$4 == ja.b && !this.a($$0, $$1, $$3)) {
         return dmc.a.m();
      } else {
         if ($$0.c(b)) {
            $$2.a($$3, ewh.c, ewh.c.a($$1));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }
}
