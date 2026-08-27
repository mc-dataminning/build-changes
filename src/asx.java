import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record asx(wx c, int d, Optional<axw<Integer>> e) {
   public static final Codec<asx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               wz.a.fieldOf("description").forGetter(asx::a),
               Codec.INT.fieldOf("pack_format").forGetter(asx::b),
               axw.a(Codec.INT).lenientOptionalFieldOf("supported_formats").forGetter(asx::c)
            )
            .apply($$0, asx::new)
   );
   public static final asw<asx> b = asw.a("pack", a);

   public wx a() {
      return this.c;
   }

   public int b() {
      return this.d;
   }

   public Optional<axw<Integer>> c() {
      return this.e;
   }
}
