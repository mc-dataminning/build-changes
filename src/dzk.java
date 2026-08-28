import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dzk(jq<dzj> e, dxk f) {
   public static final Codec<dzk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dzj.k.fieldOf("type").forGetter(dzk::a), dxk.a.fieldOf("generator").forGetter(dzk::b)).apply($$0, $$0.stable(dzk::new))
   );
   public static final alk<dzk> b = alk.a(ma.bc, all.b("overworld"));
   public static final alk<dzk> c = alk.a(ma.bc, all.b("the_nether"));
   public static final alk<dzk> d = alk.a(ma.bc, all.b("the_end"));

   public jq<dzj> a() {
      return this.e;
   }

   public dxk b() {
      return this.f;
   }
}
