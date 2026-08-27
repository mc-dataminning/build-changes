import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public record dpk(Optional<ctj> d, Optional<ctj> e, Optional<ctj> f, Optional<ctj> g) {
   public static final dpk a = new dpk(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
   public static final Codec<dpk> b = le.h.q().sizeLimitedListOf(4).xmap(dpk::new, dpk::a);
   public static final yv<wi, dpk> c = yt.a(lf.G).a(yt.c(4)).a(dpk::new, dpk::a);

   private dpk(List<ctj> $$0) {
      this(a($$0, 0), a($$0, 1), a($$0, 2), a($$0, 3));
   }

   public dpk(ctj $$0, ctj $$1, ctj $$2, ctj $$3) {
      this(List.of($$0, $$1, $$2, $$3));
   }

   private static Optional<ctj> a(List<ctj> $$0, int $$1) {
      if ($$1 >= $$0.size()) {
         return Optional.empty();
      } else {
         ctj $$2 = $$0.get($$1);
         return $$2 == ctr.qL ? Optional.empty() : Optional.of($$2);
      }
   }

   public ud a(ud $$0) {
      if (this.equals(a)) {
         return $$0;
      } else {
         $$0.a("sherds", (va)b.encodeStart(ur.a, this).getOrThrow());
         return $$0;
      }
   }

   public List<ctj> a() {
      return Stream.of(this.d, this.e, this.f, this.g).map($$0 -> $$0.orElse(ctr.qL)).toList();
   }

   public static dpk b(@Nullable ud $$0) {
      return $$0 != null && $$0.e("sherds") ? b.parse(ur.a, $$0.c("sherds")).result().orElse(a) : a;
   }

   public Optional<ctj> b() {
      return this.d;
   }

   public Optional<ctj> c() {
      return this.e;
   }

   public Optional<ctj> d() {
      return this.f;
   }

   public Optional<ctj> e() {
      return this.g;
   }
}
