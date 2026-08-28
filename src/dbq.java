import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.UnaryOperator;

public record dbq(jm<cuj> d, int e, ko f, cuo g) {
   public static final Codec<dbq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               cuo.a.fieldOf("id").forGetter(dbq::a),
               axv.l.fieldOf("count").orElse(1).forGetter(dbq::b),
               ko.a.optionalFieldOf("components", ko.c).forGetter(dbq::c)
            )
            .apply($$0, dbq::new)
   );
   public static final yw<wj, dbq> b = yw.a(yu.b(lu.K), dbq::a, yu.g, dbq::b, ko.b, dbq::c, dbq::new);
   public static final yw<wj, Optional<dbq>> c = b.a(yu::a);

   public dbq(dct $$0) {
      this($$0, 1);
   }

   public dbq(dct $$0, int $$1) {
      this($$0.r().o(), $$1, ko.c);
   }

   public dbq(jm<cuj> $$0, int $$1, ko $$2) {
      this($$0, $$1, $$2, a($$0, $$1, $$2));
   }

   public dbq a(UnaryOperator<ko.a> $$0) {
      return new dbq(this.d, this.e, $$0.apply(ko.a()).a());
   }

   private static cuo a(jm<cuj> $$0, int $$1, ko $$2) {
      return new cuo($$0, $$1, $$2.c());
   }

   public boolean a(cuo $$0) {
      return $$0.a(this.d) && this.f.a($$0);
   }

   public jm<cuj> a() {
      return this.d;
   }

   public int b() {
      return this.e;
   }

   public ko c() {
      return this.f;
   }

   public cuo d() {
      return this.g;
   }
}
