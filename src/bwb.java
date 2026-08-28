import java.util.List;

public enum bwb {
   a(bwb.a.c),
   b(bwb.a.b),
   c(bwb.a.c),
   d(bwb.a.d);

   private final bwb.a e;

   private bwb(final bwb.a $$0) {
      this.e = $$0;
   }

   public List<fdw> a(float $$0, float $$1) {
      return this.e.create($$0, $$1);
   }

   public interface a {
      List<fdw> a = List.of(fdw.c);
      bwb.a b = ($$0, $$1) -> a;
      bwb.a c = ($$0, $$1) -> List.of(new fdw(0.0, (double)$$1, 0.0));
      bwb.a d = ($$0, $$1) -> List.of(new fdw(0.0, (double)$$1 / 2.0, 0.0));

      List<fdw> create(float var1, float var2);
   }
}
