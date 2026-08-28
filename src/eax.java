import java.util.List;
import java.util.stream.Stream;

public class eax<T> {
   private final dfn a;
   private final List<T> b;

   public eax(dfn $$0, List<T> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public dfn a() {
      return this.a;
   }

   public Stream<T> b() {
      return this.b.stream();
   }

   public boolean c() {
      return this.b.isEmpty();
   }
}
