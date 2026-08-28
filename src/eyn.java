import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eyn(iv b, int c, int d) {
   public static final Codec<eyn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(iv.a.fieldOf("pos").forGetter(eyn::b), Codec.INT.fieldOf("rotation").forGetter(eyn::c), Codec.INT.fieldOf("entity_id").forGetter(eyn::d))
            .apply($$0, eyn::new)
   );

   public String a() {
      return a(this.b);
   }

   public static String a(iv $$0) {
      return "frame-" + $$0.u() + "," + $$0.v() + "," + $$0.w();
   }
}
