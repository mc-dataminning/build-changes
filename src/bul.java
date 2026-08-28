import java.util.List;

public enum bul {
   a(bul.a.c),
   b(bul.a.b),
   c(bul.a.c),
   d(bul.a.d);

   private final bul.a e;

   private bul(final bul.a $$0) {
      this.e = $$0;
   }

   public List<faz> a(float $$0, float $$1) {
      return this.e.create($$0, $$1);
   }

   public interface a {
      List<faz> a = List.of(faz.c);
      bul.a b = ($$0, $$1) -> a;
      bul.a c = ($$0, $$1) -> List.of(new faz(0.0, (double)$$1, 0.0));
      bul.a d = ($$0, $$1) -> List.of(new faz(0.0, (double)$$1 / 2.0, 0.0));

      List<faz> create(float var1, float var2);
   }
}
