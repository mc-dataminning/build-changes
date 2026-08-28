import java.util.List;
import java.util.stream.Stream;

public class eec<T> {
   private final dic a;
   private final List<T> b;

   public eec(dic $$0, List<T> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public dic a() {
      return this.a;
   }

   public Stream<T> b() {
      return this.b.stream();
   }

   public boolean c() {
      return this.b.isEmpty();
   }
}
