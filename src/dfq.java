import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dfq extends ddi {
   public static final MapCodec<dfq> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dfp.a.forGetter($$0x -> $$0x.c), u()).apply($$0, dfq::new));
   private final dea c;

   @Override
   public MapCodec<dfq> a() {
      return b;
   }

   protected dfq(dea $$0, drc.d $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   protected void b(drd $$0, daz $$1, io $$2, drd $$3, boolean $$4) {
      this.a($$0, (dba)$$1, $$2);
   }

   @Override
   protected void a(drd $$0, aqn $$1, io $$2, aym $$3) {
      if (!e($$0, $$1, $$2)) {
         $$1.a($$2, this.c.n().a(d, Boolean.valueOf(false)), 2);
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
}
