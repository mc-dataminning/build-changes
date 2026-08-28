import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record aue(xl c, int d, Optional<azf<Integer>> e) {
   public static final Codec<aue> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               xn.a.fieldOf("description").forGetter(aue::a),
               Codec.INT.fieldOf("pack_format").forGetter(aue::b),
               azf.a(Codec.INT).lenientOptionalFieldOf("supported_formats").forGetter(aue::c)
            )
            .apply($$0, aue::new)
   );
   public static final aud<aue> b = aud.a("pack", a);

   public xl a() {
      return this.c;
   }

   public int b() {
      return this.d;
   }

   public Optional<azf<Integer>> c() {
      return this.e;
   }
}
