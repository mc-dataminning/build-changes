import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dho extends dfh {
   public static final MapCodec<dho> e = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dhl.a.forGetter($$0x -> $$0x.f), u()).apply($$0, dho::new));
   private final dfw f;

   @Override
   public MapCodec<dho> a() {
      return e;
   }

   protected dho(dfw $$0, dsz.d $$1) {
      super($$1);
      this.f = $$0;
   }

   @Override
   protected void b(dta $$0, dcu $$1, jd $$2, dta $$3, boolean $$4) {
      this.a($$0, (dcv)$$1, $$2);
   }

   @Override
   protected void a(dta $$0, aqt $$1, jd $$2, ayv $$3) {
      if (!e($$0, $$1, $$2)) {
         $$1.a($$2, this.f.o().a(d, Boolean.valueOf(false)).a(c, $$0.c(c)), 2);
      }
   }

   @Override
   protected dta a(dta $$0, ji $$1, dta $$2, dcv $$3, jd $$4, jd $$5) {
      if ($$1.g() == $$0.c(c) && !$$0.a($$3, $$4)) {
         return dfy.a.o();
      } else {
         if ($$0.c(d)) {
            $$3.a($$4, eoz.c, eoz.c.a($$3));
         }

         this.a($$0, $$3, $$4);
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }
}
