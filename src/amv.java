import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record amv(tl c, int d, Optional<arp<Integer>> e) {
   public static final Codec<amv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               arf.b.fieldOf("description").forGetter(amv::a),
               Codec.INT.fieldOf("pack_format").forGetter(amv::b),
               arp.a(Codec.INT).optionalFieldOf("supported_formats").forGetter(amv::c)
            )
            .apply($$0, amv::new)
   );
   public static final amu<amv> b = amu.a("pack", a);

   public tl a() {
      return this.c;
   }

   public int b() {
      return this.d;
   }

   public Optional<arp<Integer>> c() {
      return this.e;
   }
}
