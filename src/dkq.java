import com.mojang.serialization.MapCodec;

public class dkq extends dju {
   public static final MapCodec<dkq> a = b(dkq::new);
   private static final wz b = wz.c("container.loom");

   @Override
   public MapCodec<dkq> a() {
      return a;
   }

   protected dkq(dtb.d $$0) {
      super($$0);
   }

   @Override
   protected bqr a(dtc $$0, dcw $$1, jd $$2, cmx $$3, eww $$4) {
      if ($$1.B) {
         return bqr.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(avz.ax);
         return bqr.c;
      }
   }

   @Override
   protected bqv b(dtc $$0, dcw $$1, jd $$2) {
      return new brb(($$2x, $$3, $$4) -> new cra($$2x, $$3, cqg.a($$1, $$2)), b);
   }

   @Override
   public dtc a(cyd $$0) {
      return this.o().a(aE, $$0.g().g());
   }

   @Override
   protected void a(dtd.a<dfy, dtc> $$0) {
      $$0.a(aE);
   }
}
