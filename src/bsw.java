import java.util.List;

public enum bsw {
   a(bsw.a.c),
   b(bsw.a.b),
   c(bsw.a.c),
   d(bsw.a.d);

   private final bsw.a e;

   private bsw(final bsw.a $$0) {
      this.e = $$0;
   }

   public List<evs> a(float $$0, float $$1) {
      return this.e.create($$0, $$1);
   }

   public interface a {
      List<evs> a = List.of(evs.b);
      bsw.a b = ($$0, $$1) -> a;
      bsw.a c = ($$0, $$1) -> List.of(new evs(0.0, (double)$$1, 0.0));
      bsw.a d = ($$0, $$1) -> List.of(new evs(0.0, (double)$$1 / 2.0, 0.0));

      List<evs> create(float var1, float var2);
   }
}
