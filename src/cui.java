import java.util.Optional;

public class cui {
   public static final String a = "variant";

   public static <T> jg<T> a(ju $$0, alj<T> $$1) {
      jt<T> $$2 = $$0.f($$1.c());
      return $$2.a($$1).or($$2::a).orElseThrow();
   }

   public static <T> jg<T> b(ju $$0, alj<? extends jt<T>> $$1) {
      return $$0.f($$1).a().orElseThrow();
   }

   public static <T> void a(ua $$0, jg<T> $$1) {
      $$1.e().ifPresent($$1x -> $$0.a("variant", alk.a, $$1x.a()));
   }

   public static <T> Optional<jg<T>> a(ua $$0, ju $$1, alj<? extends jt<T>> $$2) {
      return $$0.<alk>a("variant", alk.a).map($$1x -> alj.a($$2, $$1x)).flatMap($$1::c);
   }
}
