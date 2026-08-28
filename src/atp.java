import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record atp(wo c, int d, Optional<ayq<Integer>> e) {
   public static final Codec<atp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               wq.a.fieldOf("description").forGetter(atp::a),
               Codec.INT.fieldOf("pack_format").forGetter(atp::b),
               ayq.a(Codec.INT).lenientOptionalFieldOf("supported_formats").forGetter(atp::c)
            )
            .apply($$0, atp::new)
   );
   public static final ato<atp> b = new ato<>("pack", a);

   public wo a() {
      return this.c;
   }

   public int b() {
      return this.d;
   }

   public Optional<ayq<Integer>> c() {
      return this.e;
   }
}
