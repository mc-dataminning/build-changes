import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ebk(jq<ebj> e, dzk f) {
   public static final Codec<ebk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ebj.k.fieldOf("type").forGetter(ebk::a), dzk.a.fieldOf("generator").forGetter(ebk::b)).apply($$0, $$0.stable(ebk::new))
   );
   public static final alo<ebk> b = alo.a(mb.bf, alp.b("overworld"));
   public static final alo<ebk> c = alo.a(mb.bf, alp.b("the_nether"));
   public static final alo<ebk> d = alo.a(mb.bf, alp.b("the_end"));

   public jq<ebj> a() {
      return this.e;
   }

   public dzk b() {
      return this.f;
   }
}
