import java.util.List;

public enum bvl {
   a(bvl.a.c),
   b(bvl.a.b),
   c(bvl.a.c),
   d(bvl.a.d);

   private final bvl.a e;

   private bvl(final bvl.a $$0) {
      this.e = $$0;
   }

   public List<fby> a(float $$0, float $$1) {
      return this.e.create($$0, $$1);
   }

   public interface a {
      List<fby> a = List.of(fby.c);
      bvl.a b = ($$0, $$1) -> a;
      bvl.a c = ($$0, $$1) -> List.of(new fby(0.0, (double)$$1, 0.0));
      bvl.a d = ($$0, $$1) -> List.of(new fby(0.0, (double)$$1 / 2.0, 0.0));

      List<fby> create(float var1, float var2);
   }
}
