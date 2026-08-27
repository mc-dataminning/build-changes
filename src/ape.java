import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record ape(vd c, int d, Optional<aua<Integer>> e) {
   public static final Codec<ape> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               vf.a.fieldOf("description").forGetter(ape::a),
               Codec.INT.fieldOf("pack_format").forGetter(ape::b),
               aua.a(Codec.INT).optionalFieldOf("supported_formats").forGetter(ape::c)
            )
            .apply($$0, ape::new)
   );
   public static final apd<ape> b = apd.a("pack", a);

   public vd a() {
      return this.c;
   }

   public int b() {
      return this.d;
   }

   public Optional<aua<Integer>> c() {
      return this.e;
   }
}
