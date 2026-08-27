import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dss(il<dsr> e, dqw f) {
   public static final Codec<dss> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dsr.j.fieldOf("type").forGetter(dss::a), dqw.a.fieldOf("generator").forGetter(dss::b)).apply($$0, $$0.stable(dss::new))
   );
   public static final ajs<dss> b = ajs.a(ks.aP, new ajt("overworld"));
   public static final ajs<dss> c = ajs.a(ks.aP, new ajt("the_nether"));
   public static final ajs<dss> d = ajs.a(ks.aP, new ajt("the_end"));

   public il<dsr> a() {
      return this.e;
   }

   public dqw b() {
      return this.f;
   }
}
