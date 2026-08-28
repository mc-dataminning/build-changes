import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public record dvz(Optional<cxd> d, Optional<cxd> e, Optional<cxd> f, Optional<cxd> g) {
   public static final dvz a = new dvz(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
   public static final Codec<dvz> b = mb.g.q().sizeLimitedListOf(4).xmap(dvz::new, dvz::a);
   public static final yn<wa, dvz> c = yl.a(mc.K).a(yl.c(4)).a(dvz::new, dvz::a);

   private dvz(List<cxd> $$0) {
      this(a($$0, 0), a($$0, 1), a($$0, 2), a($$0, 3));
   }

   public dvz(cxd $$0, cxd $$1, cxd $$2, cxd $$3) {
      this(List.of($$0, $$1, $$2, $$3));
   }

   private static Optional<cxd> a(List<cxd> $$0, int $$1) {
      if ($$1 >= $$0.size()) {
         return Optional.empty();
      } else {
         cxd $$2 = $$0.get($$1);
         return $$2 == cxl.ru ? Optional.empty() : Optional.of($$2);
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

   public List<cxd> a() {
      return Stream.of(this.d, this.e, this.f, this.g).map($$0 -> $$0.orElse(cxl.ru)).toList();
   }

   public static dvz b(@Nullable tq $$0) {
      return $$0 != null && $$0.e("sherds") ? b.parse(ue.a, $$0.c("sherds")).result().orElse(a) : a;
   }

   public Optional<cxd> b() {
      return this.d;
   }

   public Optional<cxd> c() {
      return this.e;
   }

   public Optional<cxd> d() {
      return this.f;
   }

   public Optional<cxd> e() {
      return this.g;
   }
}
