import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record att(xd c, int d, Optional<ayu<Integer>> e) {
   public static final Codec<att> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               xf.a.fieldOf("description").forGetter(att::a),
               Codec.INT.fieldOf("pack_format").forGetter(att::b),
               ayu.a(Codec.INT).lenientOptionalFieldOf("supported_formats").forGetter(att::c)
            )
            .apply($$0, att::new)
   );
   public static final ats<att> b = ats.a("pack", a);

   public xd a() {
      return this.c;
   }

   public int b() {
      return this.d;
   }

   public Optional<ayu<Integer>> c() {
      return this.e;
   }
}
