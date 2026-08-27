import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dfr extends ddk {
   public static final MapCodec<dfr> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dfp.a.forGetter($$0x -> $$0x.e), u()).apply($$0, dfr::new));
   private final dea e;
   protected static final float b = 6.0F;
   protected static final evf c = dea.a(2.0, 0.0, 2.0, 14.0, 15.0, 14.0);

   @Override
   public MapCodec<dfr> a() {
      return a;
   }

   protected dfr(dea $$0, drc.d $$1) {
      super($$1);
      this.e = $$0;
   }

   @Override
   protected void b(drd $$0, daz $$1, io $$2, drd $$3, boolean $$4) {
      this.a($$0, (dba)$$1, $$2);
   }

   @Override
   protected void a(drd $$0, aqn $$1, io $$2, aym $$3) {
      if (!e($$0, $$1, $$2)) {
         $$1.a($$2, this.e.n().a(d, Boolean.valueOf(false)), 2);
      }
   }

   @Override
   protected drd a(drd $$0, it $$1, drd $$2, dba $$3, io $$4, io $$5) {
      if ($$1 == it.a && !$$0.a($$3, $$4)) {
         return dec.a.n();
      } else {
         this.a($$0, $$3, $$4);
         if ($$0.c(d)) {
            $$3.a($$4, emx.c, emx.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   protected evf a(drd $$0, daf $$1, io $$2, eur $$3) {
      return c;
   }
}
