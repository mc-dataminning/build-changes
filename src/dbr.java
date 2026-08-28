import java.util.List;
import java.util.Optional;

public record dbr<T extends dbe<?>>(dcp a, Optional<dbj<T>> b) {
   public static <T extends dbe<?>> yn<wa, dbr<T>> a() {
      return yn.a(dcp.b, dbr::b, $$0 -> new dbr<>($$0, Optional.empty()));
   }

   public dcp b() {
      return this.a;
   }

   public Optional<dbj<T>> c() {
      return this.b;
   }

   public static record a<T extends dbe<?>>(dba a, dbr<T> b) {

      public static <T extends dbe<?>> yn<wa, dbr.a<T>> a() {
         return yn.a(dba.a, dbr.a::b, dbr.a(), dbr.a::c, dbr.a::new);
      }

      public dba b() {
         return this.a;
      }

      public dbr<T> c() {
         return this.b;
      }
   }

   public static record b<T extends dbe<?>>(List<dbr.a<T>> a) {
      public static <T extends dbe<?>> dbr.b<T> a() {
         return new dbr.b<>(List.of());
      }

      public static <T extends dbe<?>> yn<wa, dbr.b<T>> b() {
         return yn.a(dbr.a.<T>a().a(yl.a()), dbr.b::e, dbr.b::new);
      }

      public boolean a(cwp $$0) {
         return this.a.stream().anyMatch($$1 -> $$1.a.a($$0));
      }

      public dbr.b<T> b(cwp $$0) {
         return new dbr.b<>(this.a.stream().filter($$1 -> $$1.a.a($$0)).toList());
      }

      public boolean c() {
         return this.a.isEmpty();
      }

      public int d() {
         return this.a.size();
      }

      public List<dbr.a<T>> e() {
         return this.a;
      }
   }
}
