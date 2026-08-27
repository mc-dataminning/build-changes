import com.google.common.collect.ImmutableMap;

public class bvq extends bsw<brg> {
   private final float c;

   public bvq(float $$0) {
      super(ImmutableMap.of());
      this.c = $$0;
   }

   public static boolean a(brg $$0) {
      return $$0.bc() && $$0.b(avt.a) > $$0.dg() || $$0.bq();
   }

   protected boolean a(aqe $$0, brg $$1) {
      return a($$1);
   }

   protected boolean a(aqe $$0, brg $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(aqe $$0, brg $$1, long $$2) {
      if ($$1.ej().i() < this.c) {
         $$1.I().a();
      }
   }
}
