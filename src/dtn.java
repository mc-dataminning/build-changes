import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dtn(aku e, String f) {
   public static final Codec<dtn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(aku.a.fieldOf("asset_id").forGetter(dtn::a), Codec.STRING.fieldOf("translation_key").forGetter(dtn::b)).apply($$0, dtn::new)
   );
   public static final ym<vz, dtn> b = ym.a(aku.b, dtn::a, yk.o, dtn::b, dtn::new);
   public static final Codec<jr<dtn>> c = akq.a(mc.d, a);
   public static final ym<vz, jr<dtn>> d = yk.a(mc.d, b);

   public aku a() {
      return this.e;
   }

   public String b() {
      return this.f;
   }
}
