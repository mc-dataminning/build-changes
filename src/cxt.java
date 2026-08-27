import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.UnaryOperator;

public record cxt(il<cre> d, int e, jn f, crj g) {
   public static final Codec<cxt> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               kr.h.r().fieldOf("id").forGetter(cxt::a),
               aws.a(aws.j, "count", Integer.valueOf(1)).forGetter(cxt::b),
               aws.a(jn.a, "components", jn.c).forGetter(cxt::c)
            )
            .apply($$0, cxt::new)
   );
   public static final ye<vr, cxt> b = ye.a(yc.b(ks.F), cxt::a, yc.f, cxt::b, jn.b, cxt::c, cxt::new);
   public static final ye<vr, Optional<cxt>> c = b.a(yc::a);

   public cxt(cyw $$0) {
      this($$0, 1);
   }

   public cxt(cyw $$0, int $$1) {
      this($$0.p().n(), $$1, jn.c);
   }

   public cxt(il<cre> $$0, int $$1, jn $$2) {
      this($$0, $$1, $$2, a($$0, $$1, $$2));
   }

   public cxt a(UnaryOperator<jn.a> $$0) {
      return new cxt(this.d, this.e, $$0.apply(jn.a()).a());
   }

   private static crj a(il<cre> $$0, int $$1, jn $$2) {
      return new crj($$0, $$1, $$2.c());
   }

   public boolean a(crj $$0) {
      return $$0.a(this.d) && this.f.a($$0);
   }

   public il<cre> a() {
      return this.d;
   }

   public int b() {
      return this.e;
   }

   public jn c() {
      return this.f;
   }

   public crj d() {
      return this.g;
   }
}
