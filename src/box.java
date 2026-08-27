import java.util.List;

public enum box {
   a(box.a.c),
   b(box.a.b),
   c(box.a.c),
   d(box.a.d);

   private final box.a e;

   private box(box.a $$0) {
      this.e = $$0;
   }

   public List<epr> a(float $$0, float $$1) {
      return this.e.create($$0, $$1);
   }

   public interface a {
      List<epr> a = List.of(epr.b);
      box.a b = ($$0, $$1) -> a;
      box.a c = ($$0, $$1) -> List.of(new epr(0.0, (double)$$1, 0.0));
      box.a d = ($$0, $$1) -> List.of(new epr(0.0, (double)$$1 / 2.0, 0.0));

      List<epr> create(float var1, float var2);
   }
}
