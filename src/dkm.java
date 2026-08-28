import com.mojang.serialization.MapCodec;
import java.util.function.BiFunction;

public class dkm extends dfi implements dfc {
   public static final MapCodec<dkm> a = b(dkm::new);
   public static final int b = 1;
   public static final int c = 4;
   public static final dsw d = dss.R;
   public static final dtc e = dss.S;
   private static final BiFunction<je, Integer, ewk> f = ac.a(
      ($$0, $$1) -> {
         ewk[] $$2 = new ewk[]{
            dez.a(8.0, 0.0, 8.0, 16.0, 3.0, 16.0),
            dez.a(8.0, 0.0, 0.0, 16.0, 3.0, 8.0),
            dez.a(0.0, 0.0, 0.0, 8.0, 3.0, 8.0),
            dez.a(0.0, 0.0, 8.0, 8.0, 3.0, 16.0)
         };
         ewk $$3 = ewh.a();

         for (int $$4 = 0; $$4 < $$1; $$4++) {
            int $$5 = Math.floorMod($$4 - $$0.e(), 4);
            $$3 = ewh.a($$3, $$2[$$5]);
         }

         return $$3.b();
      }
   );

   @Override
   public MapCodec<dkm> a() {
      return a;
   }

   protected dkm(dsb.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, je.c).a(e, Integer.valueOf(1)));
   }

   @Override
   public dsc a(dsc $$0, dlm $$1) {
      return $$0.a(d, $$1.a($$0.c(d)));
   }

   @Override
   public dsc a(dsc $$0, djw $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   public boolean a(dsc $$0, cya $$1) {
      return !$$1.h() && $$1.n().a(this.r()) && $$0.c(e) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   public ewk a(dsc $$0, dbe $$1, iz $$2, evw $$3) {
      return f.apply($$0.c(d), $$0.c(e));
   }

   @Override
   public dsc a(cya $$0) {
      dsc $$1 = $$0.q().a_($$0.a());
      return $$1.a(this) ? $$1.a(e, Integer.valueOf(Math.min(4, $$1.c(e) + 1))) : this.o().a(d, $$0.g().g());
   }

   @Override
   protected void a(dsd.a<dez, dsc> $$0) {
      $$0.a(d, e);
   }

   @Override
   public boolean b(dcb $$0, iz $$1, dsc $$2) {
      return true;
   }

   @Override
   public boolean a(dby $$0, azh $$1, iz $$2, dsc $$3) {
      return true;
   }

   @Override
   public void a(arf $$0, azh $$1, iz $$2, dsc $$3) {
      int $$4 = $$3.c(e);
      if ($$4 < 4) {
         $$0.a($$2, $$3.a(e, Integer.valueOf($$4 + 1)), 2);
      } else {
         a($$0, $$2, new cup(this));
      }
   }
}
