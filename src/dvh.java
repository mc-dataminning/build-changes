import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public record dvh(Optional<cwm> d, Optional<cwm> e, Optional<cwm> f, Optional<cwm> g) {
   public static final dvh a = new dvh(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
   public static final Codec<dvh> b = mb.g.q().sizeLimitedListOf(4).xmap(dvh::new, dvh::a);
   public static final yn<wa, dvh> c = yl.a(mc.K).a(yl.c(4)).a(dvh::new, dvh::a);

   private dvh(List<cwm> $$0) {
      this(a($$0, 0), a($$0, 1), a($$0, 2), a($$0, 3));
   }

   public dvh(cwm $$0, cwm $$1, cwm $$2, cwm $$3) {
      this(List.of($$0, $$1, $$2, $$3));
   }

   private static Optional<cwm> a(List<cwm> $$0, int $$1) {
      if ($$1 >= $$0.size()) {
         return Optional.empty();
      } else {
         cwm $$2 = $$0.get($$1);
         return $$2 == cwu.rs ? Optional.empty() : Optional.of($$2);
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

   public List<cwm> a() {
      return Stream.of(this.d, this.e, this.f, this.g).map($$0 -> $$0.orElse(cwu.rs)).toList();
   }

   public static dvh b(@Nullable tq $$0) {
      return $$0 != null && $$0.e("sherds") ? b.parse(ue.a, $$0.c("sherds")).result().orElse(a) : a;
   }

   public Optional<cwm> b() {
      return this.d;
   }

   public Optional<cwm> c() {
      return this.e;
   }

   public Optional<cwm> d() {
      return this.f;
   }

   public Optional<cwm> e() {
      return this.g;
   }
}
