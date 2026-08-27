import java.util.List;

public enum bnr {
   a(bnr.a.c),
   b(bnr.a.b),
   c(bnr.a.c),
   d(bnr.a.d);

   private final bnr.a e;

   private bnr(bnr.a $$0) {
      this.e = $$0;
   }

   public List<enz> a(float $$0, float $$1) {
      return this.e.create($$0, $$1);
   }

   public interface a {
      List<enz> a = List.of(enz.b);
      bnr.a b = ($$0, $$1) -> a;
      bnr.a c = ($$0, $$1) -> List.of(new enz(0.0, (double)$$1, 0.0));
      bnr.a d = ($$0, $$1) -> List.of(new enz(0.0, (double)$$1 / 2.0, 0.0));

      List<enz> create(float var1, float var2);
   }
}
