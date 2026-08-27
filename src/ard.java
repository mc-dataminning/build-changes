import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record ard(vq c, int d, Optional<awa<Integer>> e) {
   public static final Codec<ard> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               vs.a.fieldOf("description").forGetter(ard::a),
               Codec.INT.fieldOf("pack_format").forGetter(ard::b),
               awa.a(Codec.INT).optionalFieldOf("supported_formats").forGetter(ard::c)
            )
            .apply($$0, ard::new)
   );
   public static final arc<ard> b = arc.a("pack", a);

   public vq a() {
      return this.c;
   }

   public int b() {
      return this.d;
   }

   public Optional<awa<Integer>> c() {
      return this.e;
   }
}
