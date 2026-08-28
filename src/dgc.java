import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.UnaryOperator;

public record dgc(jq<cxk> d, int e, ks f, cxo g) {
   public static final Codec<dgc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               cxk.e.fieldOf("id").forGetter(dgc::a),
               azn.m.fieldOf("count").orElse(1).forGetter(dgc::b),
               ks.a.optionalFieldOf("components", ks.c).forGetter(dgc::c)
            )
            .apply($$0, dgc::new)
   );
   public static final zt<xg, dgc> b = zt.a(zr.b(mb.K), dgc::a, zr.h, dgc::b, ks.b, dgc::c, dgc::new);
   public static final zt<xg, Optional<dgc>> c = b.a(zr::a);

   public dgc(dhg $$0) {
      this($$0, 1);
   }

   public dgc(dhg $$0, int $$1) {
      this($$0.j().f(), $$1, ks.c);
   }

   public dgc(jq<cxk> $$0, int $$1, ks $$2) {
      this($$0, $$1, $$2, a($$0, $$1, $$2));
   }

   public dgc a(UnaryOperator<ks.a> $$0) {
      return new dgc(this.d, this.e, $$0.apply(ks.a()).a());
   }

   private static cxo a(jq<cxk> $$0, int $$1, ks $$2) {
      return new cxo($$0, $$1, $$2.c());
   }

   public boolean a(cxo $$0) {
      return $$0.a(this.d) && this.f.a($$0);
   }

   public jq<cxk> a() {
      return this.d;
   }

   public int b() {
      return this.e;
   }

   public ks c() {
      return this.f;
   }

   public cxo d() {
      return this.g;
   }
}
