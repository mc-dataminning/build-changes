import com.mojang.serialization.MapCodec;

public class dvr extends dvj {
   public static final MapCodec<dvr> a = b(dvr::new);
   private static final ffc b = dma.b(14.0, 0.0, 1.5);

   @Override
   public MapCodec<dvr> a() {
      return a;
   }

   protected dvr(dzy.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dzz $$0, div $$1, iu $$2, bwd $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$1 instanceof arq && $$3 instanceof cti) {
         $$1.a(new iu($$2), true, $$3);
      }
   }

   @Override
   protected ffc a(dzz $$0, dib $$1, iu $$2, fen $$3) {
      return b;
   }

   @Override
   protected boolean b(dzz $$0, dib $$1, iu $$2) {
      ewg $$3 = $$1.b_($$2);
      ewg $$4 = $$1.b_($$2.d());
      return ($$3.a() == ewh.c || $$0.b() instanceof dqc) && $$4.a() == ewh.a;
   }
}
