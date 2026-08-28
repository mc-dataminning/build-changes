import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class den extends det {
   public static final MapCodec<den> a = b(den::new);
   public static final dte b = dta.P;
   public static final dtb c = dta.u;

   @Override
   public MapCodec<den> a() {
      return a;
   }

   public den(dsj.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, jf.c).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected bqg a(dsk $$0, dcf $$1, ja $$2, cmk $$3, ewb $$4) {
      if ($$1.B) {
         return bqg.a;
      } else {
         dpp $$5 = $$1.c_($$2);
         if ($$5 instanceof dpi) {
            $$3.a((dpi)$$5);
            $$3.a(avr.ar);
            clb.a($$3, true);
         }

         return bqg.c;
      }
   }

   @Override
   protected void a(dsk $$0, dcf $$1, ja $$2, dsk $$3, boolean $$4) {
      bqc.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(dsk $$0, aqm $$1, ja $$2, ayo $$3) {
      dpp $$4 = $$1.c_($$2);
      if ($$4 instanceof dpi) {
         ((dpi)$$4).l();
      }
   }

   @Nullable
   @Override
   public dpp a(ja $$0, dsk $$1) {
      return new dpi($$0, $$1);
   }

   @Override
   protected dln a_(dsk $$0) {
      return dln.c;
   }

   @Override
   protected boolean c_(dsk $$0) {
      return true;
   }

   @Override
   protected int a(dsk $$0, dcf $$1, ja $$2) {
      return cph.a($$1.c_($$2));
   }

   @Override
   protected dsk a(dsk $$0, dlu $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dsk a(dsk $$0, dke $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dsl.a<dfh, dsk> $$0) {
      $$0.a(b, c);
   }

   @Override
   public dsk a(cxm $$0) {
      return this.o().a(b, $$0.d().g());
   }
}
