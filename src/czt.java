import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.UnaryOperator;

public record czt(ix<ctj> d, int e, jz f, cto g) {
   public static final Codec<czt> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               le.h.r().fieldOf("id").forGetter(czt::a),
               axm.j.fieldOf("count").orElse(1).forGetter(czt::b),
               jz.a.optionalFieldOf("components", jz.c).forGetter(czt::c)
            )
            .apply($$0, czt::new)
   );
   public static final yv<wi, czt> b = yv.a(yt.b(lf.G), czt::a, yt.f, czt::b, jz.b, czt::c, czt::new);
   public static final yv<wi, Optional<czt>> c = b.a(yt::a);

   public czt(daw $$0) {
      this($$0, 1);
   }

   public czt(daw $$0, int $$1) {
      this($$0.q().n(), $$1, jz.c);
   }

   public czt(ix<ctj> $$0, int $$1, jz $$2) {
      this($$0, $$1, $$2, a($$0, $$1, $$2));
   }

   public czt a(UnaryOperator<jz.a> $$0) {
      return new czt(this.d, this.e, $$0.apply(jz.a()).a());
   }

   private static cto a(ix<ctj> $$0, int $$1, jz $$2) {
      return new cto($$0, $$1, $$2.c());
   }

   public boolean a(cto $$0) {
      return $$0.a(this.d) && this.f.a($$0);
   }

   public ix<ctj> a() {
      return this.d;
   }

   public int b() {
      return this.e;
   }

   public jz c() {
      return this.f;
   }

   public cto d() {
      return this.g;
   }
}
