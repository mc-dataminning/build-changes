import com.google.common.collect.ImmutableMap;

public class byz extends bxy<bwh> {
   public static final int c = 100;
   private final bst d;
   private final axe e;

   public byz(bst $$0, axe $$1) {
      super(ImmutableMap.of(cfj.n, cfk.c, cfj.T, cfk.a), 100);
      this.d = $$0;
      this.e = $$1;
   }

   protected boolean a(ash $$0, bwh $$1, long $$2) {
      return !$$1.aJ();
   }

   protected void b(ash $$0, bwh $$1, long $$2) {
      $$1.r(true);
      $$1.b(bwr.g);
   }

   protected void c(ash $$0, bwh $$1, long $$2) {
      if ($$1.aJ()) {
         $$1.h($$1.dz().d(0.1F, 1.0, 0.1F));
         $$0.a(null, $$1, this.e, axg.g, 2.0F, 1.0F);
      }

      $$1.r(false);
      $$1.b(bwr.a);
      $$1.ec().b(cfj.T);
      $$1.ec().a(cfj.S, this.d.a($$0.A));
   }
}
