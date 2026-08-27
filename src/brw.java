import java.util.List;

public enum brw {
   a(brw.a.c),
   b(brw.a.b),
   c(brw.a.c),
   d(brw.a.d);

   private final brw.a e;

   private brw(brw.a $$0) {
      this.e = $$0;
   }

   public List<ewu> a(float $$0, float $$1) {
      return this.e.create($$0, $$1);
   }

   public interface a {
      List<ewu> a = List.of(ewu.b);
      brw.a b = ($$0, $$1) -> a;
      brw.a c = ($$0, $$1) -> List.of(new ewu(0.0, (double)$$1, 0.0));
      brw.a d = ($$0, $$1) -> List.of(new ewu(0.0, (double)$$1 / 2.0, 0.0));

      List<ewu> create(float var1, float var2);
   }
}
