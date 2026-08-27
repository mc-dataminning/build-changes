import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record amy(tl c, int d, Optional<art<Integer>> e) {
   public static final Codec<amy> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               tn.a.fieldOf("description").forGetter(amy::a),
               Codec.INT.fieldOf("pack_format").forGetter(amy::b),
               art.a(Codec.INT).optionalFieldOf("supported_formats").forGetter(amy::c)
            )
            .apply($$0, amy::new)
   );
   public static final amx<amy> b = amx.a("pack", a);

   public tl a() {
      return this.c;
   }

   public int b() {
      return this.d;
   }

   public Optional<art<Integer>> c() {
      return this.e;
   }
}
