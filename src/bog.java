import java.util.List;

public enum bog {
   a(bog.a.c),
   b(bog.a.b),
   c(bog.a.c),
   d(bog.a.d);

   private final bog.a e;

   private bog(bog.a $$0) {
      this.e = $$0;
   }

   public List<eov> a(float $$0, float $$1) {
      return this.e.create($$0, $$1);
   }

   public interface a {
      List<eov> a = List.of(eov.b);
      bog.a b = ($$0, $$1) -> a;
      bog.a c = ($$0, $$1) -> List.of(new eov(0.0, (double)$$1, 0.0));
      bog.a d = ($$0, $$1) -> List.of(new eov(0.0, (double)$$1 / 2.0, 0.0));

      List<eov> create(float var1, float var2);
   }
}
