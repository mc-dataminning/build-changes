import java.util.List;

public enum bnp {
   a(bnp.a.c),
   b(bnp.a.b),
   c(bnp.a.c),
   d(bnp.a.d);

   private final bnp.a e;

   private bnp(bnp.a $$0) {
      this.e = $$0;
   }

   public List<ens> a(float $$0, float $$1) {
      return this.e.create($$0, $$1);
   }

   public interface a {
      List<ens> a = List.of(ens.b);
      bnp.a b = ($$0, $$1) -> a;
      bnp.a c = ($$0, $$1) -> List.of(new ens(0.0, (double)$$1, 0.0));
      bnp.a d = ($$0, $$1) -> List.of(new ens(0.0, (double)$$1 / 2.0, 0.0));

      List<ens> create(float var1, float var2);
   }
}
