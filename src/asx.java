import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record asx(wu c, int d, Optional<axy<Integer>> e) {
   public static final Codec<asx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ww.a.fieldOf("description").forGetter(asx::a),
               Codec.INT.fieldOf("pack_format").forGetter(asx::b),
               axy.a(Codec.INT).lenientOptionalFieldOf("supported_formats").forGetter(asx::c)
            )
            .apply($$0, asx::new)
   );
   public static final asw<asx> b = asw.a("pack", a);

   public wu a() {
      return this.c;
   }

   public int b() {
      return this.d;
   }

   public Optional<axy<Integer>> c() {
      return this.e;
   }
}
