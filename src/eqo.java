import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eqo(jg<dag> c, eqq d) {
   public static final Codec<eqo> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dag.e.fieldOf("display").forGetter($$0x -> $$0x.c), eqq.a.fieldOf("settings").forGetter($$0x -> $$0x.d)).apply($$0, eqo::new)
   );
   public static final Codec<jg<eqo>> b = aln.a(mi.aS, a);

   public jg<dag> a() {
      return this.c;
   }

   public eqq b() {
      return this.d;
   }
}
