import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record amr(ti c, int d, Optional<arl<Integer>> e) {
   public static final Codec<amr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               arb.b.fieldOf("description").forGetter(amr::a),
               Codec.INT.fieldOf("pack_format").forGetter(amr::b),
               arl.a(Codec.INT).optionalFieldOf("supported_formats").forGetter(amr::c)
            )
            .apply($$0, amr::new)
   );
   public static final amq<amr> b = amq.a("pack", a);

   public ti a() {
      return this.c;
   }

   public int b() {
      return this.d;
   }

   public Optional<arl<Integer>> c() {
      return this.e;
   }
}
