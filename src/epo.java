import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record epo(jf<czj> c, epq d) {
   public static final Codec<epo> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(czj.e.fieldOf("display").forGetter($$0x -> $$0x.c), epq.a.fieldOf("settings").forGetter($$0x -> $$0x.d)).apply($$0, epo::new)
   );
   public static final Codec<jf<epo>> b = alc.a(mh.aS, a);

   public jf<czj> a() {
      return this.c;
   }

   public epq b() {
      return this.d;
   }
}
