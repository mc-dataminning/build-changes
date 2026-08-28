import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dgs extends del {
   public static final MapCodec<dgs> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dgq.a.forGetter($$0x -> $$0x.e), u()).apply($$0, dgs::new));
   private final dfb e;
   protected static final float b = 6.0F;
   protected static final ewm c = dfb.a(2.0, 0.0, 2.0, 14.0, 15.0, 14.0);

   @Override
   public MapCodec<dgs> a() {
      return a;
   }

   protected dgs(dfb $$0, dsd.d $$1) {
      super($$1);
      this.e = $$0;
   }

   @Override
   protected void b(dse $$0, dca $$1, iz $$2, dse $$3, boolean $$4) {
      this.a($$0, (dcb)$$1, $$2);
   }

   @Override
   protected void a(dse $$0, arf $$1, iz $$2, azh $$3) {
      if (!e($$0, $$1, $$2)) {
         $$1.a($$2, this.e.o().a(d, Boolean.valueOf(false)), 2);
      }
   }

   @Override
   protected dse a(dse $$0, je $$1, dse $$2, dcb $$3, iz $$4, iz $$5) {
      if ($$1 == je.a && !$$0.a($$3, $$4)) {
         return dfd.a.o();
      } else {
         this.a($$0, $$3, $$4);
         if ($$0.c(d)) {
            $$3.a($$4, eny.c, eny.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   protected ewm a(dse $$0, dbg $$1, iz $$2, evy $$3) {
      return c;
   }
}
