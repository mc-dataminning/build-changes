import java.util.List;

public enum bqb {
   a(bqb.a.c),
   b(bqb.a.b),
   c(bqb.a.c),
   d(bqb.a.d);

   private final bqb.a e;

   private bqb(bqb.a $$0) {
      this.e = $$0;
   }

   public List<esj> a(float $$0, float $$1) {
      return this.e.create($$0, $$1);
   }

   public interface a {
      List<esj> a = List.of(esj.b);
      bqb.a b = ($$0, $$1) -> a;
      bqb.a c = ($$0, $$1) -> List.of(new esj(0.0, (double)$$1, 0.0));
      bqb.a d = ($$0, $$1) -> List.of(new esj(0.0, (double)$$1 / 2.0, 0.0));

      List<esj> create(float var1, float var2);
   }
}
