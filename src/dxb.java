import java.util.List;
import java.util.stream.Stream;

public class dxb<T> {
   private final dcb a;
   private final List<T> b;

   public dxb(dcb $$0, List<T> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public dcb a() {
      return this.a;
   }

   public Stream<T> b() {
      return this.b.stream();
   }

   public boolean c() {
      return this.b.isEmpty();
   }
}
