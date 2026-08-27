import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cyg extends cvz {
   public static final MapCodec<cyg> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cye.a.forGetter($$0x -> $$0x.e), u()).apply($$0, cyg::new));
   private final cwp e;
   protected static final float b = 6.0F;
   protected static final eml c = cwp.a(2.0, 0.0, 2.0, 14.0, 15.0, 14.0);

   @Override
   public MapCodec<cyg> a() {
      return a;
   }

   protected cyg(cwp $$0, djf.d $$1) {
      super($$1);
      this.e = $$0;
   }

   @Override
   public void b(djg $$0, cto $$1, hx $$2, djg $$3, boolean $$4) {
      this.a($$0, (ctp)$$1, $$2);
   }

   @Override
   public void a(djg $$0, and $$1, hx $$2, auu $$3) {
      if (!e($$0, $$1, $$2)) {
         $$1.a($$2, this.e.o().a(d, Boolean.valueOf(false)), 2);
      }
   }

   @Override
   public djg a(djg $$0, ic $$1, djg $$2, ctp $$3, hx $$4, hx $$5) {
      if ($$1 == ic.a && !$$0.a($$3, $$4)) {
         return cwr.a.o();
      } else {
         this.a($$0, $$3, $$4);
         if ($$0.c(d)) {
            $$3.a($$4, eer.c, eer.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public eml a(djg $$0, csu $$1, hx $$2, elx $$3) {
      return c;
   }
}
