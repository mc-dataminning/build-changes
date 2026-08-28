import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record atw(xe c, int d, Optional<ayx<Integer>> e) {
   public static final Codec<atw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               xg.a.fieldOf("description").forGetter(atw::a),
               Codec.INT.fieldOf("pack_format").forGetter(atw::b),
               ayx.a(Codec.INT).lenientOptionalFieldOf("supported_formats").forGetter(atw::c)
            )
            .apply($$0, atw::new)
   );
   public static final atv<atw> b = atv.a("pack", a);

   public xe a() {
      return this.c;
   }

   public int b() {
      return this.d;
   }

   public Optional<ayx<Integer>> c() {
      return this.e;
   }
}
