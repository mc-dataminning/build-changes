import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dhm extends dfe {
   public static final MapCodec<dhm> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dhl.a.forGetter($$0x -> $$0x.c), u()).apply($$0, dhm::new));
   private final dfw c;

   @Override
   public MapCodec<dhm> a() {
      return b;
   }

   protected dhm(dfw $$0, dsz.d $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   protected void b(dta $$0, dcu $$1, jd $$2, dta $$3, boolean $$4) {
      this.a($$0, (dcv)$$1, $$2);
   }

   @Override
   protected void a(dta $$0, aqt $$1, jd $$2, ayv $$3) {
      if (!e($$0, $$1, $$2)) {
         $$1.a($$2, this.c.o().a(d, Boolean.valueOf(false)), 2);
      }
   }

   @Override
   protected dta a(dta $$0, ji $$1, dta $$2, dcv $$3, jd $$4, jd $$5) {
      if ($$1 == ji.a && !$$0.a($$3, $$4)) {
         return dfy.a.o();
      } else {
         this.a($$0, $$3, $$4);
         if ($$0.c(d)) {
            $$3.a($$4, eoz.c, eoz.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }
}
