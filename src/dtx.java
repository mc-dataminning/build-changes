import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public record dtx(Optional<cwb> d, Optional<cwb> e, Optional<cwb> f, Optional<cwb> g) {
   public static final dtx a = new dtx(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
   public static final Codec<dtx> b = lz.g.q().sizeLimitedListOf(4).xmap(dtx::new, dtx::a);
   public static final zj<ww, dtx> c = zh.a(ma.K).a(zh.c(4)).a(dtx::new, dtx::a);

   private dtx(List<cwb> $$0) {
      this(a($$0, 0), a($$0, 1), a($$0, 2), a($$0, 3));
   }

   public dtx(cwb $$0, cwb $$1, cwb $$2, cwb $$3) {
      this(List.of($$0, $$1, $$2, $$3));
   }

   private static Optional<cwb> a(List<cwb> $$0, int $$1) {
      if ($$1 >= $$0.size()) {
         return Optional.empty();
      } else {
         cwb $$2 = $$0.get($$1);
         return $$2 == cwj.qM ? Optional.empty() : Optional.of($$2);
      }
   }

   public un a(un $$0) {
      if (this.equals(a)) {
         return $$0;
      } else {
         $$0.a("sherds", (vk)b.encodeStart(vb.a, this).getOrThrow());
         return $$0;
      }
   }

   public List<cwb> a() {
      return Stream.of(this.d, this.e, this.f, this.g).map($$0 -> $$0.orElse(cwj.qM)).toList();
   }

   public static dtx b(@Nullable un $$0) {
      return $$0 != null && $$0.e("sherds") ? b.parse(vb.a, $$0.c("sherds")).result().orElse(a) : a;
   }

   public Optional<cwb> b() {
      return this.d;
   }

   public Optional<cwb> c() {
      return this.e;
   }

   public Optional<cwb> d() {
      return this.f;
   }

   public Optional<cwb> e() {
      return this.g;
   }
}
