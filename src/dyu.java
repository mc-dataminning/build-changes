import java.util.List;
import java.util.stream.Stream;

public class dyu<T> {
   private final ddp a;
   private final List<T> b;

   public dyu(ddp $$0, List<T> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public ddp a() {
      return this.a;
   }

   public Stream<T> b() {
      return this.b.stream();
   }

   public boolean c() {
      return this.b.isEmpty();
   }
}
