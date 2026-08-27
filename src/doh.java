import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public record doh(Optional<cry> d, Optional<cry> e, Optional<cry> f, Optional<cry> g) {
   public static final doh a = new doh(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
   public static final Codec<doh> b = axe.a(lc.h.q().listOf(), 4).xmap(doh::new, doh::a);
   public static final yq<wd, doh> c = yo.a(ld.G).a(yo.c(4)).a(doh::new, doh::a);

   private doh(List<cry> $$0) {
      this(a($$0, 0), a($$0, 1), a($$0, 2), a($$0, 3));
   }

   public doh(cry $$0, cry $$1, cry $$2, cry $$3) {
      this(List.of($$0, $$1, $$2, $$3));
   }

   private static Optional<cry> a(List<cry> $$0, int $$1) {
      if ($$1 >= $$0.size()) {
         return Optional.empty();
      } else {
         cry $$2 = $$0.get($$1);
         return $$2 == csg.qL ? Optional.empty() : Optional.of($$2);
      }
   }

   public ty a(ty $$0) {
      if (this.equals(a)) {
         return $$0;
      } else {
         $$0.a("sherds", ac.a(b.encodeStart(um.a, this), IllegalStateException::new));
         return $$0;
      }
   }

   public List<cry> a() {
      return Stream.of(this.d, this.e, this.f, this.g).map($$0 -> $$0.orElse(csg.qL)).toList();
   }

   public static doh b(@Nullable ty $$0) {
      return $$0 != null && $$0.e("sherds") ? b.parse(um.a, $$0.c("sherds")).result().orElse(a) : a;
   }

   public Optional<cry> b() {
      return this.d;
   }

   public Optional<cry> c() {
      return this.e;
   }

   public Optional<cry> d() {
      return this.f;
   }

   public Optional<cry> e() {
      return this.g;
   }
}
