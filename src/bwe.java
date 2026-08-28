import java.util.List;

public enum bwe {
   a(bwe.a.c),
   b(bwe.a.b),
   c(bwe.a.c),
   d(bwe.a.d);

   private final bwe.a e;

   private bwe(final bwe.a $$0) {
      this.e = $$0;
   }

   public List<fei> a(float $$0, float $$1) {
      return this.e.create($$0, $$1);
   }

   public interface a {
      List<fei> a = List.of(fei.c);
      bwe.a b = ($$0, $$1) -> a;
      bwe.a c = ($$0, $$1) -> List.of(new fei(0.0, (double)$$1, 0.0));
      bwe.a d = ($$0, $$1) -> List.of(new fei(0.0, (double)$$1 / 2.0, 0.0));

      List<fei> create(float var1, float var2);
   }
}
