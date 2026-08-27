import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dow(ij<dov> e, dng f) {
   public static final Codec<dow> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dov.j.fieldOf("type").forGetter(dow::a), dng.a.fieldOf("generator").forGetter(dow::b)).apply($$0, $$0.stable(dow::new))
   );
   public static final aix<dow> b = aix.a(kg.aN, new aiy("overworld"));
   public static final aix<dow> c = aix.a(kg.aN, new aiy("the_nether"));
   public static final aix<dow> d = aix.a(kg.aN, new aiy("the_end"));

   public ij<dov> a() {
      return this.e;
   }

   public dng b() {
      return this.f;
   }
}
