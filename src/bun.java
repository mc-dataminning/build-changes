import java.util.List;

public enum bun {
   a(bun.a.c),
   b(bun.a.b),
   c(bun.a.c),
   d(bun.a.d);

   private final bun.a e;

   private bun(final bun.a $$0) {
      this.e = $$0;
   }

   public List<fbb> a(float $$0, float $$1) {
      return this.e.create($$0, $$1);
   }

   public interface a {
      List<fbb> a = List.of(fbb.c);
      bun.a b = ($$0, $$1) -> a;
      bun.a c = ($$0, $$1) -> List.of(new fbb(0.0, (double)$$1, 0.0));
      bun.a d = ($$0, $$1) -> List.of(new fbb(0.0, (double)$$1 / 2.0, 0.0));

      List<fbb> create(float var1, float var2);
   }
}
