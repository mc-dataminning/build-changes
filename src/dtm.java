import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public record dtm(Optional<cvt> d, Optional<cvt> e, Optional<cvt> f, Optional<cvt> g) {
   public static final dtm a = new dtm(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
   public static final Codec<dtm> b = lx.g.q().sizeLimitedListOf(4).xmap(dtm::new, dtm::a);
   public static final zf<ws, dtm> c = zd.a(ly.K).a(zd.c(4)).a(dtm::new, dtm::a);

   private dtm(List<cvt> $$0) {
      this(a($$0, 0), a($$0, 1), a($$0, 2), a($$0, 3));
   }

   public dtm(cvt $$0, cvt $$1, cvt $$2, cvt $$3) {
      this(List.of($$0, $$1, $$2, $$3));
   }

   private static Optional<cvt> a(List<cvt> $$0, int $$1) {
      if ($$1 >= $$0.size()) {
         return Optional.empty();
      } else {
         cvt $$2 = $$0.get($$1);
         return $$2 == cwb.qM ? Optional.empty() : Optional.of($$2);
      }
   }

   public uj a(uj $$0) {
      if (this.equals(a)) {
         return $$0;
      } else {
         $$0.a("sherds", (vg)b.encodeStart(ux.a, this).getOrThrow());
         return $$0;
      }
   }

   public List<cvt> a() {
      return Stream.of(this.d, this.e, this.f, this.g).map($$0 -> $$0.orElse(cwb.qM)).toList();
   }

   public static dtm b(@Nullable uj $$0) {
      return $$0 != null && $$0.e("sherds") ? b.parse(ux.a, $$0.c("sherds")).result().orElse(a) : a;
   }

   public Optional<cvt> b() {
      return this.d;
   }

   public Optional<cvt> c() {
      return this.e;
   }

   public Optional<cvt> d() {
      return this.f;
   }

   public Optional<cvt> e() {
      return this.g;
   }
}
