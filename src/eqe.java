import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eqe(jg<czw> c, eqg d) {
   public static final Codec<eqe> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(czw.e.fieldOf("display").forGetter($$0x -> $$0x.c), eqg.a.fieldOf("settings").forGetter($$0x -> $$0x.d)).apply($$0, eqe::new)
   );
   public static final Codec<jg<eqe>> b = alg.a(mi.aS, a);

   public jg<czw> a() {
      return this.c;
   }

   public eqg b() {
      return this.d;
   }
}
