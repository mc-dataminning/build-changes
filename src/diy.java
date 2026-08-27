import java.util.List;
import java.util.stream.Stream;

public class diy<T> {
   private final cpc a;
   private final List<T> b;

   public diy(cpc $$0, List<T> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public cpc a() {
      return this.a;
   }

   public Stream<T> b() {
      return this.b.stream();
   }

   public boolean c() {
      return this.b.isEmpty();
   }
}
