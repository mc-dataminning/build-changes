import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ehq(jm<cul> c, ehs d) {
   public static final Codec<ehq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ako.a(lu.K).fieldOf("display").forGetter($$0x -> $$0x.c), ehs.a.fieldOf("settings").forGetter($$0x -> $$0x.d)).apply($$0, ehq::new)
   );
   public static final Codec<jm<ehq>> b = akn.a(lu.aN, a);

   public jm<cul> a() {
      return this.c;
   }

   public ehs b() {
      return this.d;
   }
}
