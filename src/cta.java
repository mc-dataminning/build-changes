import java.util.Optional;

public class cta {
   public static final String a = "variant";

   public static <T> je<T> a(js $$0, ald<T> $$1) {
      jr<T> $$2 = $$0.f($$1.c());
      return $$2.a($$1).or($$2::a).orElseThrow();
   }

   public static <T> je<T> b(js $$0, ald<? extends jr<T>> $$1) {
      return $$0.f($$1).a().orElseThrow();
   }

   public static <T> void a(tx $$0, je<T> $$1) {
      $$1.e().ifPresent($$1x -> $$0.a("variant", $$1x.a().toString()));
   }

   public static <T> Optional<je<T>> a(tx $$0, js $$1, ald<? extends jr<T>> $$2) {
      return Optional.ofNullable(ale.c($$0.l("variant"))).map($$1x -> ald.a($$2, $$1x)).flatMap($$1::c);
   }
}
