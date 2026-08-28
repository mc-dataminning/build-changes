import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dps extends dpi implements dkx {
   public static final MapCodec<dps> h = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ays.m.fieldOf("leaf_particle_chance").forGetter($$0x -> $$0x.g), lv.bj.fieldOf("leaf_particle").forGetter($$0x -> $$0x.f), t())
            .apply($$0, dps::new)
   );

   @Override
   public MapCodec<dps> a() {
      return h;
   }

   public dps(int $$0, lt $$1, dyl.d $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   public boolean a(dhs $$0, jj $$1, dym $$2) {
      return $$0.a_($$1.e()).l();
   }

   @Override
   public boolean a(dhp $$0, azs $$1, jj $$2, dym $$3) {
      return true;
   }

   @Override
   public void a(arn $$0, azs $$1, jj $$2, dym $$3) {
      $$0.a($$2.e(), dpt.c(), 2);
   }

   @Override
   public jj a(jj $$0) {
      return $$0.e();
   }
}
