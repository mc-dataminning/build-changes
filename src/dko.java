import com.mojang.serialization.MapCodec;
import java.util.function.BiFunction;

public class dko extends dfk implements dfe {
   public static final MapCodec<dko> a = b(dko::new);
   public static final int b = 1;
   public static final int c = 4;
   public static final dsy d = dsu.R;
   public static final dte e = dsu.S;
   private static final BiFunction<je, Integer, ewm> f = ac.a(
      ($$0, $$1) -> {
         ewm[] $$2 = new ewm[]{
            dfb.a(8.0, 0.0, 8.0, 16.0, 3.0, 16.0),
            dfb.a(8.0, 0.0, 0.0, 16.0, 3.0, 8.0),
            dfb.a(0.0, 0.0, 0.0, 8.0, 3.0, 8.0),
            dfb.a(0.0, 0.0, 8.0, 8.0, 3.0, 16.0)
         };
         ewm $$3 = ewj.a();

         for (int $$4 = 0; $$4 < $$1; $$4++) {
            int $$5 = Math.floorMod($$4 - $$0.e(), 4);
            $$3 = ewj.a($$3, $$2[$$5]);
         }

         return $$3.b();
      }
   );

   @Override
   public MapCodec<dko> a() {
      return a;
   }

   protected dko(dsd.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, je.c).a(e, Integer.valueOf(1)));
   }

   @Override
   public dse a(dse $$0, dlo $$1) {
      return $$0.a(d, $$1.a($$0.c(d)));
   }

   @Override
   public dse a(dse $$0, djy $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   public boolean a(dse $$0, cyc $$1) {
      return !$$1.h() && $$1.n().a(this.r()) && $$0.c(e) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   public ewm a(dse $$0, dbg $$1, iz $$2, evy $$3) {
      return f.apply($$0.c(d), $$0.c(e));
   }

   @Override
   public dse a(cyc $$0) {
      dse $$1 = $$0.q().a_($$0.a());
      return $$1.a(this) ? $$1.a(e, Integer.valueOf(Math.min(4, $$1.c(e) + 1))) : this.o().a(d, $$0.g().g());
   }

   @Override
   protected void a(dsf.a<dfb, dse> $$0) {
      $$0.a(d, e);
   }

   @Override
   public boolean b(dcd $$0, iz $$1, dse $$2) {
      return true;
   }

   @Override
   public boolean a(dca $$0, azh $$1, iz $$2, dse $$3) {
      return true;
   }

   @Override
   public void a(arf $$0, azh $$1, iz $$2, dse $$3) {
      int $$4 = $$3.c(e);
      if ($$4 < 4) {
         $$0.a($$2, $$3.a(e, Integer.valueOf($$4 + 1)), 2);
      } else {
         a($$0, $$2, new cur(this));
      }
   }
}
