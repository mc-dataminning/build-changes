import com.google.common.collect.ImmutableMap;

public class bwm extends bts<bsc> {
   private final float c;

   public bwm(float $$0) {
      super(ImmutableMap.of());
      this.c = $$0;
   }

   public static boolean a(bsc $$0) {
      return $$0.bc() && $$0.b(avw.a) > $$0.dg() || $$0.bq();
   }

   protected boolean a(aqh $$0, bsc $$1) {
      return a($$1);
   }

   protected boolean a(aqh $$0, bsc $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(aqh $$0, bsc $$1, long $$2) {
      if ($$1.ej().i() < this.c) {
         $$1.I().a();
      }
   }
}
