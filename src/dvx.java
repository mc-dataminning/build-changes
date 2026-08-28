import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public record dvx(Optional<cxc> d, Optional<cxc> e, Optional<cxc> f, Optional<cxc> g) {
   public static final dvx a = new dvx(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
   public static final Codec<dvx> b = ma.g.q().sizeLimitedListOf(4).xmap(dvx::new, dvx::a);
   public static final zi<wv, dvx> c = zg.a(mb.K).a(zg.c(4)).a(dvx::new, dvx::a);

   private dvx(List<cxc> $$0) {
      this(a($$0, 0), a($$0, 1), a($$0, 2), a($$0, 3));
   }

   public dvx(cxc $$0, cxc $$1, cxc $$2, cxc $$3) {
      this(List.of($$0, $$1, $$2, $$3));
   }

   private static Optional<cxc> a(List<cxc> $$0, int $$1) {
      if ($$1 >= $$0.size()) {
         return Optional.empty();
      } else {
         cxc $$2 = $$0.get($$1);
         return $$2 == cxk.rs ? Optional.empty() : Optional.of($$2);
      }
   }

   public um a(um $$0) {
      if (this.equals(a)) {
         return $$0;
      } else {
         $$0.a("sherds", (vj)b.encodeStart(va.a, this).getOrThrow());
         return $$0;
      }
   }

   public List<cxc> a() {
      return Stream.of(this.d, this.e, this.f, this.g).map($$0 -> $$0.orElse(cxk.rs)).toList();
   }

   public static dvx b(@Nullable um $$0) {
      return $$0 != null && $$0.e("sherds") ? b.parse(va.a, $$0.c("sherds")).result().orElse(a) : a;
   }

   public Optional<cxc> b() {
      return this.d;
   }

   public Optional<cxc> c() {
      return this.e;
   }

   public Optional<cxc> d() {
      return this.f;
   }

   public Optional<cxc> e() {
      return this.g;
   }
}
