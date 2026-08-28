import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ekj(jq<cwi> c, ekl d) {
   public static final Codec<ekj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(alg.a(ma.K).fieldOf("display").forGetter($$0x -> $$0x.c), ekl.a.fieldOf("settings").forGetter($$0x -> $$0x.d)).apply($$0, ekj::new)
   );
   public static final Codec<jq<ekj>> b = alf.a(ma.aO, a);

   public jq<cwi> a() {
      return this.c;
   }

   public ekl b() {
      return this.d;
   }
}
