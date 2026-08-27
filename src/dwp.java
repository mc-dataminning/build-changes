import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dwp(ie<cmc> c, dwr d) {
   public static final Codec<dwp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(agq.a(kc.F).fieldOf("display").forGetter($$0x -> $$0x.c), dwr.a.fieldOf("settings").forGetter($$0x -> $$0x.d)).apply($$0, dwp::new)
   );
   public static final Codec<ie<dwp>> b = agp.a(kc.ay, a);

   public ie<cmc> a() {
      return this.c;
   }

   public dwr b() {
      return this.d;
   }
}
