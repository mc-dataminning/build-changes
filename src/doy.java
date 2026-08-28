import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class doy extends dkz<dyd> implements dtq {
   public static final MapCodec<doy> b = b(doy::new);
   public static final ebf<ja> c = dqg.e;
   public static final eay d = eax.I;
   private static final ffk e = dmf.b(14.0, 0.0, 14.0);
   private static final wy f = wy.c("container.enderchest");

   @Override
   public MapCodec<doy> a() {
      return b;
   }

   protected doy(eag.d $$0) {
      super($$0, () -> dxh.d);
      this.l(this.C.b().b(c, ja.c).b(d, Boolean.valueOf(false)));
   }

   @Override
   public don.c<? extends dxn> a(eah $$0, dja $$1, iu $$2, boolean $$3) {
      return don.b::b;
   }

   @Override
   protected ffk a(eah $$0, dig $$1, iu $$2, fev $$3) {
      return e;
   }

   @Override
   public eah a(dcw $$0) {
      ewo $$1 = $$0.q().b_($$0.a());
      return this.m().b(c, $$0.g().g()).b(d, Boolean.valueOf($$1.a() == ewp.c));
   }

   @Override
   protected bud a(eah $$0, dja $$1, iu $$2, crc $$3, fem $$4) {
      cwj $$5 = $$3.gx();
      if ($$5 != null && $$1.c_($$2) instanceof dyd $$7) {
         iu $$9 = $$2.d();
         if ($$1.a_($$9).d($$1, $$9)) {
            return bud.a;
         } else {
            if ($$1 instanceof arq $$10) {
               $$5.a($$7);
               $$3.a(new bul(($$1x, $$2x, $$3x) -> cve.a($$1x, $$2x, $$5), f));
               $$3.a(awx.aj);
               cps.a($$10, $$3, true);
            }

            return bud.a;
         }
      } else {
         return bud.a;
      }
   }

   @Override
   public dxf a(iu $$0, eah $$1) {
      return new dyd($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dxf> dxg<T> a(dja $$0, eah $$1, dxh<T> $$2) {
      return $$0.C ? a($$2, dxh.d, dyd::a) : null;
   }

   @Override
   public void a(eah $$0, dja $$1, iu $$2, azv $$3) {
      for (int $$4 = 0; $$4 < 3; $$4++) {
         int $$5 = $$3.a(2) * 2 - 1;
         int $$6 = $$3.a(2) * 2 - 1;
         double $$7 = (double)$$2.u() + 0.5 + 0.25 * (double)$$5;
         double $$8 = (double)((float)$$2.v() + $$3.i());
         double $$9 = (double)$$2.w() + 0.5 + 0.25 * (double)$$6;
         double $$10 = (double)($$3.i() * (float)$$5);
         double $$11 = ((double)$$3.i() - 0.5) * 0.125;
         double $$12 = (double)($$3.i() * (float)$$6);
         $$1.a(lx.af, $$7, $$8, $$9, $$10, $$11, $$12);
      }
   }

   @Override
   protected eah a(eah $$0, dsz $$1) {
      return $$0.b(c, $$1.a($$0.c(c)));
   }

   @Override
   protected eah a(eah $$0, dri $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(eai.a<dmf, eah> $$0) {
      $$0.a(c, d);
   }

   @Override
   protected ewo b_(eah $$0) {
      return $$0.c(d) ? ewp.c.a(false) : super.b_($$0);
   }

   @Override
   protected eah a(eah $$0, djd $$1, djp $$2, iu $$3, ja $$4, iu $$5, eah $$6, azv $$7) {
      if ($$0.c(d)) {
         $$2.a($$3, ewp.c, ewp.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(eah $$0, exd $$1) {
      return false;
   }

   @Override
   protected void a(eah $$0, arq $$1, iu $$2, azv $$3) {
      dxf $$4 = $$1.c_($$2);
      if ($$4 instanceof dyd) {
         ((dyd)$$4).a();
      }
   }
}
