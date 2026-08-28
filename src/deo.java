import java.util.List;
import java.util.Optional;

public record deo<T extends deb<?>>(dfn a, Optional<deg<T>> b) {
   public static <T extends deb<?>> yw<wj, deo<T>> a() {
      return yw.a(dfn.b, deo::b, $$0 -> new deo<>($$0, Optional.empty()));
   }

   public dfn b() {
      return this.a;
   }

   public Optional<deg<T>> c() {
      return this.b;
   }

   public static record a<T extends deb<?>>(ddx a, deo<T> b) {

      public static <T extends deb<?>> yw<wj, deo.a<T>> a() {
         return yw.a(ddx.a, deo.a::b, deo.a(), deo.a::c, deo.a::new);
      }

      public ddx b() {
         return this.a;
      }

      public deo<T> c() {
         return this.b;
      }
   }

   public static record b<T extends deb<?>>(List<deo.a<T>> a) {
      public static <T extends deb<?>> deo.b<T> a() {
         return new deo.b<>(List.of());
      }

      public static <T extends deb<?>> yw<wj, deo.b<T>> b() {
         return yw.a(deo.a.<T>a().a(yu.a()), deo.b::e, deo.b::new);
      }

      public boolean a(czk $$0) {
         return this.a.stream().anyMatch($$1 -> $$1.a.a($$0));
      }

      public deo.b<T> b(czk $$0) {
         return new deo.b<>(this.a.stream().filter($$1 -> $$1.a.a($$0)).toList());
      }

      public boolean c() {
         return this.a.isEmpty();
      }

      public int d() {
         return this.a.size();
      }

      public List<deo.a<T>> e() {
         return this.a;
      }
   }
}
