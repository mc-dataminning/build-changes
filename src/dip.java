import java.util.List;
import java.util.stream.Stream;

public class dip<T> {
   private final cot a;
   private final List<T> b;

   public dip(cot $$0, List<T> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public cot a() {
      return this.a;
   }

   public Stream<T> b() {
      return this.b.stream();
   }

   public boolean c() {
      return this.b.isEmpty();
   }
}
