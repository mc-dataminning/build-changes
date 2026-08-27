import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dlz(ie<dly> e, dkm f) {
   public static final Codec<dlz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dly.j.fieldOf("type").forGetter(dlz::a), dkm.a.fieldOf("generator").forGetter(dlz::b)).apply($$0, $$0.stable(dlz::new))
   );
   public static final ags<dlz> b = ags.a(kc.aM, new agt("overworld"));
   public static final ags<dlz> c = ags.a(kc.aM, new agt("the_nether"));
   public static final ags<dlz> d = ags.a(kc.aM, new agt("the_end"));

   public ie<dly> a() {
      return this.e;
   }

   public dkm b() {
      return this.f;
   }
}
