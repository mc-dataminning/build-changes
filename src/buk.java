import java.util.List;

public enum buk {
   a(buk.a.c),
   b(buk.a.b),
   c(buk.a.c),
   d(buk.a.d);

   private final buk.a e;

   private buk(final buk.a $$0) {
      this.e = $$0;
   }

   public List<fay> a(float $$0, float $$1) {
      return this.e.create($$0, $$1);
   }

   public interface a {
      List<fay> a = List.of(fay.c);
      buk.a b = ($$0, $$1) -> a;
      buk.a c = ($$0, $$1) -> List.of(new fay(0.0, (double)$$1, 0.0));
      buk.a d = ($$0, $$1) -> List.of(new fay(0.0, (double)$$1 / 2.0, 0.0));

      List<fay> create(float var1, float var2);
   }
}
