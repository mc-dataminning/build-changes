import java.util.List;

public enum bua {
   a(bua.a.c),
   b(bua.a.b),
   c(bua.a.c),
   d(bua.a.d);

   private final bua.a e;

   private bua(final bua.a $$0) {
      this.e = $$0;
   }

   public List<ezh> a(float $$0, float $$1) {
      return this.e.create($$0, $$1);
   }

   public interface a {
      List<ezh> a = List.of(ezh.c);
      bua.a b = ($$0, $$1) -> a;
      bua.a c = ($$0, $$1) -> List.of(new ezh(0.0, (double)$$1, 0.0));
      bua.a d = ($$0, $$1) -> List.of(new ezh(0.0, (double)$$1 / 2.0, 0.0));

      List<ezh> create(float var1, float var2);
   }
}
