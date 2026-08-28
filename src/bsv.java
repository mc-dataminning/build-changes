import java.util.List;

public enum bsv {
   a(bsv.a.c),
   b(bsv.a.b),
   c(bsv.a.c),
   d(bsv.a.d);

   private final bsv.a e;

   private bsv(final bsv.a $$0) {
      this.e = $$0;
   }

   public List<evr> a(float $$0, float $$1) {
      return this.e.create($$0, $$1);
   }

   public interface a {
      List<evr> a = List.of(evr.b);
      bsv.a b = ($$0, $$1) -> a;
      bsv.a c = ($$0, $$1) -> List.of(new evr(0.0, (double)$$1, 0.0));
      bsv.a d = ($$0, $$1) -> List.of(new evr(0.0, (double)$$1 / 2.0, 0.0));

      List<evr> create(float var1, float var2);
   }
}
