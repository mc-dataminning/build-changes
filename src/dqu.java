import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public record dqu(Optional<ctx> d, Optional<ctx> e, Optional<ctx> f, Optional<ctx> g) {
   public static final dqu a = new dqu(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
   public static final Codec<dqu> b = lq.g.r().sizeLimitedListOf(4).xmap(dqu::new, dqu::a);
   public static final ys<wf, dqu> c = yq.a(lr.K).a(yq.c(4)).a(dqu::new, dqu::a);

   private dqu(List<ctx> $$0) {
      this(a($$0, 0), a($$0, 1), a($$0, 2), a($$0, 3));
   }

   public dqu(ctx $$0, ctx $$1, ctx $$2, ctx $$3) {
      this(List.of($$0, $$1, $$2, $$3));
   }

   private static Optional<ctx> a(List<ctx> $$0, int $$1) {
      if ($$1 >= $$0.size()) {
         return Optional.empty();
      } else {
         ctx $$2 = $$0.get($$1);
         return $$2 == cuf.qL ? Optional.empty() : Optional.of($$2);
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

   public List<ctx> a() {
      return Stream.of(this.d, this.e, this.f, this.g).map($$0 -> $$0.orElse(cuf.qL)).toList();
   }

   public static dqu b(@Nullable tx $$0) {
      return $$0 != null && $$0.e("sherds") ? b.parse(ul.a, $$0.c("sherds")).result().orElse(a) : a;
   }

   public Optional<ctx> b() {
      return this.d;
   }

   public Optional<ctx> c() {
      return this.e;
   }

   public Optional<ctx> d() {
      return this.f;
   }

   public Optional<ctx> e() {
      return this.g;
   }
}
