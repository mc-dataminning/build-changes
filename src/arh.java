import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record arh(vs c, int d, Optional<awe<Integer>> e) {
   public static final Codec<arh> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               vu.a.fieldOf("description").forGetter(arh::a),
               Codec.INT.fieldOf("pack_format").forGetter(arh::b),
               awe.a(Codec.INT).optionalFieldOf("supported_formats").forGetter(arh::c)
            )
            .apply($$0, arh::new)
   );
   public static final arg<arh> b = arg.a("pack", a);

   public vs a() {
      return this.c;
   }

   public int b() {
      return this.d;
   }

   public Optional<awe<Integer>> c() {
      return this.e;
   }
}
