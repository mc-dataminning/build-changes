import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.UnaryOperator;

public record dfv(jq<cxg> d, int e, ks f, cxk g) {
   public static final Codec<dfv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               cxk.a.fieldOf("id").forGetter(dfv::a),
               azn.m.fieldOf("count").orElse(1).forGetter(dfv::b),
               ks.a.optionalFieldOf("components", ks.c).forGetter(dfv::c)
            )
            .apply($$0, dfv::new)
   );
   public static final zt<xg, dfv> b = zt.a(zr.b(mb.K), dfv::a, zr.h, dfv::b, ks.b, dfv::c, dfv::new);
   public static final zt<xg, Optional<dfv>> c = b.a(zr::a);

   public dfv(dgz $$0) {
      this($$0, 1);
   }

   public dfv(dgz $$0, int $$1) {
      this($$0.j().f(), $$1, ks.c);
   }

   public dfv(jq<cxg> $$0, int $$1, ks $$2) {
      this($$0, $$1, $$2, a($$0, $$1, $$2));
   }

   public dfv a(UnaryOperator<ks.a> $$0) {
      return new dfv(this.d, this.e, $$0.apply(ks.a()).a());
   }

   private static cxk a(jq<cxg> $$0, int $$1, ks $$2) {
      return new cxk($$0, $$1, $$2.c());
   }

   public boolean a(cxk $$0) {
      return $$0.a(this.d) && this.f.a($$0);
   }

   public jq<cxg> a() {
      return this.d;
   }

   public int b() {
      return this.e;
   }

   public ks c() {
      return this.f;
   }

   public cxk d() {
      return this.g;
   }
}
