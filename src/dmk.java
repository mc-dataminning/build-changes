import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dmk(ih<dmj> e, dkx f) {
   public static final Codec<dmk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dmj.j.fieldOf("type").forGetter(dmk::a), dkx.a.fieldOf("generator").forGetter(dmk::b)).apply($$0, $$0.stable(dmk::new))
   );
   public static final ahc<dmk> b = ahc.a(ke.aN, new ahd("overworld"));
   public static final ahc<dmk> c = ahc.a(ke.aN, new ahd("the_nether"));
   public static final ahc<dmk> d = ahc.a(ke.aN, new ahd("the_end"));

   public ih<dmj> a() {
      return this.e;
   }

   public dkx b() {
      return this.f;
   }
}
