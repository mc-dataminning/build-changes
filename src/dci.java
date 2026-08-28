import java.util.List;
import java.util.Optional;

public record dci<T extends dbv<?>>(ddh a, Optional<dca<T>> b) {
   public static <T extends dbv<?>> yn<wa, dci<T>> a() {
      return yn.a(ddh.b, dci::b, $$0 -> new dci<>($$0, Optional.empty()));
   }

   public ddh b() {
      return this.a;
   }

   public Optional<dca<T>> c() {
      return this.b;
   }

   public static record a<T extends dbv<?>>(dbr a, dci<T> b) {

      public static <T extends dbv<?>> yn<wa, dci.a<T>> a() {
         return yn.a(dbr.a, dci.a::b, dci.a(), dci.a::c, dci.a::new);
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

      public static <T extends dbv<?>> yn<wa, dci.b<T>> b() {
         return yn.a(dci.a.<T>a().a(yl.a()), dci.b::e, dci.b::new);
      }

      public boolean a(cxh $$0) {
         return this.a.stream().anyMatch($$1 -> $$1.a.a($$0));
      }

      public dci.b<T> b(cxh $$0) {
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
