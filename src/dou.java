import java.util.List;
import java.util.stream.Stream;

public class dou<T> {
   private final cuu a;
   private final List<T> b;

   public dou(cuu $$0, List<T> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public cuu a() {
      return this.a;
   }

   public Stream<T> b() {
      return this.b.stream();
   }

   public boolean c() {
      return this.b.isEmpty();
   }
}
