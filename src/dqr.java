import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public record dqr(Optional<ctv> d, Optional<ctv> e, Optional<ctv> f, Optional<ctv> g) {
   public static final dqr a = new dqr(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
   public static final Codec<dqr> b = lq.g.r().sizeLimitedListOf(4).xmap(dqr::new, dqr::a);
   public static final ys<wf, dqr> c = yq.a(lr.K).a(yq.c(4)).a(dqr::new, dqr::a);

   private dqr(List<ctv> $$0) {
      this(a($$0, 0), a($$0, 1), a($$0, 2), a($$0, 3));
   }

   public dqr(ctv $$0, ctv $$1, ctv $$2, ctv $$3) {
      this(List.of($$0, $$1, $$2, $$3));
   }

   private static Optional<ctv> a(List<ctv> $$0, int $$1) {
      if ($$1 >= $$0.size()) {
         return Optional.empty();
      } else {
         ctv $$2 = $$0.get($$1);
         return $$2 == cud.qL ? Optional.empty() : Optional.of($$2);
      }
   }

   public tx a(tx $$0) {
      if (this.equals(a)) {
         return $$0;
      } else {
         $$0.a("sherds", (uu)b.encodeStart(ul.a, this).getOrThrow());
         return $$0;
      }
   }

   public List<ctv> a() {
      return Stream.of(this.d, this.e, this.f, this.g).map($$0 -> $$0.orElse(cud.qL)).toList();
   }

   public static dqr b(@Nullable tx $$0) {
      return $$0 != null && $$0.e("sherds") ? b.parse(ul.a, $$0.c("sherds")).result().orElse(a) : a;
   }

   public Optional<ctv> b() {
      return this.d;
   }

   public Optional<ctv> c() {
      return this.e;
   }

   public Optional<ctv> d() {
      return this.f;
   }

   public Optional<ctv> e() {
      return this.g;
   }
}
