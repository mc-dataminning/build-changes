import com.google.common.collect.ImmutableMap;

public class bvf extends bsl<bqv> {
   private final float c;

   public bvf(float $$0) {
      super(ImmutableMap.of());
      this.c = $$0;
   }

   public static boolean a(bqv $$0) {
      return $$0.bc() && $$0.b(avj.a) > $$0.df() || $$0.bq();
   }

   protected boolean a(apu $$0, bqv $$1) {
      return a($$1);
   }

   protected boolean a(apu $$0, bqv $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(apu $$0, bqv $$1, long $$2) {
      if ($$1.ei().i() < this.c) {
         $$1.I().a();
      }
   }
}
