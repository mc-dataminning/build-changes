import org.joml.Vector3f;

public record fjd(fjd.c a, fjf... b) {
   public interface a {
      Vector3f apply(Vector3f var1, float var2, fjf[] var3, int var4, int var5, float var6);
   }

   public static class b {
      public static final fjd.a a = ($$0, $$1, $$2, $$3, $$4, $$5) -> {
         Vector3f $$6 = $$2[$$3].b();
         Vector3f $$7 = $$2[$$4].b();
         return $$6.lerp($$7, $$1, $$0).mul($$5);
      };
      public static final fjd.a b = ($$0, $$1, $$2, $$3, $$4, $$5) -> {
         Vector3f $$6 = $$2[Math.max(0, $$3 - 1)].b();
         Vector3f $$7 = $$2[$$3].b();
         Vector3f $$8 = $$2[$$4].b();
         Vector3f $$9 = $$2[Math.min($$2.length - 1, $$4 + 1)].b();
         $$0.set(
            azf.a($$1, $$6.x(), $$7.x(), $$8.x(), $$9.x()) * $$5,
            azf.a($$1, $$6.y(), $$7.y(), $$8.y(), $$9.y()) * $$5,
            azf.a($$1, $$6.z(), $$7.z(), $$8.z(), $$9.z()) * $$5
         );
         return $$0;
      };
   }

   public interface c {
      void apply(gaq var1, Vector3f var2);
   }

   public static class d {
      public static final fjd.c a = gaq::a;
      public static final fjd.c b = gaq::b;
      public static final fjd.c c = gaq::c;
   }
}
