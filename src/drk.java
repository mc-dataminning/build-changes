import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public record drk(Optional<cuj> d, Optional<cuj> e, Optional<cuj> f, Optional<cuj> g) {
   public static final drk a = new drk(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
   public static final Codec<drk> b = lt.g.r().sizeLimitedListOf(4).xmap(drk::new, drk::a);
   public static final yw<wj, drk> c = yu.a(lu.K).a(yu.c(4)).a(drk::new, drk::a);

   private drk(List<cuj> $$0) {
      this(a($$0, 0), a($$0, 1), a($$0, 2), a($$0, 3));
   }

   public drk(cuj $$0, cuj $$1, cuj $$2, cuj $$3) {
      this(List.of($$0, $$1, $$2, $$3));
   }

   private static Optional<cuj> a(List<cuj> $$0, int $$1) {
      if ($$1 >= $$0.size()) {
         return Optional.empty();
      } else {
         cuj $$2 = $$0.get($$1);
         return $$2 == cur.qL ? Optional.empty() : Optional.of($$2);
      }
   }

   public ua a(ua $$0) {
      if (this.equals(a)) {
         return $$0;
      } else {
         $$0.a("sherds", (ux)b.encodeStart(uo.a, this).getOrThrow());
         return $$0;
      }
   }

   public List<cuj> a() {
      return Stream.of(this.d, this.e, this.f, this.g).map($$0 -> $$0.orElse(cur.qL)).toList();
   }

   public static drk b(@Nullable ua $$0) {
      return $$0 != null && $$0.e("sherds") ? b.parse(uo.a, $$0.c("sherds")).result().orElse(a) : a;
   }

   public Optional<cuj> b() {
      return this.d;
   }

   public Optional<cuj> c() {
      return this.e;
   }

   public Optional<cuj> d() {
      return this.f;
   }

   public Optional<cuj> e() {
      return this.g;
   }
}
