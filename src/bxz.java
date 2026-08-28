import com.google.common.collect.ImmutableMap;

public class bxz extends bvf<btn> {
   private final float c;

   public bxz(float $$0) {
      super(ImmutableMap.of());
      this.c = $$0;
   }

   public static boolean a(btn $$0) {
      return $$0.bf() && $$0.b(awj.a) > $$0.dj() || $$0.bt();
   }

   protected boolean a(aqt $$0, btn $$1) {
      return a($$1);
   }

   protected boolean a(aqt $$0, btn $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(aqt $$0, btn $$1, long $$2) {
      if ($$1.dT().i() < this.c) {
         $$1.I().a();
      }
   }
}
