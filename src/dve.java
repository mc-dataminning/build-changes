import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public record dve(Optional<cwj> d, Optional<cwj> e, Optional<cwj> f, Optional<cwj> g) {
   public static final dve a = new dve(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
   public static final Codec<dve> b = mb.g.q().sizeLimitedListOf(4).xmap(dve::new, dve::a);
   public static final ym<vz, dve> c = yk.a(mc.K).a(yk.c(4)).a(dve::new, dve::a);

   private dve(List<cwj> $$0) {
      this(a($$0, 0), a($$0, 1), a($$0, 2), a($$0, 3));
   }

   public dve(cwj $$0, cwj $$1, cwj $$2, cwj $$3) {
      this(List.of($$0, $$1, $$2, $$3));
   }

   private static Optional<cwj> a(List<cwj> $$0, int $$1) {
      if ($$1 >= $$0.size()) {
         return Optional.empty();
      } else {
         cwj $$2 = $$0.get($$1);
         return $$2 == cwr.rs ? Optional.empty() : Optional.of($$2);
      }
   }

   public tq a(tq $$0) {
      if (this.equals(a)) {
         return $$0;
      } else {
         $$0.a("sherds", (un)b.encodeStart(ue.a, this).getOrThrow());
         return $$0;
      }
   }

   public List<cwj> a() {
      return Stream.of(this.d, this.e, this.f, this.g).map($$0 -> $$0.orElse(cwr.rs)).toList();
   }

   public static dve b(@Nullable tq $$0) {
      return $$0 != null && $$0.e("sherds") ? b.parse(ue.a, $$0.c("sherds")).result().orElse(a) : a;
   }

   public Optional<cwj> b() {
      return this.d;
   }

   public Optional<cwj> c() {
      return this.e;
   }

   public Optional<cwj> d() {
      return this.f;
   }

   public Optional<cwj> e() {
      return this.g;
   }
}
