import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record amo(tf c, int d, Optional<ari<Integer>> e) {
   public static final Codec<amo> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               aqy.b.fieldOf("description").forGetter(amo::a),
               Codec.INT.fieldOf("pack_format").forGetter(amo::b),
               ari.a(Codec.INT).optionalFieldOf("supported_formats").forGetter(amo::c)
            )
            .apply($$0, amo::new)
   );
   public static final amn<amo> b = amn.a("pack", a);

   public tf a() {
      return this.c;
   }

   public int b() {
      return this.d;
   }

   public Optional<ari<Integer>> c() {
      return this.e;
   }
}
