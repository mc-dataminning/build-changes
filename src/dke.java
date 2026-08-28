import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class dke extends dhq implements dpf {
   public static final MapCodec<dke> a = b(dke::new);
   public static final ali b = ali.b("sherds");
   private static final fah d = die.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);
   private static final dwd e = dvz.R;
   public static final dwa c = dvz.bw;
   private static final dwa f = dvz.C;

   @Override
   public MapCodec<dke> a() {
      return a;
   }

   protected dke(dvi.d $$0) {
      super($$0);
      this.l(this.F.b().b(e, jm.c).b(f, Boolean.valueOf(false)).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected dvj a(dvj $$0, jm $$1, dvj $$2, dfc $$3, jh $$4, jh $$5) {
      if ($$0.c(f)) {
         $$3.a($$4, erl.c, erl.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public dvj a(czs $$0) {
      erk $$1 = $$0.q().b_($$0.a());
      return this.m().b(e, $$0.g()).b(f, Boolean.valueOf($$1.a() == erl.c)).b(c, Boolean.valueOf(false));
   }

   @Override
   protected bsd a(cwb $$0, dvj $$1, dfb $$2, jh $$3, com $$4, bsc $$5, ezj $$6) {
      if ($$2.c_($$3) instanceof dtc $$7) {
         if ($$2.C) {
            return bsd.a;
         } else {
            cwb $$9 = $$7.f();
            if (!$$0.f() && ($$9.f() || cwb.c($$9, $$0) && $$9.L() < $$9.k())) {
               $$7.a(dtc.a.a);
               $$4.b(awv.c.b($$0.h()));
               cwb $$10 = $$0.b(1, $$4);
               float $$11;
               if ($$7.c()) {
                  $$7.b($$10);
                  $$11 = (float)$$10.L() / (float)$$10.k();
               } else {
                  $$9.g(1);
                  $$11 = (float)$$9.L() / (float)$$9.k();
               }

               $$2.a(null, $$3, awl.gz, awm.e, 1.0F, 0.7F + 0.5F * $$11);
               if ($$2 instanceof arn $$13) {
                  $$13.a(lr.aX, (double)$$3.u() + 0.5, (double)$$3.v() + 1.2, (double)$$3.w() + 0.5, 7, 0.0, 0.0, 0.0, 0.0);
               }

               $$7.e();
               $$2.a($$4, eag.c, $$3);
               return bsd.a;
            } else {
               return bsd.f;
            }
         }
      } else {
         return bsd.e;
      }
   }

   @Override
   protected bsd a(dvj $$0, dfb $$1, jh $$2, com $$3, ezj $$4) {
      if ($$1.c_($$2) instanceof dtc $$5) {
         $$1.a(null, $$2, awl.gA, awm.e, 1.0F, 1.0F);
         $$5.a(dtc.a.b);
         $$1.a($$3, eag.c, $$2);
         return bsd.a;
      } else {
         return bsd.e;
      }
   }

   @Override
   protected boolean a(dvj $$0, erz $$1) {
      return false;
   }

   @Override
   protected fah a(dvj $$0, deg $$1, jh $$2, ezs $$3) {
      return d;
   }

   @Override
   protected void a(dvk.a<die, dvj> $$0) {
      $$0.a(e, f, c);
   }

   @Nullable
   @Override
   public dsm a(jh $$0, dvj $$1) {
      return new dtc($$0, $$1);
   }

   @Override
   protected void a(dvj $$0, dfb $$1, jh $$2, dvj $$3, boolean $$4) {
      brz.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected List<cwb> a(dvj $$0, euf.a $$1) {
      dsm $$2 = $$1.b(ewy.h);
      if ($$2 instanceof dtc $$3) {
         $$1.a(b, $$1x -> {
            for (cvx $$2x : $$3.t().a()) {
               $$1x.accept($$2x.o());
            }
         });
      }

      return super.a($$0, $$1);
   }

   @Override
   public dvj a(dfb $$0, jh $$1, dvj $$2, com $$3) {
      cwb $$4 = $$3.fb();
      dvj $$5 = $$2;
      if ($$4.a(axj.bM) && !dbu.a($$4, axd.r)) {
         $$5 = $$2.b(c, Boolean.valueOf(true));
         $$0.a($$1, $$5, 4);
      }

      return super.a($$0, $$1, $$5, $$3);
   }

   @Override
   protected erk b_(dvj $$0) {
      return $$0.c(f) ? erl.c.a(false) : super.b_($$0);
   }

   @Override
   protected dpr h_(dvj $$0) {
      return $$0.c(c) ? dpr.bc : dpr.bb;
   }

   @Override
   public void a(cwb $$0, cvx.b $$1, List<xi> $$2, cxt $$3) {
      super.a($$0, $$1, $$2, $$3);
      dts $$4 = $$0.a(ku.ak, dts.a);
      if (!$$4.equals(dts.a)) {
         $$2.add(xh.a);
         Stream.of($$4.e(), $$4.c(), $$4.d(), $$4.b()).forEach($$1x -> $$2.add(new cwb($$1x.orElse(cwf.qM), 1).y().e().a(n.h)));
      }
   }

   @Override
   protected void a(dfb $$0, dvj $$1, ezj $$2, cpg $$3) {
      jh $$4 = $$2.b();
      if (!$$0.C && $$3.a($$0, $$4) && $$3.b($$0)) {
         $$0.a($$4, $$1.b(c, Boolean.valueOf(true)), 4);
         $$0.a($$4, true, $$3);
      }
   }

   @Override
   public cwb a(dfe $$0, jh $$1, dvj $$2) {
      return $$0.c_($$1) instanceof dtc $$3 ? $$3.u() : super.a($$0, $$1, $$2);
   }

   @Override
   protected boolean c_(dvj $$0) {
      return true;
   }

   @Override
   protected int a(dvj $$0, dfb $$1, jh $$2) {
      return cro.a($$1.c_($$2));
   }

   @Override
   protected dvj a(dvj $$0, dor $$1) {
      return $$0.b(e, $$1.a($$0.c(e)));
   }

   @Override
   protected dvj a(dvj $$0, dna $$1) {
      return $$0.a($$1.a($$0.c(e)));
   }
}
