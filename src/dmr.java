import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dmr(ih<dmq> e, dle f) {
   public static final Codec<dmr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dmq.j.fieldOf("type").forGetter(dmr::a), dle.a.fieldOf("generator").forGetter(dmr::b)).apply($$0, $$0.stable(dmr::new))
   );
   public static final ahf<dmr> b = ahf.a(ke.aN, new ahg("overworld"));
   public static final ahf<dmr> c = ahf.a(ke.aN, new ahg("the_nether"));
   public static final ahf<dmr> d = ahf.a(ke.aN, new ahg("the_end"));

   public ih<dmq> a() {
      return this.e;
   }

   public dle b() {
      return this.f;
   }
}
