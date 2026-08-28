import java.util.List;

public enum bts {
   a(bts.a.c),
   b(bts.a.b),
   c(bts.a.c),
   d(bts.a.d);

   private final bts.a e;

   private bts(final bts.a $$0) {
      this.e = $$0;
   }

   public List<eyw> a(float $$0, float $$1) {
      return this.e.create($$0, $$1);
   }

   public interface a {
      List<eyw> a = List.of(eyw.c);
      bts.a b = ($$0, $$1) -> a;
      bts.a c = ($$0, $$1) -> List.of(new eyw(0.0, (double)$$1, 0.0));
      bts.a d = ($$0, $$1) -> List.of(new eyw(0.0, (double)$$1 / 2.0, 0.0));

      List<eyw> create(float var1, float var2);
   }
}
