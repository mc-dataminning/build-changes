import java.util.List;
import java.util.Optional;

public record dfe<T extends der<?>>(dgd a, Optional<dew<T>> b) {
   public static <T extends der<?>> za<wn, dfe<T>> a() {
      return za.a(dgd.b, dfe::b, $$0 -> new dfe<>($$0, Optional.empty()));
   }

   public dgd b() {
      return this.a;
   }

   public Optional<dew<T>> c() {
      return this.b;
   }

   public static record a<T extends der<?>>(den a, dfe<T> b) {

      public static <T extends der<?>> za<wn, dfe.a<T>> a() {
         return za.a(den.a, dfe.a::b, dfe.a(), dfe.a::c, dfe.a::new);
      }

      public den b() {
         return this.a;
      }

      public dfe<T> c() {
         return this.b;
      }
   }

   public static record b<T extends der<?>>(List<dfe.a<T>> a) {
      public static <T extends der<?>> dfe.b<T> a() {
         return new dfe.b<>(List.of());
      }

      public static <T extends der<?>> za<wn, dfe.b<T>> b() {
         return za.a(dfe.a.<T>a().a(yy.a()), dfe.b::e, dfe.b::new);
      }

      public boolean a(daa $$0) {
         return this.a.stream().anyMatch($$1 -> $$1.a.a($$0));
      }

      public dfe.b<T> b(daa $$0) {
         return new dfe.b<>(this.a.stream().filter($$1 -> $$1.a.a($$0)).toList());
      }

      public boolean c() {
         return this.a.isEmpty();
      }

      public int d() {
         return this.a.size();
      }

      public List<dfe.a<T>> e() {
         return this.a;
      }
   }
}
