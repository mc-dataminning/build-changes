import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record aub(xi c, int d, Optional<azc<Integer>> e) {
   public static final Codec<aub> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               xk.a.fieldOf("description").forGetter(aub::a),
               Codec.INT.fieldOf("pack_format").forGetter(aub::b),
               azc.a(Codec.INT).lenientOptionalFieldOf("supported_formats").forGetter(aub::c)
            )
            .apply($$0, aub::new)
   );
   public static final aua<aub> b = aua.a("pack", a);

   public xi a() {
      return this.c;
   }

   public int b() {
      return this.d;
   }

   public Optional<azc<Integer>> c() {
      return this.e;
   }
}
