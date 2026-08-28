import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ezs(iw b, int c, int d) {
   public static final Codec<ezs> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(iw.a.fieldOf("pos").forGetter(ezs::b), Codec.INT.fieldOf("rotation").forGetter(ezs::c), Codec.INT.fieldOf("entity_id").forGetter(ezs::d))
            .apply($$0, ezs::new)
   );

   public String a() {
      return a(this.b);
   }

   public static String a(iw $$0) {
      return "frame-" + $$0.u() + "," + $$0.v() + "," + $$0.w();
   }
}
