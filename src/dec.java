import java.util.List;
import java.util.Optional;

public record dec<T extends ddp<?>>(dfb a, Optional<ddu<T>> b) {
   public static <T extends ddp<?>> yw<wj, dec<T>> a() {
      return yw.a(dfb.b, dec::b, $$0 -> new dec<>($$0, Optional.empty()));
   }

   public dfb b() {
      return this.a;
   }

   public Optional<ddu<T>> c() {
      return this.b;
   }

   public static record a<T extends ddp<?>>(ddl a, dec<T> b) {

      public static <T extends ddp<?>> yw<wj, dec.a<T>> a() {
         return yw.a(ddl.a, dec.a::b, dec.a(), dec.a::c, dec.a::new);
      }

      public ddl b() {
         return this.a;
      }

      public dec<T> c() {
         return this.b;
      }
   }

   public static record b<T extends ddp<?>>(List<dec.a<T>> a) {
      public static <T extends ddp<?>> dec.b<T> a() {
         return new dec.b<>(List.of());
      }

      public static <T extends ddp<?>> yw<wj, dec.b<T>> b() {
         return yw.a(dec.a.<T>a().a(yu.a()), dec.b::e, dec.b::new);
      }

      public boolean a(cyy $$0) {
         return this.a.stream().anyMatch($$1 -> $$1.a.a($$0));
      }

      public dec.b<T> b(cyy $$0) {
         return new dec.b<>(this.a.stream().filter($$1 -> $$1.a.a($$0)).toList());
      }

      public boolean c() {
         return this.a.isEmpty();
      }

      public int d() {
         return this.a.size();
      }

      public List<dec.a<T>> e() {
         return this.a;
      }
   }
}
