import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record epj(jf<czg> c, epl d) {
   public static final Codec<epj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(czg.e.fieldOf("display").forGetter($$0x -> $$0x.c), epl.a.fieldOf("settings").forGetter($$0x -> $$0x.d)).apply($$0, epj::new)
   );
   public static final Codec<jf<epj>> b = alc.a(mh.aS, a);

   public jf<czg> a() {
      return this.c;
   }

   public epl b() {
      return this.d;
   }
}
