import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.UnaryOperator;

public record ddq(jp<cvt> d, int e, kr f, cvx g) {
   public static final Codec<ddq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               cvx.a.fieldOf("id").forGetter(ddq::a),
               ays.m.fieldOf("count").orElse(1).forGetter(ddq::b),
               kr.a.optionalFieldOf("components", kr.c).forGetter(ddq::c)
            )
            .apply($$0, ddq::new)
   );
   public static final zf<ws, ddq> b = zf.a(zd.b(ly.K), ddq::a, zd.h, ddq::b, kr.b, ddq::c, ddq::new);
   public static final zf<ws, Optional<ddq>> c = b.a(zd::a);

   public ddq(deu $$0) {
      this($$0, 1);
   }

   public ddq(deu $$0, int $$1) {
      this($$0.j().f(), $$1, kr.c);
   }

   public ddq(jp<cvt> $$0, int $$1, kr $$2) {
      this($$0, $$1, $$2, a($$0, $$1, $$2));
   }

   public ddq a(UnaryOperator<kr.a> $$0) {
      return new ddq(this.d, this.e, $$0.apply(kr.a()).a());
   }

   private static cvx a(jp<cvt> $$0, int $$1, kr $$2) {
      return new cvx($$0, $$1, $$2.c());
   }

   public boolean a(cvx $$0) {
      return $$0.a(this.d) && this.f.a($$0);
   }

   public jp<cvt> a() {
      return this.d;
   }

   public int b() {
      return this.e;
   }

   public kr c() {
      return this.f;
   }

   public cvx d() {
      return this.g;
   }
}
