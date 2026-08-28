import java.util.List;

public enum bsi {
   a(bsi.a.c),
   b(bsi.a.b),
   c(bsi.a.c),
   d(bsi.a.d);

   private final bsi.a e;

   private bsi(final bsi.a $$0) {
      this.e = $$0;
   }

   public List<ewh> a(float $$0, float $$1) {
      return this.e.create($$0, $$1);
   }

   public interface a {
      List<ewh> a = List.of(ewh.b);
      bsi.a b = ($$0, $$1) -> a;
      bsi.a c = ($$0, $$1) -> List.of(new ewh(0.0, (double)$$1, 0.0));
      bsi.a d = ($$0, $$1) -> List.of(new ewh(0.0, (double)$$1 / 2.0, 0.0));

      List<ewh> create(float var1, float var2);
   }
}
