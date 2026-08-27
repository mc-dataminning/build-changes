import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record arp(vu c, int d, Optional<awo<Integer>> e) {
   public static final Codec<arp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               vw.a.fieldOf("description").forGetter(arp::a),
               Codec.INT.fieldOf("pack_format").forGetter(arp::b),
               awo.a(Codec.INT).optionalFieldOf("supported_formats").forGetter(arp::c)
            )
            .apply($$0, arp::new)
   );
   public static final aro<arp> b = aro.a("pack", a);

   public vu a() {
      return this.c;
   }

   public int b() {
      return this.d;
   }

   public Optional<awo<Integer>> c() {
      return this.e;
   }
}
