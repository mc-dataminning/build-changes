import com.mojang.serialization.MapCodec;
import java.util.function.BiFunction;

public class dfo extends dal implements daf {
   public static final MapCodec<dfo> a = b(dfo::new);
   public static final int b = 1;
   public static final int c = 4;
   public static final dnv d = dnr.R;
   public static final dob e = dnr.S;
   private static final BiFunction<ih, Integer, eqm> f = ac.a(
      ($$0, $$1) -> {
         eqm[] $$2 = new eqm[]{
            dac.a(8.0, 0.0, 8.0, 16.0, 3.0, 16.0),
            dac.a(8.0, 0.0, 0.0, 16.0, 3.0, 8.0),
            dac.a(0.0, 0.0, 0.0, 8.0, 3.0, 8.0),
            dac.a(0.0, 0.0, 8.0, 8.0, 3.0, 16.0)
         };
         eqm $$3 = eqj.a();

         for (int $$4 = 0; $$4 < $$1; $$4++) {
            int $$5 = Math.floorMod($$4 - $$0.e(), 4);
            $$3 = eqj.a($$3, $$2[$$5]);
         }

         return $$3.b();
      }
   );

   @Override
   public MapCodec<dfo> a() {
      return a;
   }

   protected dfo(dna.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, ih.c).a(e, Integer.valueOf(1)));
   }

   @Override
   public dnb a(dnb $$0, dgo $$1) {
      return $$0.a(d, $$1.a($$0.c(d)));
   }

   @Override
   public dnb a(dnb $$0, dey $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   public boolean a(dnb $$0, csu $$1) {
      return !$$1.h() && $$1.n().a(this.l()) && $$0.c(e) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   public eqm a(dnb $$0, cwh $$1, ib $$2, epy $$3) {
      return f.apply($$0.c(d), $$0.c(e));
   }

   @Override
   public dnb a(csu $$0) {
      dnb $$1 = $$0.q().a_($$0.a());
      return $$1.a(this) ? $$1.a(e, Integer.valueOf(Math.min(4, $$1.c(e) + 1))) : this.o().a(d, $$0.g().g());
   }

   @Override
   protected void a(dnc.a<dac, dnb> $$0) {
      $$0.a(d, e);
   }

   @Override
   public boolean b(cxe $$0, ib $$1, dnb $$2) {
      return true;
   }

   @Override
   public boolean a(cxb $$0, axd $$1, ib $$2, dnb $$3) {
      return true;
   }

   @Override
   public void a(apf $$0, axd $$1, ib $$2, dnb $$3) {
      int $$4 = $$3.c(e);
      if ($$4 < 4) {
         $$0.a($$2, $$3.a(e, Integer.valueOf($$4 + 1)), 2);
      } else {
         a($$0, $$2, new cqm(this));
      }
   }
}
