import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record atq(wp c, int d, Optional<ayr<Integer>> e) {
   public static final Codec<atq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               wr.a.fieldOf("description").forGetter(atq::a),
               Codec.INT.fieldOf("pack_format").forGetter(atq::b),
               ayr.a(Codec.INT).lenientOptionalFieldOf("supported_formats").forGetter(atq::c)
            )
            .apply($$0, atq::new)
   );
   public static final atp<atq> b = new atp<>("pack", a);

   public wp a() {
      return this.c;
   }

   public int b() {
      return this.d;
   }

   public Optional<ayr<Integer>> c() {
      return this.e;
   }
}
