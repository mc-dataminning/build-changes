import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record aud(xj c, int d, Optional<aze<Integer>> e) {
   public static final Codec<aud> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               xl.a.fieldOf("description").forGetter(aud::a),
               Codec.INT.fieldOf("pack_format").forGetter(aud::b),
               aze.a(Codec.INT).lenientOptionalFieldOf("supported_formats").forGetter(aud::c)
            )
            .apply($$0, aud::new)
   );
   public static final auc<aud> b = auc.a("pack", a);

   public xj a() {
      return this.c;
   }

   public int b() {
      return this.d;
   }

   public Optional<aze<Integer>> c() {
      return this.e;
   }
}
