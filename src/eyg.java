import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eyg(iu b, int c, int d) {
   public static final Codec<eyg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(iu.a.fieldOf("pos").forGetter(eyg::b), Codec.INT.fieldOf("rotation").forGetter(eyg::c), Codec.INT.fieldOf("entity_id").forGetter(eyg::d))
            .apply($$0, eyg::new)
   );

   public String a() {
      return a(this.b);
   }

   public static String a(iu $$0) {
      return "frame-" + $$0.u() + "," + $$0.v() + "," + $$0.w();
   }
}
