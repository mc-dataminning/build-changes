import com.mojang.serialization.MapCodec;

public class djp extends dit {
   public static final MapCodec<djp> a = b(djp::new);
   private static final xo b = xo.c("container.loom");

   @Override
   public MapCodec<djp> a() {
      return a;
   }

   protected djp(drz.d $$0) {
      super($$0);
   }

   @Override
   protected bqs a(dsa $$0, dbw $$1, iz $$2, cmv $$3, evl $$4) {
      if ($$1.B) {
         return bqs.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(awj.ax);
         return bqs.c;
      }
   }

   @Override
   protected bqw b(dsa $$0, dbw $$1, iz $$2) {
      return new brc(($$2x, $$3, $$4) -> new cqx($$2x, $$3, cqd.a($$1, $$2)), b);
   }

   @Override
   public dsa a(cxy $$0) {
      return this.o().a(aE, $$0.g().g());
   }

   @Override
   protected void a(dsb.a<dex, dsa> $$0) {
      $$0.a(aE);
   }
}
