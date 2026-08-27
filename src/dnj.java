import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public record dnj(Optional<cre> d, Optional<cre> e, Optional<cre> f, Optional<cre> g) {
   public static final dnj a = new dnj(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
   public static final Codec<dnj> b = aws.a(kr.h.q().listOf(), 4).xmap(dnj::new, dnj::a);
   public static final ye<vr, dnj> c = yc.a(ks.F).a(yc.c(4)).a(dnj::new, dnj::a);

   private dnj(List<cre> $$0) {
      this(a($$0, 0), a($$0, 1), a($$0, 2), a($$0, 3));
   }

   public dnj(cre $$0, cre $$1, cre $$2, cre $$3) {
      this(List.of($$0, $$1, $$2, $$3));
   }

   private static Optional<cre> a(List<cre> $$0, int $$1) {
      if ($$1 >= $$0.size()) {
         return Optional.empty();
      } else {
         cre $$2 = $$0.get($$1);
         return $$2 == crm.qK ? Optional.empty() : Optional.of($$2);
      }
   }

   public tm a(tm $$0) {
      if (this.equals(a)) {
         return $$0;
      } else {
         $$0.a("sherds", ac.a(b.encodeStart(ua.a, this), IllegalStateException::new));
         return $$0;
      }
   }

   public List<cre> a() {
      return Stream.of(this.d, this.e, this.f, this.g).map($$0 -> $$0.orElse(crm.qK)).toList();
   }

   public static dnj b(@Nullable tm $$0) {
      return $$0 != null && $$0.e("sherds") ? b.parse(ua.a, $$0.c("sherds")).result().orElse(a) : a;
   }

   public Optional<cre> b() {
      return this.d;
   }

   public Optional<cre> c() {
      return this.e;
   }

   public Optional<cre> d() {
      return this.f;
   }

   public Optional<cre> e() {
      return this.g;
   }
}
