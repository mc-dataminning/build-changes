import java.util.List;
import java.util.stream.Stream;

public class dvv<T> {
   private final dba a;
   private final List<T> b;

   public dvv(dba $$0, List<T> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public dba a() {
      return this.a;
   }

   public Stream<T> b() {
      return this.b.stream();
   }

   public boolean c() {
      return this.b.isEmpty();
   }
}
