import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eav(edh b, dwx c, bnv d, int e) implements eay {
   public static final Codec<eav> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               edh.a.fieldOf("state_provider").forGetter(eav::a),
               dwx.b.fieldOf("target").forGetter(eav::b),
               bnv.b(0, 8).fieldOf("radius").forGetter(eav::c),
               Codec.intRange(0, 4).fieldOf("half_height").forGetter(eav::d)
            )
            .apply($$0, eav::new)
   );

   public edh a() {
      return this.b;
   }

   public dwx b() {
      return this.c;
   }

   public bnv c() {
      return this.d;
   }

   public int d() {
      return this.e;
   }
}
