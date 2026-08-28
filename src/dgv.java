import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dgv extends den {
   public static final MapCodec<dgv> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dgu.a.forGetter($$0x -> $$0x.c), u()).apply($$0, dgv::new));
   private final dff c;

   @Override
   public MapCodec<dgv> a() {
      return b;
   }

   protected dgv(dff $$0, dsg.d $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   protected void b(dsh $$0, dcd $$1, ja $$2, dsh $$3, boolean $$4) {
      this.a($$0, (dce)$$1, $$2);
   }

   @Override
   protected void a(dsh $$0, aqk $$1, ja $$2, aym $$3) {
      if (!e($$0, $$1, $$2)) {
         $$1.a($$2, this.c.o().a(d, Boolean.valueOf(false)), 2);
      }
   }

   @Override
   protected dsh a(dsh $$0, jf $$1, dsh $$2, dce $$3, ja $$4, ja $$5) {
      if ($$1 == jf.a && !$$0.a($$3, $$4)) {
         return dfh.a.o();
      } else {
         this.a($$0, $$3, $$4);
         if ($$0.c(d)) {
            $$3.a($$4, eoc.c, eoc.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }
}
