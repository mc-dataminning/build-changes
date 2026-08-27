import com.google.common.collect.ImmutableMap;

public class bua extends brg<bpq> {
   private final float c;

   public bua(float $$0) {
      super(ImmutableMap.of());
      this.c = $$0;
   }

   public static boolean a(bpq $$0) {
      return $$0.bc() && $$0.b(aus.a) > $$0.df() || $$0.bq();
   }

   protected boolean a(apf $$0, bpq $$1) {
      return a($$1);
   }

   protected boolean a(apf $$0, bpq $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(apf $$0, bpq $$1, long $$2) {
      if ($$1.ei().i() < this.c) {
         $$1.I().a();
      }
   }
}
