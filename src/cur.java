import java.util.Optional;

public class cur {
   public static final String a = "variant";

   public static <T> jg<T> a(ju $$0, alq<T> $$1) {
      jt<T> $$2 = $$0.f($$1.c());
      return $$2.a($$1).or($$2::a).orElseThrow();
   }

   public static <T> jg<T> b(ju $$0, alq<? extends jt<T>> $$1) {
      return $$0.f($$1).a().orElseThrow();
   }

   public static <T> void a(ua $$0, jg<T> $$1) {
      $$1.e().ifPresent($$1x -> $$0.a("variant", alr.a, $$1x.a()));
   }

   public static <T> Optional<jg<T>> a(ua $$0, ju $$1, alq<? extends jt<T>> $$2) {
      return $$0.<alr>a("variant", alr.a).map($$1x -> alq.a($$2, $$1x)).flatMap($$1::c);
   }
}
