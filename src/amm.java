import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record amm(te c, int d, Optional<arh<Integer>> e) {
   public static final Codec<amm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               aqw.b.fieldOf("description").forGetter(amm::a),
               Codec.INT.fieldOf("pack_format").forGetter(amm::b),
               arh.a(Codec.INT).optionalFieldOf("supported_formats").forGetter(amm::c)
            )
            .apply($$0, amm::new)
   );
   public static final aml<amm> b = aml.a("pack", a);

   public te a() {
      return this.c;
   }

   public int b() {
      return this.d;
   }

   public Optional<arh<Integer>> c() {
      return this.e;
   }
}
