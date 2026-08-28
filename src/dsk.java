import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public record dsk(Optional<cvg> d, Optional<cvg> e, Optional<cvg> f, Optional<cvg> g) {
   public static final dsk a = new dsk(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
   public static final Codec<dsk> b = lu.g.q().sizeLimitedListOf(4).xmap(dsk::new, dsk::a);
   public static final zb<wo, dsk> c = yz.a(lv.K).a(yz.c(4)).a(dsk::new, dsk::a);

   private dsk(List<cvg> $$0) {
      this(a($$0, 0), a($$0, 1), a($$0, 2), a($$0, 3));
   }

   public dsk(cvg $$0, cvg $$1, cvg $$2, cvg $$3) {
      this(List.of($$0, $$1, $$2, $$3));
   }

   private static Optional<cvg> a(List<cvg> $$0, int $$1) {
      if ($$1 >= $$0.size()) {
         return Optional.empty();
      } else {
         cvg $$2 = $$0.get($$1);
         return $$2 == cvo.qM ? Optional.empty() : Optional.of($$2);
      }
   }

   public uf a(uf $$0) {
      if (this.equals(a)) {
         return $$0;
      } else {
         $$0.a("sherds", (vc)b.encodeStart(ut.a, this).getOrThrow());
         return $$0;
      }
   }

   public List<cvg> a() {
      return Stream.of(this.d, this.e, this.f, this.g).map($$0 -> $$0.orElse(cvo.qM)).toList();
   }

   public static dsk b(@Nullable uf $$0) {
      return $$0 != null && $$0.e("sherds") ? b.parse(ut.a, $$0.c("sherds")).result().orElse(a) : a;
   }

   public Optional<cvg> b() {
      return this.d;
   }

   public Optional<cvg> c() {
      return this.e;
   }

   public Optional<cvg> d() {
      return this.f;
   }

   public Optional<cvg> e() {
      return this.g;
   }
}
