import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eqc(jf<czu> c, eqe d) {
   public static final Codec<eqc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(czu.e.fieldOf("display").forGetter($$0x -> $$0x.c), eqe.a.fieldOf("settings").forGetter($$0x -> $$0x.d)).apply($$0, eqc::new)
   );
   public static final Codec<jf<eqc>> b = ale.a(mh.aS, a);

   public jf<czu> a() {
      return this.c;
   }

   public eqe b() {
      return this.d;
   }
}
