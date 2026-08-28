import java.util.List;
import java.util.Optional;

public record dcq<T extends dcd<?>>(ddo a, Optional<dci<T>> b) {
   public static <T extends dcd<?>> zt<xg, dcq<T>> a() {
      return zt.a(ddo.b, dcq::b, $$0 -> new dcq<>($$0, Optional.empty()));
   }

   public ddo b() {
      return this.a;
   }

   public Optional<dci<T>> c() {
      return this.b;
   }

   public static record a<T extends dcd<?>>(dbz a, dcq<T> b) {

      public static <T extends dcd<?>> zt<xg, dcq.a<T>> a() {
         return zt.a(dbz.a, dcq.a::b, dcq.a(), dcq.a::c, dcq.a::new);
      }

      public dbz b() {
         return this.a;
      }

      public dcq<T> c() {
         return this.b;
      }
   }

   public static record b<T extends dcd<?>>(List<dcq.a<T>> a) {
      public static <T extends dcd<?>> dcq.b<T> a() {
         return new dcq.b<>(List.of());
      }

      public static <T extends dcd<?>> zt<xg, dcq.b<T>> b() {
         return zt.a(dcq.a.<T>a().a(zr.a()), dcq.b::e, dcq.b::new);
      }

      public boolean a(cxo $$0) {
         return this.a.stream().anyMatch($$1 -> $$1.a.a($$0));
      }

      public dcq.b<T> b(cxo $$0) {
         return new dcq.b<>(this.a.stream().filter($$1 -> $$1.a.a($$0)).toList());
      }

      public boolean c() {
         return this.a.isEmpty();
      }

      public int d() {
         return this.a.size();
      }

      public List<dcq.a<T>> e() {
         return this.a;
      }
   }
}
