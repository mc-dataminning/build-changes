import java.util.List;

public enum bri {
   a(bri.a.c),
   b(bri.a.b),
   c(bri.a.c),
   d(bri.a.d);

   private final bri.a e;

   private bri(bri.a $$0) {
      this.e = $$0;
   }

   public List<etp> a(float $$0, float $$1) {
      return this.e.create($$0, $$1);
   }

   public interface a {
      List<etp> a = List.of(etp.b);
      bri.a b = ($$0, $$1) -> a;
      bri.a c = ($$0, $$1) -> List.of(new etp(0.0, (double)$$1, 0.0));
      bri.a d = ($$0, $$1) -> List.of(new etp(0.0, (double)$$1 / 2.0, 0.0));

      List<etp> create(float var1, float var2);
   }
}
