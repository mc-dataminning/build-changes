import org.joml.Vector3f;

public record fmr(fmr.c a, fmt... b) {
   public interface a {
      Vector3f apply(Vector3f var1, float var2, fmt[] var3, int var4, int var5, float var6);
   }

   public static class b {
      public static final fmr.a a = ($$0, $$1, $$2, $$3, $$4, $$5) -> {
         Vector3f $$6 = $$2[$$3].b();
         Vector3f $$7 = $$2[$$4].b();
         return $$6.lerp($$7, $$1, $$0).mul($$5);
      };
      public static final fmr.a b = ($$0, $$1, $$2, $$3, $$4, $$5) -> {
         Vector3f $$6 = $$2[Math.max(0, $$3 - 1)].b();
         Vector3f $$7 = $$2[$$3].b();
         Vector3f $$8 = $$2[$$4].b();
         Vector3f $$9 = $$2[Math.min($$2.length - 1, $$4 + 1)].b();
         $$0.set(
            bae.a($$1, $$6.x(), $$7.x(), $$8.x(), $$9.x()) * $$5,
            bae.a($$1, $$6.y(), $$7.y(), $$8.y(), $$9.y()) * $$5,
            bae.a($$1, $$6.z(), $$7.z(), $$8.z(), $$9.z()) * $$5
         );
         return $$0;
      };
   }

   public interface c {
      void apply(gem var1, Vector3f var2);
   }

   public static class d {
      public static final fmr.c a = gem::a;
      public static final fmr.c b = gem::b;
      public static final fmr.c c = gem::c;
   }
}
