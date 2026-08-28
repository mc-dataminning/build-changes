import com.mojang.serialization.MapCodec;
import java.util.function.BiFunction;

public class dlj extends dgf implements dfz {
   public static final MapCodec<dlj> a = b(dlj::new);
   public static final int b = 1;
   public static final int c = 4;
   public static final dtu d = dtq.R;
   public static final dua e = dtq.S;
   private static final BiFunction<ji, Integer, exp> f = ad.a(
      ($$0, $$1) -> {
         exp[] $$2 = new exp[]{
            dfw.a(8.0, 0.0, 8.0, 16.0, 3.0, 16.0),
            dfw.a(8.0, 0.0, 0.0, 16.0, 3.0, 8.0),
            dfw.a(0.0, 0.0, 0.0, 8.0, 3.0, 8.0),
            dfw.a(0.0, 0.0, 8.0, 8.0, 3.0, 16.0)
         };
         exp $$3 = exm.a();

         for (int $$4 = 0; $$4 < $$1; $$4++) {
            int $$5 = Math.floorMod($$4 - $$0.e(), 4);
            $$3 = exm.a($$3, $$2[$$5]);
         }

         return $$3.b();
      }
   );

   @Override
   public MapCodec<dlj> a() {
      return a;
   }

   protected dlj(dsz.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, ji.c).a(e, Integer.valueOf(1)));
   }

   @Override
   public dta a(dta $$0, dmk $$1) {
      return $$0.a(d, $$1.a($$0.c(d)));
   }

   @Override
   public dta a(dta $$0, dkt $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   public boolean a(dta $$0, cyb $$1) {
      return !$$1.h() && $$1.n().a(this.r()) && $$0.c(e) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   public exp a(dta $$0, dca $$1, jd $$2, exb $$3) {
      return f.apply($$0.c(d), $$0.c(e));
   }

   @Override
   public dta a(cyb $$0) {
      dta $$1 = $$0.q().a_($$0.a());
      return $$1.a(this) ? $$1.a(e, Integer.valueOf(Math.min(4, $$1.c(e) + 1))) : this.o().a(d, $$0.g().g());
   }

   @Override
   protected void a(dtb.a<dfw, dta> $$0) {
      $$0.a(d, e);
   }

   @Override
   public boolean b(dcx $$0, jd $$1, dta $$2) {
      return true;
   }

   @Override
   public boolean a(dcu $$0, ayv $$1, jd $$2, dta $$3) {
      return true;
   }

   @Override
   public void a(aqt $$0, ayv $$1, jd $$2, dta $$3) {
      int $$4 = $$3.c(e);
      if ($$4 < 4) {
         $$0.a($$2, $$3.a(e, Integer.valueOf($$4 + 1)), 2);
      } else {
         a($$0, $$2, new cuo(this));
      }
   }
}
