import java.util.List;

public enum brv {
   a(brv.a.c),
   b(brv.a.b),
   c(brv.a.c),
   d(brv.a.d);

   private final brv.a e;

   private brv(brv.a $$0) {
      this.e = $$0;
   }

   public List<euk> a(float $$0, float $$1) {
      return this.e.create($$0, $$1);
   }

   public interface a {
      List<euk> a = List.of(euk.b);
      brv.a b = ($$0, $$1) -> a;
      brv.a c = ($$0, $$1) -> List.of(new euk(0.0, (double)$$1, 0.0));
      brv.a d = ($$0, $$1) -> List.of(new euk(0.0, (double)$$1 / 2.0, 0.0));

      List<euk> create(float var1, float var2);
   }
}
