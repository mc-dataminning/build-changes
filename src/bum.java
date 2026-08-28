import java.util.List;

public enum bum {
   a(bum.a.c),
   b(bum.a.b),
   c(bum.a.c),
   d(bum.a.d);

   private final bum.a e;

   private bum(final bum.a $$0) {
      this.e = $$0;
   }

   public List<fba> a(float $$0, float $$1) {
      return this.e.create($$0, $$1);
   }

   public interface a {
      List<fba> a = List.of(fba.c);
      bum.a b = ($$0, $$1) -> a;
      bum.a c = ($$0, $$1) -> List.of(new fba(0.0, (double)$$1, 0.0));
      bum.a d = ($$0, $$1) -> List.of(new fba(0.0, (double)$$1 / 2.0, 0.0));

      List<fba> create(float var1, float var2);
   }
}
