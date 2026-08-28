import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dsc extends dvz implements dnf {
   public static final MapCodec<dsc> f = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ayw.a(0.0F, 1.0F).fieldOf("leaf_particle_chance").forGetter($$0x -> $$0x.e), t()).apply($$0, dsc::new)
   );

   @Override
   public MapCodec<dsc> a() {
      return f;
   }

   public dsc(float $$0, ebd.d $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean a(dka $$0, iv $$1, ebe $$2) {
      return $$0.a_($$1.e()).l();
   }

   @Override
   public boolean a(djx $$0, azx $$1, iv $$2, ebe $$3) {
      return true;
   }

   @Override
   public void a(ars $$0, azx $$1, iv $$2, ebe $$3) {
      $$0.a($$2.e(), dsd.c(), 2);
   }

   @Override
   public iv a(iv $$0) {
      return $$0.e();
   }
}
