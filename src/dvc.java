import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dvc extends dqv {
   public static final MapCodec<dvc> g = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ayu.a(0.0F, 1.0F).fieldOf("leaf_particle_chance").forGetter($$0x -> $$0x.e), t()).apply($$0, dvc::new)
   );

   public dvc(float $$0, eag.d $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(dja $$0, iu $$1, azv $$2) {
      lq $$3 = lq.a(lx.J, $$0.s($$1));
      azq.a($$0, $$1, $$2, $$3);
   }

   @Override
   public MapCodec<? extends dvc> a() {
      return g;
   }
}
