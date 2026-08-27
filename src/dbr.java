import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dbr extends czk {
   public static final MapCodec<dbr> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dbp.a.forGetter($$0x -> $$0x.e), u()).apply($$0, dbr::new));
   private final daa e;
   protected static final float b = 6.0F;
   protected static final eqk c = daa.a(2.0, 0.0, 2.0, 14.0, 15.0, 14.0);

   @Override
   public MapCodec<dbr> a() {
      return a;
   }

   protected dbr(daa $$0, dmy.d $$1) {
      super($$1);
      this.e = $$0;
   }

   @Override
   protected void b(dmz $$0, cwz $$1, ib $$2, dmz $$3, boolean $$4) {
      this.a($$0, (cxa)$$1, $$2);
   }

   @Override
   protected void a(dmz $$0, apf $$1, ib $$2, axd $$3) {
      if (!e($$0, $$1, $$2)) {
         $$1.a($$2, this.e.o().a(d, Boolean.valueOf(false)), 2);
      }
   }

   @Override
   protected dmz a(dmz $$0, ih $$1, dmz $$2, cxa $$3, ib $$4, ib $$5) {
      if ($$1 == ih.a && !$$0.a($$3, $$4)) {
         return dac.a.o();
      } else {
         this.a($$0, $$3, $$4);
         if ($$0.c(d)) {
            $$3.a($$4, eio.c, eio.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   protected eqk a(dmz $$0, cwf $$1, ib $$2, epw $$3) {
      return c;
   }
}
