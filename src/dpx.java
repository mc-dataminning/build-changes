import com.mojang.serialization.MapCodec;

public class dpx extends dma implements dtj {
   public static final MapCodec<dpx> a = b(dpx::new);
   public static final eaq b = eap.I;
   private static final ffc c = dma.b(8.0, 0.0, 8.0);

   public dpx(dzy.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, Boolean.valueOf(false)));
   }

   @Override
   public MapCodec<dpx> a() {
      return a;
   }

   @Override
   protected void a(eaa.a<dma, dzz> $$0) {
      $$0.a(b);
   }

   @Override
   protected dzz a(dzz $$0, diy $$1, djk $$2, iu $$3, ja $$4, iu $$5, dzz $$6, azv $$7) {
      if ($$0.c(b)) {
         $$2.a($$3, ewh.c, ewh.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected ewg b_(dzz $$0) {
      return $$0.c(b) ? ewh.c.a(false) : super.b_($$0);
   }

   @Override
   public dzz a(dcr $$0) {
      ewg $$1 = $$0.q().b_($$0.a());
      return this.m().b(b, Boolean.valueOf($$1.b(ewh.c)));
   }

   @Override
   protected ffc a(dzz $$0, dib $$1, iu $$2, fen $$3) {
      return c;
   }

   @Override
   protected boolean a(dzz $$0, ewv $$1) {
      return false;
   }
}
