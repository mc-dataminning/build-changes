import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dwh(jj<dwg> e, dui f) {
   public static final Codec<dwh> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dwg.k.fieldOf("type").forGetter(dwh::a), dui.a.fieldOf("generator").forGetter(dwh::b)).apply($$0, $$0.stable(dwh::new))
   );
   public static final akj<dwh> b = akj.a(lr.ba, new akk("overworld"));
   public static final akj<dwh> c = akj.a(lr.ba, new akk("the_nether"));
   public static final akj<dwh> d = akj.a(lr.ba, new akk("the_end"));

   public jj<dwg> a() {
      return this.e;
   }

   public dui b() {
      return this.f;
   }
}
