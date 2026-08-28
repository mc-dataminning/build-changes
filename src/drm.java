import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public record drm(Optional<cul> d, Optional<cul> e, Optional<cul> f, Optional<cul> g) {
   public static final drm a = new drm(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
   public static final Codec<drm> b = lt.g.r().sizeLimitedListOf(4).xmap(drm::new, drm::a);
   public static final yx<wk, drm> c = yv.a(lu.K).a(yv.c(4)).a(drm::new, drm::a);

   private drm(List<cul> $$0) {
      this(a($$0, 0), a($$0, 1), a($$0, 2), a($$0, 3));
   }

   public drm(cul $$0, cul $$1, cul $$2, cul $$3) {
      this(List.of($$0, $$1, $$2, $$3));
   }

   private static Optional<cul> a(List<cul> $$0, int $$1) {
      if ($$1 >= $$0.size()) {
         return Optional.empty();
      } else {
         cul $$2 = $$0.get($$1);
         return $$2 == cut.qL ? Optional.empty() : Optional.of($$2);
      }
   }

   public ub a(ub $$0) {
      if (this.equals(a)) {
         return $$0;
      } else {
         $$0.a("sherds", (uy)b.encodeStart(up.a, this).getOrThrow());
         return $$0;
      }
   }

   public List<cul> a() {
      return Stream.of(this.d, this.e, this.f, this.g).map($$0 -> $$0.orElse(cut.qL)).toList();
   }

   public static drm b(@Nullable ub $$0) {
      return $$0 != null && $$0.e("sherds") ? b.parse(up.a, $$0.c("sherds")).result().orElse(a) : a;
   }

   public Optional<cul> b() {
      return this.d;
   }

   public Optional<cul> c() {
      return this.e;
   }

   public Optional<cul> d() {
      return this.f;
   }

   public Optional<cul> e() {
      return this.g;
   }
}
