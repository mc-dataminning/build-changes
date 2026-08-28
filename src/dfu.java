import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.UnaryOperator;

public record dfu(jq<cxc> d, int e, ks f, cxg g) {
   public static final Codec<dfu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               cxc.e.fieldOf("id").forGetter(dfu::a),
               azd.m.fieldOf("count").orElse(1).forGetter(dfu::b),
               ks.a.optionalFieldOf("components", ks.c).forGetter(dfu::c)
            )
            .apply($$0, dfu::new)
   );
   public static final zi<wv, dfu> b = zi.a(zg.b(mb.K), dfu::a, zg.h, dfu::b, ks.b, dfu::c, dfu::new);
   public static final zi<wv, Optional<dfu>> c = b.a(zg::a);

   public dfu(dgy $$0) {
      this($$0, 1);
   }

   public dfu(dgy $$0, int $$1) {
      this($$0.j().f(), $$1, ks.c);
   }

   public dfu(jq<cxc> $$0, int $$1, ks $$2) {
      this($$0, $$1, $$2, a($$0, $$1, $$2));
   }

   public dfu a(UnaryOperator<ks.a> $$0) {
      return new dfu(this.d, this.e, $$0.apply(ks.a()).a());
   }

   private static cxg a(jq<cxc> $$0, int $$1, ks $$2) {
      return new cxg($$0, $$1, $$2.c());
   }

   public boolean a(cxg $$0) {
      return $$0.a(this.d) && this.f.a($$0);
   }

   public jq<cxc> a() {
      return this.d;
   }

   public int b() {
      return this.e;
   }

   public ks c() {
      return this.f;
   }

   public cxg d() {
      return this.g;
   }
}
