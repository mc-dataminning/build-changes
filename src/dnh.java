import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dnh extends die implements dnw {
   public static final MapCodec<dnh> a = b(dnh::new);
   public static final dwh<jm.a> b = dvz.H;
   private static final Logger f = LogUtils.getLogger();
   protected static final int c = 2;
   protected static final fah d = die.a(0.0, 0.0, 6.0, 16.0, 16.0, 10.0);
   protected static final fah e = die.a(6.0, 0.0, 0.0, 10.0, 16.0, 16.0);

   @Override
   public MapCodec<dnh> a() {
      return a;
   }

   public dnh(dvi.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jm.a.a));
   }

   @Override
   protected fah a(dvj $$0, deg $$1, jh $$2, ezs $$3) {
      switch ((jm.a)$$0.c(b)) {
         case c:
            return e;
         case a:
         default:
            return d;
      }
   }

   @Override
   protected void b(dvj $$0, arn $$1, jh $$2, azs $$3) {
      if ($$1.D_().j() && $$1.ac().b(dex.e) && $$3.a(2000) < $$1.ak().a()) {
         while ($$1.a_($$2).a(this)) {
            $$2 = $$2.e();
         }

         if ($$1.a_($$2).a($$1, $$2, bul.bx)) {
            bue $$4 = bul.bx.a($$1, $$2.d(), buk.d);
            if ($$4 != null) {
               $$4.aD();
               bue $$5 = $$4.dl();
               if ($$5 != null) {
                  $$5.aD();
               }
            }
         }
      }
   }

   @Override
   protected dvj a(dvj $$0, jm $$1, dvj $$2, dfc $$3, jh $$4, jh $$5) {
      jm.a $$6 = $$1.o();
      jm.a $$7 = $$0.c(b);
      boolean $$8 = $$7 != $$6 && $$6.d();
      return !$$8 && !$$2.a(this) && !new esk($$3, $$4, $$7).c() ? dig.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dvj $$0, dfb $$1, jh $$2, bue $$3) {
      if ($$3.o(false)) {
         $$3.a(this, $$2);
      }
   }

   @Override
   public int a(arn $$0, bue $$1) {
      return $$1 instanceof com $$2 ? Math.max(0, $$0.ac().c($$2.gl().a ? dex.F : dex.E)) : 0;
   }

   @Nullable
   @Override
   public esi a(arn $$0, bue $$1, jh $$2) {
      alh<dfb> $$3 = $$0.ag() == dfb.j ? dfb.i : dfb.j;
      arn $$4 = $$0.o().a($$3);
      if ($$4 == null) {
         return null;
      } else {
         boolean $$5 = $$4.ag() == dfb.j;
         dxa $$6 = $$4.C_();
         double $$7 = dzf.a($$0.D_(), $$4.D_());
         jh $$8 = $$6.b($$1.dC() * $$7, $$1.dE(), $$1.dI() * $$7);
         return this.a($$4, $$1, $$2, $$8, $$5, $$6);
      }
   }

   @Nullable
   private esi a(arn $$0, bue $$1, jh $$2, jh $$3, boolean $$4, dxa $$5) {
      Optional<jh> $$6 = $$0.p().a($$3, $$4, $$5);
      l.a $$9;
      esi.a $$10;
      if ($$6.isPresent()) {
         jh $$7 = $$6.get();
         dvj $$8 = $$0.a_($$7);
         $$9 = l.a($$7, $$8.c(dvz.H), 21, jm.a.b, 21, $$2x -> $$0.a_($$2x) == $$8);
         $$10 = esi.b.then($$1x -> $$1x.f($$7));
      } else {
         jm.a $$11 = $$1.dX().a_($$2).d(b).orElse(jm.a.a);
         Optional<l.a> $$12 = $$0.p().a($$3, $$11);
         if ($$12.isEmpty()) {
            f.error("Unable to create a portal, likely target out of worldborder");
            return null;
         }

         $$9 = $$12.get();
         $$10 = esi.b.then(esi.c);
      }

      return a($$1, $$2, $$9, $$0, $$10);
   }

   private static esi a(bue $$0, jh $$1, l.a $$2, arn $$3, esi.a $$4) {
      dvj $$5 = $$0.dX().a_($$1);
      jm.a $$6;
      ezn $$8;
      if ($$5.b(dvz.H)) {
         $$6 = $$5.c(dvz.H);
         l.a $$7 = l.a($$1, $$6, 21, jm.a.b, 21, $$2x -> $$0.dX().a_($$2x) == $$5);
         $$8 = $$0.a($$6, $$7);
      } else {
         $$6 = jm.a.a;
         $$8 = new ezn(0.5, 0.0, 0.0);
      }

      return a($$3, $$2, $$6, $$8, $$0, $$4);
   }

   private static esi a(arn $$0, l.a $$1, jm.a $$2, ezn $$3, bue $$4, esi.a $$5) {
      jh $$6 = $$1.a;
      dvj $$7 = $$0.a_($$6);
      jm.a $$8 = $$7.d(dvz.H).orElse(jm.a.a);
      double $$9 = (double)$$1.b;
      double $$10 = (double)$$1.c;
      buh $$11 = $$4.a($$4.ay());
      int $$12 = $$2 == $$8 ? 0 : 90;
      double $$13 = (double)$$11.a() / 2.0 + ($$9 - (double)$$11.a()) * $$3.a();
      double $$14 = ($$10 - (double)$$11.b()) * $$3.b();
      double $$15 = 0.5 + $$3.c();
      boolean $$16 = $$8 == jm.a.a;
      ezn $$17 = new ezn((double)$$6.u() + ($$16 ? $$13 : $$15), (double)$$6.v() + $$14, (double)$$6.w() + ($$16 ? $$15 : $$13));
      ezn $$18 = esk.a($$17, $$0, $$4, $$11);
      return new esi($$0, $$18, ezn.c, (float)$$12, 0.0F, bvo.a(bvo.l, bvo.k), $$5);
   }

   @Override
   public dnw.a b() {
      return dnw.a.a;
   }

   @Override
   public void a(dvj $$0, dfb $$1, jh $$2, azs $$3) {
      if ($$3.a(100) == 0) {
         $$1.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, awl.uG, awm.e, 0.5F, $$3.i() * 0.4F + 0.8F, false);
      }

      for (int $$4 = 0; $$4 < 4; $$4++) {
         double $$5 = (double)$$2.u() + $$3.j();
         double $$6 = (double)$$2.v() + $$3.j();
         double $$7 = (double)$$2.w() + $$3.j();
         double $$8 = ((double)$$3.i() - 0.5) * 0.5;
         double $$9 = ((double)$$3.i() - 0.5) * 0.5;
         double $$10 = ((double)$$3.i() - 0.5) * 0.5;
         int $$11 = $$3.a(2) * 2 - 1;
         if (!$$1.a_($$2.h()).a(this) && !$$1.a_($$2.i()).a(this)) {
            $$5 = (double)$$2.u() + 0.5 + 0.25 * (double)$$11;
            $$8 = (double)($$3.i() * 2.0F * (float)$$11);
         } else {
            $$7 = (double)$$2.w() + 0.5 + 0.25 * (double)$$11;
            $$10 = (double)($$3.i() * 2.0F * (float)$$11);
         }

         $$1.a(lr.ac, $$5, $$6, $$7, $$8, $$9, $$10);
      }
   }

   @Override
   public cwb a(dfe $$0, jh $$1, dvj $$2) {
      return cwb.k;
   }

   @Override
   protected dvj a(dvj $$0, dor $$1) {
      switch ($$1) {
         case d:
         case b:
            switch ((jm.a)$$0.c(b)) {
               case c:
                  return $$0.b(b, jm.a.a);
               case a:
                  return $$0.b(b, jm.a.c);
               default:
                  return $$0;
            }
         default:
            return $$0;
      }
   }

   @Override
   protected void a(dvk.a<die, dvj> $$0) {
      $$0.a(b);
   }
}
