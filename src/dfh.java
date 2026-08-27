import com.mojang.serialization.MapCodec;

public class dfh extends dft {
   public static final MapCodec<dfh> a = b(dfh::new);

   @Override
   public MapCodec<dfh> a() {
      return a;
   }

   public dfh(doy.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dpa.a<dby, doz> $$0) {
      $$0.a(aE);
   }

   @Override
   public doz a(cuo $$0) {
      return this.n().a(aE, $$0.g().g());
   }
}
