import java.util.List;

public enum bvk {
   a(bvk.a.c),
   b(bvk.a.b),
   c(bvk.a.c),
   d(bvk.a.d);

   private final bvk.a e;

   private bvk(final bvk.a $$0) {
      this.e = $$0;
   }

   public List<fbx> a(float $$0, float $$1) {
      return this.e.create($$0, $$1);
   }

   public interface a {
      List<fbx> a = List.of(fbx.c);
      bvk.a b = ($$0, $$1) -> a;
      bvk.a c = ($$0, $$1) -> List.of(new fbx(0.0, (double)$$1, 0.0));
      bvk.a d = ($$0, $$1) -> List.of(new fbx(0.0, (double)$$1 / 2.0, 0.0));

      List<fbx> create(float var1, float var2);
   }
}
