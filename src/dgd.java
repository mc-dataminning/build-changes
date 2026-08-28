import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.UnaryOperator;

public record dgd(jq<cxl> d, int e, ks f, cxp g) {
   public static final Codec<dgd> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               cxl.e.fieldOf("id").forGetter(dgd::a),
               azn.m.fieldOf("count").orElse(1).forGetter(dgd::b),
               ks.a.optionalFieldOf("components", ks.c).forGetter(dgd::c)
            )
            .apply($$0, dgd::new)
   );
   public static final zt<xg, dgd> b = zt.a(zr.b(mb.K), dgd::a, zr.h, dgd::b, ks.b, dgd::c, dgd::new);
   public static final zt<xg, Optional<dgd>> c = b.a(zr::a);

   public dgd(dhh $$0) {
      this($$0, 1);
   }

   public dgd(dhh $$0, int $$1) {
      this($$0.j().f(), $$1, ks.c);
   }

   public dgd(jq<cxl> $$0, int $$1, ks $$2) {
      this($$0, $$1, $$2, a($$0, $$1, $$2));
   }

   public dgd a(UnaryOperator<ks.a> $$0) {
      return new dgd(this.d, this.e, $$0.apply(ks.a()).a());
   }

   private static cxp a(jq<cxl> $$0, int $$1, ks $$2) {
      return new cxp($$0, $$1, $$2.c());
   }

   public boolean a(cxp $$0) {
      return $$0.a(this.d) && this.f.a($$0);
   }

   public jq<cxl> a() {
      return this.d;
   }

   public int b() {
      return this.e;
   }

   public ks c() {
      return this.f;
   }

   public cxp d() {
      return this.g;
   }
}
