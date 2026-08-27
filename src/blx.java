import java.util.List;

public enum blx {
   a(blx.a.c),
   b(blx.a.b),
   c(blx.a.c);

   private final blx.a d;

   private blx(blx.a $$0) {
      this.d = $$0;
   }

   public List<emc> a(float $$0, float $$1) {
      return this.d.create($$0, $$1);
   }

   public interface a {
      List<emc> a = List.of(emc.b);
      blx.a b = ($$0, $$1) -> a;
      blx.a c = ($$0, $$1) -> List.of(new emc(0.0, (double)$$1, 0.0));

      List<emc> create(float var1, float var2);
   }
}
