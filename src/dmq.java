import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dmq(ih<dmp> e, dld f) {
   public static final Codec<dmq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dmp.j.fieldOf("type").forGetter(dmq::a), dld.a.fieldOf("generator").forGetter(dmq::b)).apply($$0, $$0.stable(dmq::new))
   );
   public static final ahf<dmq> b = ahf.a(ke.aN, new ahg("overworld"));
   public static final ahf<dmq> c = ahf.a(ke.aN, new ahg("the_nether"));
   public static final ahf<dmq> d = ahf.a(ke.aN, new ahg("the_end"));

   public ih<dmp> a() {
      return this.e;
   }

   public dld b() {
      return this.f;
   }
}
