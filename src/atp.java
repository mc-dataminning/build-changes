import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record atp(xo c, int d, Optional<ayp<Integer>> e) {
   public static final Codec<atp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               xq.a.fieldOf("description").forGetter(atp::a),
               Codec.INT.fieldOf("pack_format").forGetter(atp::b),
               ayp.a(Codec.INT).lenientOptionalFieldOf("supported_formats").forGetter(atp::c)
            )
            .apply($$0, atp::new)
   );
   public static final ato<atp> b = ato.a("pack", a);

   public xo a() {
      return this.c;
   }

   public int b() {
      return this.d;
   }

   public Optional<ayp<Integer>> c() {
      return this.e;
   }
}
