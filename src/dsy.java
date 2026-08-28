import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public record dsy(Optional<cvk> d, Optional<cvk> e, Optional<cvk> f, Optional<cvk> g) {
   public static final dsy a = new dsy(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
   public static final Codec<dsy> b = lu.g.q().sizeLimitedListOf(4).xmap(dsy::new, dsy::a);
   public static final zb<wo, dsy> c = yz.a(lv.K).a(yz.c(4)).a(dsy::new, dsy::a);

   private dsy(List<cvk> $$0) {
      this(a($$0, 0), a($$0, 1), a($$0, 2), a($$0, 3));
   }

   public dsy(cvk $$0, cvk $$1, cvk $$2, cvk $$3) {
      this(List.of($$0, $$1, $$2, $$3));
   }

   private static Optional<cvk> a(List<cvk> $$0, int $$1) {
      if ($$1 >= $$0.size()) {
         return Optional.empty();
      } else {
         cvk $$2 = $$0.get($$1);
         return $$2 == cvt.qM ? Optional.empty() : Optional.of($$2);
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

   public List<cvk> a() {
      return Stream.of(this.d, this.e, this.f, this.g).map($$0 -> $$0.orElse(cvt.qM)).toList();
   }

   public static dsy b(@Nullable uf $$0) {
      return $$0 != null && $$0.e("sherds") ? b.parse(ut.a, $$0.c("sherds")).result().orElse(a) : a;
   }

   public Optional<cvk> b() {
      return this.d;
   }

   public Optional<cvk> c() {
      return this.e;
   }

   public Optional<cvk> d() {
      return this.f;
   }

   public Optional<cvk> e() {
      return this.g;
   }
}
