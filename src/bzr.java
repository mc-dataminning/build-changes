import com.google.common.collect.ImmutableMap;

public class bzr extends bwx<bvg> {
   private final float c;

   public bzr(float $$0) {
      super(ImmutableMap.of());
      this.c = $$0;
   }

   public static boolean a(bvg $$0) {
      return $$0.bl() && $$0.b(axj.a) > $$0.ds() || $$0.bz();
   }

   protected boolean a(arq $$0, bvg $$1) {
      return a($$1);
   }

   protected boolean a(arq $$0, bvg $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(arq $$0, bvg $$1, long $$2) {
      if ($$1.eb().i() < this.c) {
         $$1.O().a();
      }
   }
}
