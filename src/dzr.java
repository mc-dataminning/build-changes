import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dzr(jq<dzq> e, dxr f) {
   public static final Codec<dzr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dzq.k.fieldOf("type").forGetter(dzr::a), dxr.a.fieldOf("generator").forGetter(dzr::b)).apply($$0, $$0.stable(dzr::new))
   );
   public static final ali<dzr> b = ali.a(ma.bc, alj.b("overworld"));
   public static final ali<dzr> c = ali.a(ma.bc, alj.b("the_nether"));
   public static final ali<dzr> d = ali.a(ma.bc, alj.b("the_end"));

   public jq<dzq> a() {
      return this.e;
   }

   public dxr b() {
      return this.f;
   }
}
