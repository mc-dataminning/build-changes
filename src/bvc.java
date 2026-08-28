import java.util.List;

public enum bvc {
   a(bvc.a.c),
   b(bvc.a.b),
   c(bvc.a.c),
   d(bvc.a.d);

   private final bvc.a e;

   private bvc(final bvc.a $$0) {
      this.e = $$0;
   }

   public List<fbr> a(float $$0, float $$1) {
      return this.e.create($$0, $$1);
   }

   public interface a {
      List<fbr> a = List.of(fbr.c);
      bvc.a b = ($$0, $$1) -> a;
      bvc.a c = ($$0, $$1) -> List.of(new fbr(0.0, (double)$$1, 0.0));
      bvc.a d = ($$0, $$1) -> List.of(new fbr(0.0, (double)$$1 / 2.0, 0.0));

      List<fbr> create(float var1, float var2);
   }
}
