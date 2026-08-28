import java.util.List;

public enum bsu {
   a(bsu.a.c),
   b(bsu.a.b),
   c(bsu.a.c),
   d(bsu.a.d);

   private final bsu.a e;

   private bsu(final bsu.a $$0) {
      this.e = $$0;
   }

   public List<evq> a(float $$0, float $$1) {
      return this.e.create($$0, $$1);
   }

   public interface a {
      List<evq> a = List.of(evq.b);
      bsu.a b = ($$0, $$1) -> a;
      bsu.a c = ($$0, $$1) -> List.of(new evq(0.0, (double)$$1, 0.0));
      bsu.a d = ($$0, $$1) -> List.of(new evq(0.0, (double)$$1 / 2.0, 0.0));

      List<evq> create(float var1, float var2);
   }
}
