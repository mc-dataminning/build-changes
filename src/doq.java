import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public record doq(Optional<csu> d, Optional<csu> e, Optional<csu> f, Optional<csu> g) {
   public static final doq a = new doq(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
   public static final Codec<doq> b = axh.a(ld.h.q().listOf(), 4).xmap(doq::new, doq::a);
   public static final ys<wf, doq> c = yq.a(le.G).a(yq.c(4)).a(doq::new, doq::a);

   private doq(List<csu> $$0) {
      this(a($$0, 0), a($$0, 1), a($$0, 2), a($$0, 3));
   }

   public doq(csu $$0, csu $$1, csu $$2, csu $$3) {
      this(List.of($$0, $$1, $$2, $$3));
   }

   private static Optional<csu> a(List<csu> $$0, int $$1) {
      if ($$1 >= $$0.size()) {
         return Optional.empty();
      } else {
         csu $$2 = $$0.get($$1);
         return $$2 == ctc.qL ? Optional.empty() : Optional.of($$2);
      }
   }

   public ua a(ua $$0) {
      if (this.equals(a)) {
         return $$0;
      } else {
         $$0.a("sherds", ac.a(b.encodeStart(uo.a, this), IllegalStateException::new));
         return $$0;
      }
   }

   public List<csu> a() {
      return Stream.of(this.d, this.e, this.f, this.g).map($$0 -> $$0.orElse(ctc.qL)).toList();
   }

   public static doq b(@Nullable ua $$0) {
      return $$0 != null && $$0.e("sherds") ? b.parse(uo.a, $$0.c("sherds")).result().orElse(a) : a;
   }

   public Optional<csu> b() {
      return this.d;
   }

   public Optional<csu> c() {
      return this.e;
   }

   public Optional<csu> d() {
      return this.f;
   }

   public Optional<csu> e() {
      return this.g;
   }
}
