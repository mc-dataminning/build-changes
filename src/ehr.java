import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ehr(jm<cul> c, eht d) {
   public static final Codec<ehr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ako.a(lu.K).fieldOf("display").forGetter($$0x -> $$0x.c), eht.a.fieldOf("settings").forGetter($$0x -> $$0x.d)).apply($$0, ehr::new)
   );
   public static final Codec<jm<ehr>> b = akn.a(lu.aN, a);

   public jm<cul> a() {
      return this.c;
   }

   public eht b() {
      return this.d;
   }
}
