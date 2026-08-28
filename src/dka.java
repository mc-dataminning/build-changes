import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dka extends dgd<dso> implements dol {
   public static final MapCodec<dka> b = b(dka::new);
   public static final dvi c = dlf.aF;
   public static final dvf d = dve.C;
   protected static final ezm e = dhj.a(1.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   private static final xd f = xd.c("container.enderchest");

   @Override
   public MapCodec<dka> a() {
      return b;
   }

   protected dka(dun.d $$0) {
      super($$0, () -> dru.d);
      this.l(this.F.b().b(c, jj.c).b(d, Boolean.valueOf(false)));
   }

   @Override
   public djq.c<? extends drz> a(duo $$0, deg $$1, je $$2, boolean $$3) {
      return djq.b::b;
   }

   @Override
   protected ezm a(duo $$0, ddl $$1, je $$2, eyx $$3) {
      return e;
   }

   @Override
   protected dnq a_(duo $$0) {
      return dnq.b;
   }

   @Override
   public duo a(czk $$0) {
      eqp $$1 = $$0.q().b_($$0.a());
      return this.o().b(c, $$0.g().g()).b(d, Boolean.valueOf($$1.a() == eqq.c));
   }

   @Override
   protected brp a(duo $$0, deg $$1, je $$2, cnu $$3, eyo $$4) {
      csk $$5 = $$3.gp();
      if ($$5 != null && $$1.c_($$2) instanceof dso $$7) {
         je $$9 = $$2.d();
         if ($$1.a_($$9).d($$1, $$9)) {
            return brp.a;
         } else {
            if (!$$1.B) {
               $$5.a($$7);
               $$3.a(new brx(($$1x, $$2x, $$3x) -> crf.a($$1x, $$2x, $$5), f));
               $$3.a(awo.aj);
               cml.a($$3, true);
            }

            return brp.a;
         }
      } else {
         return brp.a;
      }
   }

   @Override
   public drs a(je $$0, duo $$1) {
      return new dso($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends drs> drt<T> a(deg $$0, duo $$1, dru<T> $$2) {
      return $$0.B ? a($$2, dru.d, dso::a) : null;
   }

   @Override
   public void a(duo $$0, deg $$1, je $$2, azl $$3) {
      for (int $$4 = 0; $$4 < 3; $$4++) {
         int $$5 = $$3.a(2) * 2 - 1;
         int $$6 = $$3.a(2) * 2 - 1;
         double $$7 = (double)$$2.u() + 0.5 + 0.25 * (double)$$5;
         double $$8 = (double)((float)$$2.v() + $$3.i());
         double $$9 = (double)$$2.w() + 0.5 + 0.25 * (double)$$6;
         double $$10 = (double)($$3.i() * (float)$$5);
         double $$11 = ((double)$$3.i() - 0.5) * 0.125;
         double $$12 = (double)($$3.i() * (float)$$6);
         $$1.a(ln.ac, $$7, $$8, $$9, $$10, $$11, $$12);
      }
   }

   @Override
   protected duo a(duo $$0, dnx $$1) {
      return $$0.b(c, $$1.a($$0.c(c)));
   }

   @Override
   protected duo a(duo $$0, dmg $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(dup.a<dhj, duo> $$0) {
      $$0.a(c, d);
   }

   @Override
   protected eqp b_(duo $$0) {
      return $$0.c(d) ? eqq.c.a(false) : super.b_($$0);
   }

   @Override
   protected duo a(duo $$0, jj $$1, duo $$2, deh $$3, je $$4, je $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, eqq.c, eqq.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(duo $$0, ere $$1) {
      return false;
   }

   @Override
   protected void a(duo $$0, arh $$1, je $$2, azl $$3) {
      drs $$4 = $$1.c_($$2);
      if ($$4 instanceof dso) {
         ((dso)$$4).b();
      }
   }
}
