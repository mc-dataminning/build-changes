import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record ass(wu c, int d, Optional<axr<Integer>> e) {
   public static final Codec<ass> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ww.a.fieldOf("description").forGetter(ass::a),
               Codec.INT.fieldOf("pack_format").forGetter(ass::b),
               axr.a(Codec.INT).optionalFieldOf("supported_formats").forGetter(ass::c)
            )
            .apply($$0, ass::new)
   );
   public static final asr<ass> b = asr.a("pack", a);

   public wu a() {
      return this.c;
   }

   public int b() {
      return this.d;
   }

   public Optional<axr<Integer>> c() {
      return this.e;
   }
}
