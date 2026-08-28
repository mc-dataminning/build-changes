import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class drf extends dvc implements dmi {
   public static final MapCodec<drf> f = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ayu.a(0.0F, 1.0F).fieldOf("leaf_particle_chance").forGetter($$0x -> $$0x.e), t()).apply($$0, drf::new)
   );

   @Override
   public MapCodec<drf> a() {
      return f;
   }

   public drf(float $$0, eag.d $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean a(djd $$0, iu $$1, eah $$2) {
      return $$0.a_($$1.e()).l();
   }

   @Override
   public boolean a(dja $$0, azv $$1, iu $$2, eah $$3) {
      return true;
   }

   @Override
   public void a(arq $$0, azv $$1, iu $$2, eah $$3) {
      $$0.a($$2.e(), drg.c(), 2);
   }

   @Override
   public iu a(iu $$0) {
      return $$0.e();
   }
}
