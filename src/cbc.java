import com.google.common.collect.ImmutableMap;

public class cbc<T extends bwt> extends byi<T> {
   private final float c;

   public cbc(float $$0) {
      super(ImmutableMap.of());
      this.c = $$0;
   }

   public static <T extends bwt> boolean a(T $$0) {
      return $$0.bj() && $$0.b(axf.a) > $$0.dp() || $$0.bw();
   }

   protected boolean a(arn $$0, bwt $$1) {
      return a($$1);
   }

   protected boolean a(arn $$0, bwt $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(arn $$0, bwt $$1, long $$2) {
      if ($$1.dY().i() < this.c) {
         $$1.N().a();
      }
   }
}
