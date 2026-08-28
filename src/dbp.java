import java.util.List;
import java.util.Optional;

public record dbp<T extends dbc<?>>(dcn a, Optional<dbh<T>> b) {
   public static <T extends dbc<?>> ym<vz, dbp<T>> a() {
      return ym.a(dcn.b, dbp::b, $$0 -> new dbp<>($$0, Optional.empty()));
   }

   public dcn b() {
      return this.a;
   }

   public Optional<dbh<T>> c() {
      return this.b;
   }

   public static record a<T extends dbc<?>>(day a, dbp<T> b) {

      public static <T extends dbc<?>> ym<vz, dbp.a<T>> a() {
         return ym.a(day.a, dbp.a::b, dbp.a(), dbp.a::c, dbp.a::new);
      }

      public day b() {
         return this.a;
      }

      public dbp<T> c() {
         return this.b;
      }
   }

   public static record b<T extends dbc<?>>(List<dbp.a<T>> a) {
      public static <T extends dbc<?>> dbp.b<T> a() {
         return new dbp.b<>(List.of());
      }

      public static <T extends dbc<?>> ym<vz, dbp.b<T>> b() {
         return ym.a(dbp.a.<T>a().a(yk.a()), dbp.b::e, dbp.b::new);
      }

      public boolean a(cwn $$0) {
         return this.a.stream().anyMatch($$1 -> $$1.a.a($$0));
      }

      public dbp.b<T> b(cwn $$0) {
         return new dbp.b<>(this.a.stream().filter($$1 -> $$1.a.a($$0)).toList());
      }

      public boolean c() {
         return this.a.isEmpty();
      }

      public int d() {
         return this.a.size();
      }

      public List<dbp.a<T>> e() {
         return this.a;
      }
   }
}
