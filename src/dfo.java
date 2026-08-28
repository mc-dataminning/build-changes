import java.util.List;
import java.util.Optional;

public record dfo<T extends dfb<?>>(dgn a, Optional<dfg<T>> b) {
   public static <T extends dfb<?>> ze<wp, dfo<T>> a() {
      return ze.a(dgn.b, dfo::b, $$0 -> new dfo<>($$0, Optional.empty()));
   }

   public dgn b() {
      return this.a;
   }

   public Optional<dfg<T>> c() {
      return this.b;
   }

   public static record a<T extends dfb<?>>(dex a, dfo<T> b) {

      public static <T extends dfb<?>> ze<wp, dfo.a<T>> a() {
         return ze.a(dex.a, dfo.a::b, dfo.a(), dfo.a::c, dfo.a::new);
      }

      public dex b() {
         return this.a;
      }

      public dfo<T> c() {
         return this.b;
      }
   }

   public static record b<T extends dfb<?>>(List<dfo.a<T>> a) {
      public static <T extends dfb<?>> dfo.b<T> a() {
         return new dfo.b<>(List.of());
      }

      public static <T extends dfb<?>> ze<wp, dfo.b<T>> b() {
         return ze.a(dfo.a.<T>a().a(zc.a()), dfo.b::e, dfo.b::new);
      }

      public boolean a(dak $$0) {
         return this.a.stream().anyMatch($$1 -> $$1.a.a($$0));
      }

      public dfo.b<T> b(dak $$0) {
         return new dfo.b<>(this.a.stream().filter($$1 -> $$1.a.a($$0)).toList());
      }

      public boolean c() {
         return this.a.isEmpty();
      }

      public int d() {
         return this.a.size();
      }

      public List<dfo.a<T>> e() {
         return this.a;
      }
   }
}
