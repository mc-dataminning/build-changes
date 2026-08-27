import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dgs extends dej {
   public static final MapCodec<dgs> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dgr.a.forGetter($$0x -> $$0x.c), u()).apply($$0, dgs::new));
   private final dfc c;

   @Override
   public MapCodec<dgs> a() {
      return b;
   }

   protected dgs(dfc $$0, dtb.d $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   protected void b(dtc $$0, dca $$1, ir $$2, dtc $$3, boolean $$4) {
      this.a($$0, (dcb)$$1, $$2);
   }

   @Override
   protected void a(dtc $$0, aqt $$1, ir $$2, ayt $$3) {
      if (!e($$0, $$1, $$2)) {
         $$1.a($$2, this.c.n().a(d, Boolean.valueOf(false)), 2);
      }
   }

   @Override
   protected dtc a(dtc $$0, iw $$1, dtc $$2, dcb $$3, ir $$4, ir $$5) {
      if ($$1 == iw.a && !$$0.a($$3, $$4)) {
         return dfe.a.n();
      } else {
         this.a($$0, $$3, $$4);
         if ($$0.c(d)) {
            $$3.a($$4, epf.c, epf.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }
}
