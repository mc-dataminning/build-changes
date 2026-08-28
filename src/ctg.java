import java.util.Optional;

public class ctg {
   public static final String a = "variant";

   public static <T> je<T> a(js $$0, alf<T> $$1) {
      jr<T> $$2 = $$0.f($$1.c());
      return $$2.a($$1).or($$2::a).orElseThrow();
   }

   public static <T> je<T> b(js $$0, alf<? extends jr<T>> $$1) {
      return $$0.f($$1).a().orElseThrow();
   }

   public static <T> void a(tz $$0, je<T> $$1) {
      $$1.e().ifPresent($$1x -> $$0.a("variant", $$1x.a().toString()));
   }

   public static <T> Optional<je<T>> a(tz $$0, js $$1, alf<? extends jr<T>> $$2) {
      return Optional.ofNullable(alg.c($$0.l("variant"))).map($$1x -> alf.a($$2, $$1x)).flatMap($$1::c);
   }
}
