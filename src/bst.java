import java.util.List;

public enum bst {
   a(bst.a.c),
   b(bst.a.b),
   c(bst.a.c),
   d(bst.a.d);

   private final bst.a e;

   private bst(final bst.a $$0) {
      this.e = $$0;
   }

   public List<evp> a(float $$0, float $$1) {
      return this.e.create($$0, $$1);
   }

   public interface a {
      List<evp> a = List.of(evp.b);
      bst.a b = ($$0, $$1) -> a;
      bst.a c = ($$0, $$1) -> List.of(new evp(0.0, (double)$$1, 0.0));
      bst.a d = ($$0, $$1) -> List.of(new evp(0.0, (double)$$1 / 2.0, 0.0));

      List<evp> create(float var1, float var2);
   }
}
