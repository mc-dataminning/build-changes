import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record aua(xh c, int d, Optional<azb<Integer>> e) {
   public static final Codec<aua> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               xj.a.fieldOf("description").forGetter(aua::a),
               Codec.INT.fieldOf("pack_format").forGetter(aua::b),
               azb.a(Codec.INT).lenientOptionalFieldOf("supported_formats").forGetter(aua::c)
            )
            .apply($$0, aua::new)
   );
   public static final atz<aua> b = atz.a("pack", a);

   public xh a() {
      return this.c;
   }

   public int b() {
      return this.d;
   }

   public Optional<azb<Integer>> c() {
      return this.e;
   }
}
