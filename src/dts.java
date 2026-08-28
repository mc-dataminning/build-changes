import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public record dts(Optional<cvx> d, Optional<cvx> e, Optional<cvx> f, Optional<cvx> g) {
   public static final dts a = new dts(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
   public static final Codec<dts> b = ly.g.q().sizeLimitedListOf(4).xmap(dts::new, dts::a);
   public static final zg<wt, dts> c = ze.a(lz.K).a(ze.c(4)).a(dts::new, dts::a);

   private dts(List<cvx> $$0) {
      this(a($$0, 0), a($$0, 1), a($$0, 2), a($$0, 3));
   }

   public dts(cvx $$0, cvx $$1, cvx $$2, cvx $$3) {
      this(List.of($$0, $$1, $$2, $$3));
   }

   private static Optional<cvx> a(List<cvx> $$0, int $$1) {
      if ($$1 >= $$0.size()) {
         return Optional.empty();
      } else {
         cvx $$2 = $$0.get($$1);
         return $$2 == cwf.qM ? Optional.empty() : Optional.of($$2);
      }
   }

   public uk a(uk $$0) {
      if (this.equals(a)) {
         return $$0;
      } else {
         $$0.a("sherds", (vh)b.encodeStart(uy.a, this).getOrThrow());
         return $$0;
      }
   }

   public List<cvx> a() {
      return Stream.of(this.d, this.e, this.f, this.g).map($$0 -> $$0.orElse(cwf.qM)).toList();
   }

   public static dts b(@Nullable uk $$0) {
      return $$0 != null && $$0.e("sherds") ? b.parse(uy.a, $$0.c("sherds")).result().orElse(a) : a;
   }

   public Optional<cvx> b() {
      return this.d;
   }

   public Optional<cvx> c() {
      return this.e;
   }

   public Optional<cvx> d() {
      return this.f;
   }

   public Optional<cvx> e() {
      return this.g;
   }
}
