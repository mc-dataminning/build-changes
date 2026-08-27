import java.util.List;

public enum bqm {
   a(bqm.a.c),
   b(bqm.a.b),
   c(bqm.a.c),
   d(bqm.a.d);

   private final bqm.a e;

   private bqm(bqm.a $$0) {
      this.e = $$0;
   }

   public List<etf> a(float $$0, float $$1) {
      return this.e.create($$0, $$1);
   }

   public interface a {
      List<etf> a = List.of(etf.b);
      bqm.a b = ($$0, $$1) -> a;
      bqm.a c = ($$0, $$1) -> List.of(new etf(0.0, (double)$$1, 0.0));
      bqm.a d = ($$0, $$1) -> List.of(new etf(0.0, (double)$$1 / 2.0, 0.0));

      List<etf> create(float var1, float var2);
   }
}
