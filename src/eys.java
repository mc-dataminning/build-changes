import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eys(iv b, int c, int d) {
   public static final Codec<eys> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(iv.a.fieldOf("pos").forGetter(eys::b), Codec.INT.fieldOf("rotation").forGetter(eys::c), Codec.INT.fieldOf("entity_id").forGetter(eys::d))
            .apply($$0, eys::new)
   );

   public String a() {
      return a(this.b);
   }

   public static String a(iv $$0) {
      return "frame-" + $$0.u() + "," + $$0.v() + "," + $$0.w();
   }
}
