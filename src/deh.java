import java.util.List;
import java.util.Optional;

public record deh<T extends ddu<?>>(dfg a, Optional<ddz<T>> b) {
   public static <T extends ddu<?>> yw<wj, deh<T>> a() {
      return yw.a(dfg.b, deh::b, $$0 -> new deh<>($$0, Optional.empty()));
   }

   public dfg b() {
      return this.a;
   }

   public Optional<ddz<T>> c() {
      return this.b;
   }

   public static record a<T extends ddu<?>>(ddq a, deh<T> b) {

      public static <T extends ddu<?>> yw<wj, deh.a<T>> a() {
         return yw.a(ddq.a, deh.a::b, deh.a(), deh.a::c, deh.a::new);
      }

      public ddq b() {
         return this.a;
      }

      public deh<T> c() {
         return this.b;
      }
   }

   public static record b<T extends ddu<?>>(List<deh.a<T>> a) {
      public static <T extends ddu<?>> deh.b<T> a() {
         return new deh.b<>(List.of());
      }

      public static <T extends ddu<?>> yw<wj, deh.b<T>> b() {
         return yw.a(deh.a.<T>a().a(yu.a()), deh.b::e, deh.b::new);
      }

      public boolean a(czd $$0) {
         return this.a.stream().anyMatch($$1 -> $$1.a.a($$0));
      }

      public deh.b<T> b(czd $$0) {
         return new deh.b<>(this.a.stream().filter($$1 -> $$1.a.a($$0)).toList());
      }

      public boolean c() {
         return this.a.isEmpty();
      }

      public int d() {
         return this.a.size();
      }

      public List<deh.a<T>> e() {
         return this.a;
      }
   }
}
