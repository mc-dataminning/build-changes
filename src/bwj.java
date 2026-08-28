import java.util.List;

public enum bwj {
   a(bwj.a.c),
   b(bwj.a.b),
   c(bwj.a.c),
   d(bwj.a.d);

   private final bwj.a e;

   private bwj(final bwj.a $$0) {
      this.e = $$0;
   }

   public List<fex> a(float $$0, float $$1) {
      return this.e.create($$0, $$1);
   }

   public interface a {
      List<fex> a = List.of(fex.c);
      bwj.a b = ($$0, $$1) -> a;
      bwj.a c = ($$0, $$1) -> List.of(new fex(0.0, (double)$$1, 0.0));
      bwj.a d = ($$0, $$1) -> List.of(new fex(0.0, (double)$$1 / 2.0, 0.0));

      List<fex> create(float var1, float var2);
   }
}
