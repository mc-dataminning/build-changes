import java.util.List;

public enum bvg {
   a(bvg.a.c),
   b(bvg.a.b),
   c(bvg.a.c),
   d(bvg.a.d);

   private final bvg.a e;

   private bvg(final bvg.a $$0) {
      this.e = $$0;
   }

   public List<fbs> a(float $$0, float $$1) {
      return this.e.create($$0, $$1);
   }

   public interface a {
      List<fbs> a = List.of(fbs.c);
      bvg.a b = ($$0, $$1) -> a;
      bvg.a c = ($$0, $$1) -> List.of(new fbs(0.0, (double)$$1, 0.0));
      bvg.a d = ($$0, $$1) -> List.of(new fbs(0.0, (double)$$1 / 2.0, 0.0));

      List<fbs> create(float var1, float var2);
   }
}
