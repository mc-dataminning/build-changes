import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record edm(je<edl> e, ebm f) {
   public static final Codec<edm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(edl.l.fieldOf("type").forGetter(edm::a), ebm.a.fieldOf("generator").forGetter(edm::b)).apply($$0, $$0.stable(edm::new))
   );
   public static final ald<edm> b = ald.a(mg.bn, ale.b("overworld"));
   public static final ald<edm> c = ald.a(mg.bn, ale.b("the_nether"));
   public static final ald<edm> d = ald.a(mg.bn, ale.b("the_end"));

   public je<edl> a() {
      return this.e;
   }

   public ebm b() {
      return this.f;
   }
}
