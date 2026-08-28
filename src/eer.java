import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eer(jf<eeq> e, ecr f) {
   public static final Codec<eer> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eeq.l.fieldOf("type").forGetter(eer::a), ecr.a.fieldOf("generator").forGetter(eer::b)).apply($$0, $$0.stable(eer::new))
   );
   public static final alf<eer> b = alf.a(mh.bq, alg.b("overworld"));
   public static final alf<eer> c = alf.a(mh.bq, alg.b("the_nether"));
   public static final alf<eer> d = alf.a(mh.bq, alg.b("the_end"));

   public jf<eeq> a() {
      return this.e;
   }

   public ecr b() {
      return this.f;
   }
}
