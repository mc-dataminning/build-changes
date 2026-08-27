import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record anv(ui c, int d, Optional<asq<Integer>> e) {
   public static final Codec<anv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               uk.a.fieldOf("description").forGetter(anv::a),
               Codec.INT.fieldOf("pack_format").forGetter(anv::b),
               asq.a(Codec.INT).optionalFieldOf("supported_formats").forGetter(anv::c)
            )
            .apply($$0, anv::new)
   );
   public static final anu<anv> b = anu.a("pack", a);

   public ui a() {
      return this.c;
   }

   public int b() {
      return this.d;
   }

   public Optional<asq<Integer>> c() {
      return this.e;
   }
}
