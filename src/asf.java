import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record asf(wi c, int d, Optional<axe<Integer>> e) {
   public static final Codec<asf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               wk.a.fieldOf("description").forGetter(asf::a),
               Codec.INT.fieldOf("pack_format").forGetter(asf::b),
               axe.a(Codec.INT).optionalFieldOf("supported_formats").forGetter(asf::c)
            )
            .apply($$0, asf::new)
   );
   public static final ase<asf> b = ase.a("pack", a);

   public wi a() {
      return this.c;
   }

   public int b() {
      return this.d;
   }

   public Optional<axe<Integer>> c() {
      return this.e;
   }
}
