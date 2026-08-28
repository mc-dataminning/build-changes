import java.util.List;

public enum bww {
   a(bww.a.c),
   b(bww.a.b),
   c(bww.a.c),
   d(bww.a.d);

   private final bww.a e;

   private bww(final bww.a $$0) {
      this.e = $$0;
   }

   public List<ffs> a(float $$0, float $$1) {
      return this.e.create($$0, $$1);
   }

   public interface a {
      List<ffs> a = List.of(ffs.c);
      bww.a b = ($$0, $$1) -> a;
      bww.a c = ($$0, $$1) -> List.of(new ffs(0.0, (double)$$1, 0.0));
      bww.a d = ($$0, $$1) -> List.of(new ffs(0.0, (double)$$1 / 2.0, 0.0));

      List<ffs> create(float var1, float var2);
   }
}
