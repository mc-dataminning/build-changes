import com.google.common.collect.ImmutableMap;

public class bzi extends bwo<bux> {
   private final float c;

   public bzi(float $$0) {
      super(ImmutableMap.of());
      this.c = $$0;
   }

   public static boolean a(bux $$0) {
      return $$0.bk() && $$0.b(axf.a) > $$0.dr() || $$0.by();
   }

   protected boolean a(arm $$0, bux $$1) {
      return a($$1);
   }

   protected boolean a(arm $$0, bux $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(arm $$0, bux $$1, long $$2) {
      if ($$1.ea().i() < this.c) {
         $$1.O().a();
      }
   }
}
