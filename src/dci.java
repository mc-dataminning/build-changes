import java.util.List;
import java.util.Optional;

public record dci<T extends dbv<?>>(ddg a, Optional<dca<T>> b) {
   public static <T extends dbv<?>> zi<wv, dci<T>> a() {
      return zi.a(ddg.b, dci::b, $$0 -> new dci<>($$0, Optional.empty()));
   }

   public ddg b() {
      return this.a;
   }

   public Optional<dca<T>> c() {
      return this.b;
   }

   public static record a<T extends dbv<?>>(dbr a, dci<T> b) {

      public static <T extends dbv<?>> zi<wv, dci.a<T>> a() {
         return zi.a(dbr.a, dci.a::b, dci.a(), dci.a::c, dci.a::new);
      }

      public dbr b() {
         return this.a;
      }

      public dci<T> c() {
         return this.b;
      }
   }

   public static record b<T extends dbv<?>>(List<dci.a<T>> a) {
      public static <T extends dbv<?>> dci.b<T> a() {
         return new dci.b<>(List.of());
      }

      public static <T extends dbv<?>> zi<wv, dci.b<T>> b() {
         return zi.a(dci.a.<T>a().a(zg.a()), dci.b::e, dci.b::new);
      }

      public boolean a(cxg $$0) {
         return this.a.stream().anyMatch($$1 -> $$1.a.a($$0));
      }

      public dci.b<T> b(cxg $$0) {
         return new dci.b<>(this.a.stream().filter($$1 -> $$1.a.a($$0)).toList());
      }

      public boolean c() {
         return this.a.isEmpty();
      }

      public int d() {
         return this.a.size();
      }

      public List<dci.a<T>> e() {
         return this.a;
      }
   }
}
