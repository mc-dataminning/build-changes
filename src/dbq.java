import java.util.List;
import java.util.Optional;

public record dbq<T extends dbd<?>>(dco a, Optional<dbi<T>> b) {
   public static <T extends dbd<?>> yn<wa, dbq<T>> a() {
      return yn.a(dco.b, dbq::b, $$0 -> new dbq<>($$0, Optional.empty()));
   }

   public dco b() {
      return this.a;
   }

   public Optional<dbi<T>> c() {
      return this.b;
   }

   public static record a<T extends dbd<?>>(daz a, dbq<T> b) {

      public static <T extends dbd<?>> yn<wa, dbq.a<T>> a() {
         return yn.a(daz.a, dbq.a::b, dbq.a(), dbq.a::c, dbq.a::new);
      }

      public daz b() {
         return this.a;
      }

      public dbq<T> c() {
         return this.b;
      }
   }

   public static record b<T extends dbd<?>>(List<dbq.a<T>> a) {
      public static <T extends dbd<?>> dbq.b<T> a() {
         return new dbq.b<>(List.of());
      }

      public static <T extends dbd<?>> yn<wa, dbq.b<T>> b() {
         return yn.a(dbq.a.<T>a().a(yl.a()), dbq.b::e, dbq.b::new);
      }

      public boolean a(cwo $$0) {
         return this.a.stream().anyMatch($$1 -> $$1.a.a($$0));
      }

      public dbq.b<T> b(cwo $$0) {
         return new dbq.b<>(this.a.stream().filter($$1 -> $$1.a.a($$0)).toList());
      }

      public boolean c() {
         return this.a.isEmpty();
      }

      public int d() {
         return this.a.size();
      }

      public List<dbq.a<T>> e() {
         return this.a;
      }
   }
}
