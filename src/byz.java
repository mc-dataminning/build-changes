import com.google.common.collect.ImmutableMap;

public class byz extends bwf<bup> {
   private final float c;

   public byz(float $$0) {
      super(ImmutableMap.of());
      this.c = $$0;
   }

   public static boolean a(bup $$0) {
      return $$0.bi() && $$0.b(axb.a) > $$0.dm() || $$0.bw();
   }

   protected boolean a(arj $$0, bup $$1) {
      return a($$1);
   }

   protected boolean a(arj $$0, bup $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(arj $$0, bup $$1, long $$2) {
      if ($$1.dV().i() < this.c) {
         $$1.O().a();
      }
   }
}
