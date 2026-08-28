import com.google.common.collect.ImmutableMap;

public class bya extends bvg<btp> {
   private final float c;

   public bya(float $$0) {
      super(ImmutableMap.of());
      this.c = $$0;
   }

   public static boolean a(btp $$0) {
      return $$0.be() && $$0.b(awu.a) > $$0.di() || $$0.bs();
   }

   protected boolean a(are $$0, btp $$1) {
      return a($$1);
   }

   protected boolean a(are $$0, btp $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(are $$0, btp $$1, long $$2) {
      if ($$1.el().i() < this.c) {
         $$1.I().a();
      }
   }
}
