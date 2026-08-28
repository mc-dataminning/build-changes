import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dwg(jj<dwf> e, duh f) {
   public static final Codec<dwg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dwf.j.fieldOf("type").forGetter(dwg::a), duh.a.fieldOf("generator").forGetter(dwg::b)).apply($$0, $$0.stable(dwg::new))
   );
   public static final akj<dwg> b = akj.a(lr.ba, new akk("overworld"));
   public static final akj<dwg> c = akj.a(lr.ba, new akk("the_nether"));
   public static final akj<dwg> d = akj.a(lr.ba, new akk("the_end"));

   public jj<dwf> a() {
      return this.e;
   }

   public duh b() {
      return this.f;
   }
}
