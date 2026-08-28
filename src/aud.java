import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record aud(wy c, int d, Optional<aze<Integer>> e) {
   public static final Codec<aud> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               xa.a.fieldOf("description").forGetter(aud::a),
               Codec.INT.fieldOf("pack_format").forGetter(aud::b),
               aze.a(Codec.INT).lenientOptionalFieldOf("supported_formats").forGetter(aud::c)
            )
            .apply($$0, aud::new)
   );
   public static final auc<aud> b = new auc<>("pack", a);

   public wy a() {
      return this.c;
   }

   public int b() {
      return this.d;
   }

   public Optional<aze<Integer>> c() {
      return this.e;
   }
}
