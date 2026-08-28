import java.util.List;
import java.util.Optional;

public record dcy<T extends dcl<?>>(ddx a, Optional<dcq<T>> b) {
   public static <T extends dcl<?>> yt<wg, dcy<T>> a() {
      return yt.a(ddx.b, dcy::b, $$0 -> new dcy<>($$0, Optional.empty()));
   }

   public ddx b() {
      return this.a;
   }

   public Optional<dcq<T>> c() {
      return this.b;
   }

   public static record a<T extends dcl<?>>(dch a, dcy<T> b) {

      public static <T extends dcl<?>> yt<wg, dcy.a<T>> a() {
         return yt.a(dch.a, dcy.a::b, dcy.a(), dcy.a::c, dcy.a::new);
      }

      public dch b() {
         return this.a;
      }

      public dcy<T> c() {
         return this.b;
      }
   }

   public static record b<T extends dcl<?>>(List<dcy.a<T>> a) {
      public static <T extends dcl<?>> dcy.b<T> a() {
         return new dcy.b<>(List.of());
      }

      public static <T extends dcl<?>> yt<wg, dcy.b<T>> b() {
         return yt.a(dcy.a.<T>a().a(yr.a()), dcy.b::e, dcy.b::new);
      }

      public boolean a(cxy $$0) {
         return this.a.stream().anyMatch($$1 -> $$1.a.a($$0));
      }

      public dcy.b<T> b(cxy $$0) {
         return new dcy.b<>(this.a.stream().filter($$1 -> $$1.a.a($$0)).toList());
      }

      public boolean c() {
         return this.a.isEmpty();
      }

      public int d() {
         return this.a.size();
      }

      public List<dcy.a<T>> e() {
         return this.a;
      }
   }
}
