import java.util.List;
import java.util.Optional;

public record dcr<T extends dce<?>>(ddp a, Optional<dcj<T>> b) {
   public static <T extends dce<?>> zt<xg, dcr<T>> a() {
      return zt.a(ddp.b, dcr::b, $$0 -> new dcr<>($$0, Optional.empty()));
   }

   public ddp b() {
      return this.a;
   }

   public Optional<dcj<T>> c() {
      return this.b;
   }

   public static record a<T extends dce<?>>(dca a, dcr<T> b) {

      public static <T extends dce<?>> zt<xg, dcr.a<T>> a() {
         return zt.a(dca.a, dcr.a::b, dcr.a(), dcr.a::c, dcr.a::new);
      }

      public dca b() {
         return this.a;
      }

      public dcr<T> c() {
         return this.b;
      }
   }

   public static record b<T extends dce<?>>(List<dcr.a<T>> a) {
      public static <T extends dce<?>> dcr.b<T> a() {
         return new dcr.b<>(List.of());
      }

      public static <T extends dce<?>> zt<xg, dcr.b<T>> b() {
         return zt.a(dcr.a.<T>a().a(zr.a()), dcr.b::e, dcr.b::new);
      }

      public boolean a(cxp $$0) {
         return this.a.stream().anyMatch($$1 -> $$1.a.a($$0));
      }

      public dcr.b<T> b(cxp $$0) {
         return new dcr.b<>(this.a.stream().filter($$1 -> $$1.a.a($$0)).toList());
      }

      public boolean c() {
         return this.a.isEmpty();
      }

      public int d() {
         return this.a.size();
      }

      public List<dcr.a<T>> e() {
         return this.a;
      }
   }
}
