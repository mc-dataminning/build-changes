import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dzg(jq<dzf> e, dxg f) {
   public static final Codec<dzg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dzf.k.fieldOf("type").forGetter(dzg::a), dxg.a.fieldOf("generator").forGetter(dzg::b)).apply($$0, $$0.stable(dzg::new))
   );
   public static final alh<dzg> b = alh.a(lz.bc, ali.b("overworld"));
   public static final alh<dzg> c = alh.a(lz.bc, ali.b("the_nether"));
   public static final alh<dzg> d = alh.a(lz.bc, ali.b("the_end"));

   public jq<dzf> a() {
      return this.e;
   }

   public dxg b() {
      return this.f;
   }
}
