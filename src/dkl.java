import com.mojang.serialization.MapCodec;
import java.util.function.BiFunction;

public class dkl extends dfh implements dfb {
   public static final MapCodec<dkl> a = b(dkl::new);
   public static final int b = 1;
   public static final int c = 4;
   public static final dsv d = dsr.R;
   public static final dtb e = dsr.S;
   private static final BiFunction<je, Integer, ewj> f = ac.a(
      ($$0, $$1) -> {
         ewj[] $$2 = new ewj[]{
            dey.a(8.0, 0.0, 8.0, 16.0, 3.0, 16.0),
            dey.a(8.0, 0.0, 0.0, 16.0, 3.0, 8.0),
            dey.a(0.0, 0.0, 0.0, 8.0, 3.0, 8.0),
            dey.a(0.0, 0.0, 8.0, 8.0, 3.0, 16.0)
         };
         ewj $$3 = ewg.a();

         for (int $$4 = 0; $$4 < $$1; $$4++) {
            int $$5 = Math.floorMod($$4 - $$0.e(), 4);
            $$3 = ewg.a($$3, $$2[$$5]);
         }

         return $$3.b();
      }
   );

   @Override
   public MapCodec<dkl> a() {
      return a;
   }

   protected dkl(dsa.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, je.c).a(e, Integer.valueOf(1)));
   }

   @Override
   public dsb a(dsb $$0, dll $$1) {
      return $$0.a(d, $$1.a($$0.c(d)));
   }

   @Override
   public dsb a(dsb $$0, djv $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   public boolean a(dsb $$0, cxz $$1) {
      return !$$1.h() && $$1.n().a(this.r()) && $$0.c(e) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   public ewj a(dsb $$0, dbd $$1, iz $$2, evv $$3) {
      return f.apply($$0.c(d), $$0.c(e));
   }

   @Override
   public dsb a(cxz $$0) {
      dsb $$1 = $$0.q().a_($$0.a());
      return $$1.a(this) ? $$1.a(e, Integer.valueOf(Math.min(4, $$1.c(e) + 1))) : this.o().a(d, $$0.g().g());
   }

   @Override
   protected void a(dsc.a<dey, dsb> $$0) {
      $$0.a(d, e);
   }

   @Override
   public boolean b(dca $$0, iz $$1, dsb $$2) {
      return true;
   }

   @Override
   public boolean a(dbx $$0, azg $$1, iz $$2, dsb $$3) {
      return true;
   }

   @Override
   public void a(are $$0, azg $$1, iz $$2, dsb $$3) {
      int $$4 = $$3.c(e);
      if ($$4 < 4) {
         $$0.a($$2, $$3.a(e, Integer.valueOf($$4 + 1)), 2);
      } else {
         a($$0, $$2, new cuo(this));
      }
   }
}
