import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ebr(jq<ebq> e, dzr f) {
   public static final Codec<ebr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ebq.k.fieldOf("type").forGetter(ebr::a), dzr.a.fieldOf("generator").forGetter(ebr::b)).apply($$0, $$0.stable(ebr::new))
   );
   public static final aly<ebr> b = aly.a(mb.bf, alz.b("overworld"));
   public static final aly<ebr> c = aly.a(mb.bf, alz.b("the_nether"));
   public static final aly<ebr> d = aly.a(mb.bf, alz.b("the_end"));

   public jq<ebq> a() {
      return this.e;
   }

   public dzr b() {
      return this.f;
   }
}
