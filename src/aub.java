import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record aub(ww c, int d, Optional<azc<Integer>> e) {
   public static final Codec<aub> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               wy.a.fieldOf("description").forGetter(aub::a),
               Codec.INT.fieldOf("pack_format").forGetter(aub::b),
               azc.a(Codec.INT).lenientOptionalFieldOf("supported_formats").forGetter(aub::c)
            )
            .apply($$0, aub::new)
   );
   public static final aua<aub> b = new aua<>("pack", a);

   public ww a() {
      return this.c;
   }

   public int b() {
      return this.d;
   }

   public Optional<azc<Integer>> c() {
      return this.e;
   }
}
