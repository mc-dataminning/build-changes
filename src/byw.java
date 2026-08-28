import com.google.common.collect.ImmutableMap;

public class byw extends bwc<bum> {
   private final float c;

   public byw(float $$0) {
      super(ImmutableMap.of());
      this.c = $$0;
   }

   public static boolean a(bum $$0) {
      return $$0.bi() && $$0.b(awz.a) > $$0.dm() || $$0.bw();
   }

   protected boolean a(arh $$0, bum $$1) {
      return a($$1);
   }

   protected boolean a(arh $$0, bum $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(arh $$0, bum $$1, long $$2) {
      if ($$1.dV().i() < this.c) {
         $$1.O().a();
      }
   }
}
