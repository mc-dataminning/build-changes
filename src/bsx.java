import java.util.List;

public enum bsx {
   a(bsx.a.c),
   b(bsx.a.b),
   c(bsx.a.c),
   d(bsx.a.d);

   private final bsx.a e;

   private bsx(final bsx.a $$0) {
      this.e = $$0;
   }

   public List<evt> a(float $$0, float $$1) {
      return this.e.create($$0, $$1);
   }

   public interface a {
      List<evt> a = List.of(evt.b);
      bsx.a b = ($$0, $$1) -> a;
      bsx.a c = ($$0, $$1) -> List.of(new evt(0.0, (double)$$1, 0.0));
      bsx.a d = ($$0, $$1) -> List.of(new evt(0.0, (double)$$1 / 2.0, 0.0));

      List<evt> create(float var1, float var2);
   }
}
