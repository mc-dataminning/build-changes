import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public record due(Optional<cwi> d, Optional<cwi> e, Optional<cwi> f, Optional<cwi> g) {
   public static final due a = new due(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
   public static final Codec<due> b = lz.g.q().sizeLimitedListOf(4).xmap(due::new, due::a);
   public static final zh<wu, due> c = zf.a(ma.K).a(zf.c(4)).a(due::new, due::a);

   private due(List<cwi> $$0) {
      this(a($$0, 0), a($$0, 1), a($$0, 2), a($$0, 3));
   }

   public due(cwi $$0, cwi $$1, cwi $$2, cwi $$3) {
      this(List.of($$0, $$1, $$2, $$3));
   }

   private static Optional<cwi> a(List<cwi> $$0, int $$1) {
      if ($$1 >= $$0.size()) {
         return Optional.empty();
      } else {
         cwi $$2 = $$0.get($$1);
         return $$2 == cwq.qM ? Optional.empty() : Optional.of($$2);
      }
   }

   public ul a(ul $$0) {
      if (this.equals(a)) {
         return $$0;
      } else {
         $$0.a("sherds", (vi)b.encodeStart(uz.a, this).getOrThrow());
         return $$0;
      }
   }

   public List<cwi> a() {
      return Stream.of(this.d, this.e, this.f, this.g).map($$0 -> $$0.orElse(cwq.qM)).toList();
   }

   public static due b(@Nullable ul $$0) {
      return $$0 != null && $$0.e("sherds") ? b.parse(uz.a, $$0.c("sherds")).result().orElse(a) : a;
   }

   public Optional<cwi> b() {
      return this.d;
   }

   public Optional<cwi> c() {
      return this.e;
   }

   public Optional<cwi> d() {
      return this.f;
   }

   public Optional<cwi> e() {
      return this.g;
   }
}
