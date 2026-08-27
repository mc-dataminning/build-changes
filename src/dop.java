import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dop(ij<doo> e, dnc f) {
   public static final Codec<dop> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(doo.j.fieldOf("type").forGetter(dop::a), dnc.a.fieldOf("generator").forGetter(dop::b)).apply($$0, $$0.stable(dop::new))
   );
   public static final aix<dop> b = aix.a(kg.aN, new aiy("overworld"));
   public static final aix<dop> c = aix.a(kg.aN, new aiy("the_nether"));
   public static final aix<dop> d = aix.a(kg.aN, new aiy("the_end"));

   public ij<doo> a() {
      return this.e;
   }

   public dnc b() {
      return this.f;
   }
}
