import com.mojang.serialization.MapCodec;

public class dpm extends dqa {
   public static final MapCodec<dpm> a = b(dpm::new);

   @Override
   public MapCodec<dpm> a() {
      return a;
   }

   public dpm(dzy.d $$0) {
      super($$0);
   }

   @Override
   protected void a(eaa.a<dma, dzz> $$0) {
      $$0.a(e);
   }

   @Override
   public dzz a(dcr $$0) {
      return this.m().b(e, $$0.g().g());
   }
}
