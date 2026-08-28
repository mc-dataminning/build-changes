import java.util.List;

public enum bwg {
   a(bwg.a.c),
   b(bwg.a.b),
   c(bwg.a.c),
   d(bwg.a.d);

   private final bwg.a e;

   private bwg(final bwg.a $$0) {
      this.e = $$0;
   }

   public List<feq> a(float $$0, float $$1) {
      return this.e.create($$0, $$1);
   }

   public interface a {
      List<feq> a = List.of(feq.c);
      bwg.a b = ($$0, $$1) -> a;
      bwg.a c = ($$0, $$1) -> List.of(new feq(0.0, (double)$$1, 0.0));
      bwg.a d = ($$0, $$1) -> List.of(new feq(0.0, (double)$$1 / 2.0, 0.0));

      List<feq> create(float var1, float var2);
   }
}
