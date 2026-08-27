import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record arc(vq c, int d, Optional<avz<Integer>> e) {
   public static final Codec<arc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               vs.a.fieldOf("description").forGetter(arc::a),
               Codec.INT.fieldOf("pack_format").forGetter(arc::b),
               avz.a(Codec.INT).optionalFieldOf("supported_formats").forGetter(arc::c)
            )
            .apply($$0, arc::new)
   );
   public static final arb<arc> b = arb.a("pack", a);

   public vq a() {
      return this.c;
   }

   public int b() {
      return this.d;
   }

   public Optional<avz<Integer>> c() {
      return this.e;
   }
}
