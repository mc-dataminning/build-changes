import java.util.List;
import java.util.Optional;

public record dbs<T extends dbf<?>>(dcq a, Optional<dbk<T>> b) {
   public static <T extends dbf<?>> yn<wa, dbs<T>> a() {
      return yn.a(dcq.b, dbs::b, $$0 -> new dbs<>($$0, Optional.empty()));
   }

   public dcq b() {
      return this.a;
   }

   public Optional<dbk<T>> c() {
      return this.b;
   }

   public static record a<T extends dbf<?>>(dbb a, dbs<T> b) {

      public static <T extends dbf<?>> yn<wa, dbs.a<T>> a() {
         return yn.a(dbb.a, dbs.a::b, dbs.a(), dbs.a::c, dbs.a::new);
      }

      public dbb b() {
         return this.a;
      }

      public dbs<T> c() {
         return this.b;
      }
   }

   public static record b<T extends dbf<?>>(List<dbs.a<T>> a) {
      public static <T extends dbf<?>> dbs.b<T> a() {
         return new dbs.b<>(List.of());
      }

      public static <T extends dbf<?>> yn<wa, dbs.b<T>> b() {
         return yn.a(dbs.a.<T>a().a(yl.a()), dbs.b::e, dbs.b::new);
      }

      public boolean a(cwq $$0) {
         return this.a.stream().anyMatch($$1 -> $$1.a.a($$0));
      }

      public dbs.b<T> b(cwq $$0) {
         return new dbs.b<>(this.a.stream().filter($$1 -> $$1.a.a($$0)).toList());
      }

      public boolean c() {
         return this.a.isEmpty();
      }

      public int d() {
         return this.a.size();
      }

      public List<dbs.a<T>> e() {
         return this.a;
      }
   }
}
