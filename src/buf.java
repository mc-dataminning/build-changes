import java.util.List;

public enum buf {
   a(buf.a.c),
   b(buf.a.b),
   c(buf.a.c),
   d(buf.a.d);

   private final buf.a e;

   private buf(final buf.a $$0) {
      this.e = $$0;
   }

   public List<ezn> a(float $$0, float $$1) {
      return this.e.create($$0, $$1);
   }

   public interface a {
      List<ezn> a = List.of(ezn.c);
      buf.a b = ($$0, $$1) -> a;
      buf.a c = ($$0, $$1) -> List.of(new ezn(0.0, (double)$$1, 0.0));
      buf.a d = ($$0, $$1) -> List.of(new ezn(0.0, (double)$$1 / 2.0, 0.0));

      List<ezn> create(float var1, float var2);
   }
}
