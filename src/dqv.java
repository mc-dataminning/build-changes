import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public record dqv(Optional<cty> d, Optional<cty> e, Optional<cty> f, Optional<cty> g) {
   public static final dqv a = new dqv(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
   public static final Codec<dqv> b = lq.g.r().sizeLimitedListOf(4).xmap(dqv::new, dqv::a);
   public static final ys<wf, dqv> c = yq.a(lr.K).a(yq.c(4)).a(dqv::new, dqv::a);

   private dqv(List<cty> $$0) {
      this(a($$0, 0), a($$0, 1), a($$0, 2), a($$0, 3));
   }

   public dqv(cty $$0, cty $$1, cty $$2, cty $$3) {
      this(List.of($$0, $$1, $$2, $$3));
   }

   private static Optional<cty> a(List<cty> $$0, int $$1) {
      if ($$1 >= $$0.size()) {
         return Optional.empty();
      } else {
         cty $$2 = $$0.get($$1);
         return $$2 == cug.qL ? Optional.empty() : Optional.of($$2);
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

   public List<cty> a() {
      return Stream.of(this.d, this.e, this.f, this.g).map($$0 -> $$0.orElse(cug.qL)).toList();
   }

   public static dqv b(@Nullable tx $$0) {
      return $$0 != null && $$0.e("sherds") ? b.parse(ul.a, $$0.c("sherds")).result().orElse(a) : a;
   }

   public Optional<cty> b() {
      return this.d;
   }

   public Optional<cty> c() {
      return this.e;
   }

   public Optional<cty> d() {
      return this.f;
   }

   public Optional<cty> e() {
      return this.g;
   }
}
