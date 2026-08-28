import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public record dwe(Optional<cxl> d, Optional<cxl> e, Optional<cxl> f, Optional<cxl> g) {
   public static final dwe a = new dwe(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
   public static final Codec<dwe> b = ma.g.q().sizeLimitedListOf(4).xmap(dwe::new, dwe::a);
   public static final zt<xg, dwe> c = zr.a(mb.K).a(zr.c(4)).a(dwe::new, dwe::a);

   private dwe(List<cxl> $$0) {
      this(a($$0, 0), a($$0, 1), a($$0, 2), a($$0, 3));
   }

   public dwe(cxl $$0, cxl $$1, cxl $$2, cxl $$3) {
      this(List.of($$0, $$1, $$2, $$3));
   }

   private static Optional<cxl> a(List<cxl> $$0, int $$1) {
      if ($$1 >= $$0.size()) {
         return Optional.empty();
      } else {
         cxl $$2 = $$0.get($$1);
         return $$2 == cxt.rj ? Optional.empty() : Optional.of($$2);
      }
   }

   public ux a(ux $$0) {
      if (this.equals(a)) {
         return $$0;
      } else {
         $$0.a("sherds", (vu)b.encodeStart(vl.a, this).getOrThrow());
         return $$0;
      }
   }

   public List<cxl> a() {
      return Stream.of(this.d, this.e, this.f, this.g).map($$0 -> $$0.orElse(cxt.rj)).toList();
   }

   public static dwe b(@Nullable ux $$0) {
      return $$0 != null && $$0.e("sherds") ? b.parse(vl.a, $$0.c("sherds")).result().orElse(a) : a;
   }

   public Optional<cxl> b() {
      return this.d;
   }

   public Optional<cxl> c() {
      return this.e;
   }

   public Optional<cxl> d() {
      return this.f;
   }

   public Optional<cxl> e() {
      return this.g;
   }
}
