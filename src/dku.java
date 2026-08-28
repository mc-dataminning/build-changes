import com.mojang.serialization.MapCodec;
import java.util.function.BiFunction;

public class dku extends dfq implements dfk {
   public static final MapCodec<dku> a = b(dku::new);
   public static final int b = 1;
   public static final int c = 4;
   public static final dte d = dta.R;
   public static final dtk e = dta.S;
   private static final BiFunction<jf, Integer, ewy> f = ac.a(
      ($$0, $$1) -> {
         ewy[] $$2 = new ewy[]{
            dfh.a(8.0, 0.0, 8.0, 16.0, 3.0, 16.0),
            dfh.a(8.0, 0.0, 0.0, 16.0, 3.0, 8.0),
            dfh.a(0.0, 0.0, 0.0, 8.0, 3.0, 8.0),
            dfh.a(0.0, 0.0, 8.0, 8.0, 3.0, 16.0)
         };
         ewy $$3 = ewv.a();

         for (int $$4 = 0; $$4 < $$1; $$4++) {
            int $$5 = Math.floorMod($$4 - $$0.e(), 4);
            $$3 = ewv.a($$3, $$2[$$5]);
         }

         return $$3.b();
      }
   );

   @Override
   public MapCodec<dku> a() {
      return a;
   }

   protected dku(dsj.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, jf.c).a(e, Integer.valueOf(1)));
   }

   @Override
   public dsk a(dsk $$0, dlu $$1) {
      return $$0.a(d, $$1.a($$0.c(d)));
   }

   @Override
   public dsk a(dsk $$0, dke $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   public boolean a(dsk $$0, cxm $$1) {
      return !$$1.h() && $$1.n().a(this.r()) && $$0.c(e) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   public ewy a(dsk $$0, dbl $$1, ja $$2, ewk $$3) {
      return f.apply($$0.c(d), $$0.c(e));
   }

   @Override
   public dsk a(cxm $$0) {
      dsk $$1 = $$0.q().a_($$0.a());
      return $$1.a(this) ? $$1.a(e, Integer.valueOf(Math.min(4, $$1.c(e) + 1))) : this.o().a(d, $$0.g().g());
   }

   @Override
   protected void a(dsl.a<dfh, dsk> $$0) {
      $$0.a(d, e);
   }

   @Override
   public boolean b(dci $$0, ja $$1, dsk $$2) {
      return true;
   }

   @Override
   public boolean a(dcf $$0, ayo $$1, ja $$2, dsk $$3) {
      return true;
   }

   @Override
   public void a(aqm $$0, ayo $$1, ja $$2, dsk $$3) {
      int $$4 = $$3.c(e);
      if ($$4 < 4) {
         $$0.a($$2, $$3.a(e, Integer.valueOf($$4 + 1)), 2);
      } else {
         a($$0, $$2, new cuc(this));
      }
   }
}
