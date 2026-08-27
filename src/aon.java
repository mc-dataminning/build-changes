import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record aon(uv c, int d, Optional<ati<Integer>> e) {
   public static final Codec<aon> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ux.a.fieldOf("description").forGetter(aon::a),
               Codec.INT.fieldOf("pack_format").forGetter(aon::b),
               ati.a(Codec.INT).optionalFieldOf("supported_formats").forGetter(aon::c)
            )
            .apply($$0, aon::new)
   );
   public static final aom<aon> b = aom.a("pack", a);

   public uv a() {
      return this.c;
   }

   public int b() {
      return this.d;
   }

   public Optional<ati<Integer>> c() {
      return this.e;
   }
}
