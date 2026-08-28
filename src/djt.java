import com.mojang.serialization.MapCodec;

public class djt extends dix {
   public static final MapCodec<djt> a = b(djt::new);
   private static final xp b = xp.c("container.loom");

   @Override
   public MapCodec<djt> a() {
      return a;
   }

   protected djt(dsd.d $$0) {
      super($$0);
   }

   @Override
   protected bqw a(dse $$0, dca $$1, iz $$2, cmz $$3, evp $$4) {
      if ($$1.B) {
         return bqw.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(awk.ax);
         return bqw.c;
      }
   }

   @Override
   protected bra b(dse $$0, dca $$1, iz $$2) {
      return new brg(($$2x, $$3, $$4) -> new crb($$2x, $$3, cqh.a($$1, $$2)), b);
   }

   @Override
   public dse a(cyc $$0) {
      return this.o().a(aE, $$0.g().g());
   }

   @Override
   protected void a(dsf.a<dfb, dse> $$0) {
      $$0.a(aE);
   }
}
