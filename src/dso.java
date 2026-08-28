import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dso extends dwl implements dnr {
   public static final MapCodec<dso> f = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(azg.a(0.0F, 1.0F).fieldOf("leaf_particle_chance").forGetter($$0x -> $$0x.e), t()).apply($$0, dso::new)
   );

   @Override
   public MapCodec<dso> a() {
      return f;
   }

   public dso(float $$0, ebp.d $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean a(dkm $$0, iw $$1, ebq $$2) {
      return $$0.a_($$1.e()).l();
   }

   @Override
   public boolean a(dkj $$0, bai $$1, iw $$2, ebq $$3) {
      return true;
   }

   @Override
   public void a(asb $$0, bai $$1, iw $$2, ebq $$3) {
      $$0.a($$2.e(), dsp.c(), 2);
   }

   @Override
   public iw a(iw $$0) {
      return $$0.e();
   }
}
