import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record auo(xg c, int d, Optional<azr<Integer>> e) {
   public static final Codec<auo> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               xi.a.fieldOf("description").forGetter(auo::a),
               Codec.INT.fieldOf("pack_format").forGetter(auo::b),
               azr.a(Codec.INT).lenientOptionalFieldOf("supported_formats").forGetter(auo::c)
            )
            .apply($$0, auo::new)
   );
   public static final aun<auo> b = new aun<>("pack", a);

   public xg a() {
      return this.c;
   }

   public int b() {
      return this.d;
   }

   public Optional<azr<Integer>> c() {
      return this.e;
   }
}
