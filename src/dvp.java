import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dvp extends dtu implements dvj {
   public static final MapCodec<dvp> g = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dvj.a.e.fieldOf("weathering_state").forGetter(dmw::c), dzo.a.fieldOf("base_state").forGetter($$0x -> $$0x.f), t()).apply($$0, dvp::new)
   );
   private final dvj.a h;

   @Override
   public MapCodec<dvp> a() {
      return g;
   }

   public dvp(dvj.a $$0, dzo $$1, dzn.d $$2) {
      super($$1, $$2);
      this.h = $$0;
   }

   @Override
   protected void b(dzo $$0, aro $$1, iu $$2, azt $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean f(dzo $$0) {
      return dvj.c($$0.b()).isPresent();
   }

   public dvj.a q() {
      return this.h;
   }
}
