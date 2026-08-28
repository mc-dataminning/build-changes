import java.util.List;
import java.util.Optional;

public record ddw<T extends ddj<?>>(dev a, Optional<ddo<T>> b) {
   public static <T extends ddj<?>> yu<wh, ddw<T>> a() {
      return yu.a(dev.b, ddw::b, $$0 -> new ddw<>($$0, Optional.empty()));
   }

   public dev b() {
      return this.a;
   }

   public Optional<ddo<T>> c() {
      return this.b;
   }

   public static record a<T extends ddj<?>>(ddf a, ddw<T> b) {

      public static <T extends ddj<?>> yu<wh, ddw.a<T>> a() {
         return yu.a(ddf.a, ddw.a::b, ddw.a(), ddw.a::c, ddw.a::new);
      }

      public ddf b() {
         return this.a;
      }

      public ddw<T> c() {
         return this.b;
      }
   }

   public static record b<T extends ddj<?>>(List<ddw.a<T>> a) {
      public static <T extends ddj<?>> ddw.b<T> a() {
         return new ddw.b<>(List.of());
      }

      public static <T extends ddj<?>> yu<wh, ddw.b<T>> b() {
         return yu.a(ddw.a.<T>a().a(ys.a()), ddw.b::e, ddw.b::new);
      }

      public boolean a(cys $$0) {
         return this.a.stream().anyMatch($$1 -> $$1.a.a($$0));
      }

      public ddw.b<T> b(cys $$0) {
         return new ddw.b<>(this.a.stream().filter($$1 -> $$1.a.a($$0)).toList());
      }

      public boolean c() {
         return this.a.isEmpty();
      }

      public int d() {
         return this.a.size();
      }

      public List<ddw.a<T>> e() {
         return this.a;
      }
   }
}
