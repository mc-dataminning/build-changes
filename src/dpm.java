import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public record dpm(Optional<ctl> d, Optional<ctl> e, Optional<ctl> f, Optional<ctl> g) {
   public static final dpm a = new dpm(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
   public static final Codec<dpm> b = le.h.q().sizeLimitedListOf(4).xmap(dpm::new, dpm::a);
   public static final yv<wi, dpm> c = yt.a(lf.G).a(yt.c(4)).a(dpm::new, dpm::a);

   private dpm(List<ctl> $$0) {
      this(a($$0, 0), a($$0, 1), a($$0, 2), a($$0, 3));
   }

   public dpm(ctl $$0, ctl $$1, ctl $$2, ctl $$3) {
      this(List.of($$0, $$1, $$2, $$3));
   }

   private static Optional<ctl> a(List<ctl> $$0, int $$1) {
      if ($$1 >= $$0.size()) {
         return Optional.empty();
      } else {
         ctl $$2 = $$0.get($$1);
         return $$2 == ctt.qL ? Optional.empty() : Optional.of($$2);
      }
   }

   public ud a(ud $$0) {
      if (this.equals(a)) {
         return $$0;
      } else {
         $$0.a("sherds", (va)b.encodeStart(ur.a, this).getOrThrow());
         return $$0;
      }
   }

   public List<ctl> a() {
      return Stream.of(this.d, this.e, this.f, this.g).map($$0 -> $$0.orElse(ctt.qL)).toList();
   }

   public static dpm b(@Nullable ud $$0) {
      return $$0 != null && $$0.e("sherds") ? b.parse(ur.a, $$0.c("sherds")).result().orElse(a) : a;
   }

   public Optional<ctl> b() {
      return this.d;
   }

   public Optional<ctl> c() {
      return this.e;
   }

   public Optional<ctl> d() {
      return this.f;
   }

   public Optional<ctl> e() {
      return this.g;
   }
}
