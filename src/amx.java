import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record amx(tn c, int d, Optional<arr<Integer>> e) {
   public static final Codec<amx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               arh.b.fieldOf("description").forGetter(amx::a),
               Codec.INT.fieldOf("pack_format").forGetter(amx::b),
               arr.a(Codec.INT).optionalFieldOf("supported_formats").forGetter(amx::c)
            )
            .apply($$0, amx::new)
   );
   public static final amw<amx> b = amw.a("pack", a);

   public tn a() {
      return this.c;
   }

   public int b() {
      return this.d;
   }

   public Optional<arr<Integer>> c() {
      return this.e;
   }
}
