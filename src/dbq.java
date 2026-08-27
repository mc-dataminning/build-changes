import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dbq extends czi {
   public static final MapCodec<dbq> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dbp.a.forGetter($$0x -> $$0x.c), u()).apply($$0, dbq::new));
   private final daa c;

   @Override
   public MapCodec<dbq> a() {
      return b;
   }

   protected dbq(daa $$0, dmy.d $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   protected void b(dmz $$0, cwz $$1, ib $$2, dmz $$3, boolean $$4) {
      this.a($$0, (cxa)$$1, $$2);
   }

   @Override
   protected void a(dmz $$0, apf $$1, ib $$2, axd $$3) {
      if (!e($$0, $$1, $$2)) {
         $$1.a($$2, this.c.o().a(d, Boolean.valueOf(false)), 2);
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
}
