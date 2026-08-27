import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record duw(ix<duv> e, dta f) {
   public static final Codec<duw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(duv.j.fieldOf("type").forGetter(duw::a), dta.a.fieldOf("generator").forGetter(duw::b)).apply($$0, $$0.stable(duw::new))
   );
   public static final akm<duw> b = akm.a(lf.aT, new akn("overworld"));
   public static final akm<duw> c = akm.a(lf.aT, new akn("the_nether"));
   public static final akm<duw> d = akm.a(lf.aT, new akn("the_end"));

   public ix<duv> a() {
      return this.e;
   }

   public dta b() {
      return this.f;
   }
}
