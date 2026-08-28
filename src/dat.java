import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.UnaryOperator;

public record dat(ji<cuj> d, int e, kk f, cuo g) {
   public static final Codec<dat> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               cuo.a.fieldOf("id").forGetter(dat::a),
               ayg.l.fieldOf("count").orElse(1).forGetter(dat::b),
               kk.a.optionalFieldOf("components", kk.c).forGetter(dat::c)
            )
            .apply($$0, dat::new)
   );
   public static final zm<wz, dat> b = zm.a(zk.b(lq.G), dat::a, zk.g, dat::b, kk.b, dat::c, dat::new);
   public static final zm<wz, Optional<dat>> c = b.a(zk::a);

   public dat(dbw $$0) {
      this($$0, 1);
   }

   public dat(dbw $$0, int $$1) {
      this($$0.r().o(), $$1, kk.c);
   }

   public dat(ji<cuj> $$0, int $$1, kk $$2) {
      this($$0, $$1, $$2, a($$0, $$1, $$2));
   }

   public dat a(UnaryOperator<kk.a> $$0) {
      return new dat(this.d, this.e, $$0.apply(kk.a()).a());
   }

   private static cuo a(ji<cuj> $$0, int $$1, kk $$2) {
      return new cuo($$0, $$1, $$2.c());
   }

   public boolean a(cuo $$0) {
      return $$0.a(this.d) && this.f.a($$0);
   }

   public ji<cuj> a() {
      return this.d;
   }

   public int b() {
      return this.e;
   }

   public kk c() {
      return this.f;
   }

   public cuo d() {
      return this.g;
   }
}
