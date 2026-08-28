import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class dkj extends dhv implements dpk {
   public static final MapCodec<dkj> a = b(dkj::new);
   public static final all b = all.b("sherds");
   private static final fal d = dij.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);
   private static final dwl<jm> e = dwe.R;
   public static final dwf c = dwe.bw;
   private static final dwf f = dwe.C;

   @Override
   public MapCodec<dkj> a() {
      return a;
   }

   protected dkj(dvn.d $$0) {
      super($$0);
      this.l(this.F.b().b(e, jm.c).b(f, Boolean.valueOf(false)).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected dvo a(dvo $$0, dfi $$1, dfu $$2, jh $$3, jm $$4, jh $$5, dvo $$6, azv $$7) {
      if ($$0.c(f)) {
         $$2.a($$3, erp.c, erp.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public dvo a(czw $$0) {
      ero $$1 = $$0.q().b_($$0.a());
      return this.m().b(e, $$0.g()).b(f, Boolean.valueOf($$1.a() == erp.c)).b(c, Boolean.valueOf(false));
   }

   @Override
   protected bsh a(cwf $$0, dvo $$1, dff $$2, jh $$3, cor $$4, bsg $$5, ezn $$6) {
      if ($$2.c_($$3) instanceof dth $$7) {
         if ($$2.C) {
            return bsh.a;
         } else {
            cwf $$9 = $$7.f();
            if (!$$0.f() && ($$9.f() || cwf.c($$9, $$0) && $$9.L() < $$9.k())) {
               $$7.a(dth.a.a);
               $$4.b(awy.c.b($$0.h()));
               cwf $$10 = $$0.b(1, $$4);
               float $$11;
               if ($$7.c()) {
                  $$7.b($$10);
                  $$11 = (float)$$10.L() / (float)$$10.k();
               } else {
                  $$9.g(1);
                  $$11 = (float)$$9.L() / (float)$$9.k();
               }

               $$2.a(null, $$3, awo.gz, awp.e, 1.0F, 0.7F + 0.5F * $$11);
               if ($$2 instanceof arq $$13) {
                  $$13.a(ls.aX, (double)$$3.u() + 0.5, (double)$$3.v() + 1.2, (double)$$3.w() + 0.5, 7, 0.0, 0.0, 0.0, 0.0);
               }

               $$7.e();
               $$2.a($$4, eak.c, $$3);
               return bsh.a;
            } else {
               return bsh.f;
            }
         }
      } else {
         return bsh.e;
      }
   }

   @Override
   protected bsh a(dvo $$0, dff $$1, jh $$2, cor $$3, ezn $$4) {
      if ($$1.c_($$2) instanceof dth $$5) {
         $$1.a(null, $$2, awo.gA, awp.e, 1.0F, 1.0F);
         $$5.a(dth.a.b);
         $$1.a($$3, eak.c, $$2);
         return bsh.a;
      } else {
         return bsh.e;
      }
   }

   @Override
   protected boolean a(dvo $$0, esd $$1) {
      return false;
   }

   @Override
   protected fal a(dvo $$0, dek $$1, jh $$2, ezw $$3) {
      return d;
   }

   @Override
   protected void a(dvp.a<dij, dvo> $$0) {
      $$0.a(e, f, c);
   }

   @Nullable
   @Override
   public dsr a(jh $$0, dvo $$1) {
      return new dth($$0, $$1);
   }

   @Override
   protected void a(dvo $$0, dff $$1, jh $$2, dvo $$3, boolean $$4) {
      bsd.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected List<cwf> a(dvo $$0, euj.a $$1) {
      dsr $$2 = $$1.b(exc.h);
      if ($$2 instanceof dth $$3) {
         $$1.a(b, $$1x -> {
            for (cwb $$2x : $$3.t().a()) {
               $$1x.accept($$2x.o());
            }
         });
      }

      return super.a($$0, $$1);
   }

   @Override
   public dvo a(dff $$0, jh $$1, dvo $$2, cor $$3) {
      cwf $$4 = $$3.fc();
      dvo $$5 = $$2;
      if ($$4.a(axm.bN) && !dby.a($$4, axg.r)) {
         $$5 = $$2.b(c, Boolean.valueOf(true));
         $$0.a($$1, $$5, 4);
      }

      return super.a($$0, $$1, $$5, $$3);
   }

   @Override
   protected ero b_(dvo $$0) {
      return $$0.c(f) ? erp.c.a(false) : super.b_($$0);
   }

   @Override
   protected dpw h_(dvo $$0) {
      return $$0.c(c) ? dpw.bc : dpw.bb;
   }

   @Override
   public void a(cwf $$0, cwb.b $$1, List<xl> $$2, cxx $$3) {
      super.a($$0, $$1, $$2, $$3);
      dtx $$4 = $$0.a(ku.ak, dtx.a);
      if (!$$4.equals(dtx.a)) {
         $$2.add(xk.a);
         Stream.of($$4.e(), $$4.c(), $$4.d(), $$4.b()).forEach($$1x -> $$2.add(new cwf($$1x.orElse(cwj.qM), 1).y().e().a(n.h)));
      }
   }

   @Override
   protected void a(dff $$0, dvo $$1, ezn $$2, cpk $$3) {
      jh $$4 = $$2.b();
      if (!$$0.C && $$3.a($$0, $$4) && $$3.b($$0)) {
         $$0.a($$4, $$1.b(c, Boolean.valueOf(true)), 4);
         $$0.a($$4, true, $$3);
      }
   }

   @Override
   public cwf a(dfi $$0, jh $$1, dvo $$2) {
      return $$0.c_($$1) instanceof dth $$3 ? $$3.u() : super.a($$0, $$1, $$2);
   }

   @Override
   protected boolean c_(dvo $$0) {
      return true;
   }

   @Override
   protected int a(dvo $$0, dff $$1, jh $$2) {
      return crs.a($$1.c_($$2));
   }

   @Override
   protected dvo a(dvo $$0, dow $$1) {
      return $$0.b(e, $$1.a($$0.c(e)));
   }

   @Override
   protected dvo a(dvo $$0, dnf $$1) {
      return $$0.a($$1.a($$0.c(e)));
   }
}
