import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public record drj(Optional<cuc> d, Optional<cuc> e, Optional<cuc> f, Optional<cuc> g) {
   public static final drj a = new drj(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
   public static final Codec<drj> b = axu.a(lh.h.q().listOf(), 4).xmap(drj::new, drj::a);
   public static final zc<wp, drj> c = za.a(li.G).a(za.c(4)).a(drj::new, drj::a);

   private drj(List<cuc> $$0) {
      this(a($$0, 0), a($$0, 1), a($$0, 2), a($$0, 3));
   }

   public drj(cuc $$0, cuc $$1, cuc $$2, cuc $$3) {
      this(List.of($$0, $$1, $$2, $$3));
   }

   private static Optional<cuc> a(List<cuc> $$0, int $$1) {
      if ($$1 >= $$0.size()) {
         return Optional.empty();
      } else {
         cuc $$2 = $$0.get($$1);
         return $$2 == cuk.si ? Optional.empty() : Optional.of($$2);
      }
   }

   public uk a(uk $$0) {
      if (this.equals(a)) {
         return $$0;
      } else {
         $$0.a("sherds", ad.a(b.encodeStart(uy.a, this), IllegalStateException::new));
         return $$0;
      }
   }

   public List<cuc> a() {
      return Stream.of(this.d, this.e, this.f, this.g).map($$0 -> $$0.orElse(cuk.si)).toList();
   }

   public static drj b(@Nullable uk $$0) {
      return $$0 != null && $$0.e("sherds") ? b.parse(uy.a, $$0.c("sherds")).result().orElse(a) : a;
   }

   public Optional<cuc> b() {
      return this.d;
   }

   public Optional<cuc> c() {
      return this.e;
   }

   public Optional<cuc> d() {
      return this.f;
   }

   public Optional<cuc> e() {
      return this.g;
   }
}
