import java.util.Optional;

public class cug {
   public static final String a = "variant";

   public static <T> jf<T> a(jt $$0, alh<T> $$1) {
      js<T> $$2 = $$0.f($$1.c());
      return $$2.a($$1).or($$2::a).orElseThrow();
   }

   public static <T> jf<T> b(jt $$0, alh<? extends js<T>> $$1) {
      return $$0.f($$1).a().orElseThrow();
   }

   public static <T> void a(tz $$0, jf<T> $$1) {
      $$1.e().ifPresent($$1x -> $$0.a("variant", ali.a, $$1x.a()));
   }

   public static <T> Optional<jf<T>> a(tz $$0, jt $$1, alh<? extends js<T>> $$2) {
      return $$0.<ali>a("variant", ali.a).map($$1x -> alh.a($$2, $$1x)).flatMap($$1::c);
   }
}
