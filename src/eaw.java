import java.util.List;
import java.util.stream.Stream;

public class eaw<T> {
   private final dfm a;
   private final List<T> b;

   public eaw(dfm $$0, List<T> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public dfm a() {
      return this.a;
   }

   public Stream<T> b() {
      return this.b.stream();
   }

   public boolean c() {
      return this.b.isEmpty();
   }
}
