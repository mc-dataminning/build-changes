import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public record dqg(Optional<cuf> d, Optional<cuf> e, Optional<cuf> f, Optional<cuf> g) {
   public static final dqg a = new dqg(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
   public static final Codec<dqg> b = lp.h.q().sizeLimitedListOf(4).xmap(dqg::new, dqg::a);
   public static final zj<ww, dqg> c = zh.a(lq.G).a(zh.c(4)).a(dqg::new, dqg::a);

   private dqg(List<cuf> $$0) {
      this(a($$0, 0), a($$0, 1), a($$0, 2), a($$0, 3));
   }

   public dqg(cuf $$0, cuf $$1, cuf $$2, cuf $$3) {
      this(List.of($$0, $$1, $$2, $$3));
   }

   private static Optional<cuf> a(List<cuf> $$0, int $$1) {
      if ($$1 >= $$0.size()) {
         return Optional.empty();
      } else {
         cuf $$2 = $$0.get($$1);
         return $$2 == cun.qL ? Optional.empty() : Optional.of($$2);
      }
   }

   public ur a(ur $$0) {
      if (this.equals(a)) {
         return $$0;
      } else {
         $$0.a("sherds", (vo)b.encodeStart(vf.a, this).getOrThrow());
         return $$0;
      }
   }

   public List<cuf> a() {
      return Stream.of(this.d, this.e, this.f, this.g).map($$0 -> $$0.orElse(cun.qL)).toList();
   }

   public static dqg b(@Nullable ur $$0) {
      return $$0 != null && $$0.e("sherds") ? b.parse(vf.a, $$0.c("sherds")).result().orElse(a) : a;
   }

   public Optional<cuf> b() {
      return this.d;
   }

   public Optional<cuf> c() {
      return this.e;
   }

   public Optional<cuf> d() {
      return this.f;
   }

   public Optional<cuf> e() {
      return this.g;
   }
}
