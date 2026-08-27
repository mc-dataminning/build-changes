import java.util.List;
import java.util.stream.Stream;

public class dmw<T> {
   private final csw a;
   private final List<T> b;

   public dmw(csw $$0, List<T> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public csw a() {
      return this.a;
   }

   public Stream<T> b() {
      return this.b.stream();
   }

   public boolean c() {
      return this.b.isEmpty();
   }
}
