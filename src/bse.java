import java.util.List;

public enum bse {
   a(bse.a.c),
   b(bse.a.b),
   c(bse.a.c),
   d(bse.a.d);

   private final bse.a e;

   private bse(final bse.a $$0) {
      this.e = $$0;
   }

   public List<evz> a(float $$0, float $$1) {
      return this.e.create($$0, $$1);
   }

   public interface a {
      List<evz> a = List.of(evz.b);
      bse.a b = ($$0, $$1) -> a;
      bse.a c = ($$0, $$1) -> List.of(new evz(0.0, (double)$$1, 0.0));
      bse.a d = ($$0, $$1) -> List.of(new evz(0.0, (double)$$1 / 2.0, 0.0));

      List<evz> create(float var1, float var2);
   }
}
