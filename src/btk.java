import java.util.List;

public enum btk {
   a(btk.a.c),
   b(btk.a.b),
   c(btk.a.c),
   d(btk.a.d);

   private final btk.a e;

   private btk(final btk.a $$0) {
      this.e = $$0;
   }

   public List<eye> a(float $$0, float $$1) {
      return this.e.create($$0, $$1);
   }

   public interface a {
      List<eye> a = List.of(eye.c);
      btk.a b = ($$0, $$1) -> a;
      btk.a c = ($$0, $$1) -> List.of(new eye(0.0, (double)$$1, 0.0));
      btk.a d = ($$0, $$1) -> List.of(new eye(0.0, (double)$$1 / 2.0, 0.0));

      List<eye> create(float var1, float var2);
   }
}
