import java.util.List;
import java.util.stream.Stream;

public class ecp<T> {
   private final dgw a;
   private final List<T> b;

   public ecp(dgw $$0, List<T> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public dgw a() {
      return this.a;
   }

   public Stream<T> b() {
      return this.b.stream();
   }

   public boolean c() {
      return this.b.isEmpty();
   }
}
