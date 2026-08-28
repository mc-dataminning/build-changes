import java.util.List;

public enum bsq {
   a(bsq.a.c),
   b(bsq.a.b),
   c(bsq.a.c),
   d(bsq.a.d);

   private final bsq.a e;

   private bsq(final bsq.a $$0) {
      this.e = $$0;
   }

   public List<evm> a(float $$0, float $$1) {
      return this.e.create($$0, $$1);
   }

   public interface a {
      List<evm> a = List.of(evm.b);
      bsq.a b = ($$0, $$1) -> a;
      bsq.a c = ($$0, $$1) -> List.of(new evm(0.0, (double)$$1, 0.0));
      bsq.a d = ($$0, $$1) -> List.of(new evm(0.0, (double)$$1 / 2.0, 0.0));

      List<evm> create(float var1, float var2);
   }
}
