import java.util.List;
import java.util.Optional;

public record dfc<T extends dep<?>>(dgb a, Optional<deu<T>> b) {
   public static <T extends dep<?>> yy<wl, dfc<T>> a() {
      return yy.a(dgb.b, dfc::b, $$0 -> new dfc<>($$0, Optional.empty()));
   }

   public dgb b() {
      return this.a;
   }

   public Optional<deu<T>> c() {
      return this.b;
   }

   public static record a<T extends dep<?>>(del a, dfc<T> b) {

      public static <T extends dep<?>> yy<wl, dfc.a<T>> a() {
         return yy.a(del.a, dfc.a::b, dfc.a(), dfc.a::c, dfc.a::new);
      }

      public del b() {
         return this.a;
      }

      public dfc<T> c() {
         return this.b;
      }
   }

   public static record b<T extends dep<?>>(List<dfc.a<T>> a) {
      public static <T extends dep<?>> dfc.b<T> a() {
         return new dfc.b<>(List.of());
      }

      public static <T extends dep<?>> yy<wl, dfc.b<T>> b() {
         return yy.a(dfc.a.<T>a().a(yw.a()), dfc.b::e, dfc.b::new);
      }

      public boolean a(czy $$0) {
         return this.a.stream().anyMatch($$1 -> $$1.a.a($$0));
      }

      public dfc.b<T> b(czy $$0) {
         return new dfc.b<>(this.a.stream().filter($$1 -> $$1.a.a($$0)).toList());
      }

      public boolean c() {
         return this.a.isEmpty();
      }

      public int d() {
         return this.a.size();
      }

      public List<dfc.a<T>> e() {
         return this.a;
      }
   }
}
