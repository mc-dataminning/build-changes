import com.mojang.serialization.MapCodec;
import java.util.function.BiFunction;

public class dkk extends dfg implements dfa {
   public static final MapCodec<dkk> a = b(dkk::new);
   public static final int b = 1;
   public static final int c = 4;
   public static final dsu d = dsq.R;
   public static final dta e = dsq.S;
   private static final BiFunction<je, Integer, ewi> f = ac.a(
      ($$0, $$1) -> {
         ewi[] $$2 = new ewi[]{
            dex.a(8.0, 0.0, 8.0, 16.0, 3.0, 16.0),
            dex.a(8.0, 0.0, 0.0, 16.0, 3.0, 8.0),
            dex.a(0.0, 0.0, 0.0, 8.0, 3.0, 8.0),
            dex.a(0.0, 0.0, 8.0, 8.0, 3.0, 16.0)
         };
         ewi $$3 = ewf.a();

         for (int $$4 = 0; $$4 < $$1; $$4++) {
            int $$5 = Math.floorMod($$4 - $$0.e(), 4);
            $$3 = ewf.a($$3, $$2[$$5]);
         }

         return $$3.b();
      }
   );

   @Override
   public MapCodec<dkk> a() {
      return a;
   }

   protected dkk(drz.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, je.c).a(e, Integer.valueOf(1)));
   }

   @Override
   public dsa a(dsa $$0, dlk $$1) {
      return $$0.a(d, $$1.a($$0.c(d)));
   }

   @Override
   public dsa a(dsa $$0, dju $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   public boolean a(dsa $$0, cxy $$1) {
      return !$$1.h() && $$1.n().a(this.r()) && $$0.c(e) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   public ewi a(dsa $$0, dbc $$1, iz $$2, evu $$3) {
      return f.apply($$0.c(d), $$0.c(e));
   }

   @Override
   public dsa a(cxy $$0) {
      dsa $$1 = $$0.q().a_($$0.a());
      return $$1.a(this) ? $$1.a(e, Integer.valueOf(Math.min(4, $$1.c(e) + 1))) : this.o().a(d, $$0.g().g());
   }

   @Override
   protected void a(dsb.a<dex, dsa> $$0) {
      $$0.a(d, e);
   }

   @Override
   public boolean b(dbz $$0, iz $$1, dsa $$2) {
      return true;
   }

   @Override
   public boolean a(dbw $$0, azf $$1, iz $$2, dsa $$3) {
      return true;
   }

   @Override
   public void a(are $$0, azf $$1, iz $$2, dsa $$3) {
      int $$4 = $$3.c(e);
      if ($$4 < 4) {
         $$0.a($$2, $$3.a(e, Integer.valueOf($$4 + 1)), 2);
      } else {
         a($$0, $$2, new cun(this));
      }
   }
}
