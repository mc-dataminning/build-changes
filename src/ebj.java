import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ebj(jq<ebi> e, dzj f) {
   public static final Codec<ebj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ebi.k.fieldOf("type").forGetter(ebj::a), dzj.a.fieldOf("generator").forGetter(ebj::b)).apply($$0, $$0.stable(ebj::new))
   );
   public static final aly<ebj> b = aly.a(mb.be, alz.b("overworld"));
   public static final aly<ebj> c = aly.a(mb.be, alz.b("the_nether"));
   public static final aly<ebj> d = aly.a(mb.be, alz.b("the_end"));

   public jq<ebi> a() {
      return this.e;
   }

   public dzj b() {
      return this.f;
   }
}
