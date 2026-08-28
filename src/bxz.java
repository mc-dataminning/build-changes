import com.google.common.collect.ImmutableMap;

public class bxz extends bwy<bvh> {
   public static final int c = 100;
   private final brt d;
   private final avy e;

   public bxz(brt $$0, avy $$1) {
      super(ImmutableMap.of(cej.n, cek.c, cej.T, cek.a), 100);
      this.d = $$0;
      this.e = $$1;
   }

   protected boolean a(arc $$0, bvh $$1, long $$2) {
      return !$$1.aJ();
   }

   protected void b(arc $$0, bvh $$1, long $$2) {
      $$1.r(true);
      $$1.b(bvr.g);
   }

   protected void c(arc $$0, bvh $$1, long $$2) {
      if ($$1.aJ()) {
         $$1.h($$1.dz().d(0.1F, 1.0, 0.1F));
         $$0.a(null, $$1, this.e, awa.g, 2.0F, 1.0F);
      }

      $$1.r(false);
      $$1.b(bvr.a);
      $$1.ec().b(cej.T);
      $$1.ec().a(cej.S, this.d.a($$0.A));
   }
}
