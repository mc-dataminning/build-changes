import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record asd(wg c, int d, Optional<axc<Integer>> e) {
   public static final Codec<asd> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               wi.a.fieldOf("description").forGetter(asd::a),
               Codec.INT.fieldOf("pack_format").forGetter(asd::b),
               axc.a(Codec.INT).optionalFieldOf("supported_formats").forGetter(asd::c)
            )
            .apply($$0, asd::new)
   );
   public static final asc<asd> b = asc.a("pack", a);

   public wg a() {
      return this.c;
   }

   public int b() {
      return this.d;
   }

   public Optional<axc<Integer>> c() {
      return this.e;
   }
}
