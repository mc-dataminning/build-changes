import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.UnaryOperator;

public record das(ji<cui> d, int e, kk f, cun g) {
   public static final Codec<das> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               cun.a.fieldOf("id").forGetter(das::a),
               ayf.l.fieldOf("count").orElse(1).forGetter(das::b),
               kk.a.optionalFieldOf("components", kk.c).forGetter(das::c)
            )
            .apply($$0, das::new)
   );
   public static final zm<wz, das> b = zm.a(zk.b(lq.G), das::a, zk.g, das::b, kk.b, das::c, das::new);
   public static final zm<wz, Optional<das>> c = b.a(zk::a);

   public das(dbv $$0) {
      this($$0, 1);
   }

   public das(dbv $$0, int $$1) {
      this($$0.r().o(), $$1, kk.c);
   }

   public das(ji<cui> $$0, int $$1, kk $$2) {
      this($$0, $$1, $$2, a($$0, $$1, $$2));
   }

   public das a(UnaryOperator<kk.a> $$0) {
      return new das(this.d, this.e, $$0.apply(kk.a()).a());
   }

   private static cun a(ji<cui> $$0, int $$1, kk $$2) {
      return new cun($$0, $$1, $$2.c());
   }

   public boolean a(cun $$0) {
      return $$0.a(this.d) && this.f.a($$0);
   }

   public ji<cui> a() {
      return this.d;
   }

   public int b() {
      return this.e;
   }

   public kk c() {
      return this.f;
   }

   public cun d() {
      return this.g;
   }
}
