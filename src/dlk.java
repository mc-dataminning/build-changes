import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dlk extends dma implements dtj {
   public static final eaq b = eap.I;
   private static final ffc a = dma.b(12.0, 0.0, 4.0);

   protected dlk(dzy.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, Boolean.valueOf(true)));
   }

   @Override
   protected abstract MapCodec<? extends dlk> a();

   protected void a(dzz $$0, dib $$1, djk $$2, azv $$3, iu $$4) {
      if (!d($$0, $$1, $$4)) {
         $$2.a($$4, this, 60 + $$3.a(40));
      }
   }

   protected static boolean d(dzz $$0, dib $$1, iu $$2) {
      if ($$0.c(b)) {
         return true;
      } else {
         for (ja $$3 : ja.values()) {
            if ($$1.b_($$2.a($$3)).a(axh.a)) {
               return true;
            }
         }

         return false;
      }
   }

   @Nullable
   @Override
   public dzz a(dcr $$0) {
      ewg $$1 = $$0.q().b_($$0.a());
      return this.m().b(b, Boolean.valueOf($$1.a(axh.a) && $$1.e() == 8));
   }

   @Override
   protected ffc a(dzz $$0, dib $$1, iu $$2, fen $$3) {
      return a;
   }

   @Override
   protected dzz a(dzz $$0, diy $$1, djk $$2, iu $$3, ja $$4, iu $$5, dzz $$6, azv $$7) {
      if ($$0.c(b)) {
         $$2.a($$3, ewh.c, ewh.c.a($$1));
      }

      return $$4 == ja.a && !this.a($$0, $$1, $$3) ? dmc.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dzz $$0, diy $$1, iu $$2) {
      iu $$3 = $$2.e();
      return $$1.a_($$3).c($$1, $$3, ja.b);
   }

   @Override
   protected void a(eaa.a<dma, dzz> $$0) {
      $$0.a(b);
   }

   @Override
   protected ewg b_(dzz $$0) {
      return $$0.c(b) ? ewh.c.a(false) : super.b_($$0);
   }
}
