import java.util.List;

public enum brx {
   a(brx.a.c),
   b(brx.a.b),
   c(brx.a.c),
   d(brx.a.d);

   private final brx.a e;

   private brx(brx.a $$0) {
      this.e = $$0;
   }

   public List<eum> a(float $$0, float $$1) {
      return this.e.create($$0, $$1);
   }

   public interface a {
      List<eum> a = List.of(eum.b);
      brx.a b = ($$0, $$1) -> a;
      brx.a c = ($$0, $$1) -> List.of(new eum(0.0, (double)$$1, 0.0));
      brx.a d = ($$0, $$1) -> List.of(new eum(0.0, (double)$$1 / 2.0, 0.0));

      List<eum> create(float var1, float var2);
   }
}
