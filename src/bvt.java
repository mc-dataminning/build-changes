import java.util.List;

public enum bvt {
   a(bvt.a.c),
   b(bvt.a.b),
   c(bvt.a.c),
   d(bvt.a.d);

   private final bvt.a e;

   private bvt(final bvt.a $$0) {
      this.e = $$0;
   }

   public List<fcu> a(float $$0, float $$1) {
      return this.e.create($$0, $$1);
   }

   public interface a {
      List<fcu> a = List.of(fcu.c);
      bvt.a b = ($$0, $$1) -> a;
      bvt.a c = ($$0, $$1) -> List.of(new fcu(0.0, (double)$$1, 0.0));
      bvt.a d = ($$0, $$1) -> List.of(new fcu(0.0, (double)$$1 / 2.0, 0.0));

      List<fcu> create(float var1, float var2);
   }
}
