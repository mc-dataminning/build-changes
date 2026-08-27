import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.UnaryOperator;

public record cyq(iv<cry> d, int e, jx f, csd g) {
   public static final Codec<cyq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               lc.h.r().fieldOf("id").forGetter(cyq::a), axe.j.fieldOf("count").orElse(1).forGetter(cyq::b), axe.a(jx.a, "components", jx.c).forGetter(cyq::c)
            )
            .apply($$0, cyq::new)
   );
   public static final yq<wd, cyq> b = yq.a(yo.b(ld.G), cyq::a, yo.f, cyq::b, jx.b, cyq::c, cyq::new);
   public static final yq<wd, Optional<cyq>> c = b.a(yo::a);

   public cyq(czt $$0) {
      this($$0, 1);
   }

   public cyq(czt $$0, int $$1) {
      this($$0.p().n(), $$1, jx.c);
   }

   public cyq(iv<cry> $$0, int $$1, jx $$2) {
      this($$0, $$1, $$2, a($$0, $$1, $$2));
   }

   public cyq a(UnaryOperator<jx.a> $$0) {
      return new cyq(this.d, this.e, $$0.apply(jx.a()).a());
   }

   private static csd a(iv<cry> $$0, int $$1, jx $$2) {
      return new csd($$0, $$1, $$2.c());
   }

   public boolean a(csd $$0) {
      return $$0.a(this.d) && this.f.a($$0);
   }

   public iv<cry> a() {
      return this.d;
   }

   public int b() {
      return this.e;
   }

   public jx c() {
      return this.f;
   }

   public csd d() {
      return this.g;
   }
}
