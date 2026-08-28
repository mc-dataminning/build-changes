import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public record dvw(Optional<cxg> d, Optional<cxg> e, Optional<cxg> f, Optional<cxg> g) {
   public static final dvw a = new dvw(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
   public static final Codec<dvw> b = ma.g.q().sizeLimitedListOf(4).xmap(dvw::new, dvw::a);
   public static final zt<xg, dvw> c = zr.a(mb.K).a(zr.c(4)).a(dvw::new, dvw::a);

   private dvw(List<cxg> $$0) {
      this(a($$0, 0), a($$0, 1), a($$0, 2), a($$0, 3));
   }

   public dvw(cxg $$0, cxg $$1, cxg $$2, cxg $$3) {
      this(List.of($$0, $$1, $$2, $$3));
   }

   private static Optional<cxg> a(List<cxg> $$0, int $$1) {
      if ($$1 >= $$0.size()) {
         return Optional.empty();
      } else {
         cxg $$2 = $$0.get($$1);
         return $$2 == cxo.rj ? Optional.empty() : Optional.of($$2);
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

   public List<cxg> a() {
      return Stream.of(this.d, this.e, this.f, this.g).map($$0 -> $$0.orElse(cxo.rj)).toList();
   }

   public static dvw b(@Nullable ux $$0) {
      return $$0 != null && $$0.e("sherds") ? b.parse(vl.a, $$0.c("sherds")).result().orElse(a) : a;
   }

   public Optional<cxg> b() {
      return this.d;
   }

   public Optional<cxg> c() {
      return this.e;
   }

   public Optional<cxg> d() {
      return this.f;
   }

   public Optional<cxg> e() {
      return this.g;
   }
}
