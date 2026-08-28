import java.util.List;

public enum bxf {
   a(bxf.a.c),
   b(bxf.a.b),
   c(bxf.a.c),
   d(bxf.a.d);

   private final bxf.a e;

   private bxf(final bxf.a $$0) {
      this.e = $$0;
   }

   public List<fgc> a(float $$0, float $$1) {
      return this.e.create($$0, $$1);
   }

   public interface a {
      List<fgc> a = List.of(fgc.c);
      bxf.a b = ($$0, $$1) -> a;
      bxf.a c = ($$0, $$1) -> List.of(new fgc(0.0, (double)$$1, 0.0));
      bxf.a d = ($$0, $$1) -> List.of(new fgc(0.0, (double)$$1 / 2.0, 0.0));

      List<fgc> create(float var1, float var2);
   }
}
