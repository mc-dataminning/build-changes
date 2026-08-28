import java.util.List;
import java.util.Optional;

public record dcl<T extends dbz<?>>(ddi a, Optional<dcd<T>> b) {
   public static <T extends dbz<?>> zt<xg, dcl<T>> a() {
      return zt.a(ddi.b, dcl::b, $$0 -> new dcl<>($$0, Optional.empty()));
   }

   public ddi b() {
      return this.a;
   }

   public Optional<dcd<T>> c() {
      return this.b;
   }

   public static record a<T extends dbz<?>>(dbv a, dcl<T> b) {

      public static <T extends dbz<?>> zt<xg, dcl.a<T>> a() {
         return zt.a(dbv.a, dcl.a::b, dcl.a(), dcl.a::c, dcl.a::new);
      }

      public dbv b() {
         return this.a;
      }

      public dcl<T> c() {
         return this.b;
      }
   }

   public static record b<T extends dbz<?>>(List<dcl.a<T>> a) {
      public static <T extends dbz<?>> dcl.b<T> a() {
         return new dcl.b<>(List.of());
      }

      public static <T extends dbz<?>> zt<xg, dcl.b<T>> b() {
         return zt.a(dcl.a.<T>a().a(zr.a()), dcl.b::e, dcl.b::new);
      }

      public boolean a(cxk $$0) {
         return this.a.stream().anyMatch($$1 -> $$1.a.a($$0));
      }

      public dcl.b<T> b(cxk $$0) {
         return new dcl.b<>(this.a.stream().filter($$1 -> $$1.a.a($$0)).toList());
      }

      public boolean c() {
         return this.a.isEmpty();
      }

      public int d() {
         return this.a.size();
      }

      public List<dcl.a<T>> e() {
         return this.a;
      }
   }
}
