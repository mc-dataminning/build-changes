import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public record dtb(Optional<cvn> d, Optional<cvn> e, Optional<cvn> f, Optional<cvn> g) {
   public static final dtb a = new dtb(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
   public static final Codec<dtb> b = lv.g.q().sizeLimitedListOf(4).xmap(dtb::new, dtb::a);
   public static final zc<wp, dtb> c = za.a(lw.K).a(za.c(4)).a(dtb::new, dtb::a);

   private dtb(List<cvn> $$0) {
      this(a($$0, 0), a($$0, 1), a($$0, 2), a($$0, 3));
   }

   public dtb(cvn $$0, cvn $$1, cvn $$2, cvn $$3) {
      this(List.of($$0, $$1, $$2, $$3));
   }

   private static Optional<cvn> a(List<cvn> $$0, int $$1) {
      if ($$1 >= $$0.size()) {
         return Optional.empty();
      } else {
         cvn $$2 = $$0.get($$1);
         return $$2 == cvw.qM ? Optional.empty() : Optional.of($$2);
      }
   }

   public ug a(ug $$0) {
      if (this.equals(a)) {
         return $$0;
      } else {
         $$0.a("sherds", (vd)b.encodeStart(uu.a, this).getOrThrow());
         return $$0;
      }
   }

   public List<cvn> a() {
      return Stream.of(this.d, this.e, this.f, this.g).map($$0 -> $$0.orElse(cvw.qM)).toList();
   }

   public static dtb b(@Nullable ug $$0) {
      return $$0 != null && $$0.e("sherds") ? b.parse(uu.a, $$0.c("sherds")).result().orElse(a) : a;
   }

   public Optional<cvn> b() {
      return this.d;
   }

   public Optional<cvn> c() {
      return this.e;
   }

   public Optional<cvn> d() {
      return this.f;
   }

   public Optional<cvn> e() {
      return this.g;
   }
}
