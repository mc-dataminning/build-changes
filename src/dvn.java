import com.mojang.serialization.MapCodec;

public class dvn extends dne {
   public static final MapCodec<dvn> a = b(dvn::new);
   private static final fgm b = dne.a(6.0);

   @Override
   public MapCodec<dvn> a() {
      return a;
   }

   protected dvn(ebf.d $$0) {
      super($$0);
   }

   @Override
   protected dtr a_(ebg $$0) {
      return dtr.a;
   }

   @Override
   protected fgm a(ebg $$0, djd $$1, iw $$2, ffx $$3) {
      return b;
   }

   @Override
   protected float c(ebg $$0, djd $$1, iw $$2) {
      return 1.0F;
   }
}
