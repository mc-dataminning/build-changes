import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dpc extends dos implements dkh {
   public static final MapCodec<dpc> h = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ayi.m.fieldOf("leaf_particle_chance").forGetter($$0x -> $$0x.g), lt.bj.fieldOf("leaf_particle").forGetter($$0x -> $$0x.f), t())
            .apply($$0, dpc::new)
   );

   @Override
   public MapCodec<dpc> a() {
      return h;
   }

   public dpc(int $$0, lr $$1, dxp.d $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   public boolean a(dhc $$0, ji $$1, dxq $$2) {
      return $$0.a_($$1.e()).l();
   }

   @Override
   public boolean a(dgz $$0, azh $$1, ji $$2, dxq $$3) {
      return true;
   }

   @Override
   public void a(ard $$0, azh $$1, ji $$2, dxq $$3) {
      $$0.a($$2.e(), dpd.c(), 2);
   }

   @Override
   public ji a(ji $$0) {
      return $$0.e();
   }
}
