import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public record dwt(Optional<cxu> d, Optional<cxu> e, Optional<cxu> f, Optional<cxu> g) {
   public static final dwt a = new dwt(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
   public static final Codec<dwt> b = md.g.q().sizeLimitedListOf(4).xmap(dwt::new, dwt::a);
   public static final yt<wg, dwt> c = yr.a(me.K).a(yr.c(4)).a(dwt::new, dwt::a);

   private dwt(List<cxu> $$0) {
      this(a($$0, 0), a($$0, 1), a($$0, 2), a($$0, 3));
   }

   public dwt(cxu $$0, cxu $$1, cxu $$2, cxu $$3) {
      this(List.of($$0, $$1, $$2, $$3));
   }

   private static Optional<cxu> a(List<cxu> $$0, int $$1) {
      if ($$1 >= $$0.size()) {
         return Optional.empty();
      } else {
         cxu $$2 = $$0.get($$1);
         return $$2 == cyc.rw ? Optional.empty() : Optional.of($$2);
      }
   }

   public tw a(tw $$0) {
      if (this.equals(a)) {
         return $$0;
      } else {
         $$0.a("sherds", (ut)b.encodeStart(uk.a, this).getOrThrow());
         return $$0;
      }
   }

   public List<cxu> a() {
      return Stream.of(this.d, this.e, this.f, this.g).map($$0 -> $$0.orElse(cyc.rw)).toList();
   }

   public static dwt b(@Nullable tw $$0) {
      return $$0 != null && $$0.e("sherds") ? b.parse(uk.a, $$0.c("sherds")).result().orElse(a) : a;
   }

   public Optional<cxu> b() {
      return this.d;
   }

   public Optional<cxu> c() {
      return this.e;
   }

   public Optional<cxu> d() {
      return this.f;
   }

   public Optional<cxu> e() {
      return this.g;
   }
}
