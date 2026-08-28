import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ezi(iw b, int c, int d) {
   public static final Codec<ezi> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(iw.a.fieldOf("pos").forGetter(ezi::b), Codec.INT.fieldOf("rotation").forGetter(ezi::c), Codec.INT.fieldOf("entity_id").forGetter(ezi::d))
            .apply($$0, ezi::new)
   );

   public String a() {
      return a(this.b);
   }

   public static String a(iw $$0) {
      return "frame-" + $$0.u() + "," + $$0.v() + "," + $$0.w();
   }
}
