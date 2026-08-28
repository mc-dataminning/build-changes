import java.util.List;

public enum bwu {
   a(bwu.a.c),
   b(bwu.a.b),
   c(bwu.a.c),
   d(bwu.a.d);

   private final bwu.a e;

   private bwu(final bwu.a $$0) {
      this.e = $$0;
   }

   public List<ffq> a(float $$0, float $$1) {
      return this.e.create($$0, $$1);
   }

   public interface a {
      List<ffq> a = List.of(ffq.c);
      bwu.a b = ($$0, $$1) -> a;
      bwu.a c = ($$0, $$1) -> List.of(new ffq(0.0, (double)$$1, 0.0));
      bwu.a d = ($$0, $$1) -> List.of(new ffq(0.0, (double)$$1 / 2.0, 0.0));

      List<ffq> create(float var1, float var2);
   }
}
