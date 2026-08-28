import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dse extends dwb implements dnh {
   public static final MapCodec<dse> f = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ayy.a(0.0F, 1.0F).fieldOf("leaf_particle_chance").forGetter($$0x -> $$0x.e), t()).apply($$0, dse::new)
   );

   @Override
   public MapCodec<dse> a() {
      return f;
   }

   public dse(float $$0, ebf.d $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean a(dkc $$0, iw $$1, ebg $$2) {
      return $$0.a_($$1.e()).l();
   }

   @Override
   public boolean a(djz $$0, azz $$1, iw $$2, ebg $$3) {
      return true;
   }

   @Override
   public void a(aru $$0, azz $$1, iw $$2, ebg $$3) {
      $$0.a($$2.e(), dsf.c(), 2);
   }

   @Override
   public iw a(iw $$0) {
      return $$0.e();
   }
}
