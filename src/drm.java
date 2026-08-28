import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class drm extends dvj implements dmp {
   public static final MapCodec<drm> f = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ayu.a(0.0F, 1.0F).fieldOf("leaf_particle_chance").forGetter($$0x -> $$0x.e), t()).apply($$0, drm::new)
   );

   @Override
   public MapCodec<drm> a() {
      return f;
   }

   public drm(float $$0, ean.d $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean a(djk $$0, iv $$1, eao $$2) {
      return $$0.a_($$1.e()).l();
   }

   @Override
   public boolean a(djh $$0, azv $$1, iv $$2, eao $$3) {
      return true;
   }

   @Override
   public void a(arq $$0, azv $$1, iv $$2, eao $$3) {
      $$0.a($$2.e(), drn.c(), 2);
   }

   @Override
   public iv a(iv $$0) {
      return $$0.e();
   }
}
