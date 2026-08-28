import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public record dvf(Optional<cwk> d, Optional<cwk> e, Optional<cwk> f, Optional<cwk> g) {
   public static final dvf a = new dvf(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
   public static final Codec<dvf> b = mb.g.q().sizeLimitedListOf(4).xmap(dvf::new, dvf::a);
   public static final yn<wa, dvf> c = yl.a(mc.K).a(yl.c(4)).a(dvf::new, dvf::a);

   private dvf(List<cwk> $$0) {
      this(a($$0, 0), a($$0, 1), a($$0, 2), a($$0, 3));
   }

   public dvf(cwk $$0, cwk $$1, cwk $$2, cwk $$3) {
      this(List.of($$0, $$1, $$2, $$3));
   }

   private static Optional<cwk> a(List<cwk> $$0, int $$1) {
      if ($$1 >= $$0.size()) {
         return Optional.empty();
      } else {
         cwk $$2 = $$0.get($$1);
         return $$2 == cws.rs ? Optional.empty() : Optional.of($$2);
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

   public List<cwk> a() {
      return Stream.of(this.d, this.e, this.f, this.g).map($$0 -> $$0.orElse(cws.rs)).toList();
   }

   public static dvf b(@Nullable tq $$0) {
      return $$0 != null && $$0.e("sherds") ? b.parse(ue.a, $$0.c("sherds")).result().orElse(a) : a;
   }

   public Optional<cwk> b() {
      return this.d;
   }

   public Optional<cwk> c() {
      return this.e;
   }

   public Optional<cwk> d() {
      return this.f;
   }

   public Optional<cwk> e() {
      return this.g;
   }
}
