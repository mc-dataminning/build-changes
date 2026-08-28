import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dqz extends duu implements dmd {
   public static final MapCodec<dqz> f = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ayu.a(0.0F, 1.0F).fieldOf("leaf_particle_chance").forGetter($$0x -> $$0x.e), t()).apply($$0, dqz::new)
   );

   @Override
   public MapCodec<dqz> a() {
      return f;
   }

   public dqz(float $$0, dzy.d $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean a(diy $$0, iu $$1, dzz $$2) {
      return $$0.a_($$1.e()).l();
   }

   @Override
   public boolean a(div $$0, azv $$1, iu $$2, dzz $$3) {
      return true;
   }

   @Override
   public void a(arq $$0, azv $$1, iu $$2, dzz $$3) {
      $$0.a($$2.e(), dra.c(), 2);
   }

   @Override
   public iu a(iu $$0) {
      return $$0.e();
   }
}
