import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dpv extends dlw<dza> implements dun {
   public static final MapCodec<dpv> b = b(dpv::new);
   public static final ecc<jb> c = drd.e;
   public static final ebv d = ebu.I;
   private static final fgk e = dnc.b(14.0, 0.0, 14.0);
   private static final xa f = xa.c("container.enderchest");

   @Override
   public MapCodec<dpv> a() {
      return b;
   }

   protected dpv(ebd.d $$0) {
      super($$0, () -> dye.d);
      this.l(this.C.b().b(c, jb.c).b(d, Boolean.valueOf(false)));
   }

   @Override
   public dpk.c<? extends dyk> a(ebe $$0, djx $$1, iv $$2, boolean $$3) {
      return dpk.b::b;
   }

   @Override
   protected fgk a(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      return e;
   }

   @Override
   public ebe a(ddr $$0) {
      exo $$1 = $$0.q().b_($$0.a());
      return this.m().b(c, $$0.g().g()).b(d, Boolean.valueOf($$1.a() == exp.c));
   }

   @Override
   protected bur a(ebe $$0, djx $$1, iv $$2, crx $$3, ffm $$4) {
      cxe $$5 = $$3.gx();
      if ($$5 != null && $$1.c_($$2) instanceof dza $$7) {
         iv $$9 = $$2.d();
         if ($$1.a_($$9).d($$1, $$9)) {
            return bur.a;
         } else {
            if ($$1 instanceof ars $$10) {
               $$5.a($$7);
               $$3.a(new buz(($$1x, $$2x, $$3x) -> cvz.a($$1x, $$2x, $$5), f));
               $$3.a(awz.aj);
               cqn.a($$10, $$3, true);
            }

            return bur.a;
         }
      } else {
         return bur.a;
      }
   }

   @Override
   public dyc a(iv $$0, ebe $$1) {
      return new dza($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dyc> dyd<T> a(djx $$0, ebe $$1, dye<T> $$2) {
      return $$0.C ? a($$2, dye.d, dza::a) : null;
   }

   @Override
   public void a(ebe $$0, djx $$1, iv $$2, azx $$3) {
      for (int $$4 = 0; $$4 < 3; $$4++) {
         int $$5 = $$3.a(2) * 2 - 1;
         int $$6 = $$3.a(2) * 2 - 1;
         double $$7 = (double)$$2.u() + 0.5 + 0.25 * (double)$$5;
         double $$8 = (double)((float)$$2.v() + $$3.i());
         double $$9 = (double)$$2.w() + 0.5 + 0.25 * (double)$$6;
         double $$10 = (double)($$3.i() * (float)$$5);
         double $$11 = ((double)$$3.i() - 0.5) * 0.125;
         double $$12 = (double)($$3.i() * (float)$$6);
         $$1.a(ly.af, $$7, $$8, $$9, $$10, $$11, $$12);
      }
   }

   @Override
   protected ebe a(ebe $$0, dtw $$1) {
      return $$0.b(c, $$1.a($$0.c(c)));
   }

   @Override
   protected ebe a(ebe $$0, dsf $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(ebf.a<dnc, ebe> $$0) {
      $$0.a(c, d);
   }

   @Override
   protected exo b_(ebe $$0) {
      return $$0.c(d) ? exp.c.a(false) : super.b_($$0);
   }

   @Override
   protected ebe a(ebe $$0, dka $$1, dkm $$2, iv $$3, jb $$4, iv $$5, ebe $$6, azx $$7) {
      if ($$0.c(d)) {
         $$2.a($$3, exp.c, exp.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(ebe $$0, eyd $$1) {
      return false;
   }

   @Override
   protected void a(ebe $$0, ars $$1, iv $$2, azx $$3) {
      dyc $$4 = $$1.c_($$2);
      if ($$4 instanceof dza) {
         ((dza)$$4).a();
      }
   }
}
