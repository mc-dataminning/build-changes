import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ebq(jq<ebp> e, dzq f) {
   public static final Codec<ebq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ebp.k.fieldOf("type").forGetter(ebq::a), dzq.a.fieldOf("generator").forGetter(ebq::b)).apply($$0, $$0.stable(ebq::new))
   );
   public static final aly<ebq> b = aly.a(mb.bf, alz.b("overworld"));
   public static final aly<ebq> c = aly.a(mb.bf, alz.b("the_nether"));
   public static final aly<ebq> d = aly.a(mb.bf, alz.b("the_end"));

   public jq<ebp> a() {
      return this.e;
   }

   public dzq b() {
      return this.f;
   }
}
