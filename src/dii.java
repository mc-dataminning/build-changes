import com.mojang.serialization.MapCodec;

public class dii extends div {
   public static final MapCodec<dii> a = b(dii::new);

   @Override
   public MapCodec<dii> a() {
      return a;
   }

   public dii(dsb.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dsd.a<dez, dsc> $$0) {
      $$0.a(aE);
   }

   @Override
   public dsc a(cya $$0) {
      return this.o().a(aE, $$0.g().g());
   }
}
