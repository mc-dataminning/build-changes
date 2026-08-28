import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dvo extends drh {
   public static final MapCodec<dvo> g = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ayu.a(0.0F, 1.0F).fieldOf("leaf_particle_chance").forGetter($$0x -> $$0x.e), t()).apply($$0, dvo::new)
   );

   public dvo(float $$0, eas.d $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(djm $$0, iv $$1, azv $$2) {
      lr $$3 = lr.a(ly.J, $$0.s($$1));
      azq.a($$0, $$1, $$2, $$3);
   }

   @Override
   public MapCodec<? extends dvo> a() {
      return g;
   }
}
