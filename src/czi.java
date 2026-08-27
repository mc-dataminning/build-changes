import com.mojang.serialization.MapCodec;

public class czi extends czu {
   public static final MapCodec<czi> a = b(czi::new);

   @Override
   public MapCodec<czi> a() {
      return a;
   }

   public czi(dio.d $$0) {
      super($$0);
   }

   @Override
   protected void a(diq.a<cvz, dip> $$0) {
      $$0.a(aE);
   }

   @Override
   public dip a(coq $$0) {
      return this.o().a(aE, $$0.g().g());
   }
}
