import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record asp(ws c, int d, Optional<axo<Integer>> e) {
   public static final Codec<asp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               wu.a.fieldOf("description").forGetter(asp::a),
               Codec.INT.fieldOf("pack_format").forGetter(asp::b),
               axo.a(Codec.INT).optionalFieldOf("supported_formats").forGetter(asp::c)
            )
            .apply($$0, asp::new)
   );
   public static final aso<asp> b = aso.a("pack", a);

   public ws a() {
      return this.c;
   }

   public int b() {
      return this.d;
   }

   public Optional<axo<Integer>> c() {
      return this.e;
   }
}
