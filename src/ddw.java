import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.UnaryOperator;

public record ddw(jq<cvx> d, int e, ks f, cwb g) {
   public static final Codec<ddw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               cwb.a.fieldOf("id").forGetter(ddw::a),
               ayt.m.fieldOf("count").orElse(1).forGetter(ddw::b),
               ks.a.optionalFieldOf("components", ks.c).forGetter(ddw::c)
            )
            .apply($$0, ddw::new)
   );
   public static final zg<wt, ddw> b = zg.a(ze.b(lz.K), ddw::a, ze.h, ddw::b, ks.b, ddw::c, ddw::new);
   public static final zg<wt, Optional<ddw>> c = b.a(ze::a);

   public ddw(dfa $$0) {
      this($$0, 1);
   }

   public ddw(dfa $$0, int $$1) {
      this($$0.j().f(), $$1, ks.c);
   }

   public ddw(jq<cvx> $$0, int $$1, ks $$2) {
      this($$0, $$1, $$2, a($$0, $$1, $$2));
   }

   public ddw a(UnaryOperator<ks.a> $$0) {
      return new ddw(this.d, this.e, $$0.apply(ks.a()).a());
   }

   private static cwb a(jq<cvx> $$0, int $$1, ks $$2) {
      return new cwb($$0, $$1, $$2.c());
   }

   public boolean a(cwb $$0) {
      return $$0.a(this.d) && this.f.a($$0);
   }

   public jq<cvx> a() {
      return this.d;
   }

   public int b() {
      return this.e;
   }

   public ks c() {
      return this.f;
   }

   public cwb d() {
      return this.g;
   }
}
