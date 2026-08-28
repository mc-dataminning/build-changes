import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.UnaryOperator;

public record dbs(jm<cul> d, int e, ko f, cuq g) {
   public static final Codec<dbs> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               cuq.a.fieldOf("id").forGetter(dbs::a),
               axw.l.fieldOf("count").orElse(1).forGetter(dbs::b),
               ko.a.optionalFieldOf("components", ko.c).forGetter(dbs::c)
            )
            .apply($$0, dbs::new)
   );
   public static final yx<wk, dbs> b = yx.a(yv.b(lu.K), dbs::a, yv.g, dbs::b, ko.b, dbs::c, dbs::new);
   public static final yx<wk, Optional<dbs>> c = b.a(yv::a);

   public dbs(dcv $$0) {
      this($$0, 1);
   }

   public dbs(dcv $$0, int $$1) {
      this($$0.r().o(), $$1, ko.c);
   }

   public dbs(jm<cul> $$0, int $$1, ko $$2) {
      this($$0, $$1, $$2, a($$0, $$1, $$2));
   }

   public dbs a(UnaryOperator<ko.a> $$0) {
      return new dbs(this.d, this.e, $$0.apply(ko.a()).a());
   }

   private static cuq a(jm<cul> $$0, int $$1, ko $$2) {
      return new cuq($$0, $$1, $$2.c());
   }

   public boolean a(cuq $$0) {
      return $$0.a(this.d) && this.f.a($$0);
   }

   public jm<cul> a() {
      return this.d;
   }

   public int b() {
      return this.e;
   }

   public ko c() {
      return this.f;
   }

   public cuq d() {
      return this.g;
   }
}
