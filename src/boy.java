import java.util.List;

public enum boy {
   a(boy.a.c),
   b(boy.a.b),
   c(boy.a.c),
   d(boy.a.d);

   private final boy.a e;

   private boy(boy.a $$0) {
      this.e = $$0;
   }

   public List<ept> a(float $$0, float $$1) {
      return this.e.create($$0, $$1);
   }

   public interface a {
      List<ept> a = List.of(ept.b);
      boy.a b = ($$0, $$1) -> a;
      boy.a c = ($$0, $$1) -> List.of(new ept(0.0, (double)$$1, 0.0));
      boy.a d = ($$0, $$1) -> List.of(new ept(0.0, (double)$$1 / 2.0, 0.0));

      List<ept> create(float var1, float var2);
   }
}
