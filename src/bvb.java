import java.util.List;

public enum bvb {
   a(bvb.a.c),
   b(bvb.a.b),
   c(bvb.a.c),
   d(bvb.a.d);

   private final bvb.a e;

   private bvb(final bvb.a $$0) {
      this.e = $$0;
   }

   public List<fbx> a(float $$0, float $$1) {
      return this.e.create($$0, $$1);
   }

   public interface a {
      List<fbx> a = List.of(fbx.c);
      bvb.a b = ($$0, $$1) -> a;
      bvb.a c = ($$0, $$1) -> List.of(new fbx(0.0, (double)$$1, 0.0));
      bvb.a d = ($$0, $$1) -> List.of(new fbx(0.0, (double)$$1 / 2.0, 0.0));

      List<fbx> create(float var1, float var2);
   }
}
