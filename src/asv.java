import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record asv(wu c, int d, Optional<axw<Integer>> e) {
   public static final Codec<asv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ww.a.fieldOf("description").forGetter(asv::a),
               Codec.INT.fieldOf("pack_format").forGetter(asv::b),
               axw.a(Codec.INT).lenientOptionalFieldOf("supported_formats").forGetter(asv::c)
            )
            .apply($$0, asv::new)
   );
   public static final asu<asv> b = asu.a("pack", a);

   public wu a() {
      return this.c;
   }

   public int b() {
      return this.d;
   }

   public Optional<axw<Integer>> c() {
      return this.e;
   }
}
