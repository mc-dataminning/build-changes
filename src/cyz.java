import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.UnaryOperator;

public record cyz(iw<csu> d, int e, jy f, csz g) {
   public static final Codec<cyz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ld.h.r().fieldOf("id").forGetter(cyz::a), axh.j.fieldOf("count").orElse(1).forGetter(cyz::b), axh.a(jy.a, "components", jy.c).forGetter(cyz::c)
            )
            .apply($$0, cyz::new)
   );
   public static final ys<wf, cyz> b = ys.a(yq.b(le.G), cyz::a, yq.f, cyz::b, jy.b, cyz::c, cyz::new);
   public static final ys<wf, Optional<cyz>> c = b.a(yq::a);

   public cyz(dac $$0) {
      this($$0, 1);
   }

   public cyz(dac $$0, int $$1) {
      this($$0.q().n(), $$1, jy.c);
   }

   public cyz(iw<csu> $$0, int $$1, jy $$2) {
      this($$0, $$1, $$2, a($$0, $$1, $$2));
   }

   public cyz a(UnaryOperator<jy.a> $$0) {
      return new cyz(this.d, this.e, $$0.apply(jy.a()).a());
   }

   private static csz a(iw<csu> $$0, int $$1, jy $$2) {
      return new csz($$0, $$1, $$2.c());
   }

   public boolean a(csz $$0) {
      return $$0.a(this.d) && this.f.a($$0);
   }

   public iw<csu> a() {
      return this.d;
   }

   public int b() {
      return this.e;
   }

   public jy c() {
      return this.f;
   }

   public csz d() {
      return this.g;
   }
}
