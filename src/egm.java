import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record egm(ji<cul> c, ego d) {
   public static final Codec<egm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(alc.a(lq.G).fieldOf("display").forGetter($$0x -> $$0x.c), ego.a.fieldOf("settings").forGetter($$0x -> $$0x.d)).apply($$0, egm::new)
   );
   public static final Codec<ji<egm>> b = alb.a(lq.aF, a);

   public ji<cul> a() {
      return this.c;
   }

   public ego b() {
      return this.d;
   }
}
