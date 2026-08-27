import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ddp extends dbi {
   public static final MapCodec<ddp> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ddn.a.forGetter($$0x -> $$0x.e), u()).apply($$0, ddp::new));
   private final dby e;
   protected static final float b = 6.0F;
   protected static final est c = dby.a(2.0, 0.0, 2.0, 14.0, 15.0, 14.0);

   @Override
   public MapCodec<ddp> a() {
      return a;
   }

   protected ddp(dby $$0, doy.d $$1) {
      super($$1);
      this.e = $$0;
   }

   @Override
   protected void b(doz $$0, cyx $$1, ib $$2, doz $$3, boolean $$4) {
      this.a($$0, (cyy)$$1, $$2);
   }

   @Override
   protected void a(doz $$0, aps $$1, ib $$2, axr $$3) {
      if (!e($$0, $$1, $$2)) {
         $$1.a($$2, this.e.n().a(d, Boolean.valueOf(false)), 2);
      }
   }

   @Override
   protected doz a(doz $$0, ih $$1, doz $$2, cyy $$3, ib $$4, ib $$5) {
      if ($$1 == ih.a && !$$0.a($$3, $$4)) {
         return dca.a.n();
      } else {
         this.a($$0, $$3, $$4);
         if ($$0.c(d)) {
            $$3.a($$4, ekt.c, ekt.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   protected est a(doz $$0, cyd $$1, ib $$2, esf $$3) {
      return c;
   }
}
