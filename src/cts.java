import java.util.Optional;

public class cts {
   public static final String a = "variant";

   public static <T> jf<T> a(jt $$0, alf<T> $$1) {
      js<T> $$2 = $$0.f($$1.c());
      return $$2.a($$1).or($$2::a).orElseThrow();
   }

   public static <T> jf<T> b(jt $$0, alf<? extends js<T>> $$1) {
      return $$0.f($$1).a().orElseThrow();
   }

   public static <T> void a(tz $$0, jf<T> $$1) {
      $$1.e().ifPresent($$1x -> $$0.a("variant", $$1x.a().toString()));
   }

   public static <T> Optional<jf<T>> a(tz $$0, jt $$1, alf<? extends js<T>> $$2) {
      return Optional.ofNullable(alg.c($$0.j("variant"))).map($$1x -> alf.a($$2, $$1x)).flatMap($$1::c);
   }
}
