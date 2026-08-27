import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.UnaryOperator;

public record daw(ja<cuc> d, int e, kc f, cuh g) {
   public static final Codec<daw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               lh.h.r().fieldOf("id").forGetter(daw::a), axu.j.fieldOf("count").orElse(1).forGetter(daw::b), axu.a(kc.a, "components", kc.c).forGetter(daw::c)
            )
            .apply($$0, daw::new)
   );
   public static final zc<wp, daw> b = zc.a(za.b(li.G), daw::a, za.g, daw::b, kc.b, daw::c, daw::new);
   public static final zc<wp, Optional<daw>> c = b.a(za::a);

   public daw(dbz $$0) {
      this($$0, 1);
   }

   public daw(dbz $$0, int $$1) {
      this($$0.q().n(), $$1, kc.c);
   }

   public daw(ja<cuc> $$0, int $$1, kc $$2) {
      this($$0, $$1, $$2, a($$0, $$1, $$2));
   }

   public daw a(UnaryOperator<kc.a> $$0) {
      return new daw(this.d, this.e, $$0.apply(kc.a()).a());
   }

   private static cuh a(ja<cuc> $$0, int $$1, kc $$2) {
      return new cuh($$0, $$1, $$2.c());
   }

   public boolean a(cuh $$0) {
      return $$0.a(this.d) && this.f.a($$0);
   }

   public ja<cuc> a() {
      return this.d;
   }

   public int b() {
      return this.e;
   }

   public kc c() {
      return this.f;
   }

   public cuh d() {
      return this.g;
   }
}
