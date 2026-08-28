import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ekc(jq<cwb> c, eke d) {
   public static final Codec<ekc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ali.a(ma.K).fieldOf("display").forGetter($$0x -> $$0x.c), eke.a.fieldOf("settings").forGetter($$0x -> $$0x.d)).apply($$0, ekc::new)
   );
   public static final Codec<jq<ekc>> b = alh.a(ma.aO, a);

   public jq<cwb> a() {
      return this.c;
   }

   public eke b() {
      return this.d;
   }
}
