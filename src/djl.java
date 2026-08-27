import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record djl(ib<djk> e, dhy f) {
   public static final Codec<djl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(djk.j.fieldOf("type").forGetter(djl::a), dhy.a.fieldOf("generator").forGetter(djl::b)).apply($$0, $$0.stable(djl::new))
   );
   public static final afv<djl> b = afv.a(jz.aJ, new afw("overworld"));
   public static final afv<djl> c = afv.a(jz.aJ, new afw("the_nether"));
   public static final afv<djl> d = afv.a(jz.aJ, new afw("the_end"));

   public ib<djk> a() {
      return this.e;
   }

   public dhy b() {
      return this.f;
   }
}
