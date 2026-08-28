import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.UnaryOperator;

public record djd(jg<dag> d, int e, kf f, dak g) {
   public static final Codec<djd> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dag.e.fieldOf("id").forGetter(djd::a),
               azg.m.fieldOf("count").orElse(1).forGetter(djd::b),
               kf.a.optionalFieldOf("components", kf.c).forGetter(djd::c)
            )
            .apply($$0, djd::new)
   );
   public static final ze<wp, djd> b = ze.a(dag.f, djd::a, zc.h, djd::b, kf.b, djd::c, djd::new);
   public static final ze<wp, Optional<djd>> c = b.a(zc::a);

   public djd(dki $$0) {
      this($$0, 1);
   }

   public djd(dki $$0, int $$1) {
      this($$0.h().e(), $$1, kf.c);
   }

   public djd(jg<dag> $$0, int $$1, kf $$2) {
      this($$0, $$1, $$2, a($$0, $$1, $$2));
   }

   public djd a(UnaryOperator<kf.a> $$0) {
      return new djd(this.d, this.e, $$0.apply(kf.a()).a());
   }

   private static dak a(jg<dag> $$0, int $$1, kf $$2) {
      return new dak($$0, $$1, $$2.d());
   }

   public boolean a(dak $$0) {
      return $$0.a(this.d) && this.f.a($$0);
   }

   public jg<dag> a() {
      return this.d;
   }

   public int b() {
      return this.e;
   }

   public kf c() {
      return this.f;
   }

   public dak d() {
      return this.g;
   }
}
