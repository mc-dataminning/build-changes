import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class djy extends dhk implements doz {
   public static final MapCodec<djy> a = b(djy::new);
   public static final alh b = alh.b("sherds");
   private static final fab d = dhy.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);
   private static final dvx e = dvt.R;
   public static final dvu c = dvt.bw;
   private static final dvu f = dvt.C;

   @Override
   public MapCodec<djy> a() {
      return a;
   }

   protected djy(dvc.d $$0) {
      super($$0);
      this.l(this.F.b().b(e, jl.c).b(f, Boolean.valueOf(false)).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected dvd a(dvd $$0, jl $$1, dvd $$2, dew $$3, jg $$4, jg $$5) {
      if ($$0.c(f)) {
         $$3.a($$4, erf.c, erf.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public dvd a(czm $$0) {
      ere $$1 = $$0.q().b_($$0.a());
      return this.m().b(e, $$0.g()).b(f, Boolean.valueOf($$1.a() == erf.c)).b(c, Boolean.valueOf(false));
   }

   @Override
   protected bry a(cvx $$0, dvd $$1, dev $$2, jg $$3, coh $$4, brx $$5, ezd $$6) {
      if ($$2.c_($$3) instanceof dsw $$7) {
         if ($$2.C) {
            return bry.a;
         } else {
            cvx $$9 = $$7.f();
            if (!$$0.f() && ($$9.f() || cvx.c($$9, $$0) && $$9.L() < $$9.k())) {
               $$7.a(dsw.a.a);
               $$4.b(awu.c.b($$0.h()));
               cvx $$10 = $$0.b(1, $$4);
               float $$11;
               if ($$7.c()) {
                  $$7.b($$10);
                  $$11 = (float)$$10.L() / (float)$$10.k();
               } else {
                  $$9.g(1);
                  $$11 = (float)$$9.L() / (float)$$9.k();
               }

               $$2.a(null, $$3, awk.gz, awl.e, 1.0F, 0.7F + 0.5F * $$11);
               if ($$2 instanceof arm $$13) {
                  $$13.a(lq.aX, (double)$$3.u() + 0.5, (double)$$3.v() + 1.2, (double)$$3.w() + 0.5, 7, 0.0, 0.0, 0.0, 0.0);
               }

               $$7.e();
               $$2.a($$4, eaa.c, $$3);
               return bry.a;
            } else {
               return bry.f;
            }
         }
      } else {
         return bry.e;
      }
   }

   @Override
   protected bry a(dvd $$0, dev $$1, jg $$2, coh $$3, ezd $$4) {
      if ($$1.c_($$2) instanceof dsw $$5) {
         $$1.a(null, $$2, awk.gA, awl.e, 1.0F, 1.0F);
         $$5.a(dsw.a.b);
         $$1.a($$3, eaa.c, $$2);
         return bry.a;
      } else {
         return bry.e;
      }
   }

   @Override
   protected boolean a(dvd $$0, ert $$1) {
      return false;
   }

   @Override
   protected fab a(dvd $$0, dea $$1, jg $$2, ezm $$3) {
      return d;
   }

   @Override
   protected void a(dve.a<dhy, dvd> $$0) {
      $$0.a(e, f, c);
   }

   @Nullable
   @Override
   public dsg a(jg $$0, dvd $$1) {
      return new dsw($$0, $$1);
   }

   @Override
   protected void a(dvd $$0, dev $$1, jg $$2, dvd $$3, boolean $$4) {
      bru.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected List<cvx> a(dvd $$0, etz.a $$1) {
      dsg $$2 = $$1.b(ews.h);
      if ($$2 instanceof dsw $$3) {
         $$1.a(b, $$1x -> {
            for (cvt $$2x : $$3.t().a()) {
               $$1x.accept($$2x.o());
            }
         });
      }

      return super.a($$0, $$1);
   }

   @Override
   public dvd a(dev $$0, jg $$1, dvd $$2, coh $$3) {
      cvx $$4 = $$3.fb();
      dvd $$5 = $$2;
      if ($$4.a(axi.bJ) && !dbo.a($$4, axc.r)) {
         $$5 = $$2.b(c, Boolean.valueOf(true));
         $$0.a($$1, $$5, 4);
      }

      return super.a($$0, $$1, $$5, $$3);
   }

   @Override
   protected ere b_(dvd $$0) {
      return $$0.c(f) ? erf.c.a(false) : super.b_($$0);
   }

   @Override
   protected dpl h_(dvd $$0) {
      return $$0.c(c) ? dpl.bc : dpl.bb;
   }

   @Override
   public void a(cvx $$0, cvt.b $$1, List<xh> $$2, cxp $$3) {
      super.a($$0, $$1, $$2, $$3);
      dtm $$4 = $$0.a(kt.aj, dtm.a);
      if (!$$4.equals(dtm.a)) {
         $$2.add(xg.a);
         Stream.of($$4.e(), $$4.c(), $$4.d(), $$4.b()).forEach($$1x -> $$2.add(new cvx($$1x.orElse(cwb.qM), 1).y().e().a(n.h)));
      }
   }

   @Override
   protected void a(dev $$0, dvd $$1, ezd $$2, cpb $$3) {
      jg $$4 = $$2.b();
      if (!$$0.C && $$3.a($$0, $$4) && $$3.b($$0)) {
         $$0.a($$4, $$1.b(c, Boolean.valueOf(true)), 4);
         $$0.a($$4, true, $$3);
      }
   }

   @Override
   public cvx a(dey $$0, jg $$1, dvd $$2) {
      return $$0.c_($$1) instanceof dsw $$3 ? $$3.u() : super.a($$0, $$1, $$2);
   }

   @Override
   protected boolean c_(dvd $$0) {
      return true;
   }

   @Override
   protected int a(dvd $$0, dev $$1, jg $$2) {
      return crj.a($$1.c_($$2));
   }

   @Override
   protected dvd a(dvd $$0, dol $$1) {
      return $$0.b(e, $$1.a($$0.c(e)));
   }

   @Override
   protected dvd a(dvd $$0, dmu $$1) {
      return $$0.a($$1.a($$0.c(e)));
   }
}
