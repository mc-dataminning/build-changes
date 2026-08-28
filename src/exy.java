import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record exy(iu b, int c, int d) {
   public static final Codec<exy> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(iu.a.fieldOf("pos").forGetter(exy::b), Codec.INT.fieldOf("rotation").forGetter(exy::c), Codec.INT.fieldOf("entity_id").forGetter(exy::d))
            .apply($$0, exy::new)
   );

   public String a() {
      return a(this.b);
   }

   public static String a(iu $$0) {
      return "frame-" + $$0.u() + "," + $$0.v() + "," + $$0.w();
   }
}
