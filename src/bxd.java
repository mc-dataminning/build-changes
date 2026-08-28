import com.google.common.collect.ImmutableMap;

public class bxd extends bwc<bum> {
   public static final int c = 100;
   private final bra d;
   private final awd e;

   public bxd(bra $$0, awd $$1) {
      super(ImmutableMap.of(cdn.n, cdo.c, cdn.T, cdo.a), 100);
      this.d = $$0;
      this.e = $$1;
   }

   protected boolean a(arh $$0, bum $$1, long $$2) {
      return !$$1.aH();
   }

   protected void b(arh $$0, bum $$1, long $$2) {
      $$1.r(true);
      $$1.b(buw.g);
   }

   protected void c(arh $$0, bum $$1, long $$2) {
      if ($$1.aH()) {
         $$1.h($$1.dv().d(0.1F, 1.0, 0.1F));
         $$0.a(null, $$1, this.e, awf.g, 2.0F, 1.0F);
      }

      $$1.r(false);
      $$1.b(buw.a);
      $$1.dX().b(cdn.T);
      $$1.dX().a(cdn.S, this.d.a($$0.z));
   }
}
