import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dbt extends czm {
   public static final MapCodec<dbt> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dbr.a.forGetter($$0x -> $$0x.e), u()).apply($$0, dbt::new));
   private final dac e;
   protected static final float b = 6.0F;
   protected static final eqm c = dac.a(2.0, 0.0, 2.0, 14.0, 15.0, 14.0);

   @Override
   public MapCodec<dbt> a() {
      return a;
   }

   protected dbt(dac $$0, dna.d $$1) {
      super($$1);
      this.e = $$0;
   }

   @Override
   protected void b(dnb $$0, cxb $$1, ib $$2, dnb $$3, boolean $$4) {
      this.a($$0, (cxc)$$1, $$2);
   }

   @Override
   protected void a(dnb $$0, apf $$1, ib $$2, axd $$3) {
      if (!e($$0, $$1, $$2)) {
         $$1.a($$2, this.e.o().a(d, Boolean.valueOf(false)), 2);
      }
   }

   @Override
   protected dnb a(dnb $$0, ih $$1, dnb $$2, cxc $$3, ib $$4, ib $$5) {
      if ($$1 == ih.a && !$$0.a($$3, $$4)) {
         return dae.a.o();
      } else {
         this.a($$0, $$3, $$4);
         if ($$0.c(d)) {
            $$3.a($$4, eiq.c, eiq.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   protected eqm a(dnb $$0, cwh $$1, ib $$2, epy $$3) {
      return c;
   }
}
