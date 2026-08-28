import com.google.common.collect.ImmutableMap;

public class byb extends bvh<btp> {
   private final float c;

   public byb(float $$0) {
      super(ImmutableMap.of());
      this.c = $$0;
   }

   public static boolean a(btp $$0) {
      return $$0.bf() && $$0.b(awk.a) > $$0.di() || $$0.bt();
   }

   protected boolean a(aqu $$0, btp $$1) {
      return a($$1);
   }

   protected boolean a(aqu $$0, btp $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(aqu $$0, btp $$1, long $$2) {
      if ($$1.dR().i() < this.c) {
         $$1.L().a();
      }
   }
}
