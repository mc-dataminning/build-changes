import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dzm(ij<coy> c, dzo d) {
   public static final Codec<dzm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(aiv.a(kg.F).fieldOf("display").forGetter($$0x -> $$0x.c), dzo.a.fieldOf("settings").forGetter($$0x -> $$0x.d)).apply($$0, dzm::new)
   );
   public static final Codec<ij<dzm>> b = aiu.a(kg.az, a);

   public ij<coy> a() {
      return this.c;
   }

   public dzo b() {
      return this.d;
   }
}
