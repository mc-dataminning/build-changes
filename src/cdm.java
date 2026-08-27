import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cdm(ajv b, ajv c, ajv d, ir<daf> e) {
   public static final Codec<cdm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ajv.a.fieldOf("texture").forGetter(cdm::a),
               ajv.a.fieldOf("tame_texture").forGetter(cdm::b),
               ajv.a.fieldOf("angry_texture").forGetter(cdm::c),
               jc.a(ku.aw).fieldOf("biomes").forGetter(cdm::d)
            )
            .apply($$0, cdm::new)
   );

   public ajv a() {
      return this.b;
   }

   public ajv b() {
      return this.c;
   }

   public ajv c() {
      return this.d;
   }

   public ir<daf> d() {
      return this.e;
   }
}
