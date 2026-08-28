import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public record dwd(Optional<cxk> d, Optional<cxk> e, Optional<cxk> f, Optional<cxk> g) {
   public static final dwd a = new dwd(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
   public static final Codec<dwd> b = ma.g.q().sizeLimitedListOf(4).xmap(dwd::new, dwd::a);
   public static final zt<xg, dwd> c = zr.a(mb.K).a(zr.c(4)).a(dwd::new, dwd::a);

   private dwd(List<cxk> $$0) {
      this(a($$0, 0), a($$0, 1), a($$0, 2), a($$0, 3));
   }

   public dwd(cxk $$0, cxk $$1, cxk $$2, cxk $$3) {
      this(List.of($$0, $$1, $$2, $$3));
   }

   private static Optional<cxk> a(List<cxk> $$0, int $$1) {
      if ($$1 >= $$0.size()) {
         return Optional.empty();
      } else {
         cxk $$2 = $$0.get($$1);
         return $$2 == cxs.rj ? Optional.empty() : Optional.of($$2);
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

   public List<cxk> a() {
      return Stream.of(this.d, this.e, this.f, this.g).map($$0 -> $$0.orElse(cxs.rj)).toList();
   }

   public static dwd b(@Nullable ux $$0) {
      return $$0 != null && $$0.e("sherds") ? b.parse(vl.a, $$0.c("sherds")).result().orElse(a) : a;
   }

   public Optional<cxk> b() {
      return this.d;
   }

   public Optional<cxk> c() {
      return this.e;
   }

   public Optional<cxk> d() {
      return this.f;
   }

   public Optional<cxk> e() {
      return this.g;
   }
}
