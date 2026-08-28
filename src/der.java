import java.util.List;
import java.util.Optional;

public record der<T extends dee<?>>(dfq a, Optional<dej<T>> b) {
   public static <T extends dee<?>> yw<wj, der<T>> a() {
      return yw.a(dfq.b, der::b, $$0 -> new der<>($$0, Optional.empty()));
   }

   public dfq b() {
      return this.a;
   }

   public Optional<dej<T>> c() {
      return this.b;
   }

   public static record a<T extends dee<?>>(dea a, der<T> b) {

      public static <T extends dee<?>> yw<wj, der.a<T>> a() {
         return yw.a(dea.a, der.a::b, der.a(), der.a::c, der.a::new);
      }

      public dea b() {
         return this.a;
      }

      public der<T> c() {
         return this.b;
      }
   }

   public static record b<T extends dee<?>>(List<der.a<T>> a) {
      public static <T extends dee<?>> der.b<T> a() {
         return new der.b<>(List.of());
      }

      public static <T extends dee<?>> yw<wj, der.b<T>> b() {
         return yw.a(der.a.<T>a().a(yu.a()), der.b::e, der.b::new);
      }

      public boolean a(czn $$0) {
         return this.a.stream().anyMatch($$1 -> $$1.a.a($$0));
      }

      public der.b<T> b(czn $$0) {
         return new der.b<>(this.a.stream().filter($$1 -> $$1.a.a($$0)).toList());
      }

      public boolean c() {
         return this.a.isEmpty();
      }

      public int d() {
         return this.a.size();
      }

      public List<der.a<T>> e() {
         return this.a;
      }
   }
}
