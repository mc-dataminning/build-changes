import com.google.common.collect.ImmutableMap;

public class bzn extends bwt<bvc> {
   private final float c;

   public bzn(float $$0) {
      super(ImmutableMap.of());
      this.c = $$0;
   }

   public static boolean a(bvc $$0) {
      return $$0.bk() && $$0.b(axg.a) > $$0.dr() || $$0.by();
   }

   protected boolean a(arn $$0, bvc $$1) {
      return a($$1);
   }

   protected boolean a(arn $$0, bvc $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(arn $$0, bvc $$1, long $$2) {
      if ($$1.ea().i() < this.c) {
         $$1.O().a();
      }
   }
}
