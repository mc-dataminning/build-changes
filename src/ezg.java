import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ezg(iv b, int c, int d) {
   public static final Codec<ezg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(iv.a.fieldOf("pos").forGetter(ezg::b), Codec.INT.fieldOf("rotation").forGetter(ezg::c), Codec.INT.fieldOf("entity_id").forGetter(ezg::d))
            .apply($$0, ezg::new)
   );

   public String a() {
      return a(this.b);
   }

   public static String a(iv $$0) {
      return "frame-" + $$0.u() + "," + $$0.v() + "," + $$0.w();
   }
}
