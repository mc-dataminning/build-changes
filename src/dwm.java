import java.util.List;
import java.util.stream.Stream;

public class dwm<T> {
   private final dbn a;
   private final List<T> b;

   public dwm(dbn $$0, List<T> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public dbn a() {
      return this.a;
   }

   public Stream<T> b() {
      return this.b.stream();
   }

   public boolean c() {
      return this.b.isEmpty();
   }
}
