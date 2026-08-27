import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public record dns(Optional<crn> d, Optional<crn> e, Optional<crn> f, Optional<crn> g) {
   public static final dns a = new dns(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
   public static final Codec<dns> b = awu.a(kt.h.q().listOf(), 4).xmap(dns::new, dns::a);
   public static final yg<vt, dns> c = ye.a(ku.G).a(ye.c(4)).a(dns::new, dns::a);

   private dns(List<crn> $$0) {
      this(a($$0, 0), a($$0, 1), a($$0, 2), a($$0, 3));
   }

   public dns(crn $$0, crn $$1, crn $$2, crn $$3) {
      this(List.of($$0, $$1, $$2, $$3));
   }

   private static Optional<crn> a(List<crn> $$0, int $$1) {
      if ($$1 >= $$0.size()) {
         return Optional.empty();
      } else {
         crn $$2 = $$0.get($$1);
         return $$2 == crv.qK ? Optional.empty() : Optional.of($$2);
      }
   }

   public to a(to $$0) {
      if (this.equals(a)) {
         return $$0;
      } else {
         $$0.a("sherds", ac.a(b.encodeStart(uc.a, this), IllegalStateException::new));
         return $$0;
      }
   }

   public List<crn> a() {
      return Stream.of(this.d, this.e, this.f, this.g).map($$0 -> $$0.orElse(crv.qK)).toList();
   }

   public static dns b(@Nullable to $$0) {
      return $$0 != null && $$0.e("sherds") ? b.parse(uc.a, $$0.c("sherds")).result().orElse(a) : a;
   }

   public Optional<crn> b() {
      return this.d;
   }

   public Optional<crn> c() {
      return this.e;
   }

   public Optional<crn> d() {
      return this.f;
   }

   public Optional<crn> e() {
      return this.g;
   }
}
