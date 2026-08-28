import com.mojang.serialization.MapCodec;

public class dig extends dit {
   public static final MapCodec<dig> a = b(dig::new);

   @Override
   public MapCodec<dig> a() {
      return a;
   }

   public dig(drz.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dsb.a<dex, dsa> $$0) {
      $$0.a(aE);
   }

   @Override
   public dsa a(cxy $$0) {
      return this.o().a(aE, $$0.g().g());
   }
}
