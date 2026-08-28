import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class drr extends dvo implements dmu {
   public static final MapCodec<drr> f = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ayu.a(0.0F, 1.0F).fieldOf("leaf_particle_chance").forGetter($$0x -> $$0x.e), t()).apply($$0, drr::new)
   );

   @Override
   public MapCodec<drr> a() {
      return f;
   }

   public drr(float $$0, eas.d $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean a(djp $$0, iv $$1, eat $$2) {
      return $$0.a_($$1.e()).l();
   }

   @Override
   public boolean a(djm $$0, azv $$1, iv $$2, eat $$3) {
      return true;
   }

   @Override
   public void a(arq $$0, azv $$1, iv $$2, eat $$3) {
      $$0.a($$2.e(), drs.c(), 2);
   }

   @Override
   public iv a(iv $$0) {
      return $$0.e();
   }
}
