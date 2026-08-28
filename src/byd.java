import com.google.common.collect.ImmutableMap;

public class byd extends bvj<bts> {
   private final float c;

   public byd(float $$0) {
      super(ImmutableMap.of());
      this.c = $$0;
   }

   public static boolean a(bts $$0) {
      return $$0.be() && $$0.b(awv.a) > $$0.di() || $$0.bs();
   }

   protected boolean a(arf $$0, bts $$1) {
      return a($$1);
   }

   protected boolean a(arf $$0, bts $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(arf $$0, bts $$1, long $$2) {
      if ($$1.el().i() < this.c) {
         $$1.I().a();
      }
   }
}
