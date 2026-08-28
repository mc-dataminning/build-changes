import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.UnaryOperator;

public record dhr(je<cyu> d, int e, kd f, cyy g) {
   public static final Codec<dhr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               cyu.e.fieldOf("id").forGetter(dhr::a),
               ayu.m.fieldOf("count").orElse(1).forGetter(dhr::b),
               kd.a.optionalFieldOf("components", kd.c).forGetter(dhr::c)
            )
            .apply($$0, dhr::new)
   );
   public static final yw<wj, dhr> b = yw.a(cyu.f, dhr::a, yu.h, dhr::b, kd.b, dhr::c, dhr::new);
   public static final yw<wj, Optional<dhr>> c = b.a(yu::a);

   public dhr(diu $$0) {
      this($$0, 1);
   }

   public dhr(diu $$0, int $$1) {
      this($$0.h().e(), $$1, kd.c);
   }

   public dhr(je<cyu> $$0, int $$1, kd $$2) {
      this($$0, $$1, $$2, a($$0, $$1, $$2));
   }

   public dhr a(UnaryOperator<kd.a> $$0) {
      return new dhr(this.d, this.e, $$0.apply(kd.a()).a());
   }

   private static cyy a(je<cyu> $$0, int $$1, kd $$2) {
      return new cyy($$0, $$1, $$2.c());
   }

   public boolean a(cyy $$0) {
      return $$0.a(this.d) && this.f.a($$0);
   }

   public je<cyu> a() {
      return this.d;
   }

   public int b() {
      return this.e;
   }

   public kd c() {
      return this.f;
   }

   public cyy d() {
      return this.g;
   }
}
