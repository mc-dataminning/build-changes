import java.util.List;
import java.util.stream.Stream;

public class dme<T> {
   private final csf a;
   private final List<T> b;

   public dme(csf $$0, List<T> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public csf a() {
      return this.a;
   }

   public Stream<T> b() {
      return this.b.stream();
   }

   public boolean c() {
      return this.b.isEmpty();
   }
}
