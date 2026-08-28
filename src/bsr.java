import java.util.List;

public enum bsr {
   a(bsr.a.c),
   b(bsr.a.b),
   c(bsr.a.c),
   d(bsr.a.d);

   private final bsr.a e;

   private bsr(final bsr.a $$0) {
      this.e = $$0;
   }

   public List<eww> a(float $$0, float $$1) {
      return this.e.create($$0, $$1);
   }

   public interface a {
      List<eww> a = List.of(eww.b);
      bsr.a b = ($$0, $$1) -> a;
      bsr.a c = ($$0, $$1) -> List.of(new eww(0.0, (double)$$1, 0.0));
      bsr.a d = ($$0, $$1) -> List.of(new eww(0.0, (double)$$1 / 2.0, 0.0));

      List<eww> create(float var1, float var2);
   }
}
