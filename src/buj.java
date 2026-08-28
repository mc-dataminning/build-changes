import java.util.List;

public enum buj {
   a(buj.a.c),
   b(buj.a.b),
   c(buj.a.c),
   d(buj.a.d);

   private final buj.a e;

   private buj(final buj.a $$0) {
      this.e = $$0;
   }

   public List<ezr> a(float $$0, float $$1) {
      return this.e.create($$0, $$1);
   }

   public interface a {
      List<ezr> a = List.of(ezr.c);
      buj.a b = ($$0, $$1) -> a;
      buj.a c = ($$0, $$1) -> List.of(new ezr(0.0, (double)$$1, 0.0));
      buj.a d = ($$0, $$1) -> List.of(new ezr(0.0, (double)$$1 / 2.0, 0.0));

      List<ezr> create(float var1, float var2);
   }
}
