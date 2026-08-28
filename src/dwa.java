import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dwa(jj<dvz> e, due f) {
   public static final Codec<dwa> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dvz.j.fieldOf("type").forGetter(dwa::a), due.a.fieldOf("generator").forGetter(dwa::b)).apply($$0, $$0.stable(dwa::new))
   );
   public static final akj<dwa> b = akj.a(lr.ba, new akk("overworld"));
   public static final akj<dwa> c = akj.a(lr.ba, new akk("the_nether"));
   public static final akj<dwa> d = akj.a(lr.ba, new akk("the_end"));

   public jj<dvz> a() {
      return this.e;
   }

   public due b() {
      return this.f;
   }
}
