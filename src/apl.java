import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record apl(vg c, int d, Optional<auh<Integer>> e) {
   public static final Codec<apl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               vi.a.fieldOf("description").forGetter(apl::a),
               Codec.INT.fieldOf("pack_format").forGetter(apl::b),
               auh.a(Codec.INT).optionalFieldOf("supported_formats").forGetter(apl::c)
            )
            .apply($$0, apl::new)
   );
   public static final apk<apl> b = apk.a("pack", a);

   public vg a() {
      return this.c;
   }

   public int b() {
      return this.d;
   }

   public Optional<auh<Integer>> c() {
      return this.e;
   }
}
