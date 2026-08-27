import com.mojang.serialization.MapCodec;

public class dkf extends dch {
   public static final MapCodec<dkf> a = b(dkf::new);
   private static final double b = 5.0;
   private static final etc c = dch.a(5.0, 5.0, 5.0, 11.0, 11.0, 11.0);

   @Override
   public MapCodec<dkf> a() {
      return a;
   }

   protected dkf(dph.d $$0) {
      super($$0);
   }

   @Override
   protected dim b_(dpi $$0) {
      return dim.a;
   }

   @Override
   protected etc a(dpi $$0, cym $$1, id $$2, eso $$3) {
      return c;
   }

   @Override
   protected float d(dpi $$0, cym $$1, id $$2) {
      return 1.0F;
   }
}
