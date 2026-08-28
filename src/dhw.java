import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class dhw extends dfi implements dmy {
   public static final MapCodec<dhw> a = b(dhw::new);
   public static final akq b = akq.b("sherds");
   private static final exp d = dfw.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);
   private static final dtu e = dtq.R;
   public static final dtr c = dtq.bw;
   private static final dtr f = dtq.C;

   @Override
   public MapCodec<dhw> a() {
      return a;
   }

   protected dhw(dsz.d $$0) {
      super($$0);
      this.k(this.E.b().a(e, ji.c).a(f, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected dta a(dta $$0, ji $$1, dta $$2, dcv $$3, jd $$4, jd $$5) {
      if ($$0.c(f)) {
         $$3.a($$4, eoz.c, eoz.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public dta a(cyb $$0) {
      eoy $$1 = $$0.q().b_($$0.a());
      return this.o().a(e, $$0.g()).a(f, Boolean.valueOf($$1.a() == eoz.c)).a(c, Boolean.valueOf(false));
   }

   @Override
   protected bqs a(cuo $$0, dta $$1, dcu $$2, jd $$3, cmv $$4, bqp $$5, ews $$6) {
      if ($$2.c_($$3) instanceof dqv $$7) {
         if ($$2.B) {
            return bqs.b;
         } else {
            cuo $$9 = $$7.f();
            if (!$$0.e() && ($$9.e() || cuo.c($$9, $$0) && $$9.H() < $$9.j())) {
               $$7.a(dqv.a.a);
               $$4.b(avy.c.b($$0.g()));
               cuo $$10 = $$0.b(1, $$4);
               float $$11;
               if ($$7.c()) {
                  $$7.b($$10);
                  $$11 = (float)$$10.H() / (float)$$10.j();
               } else {
                  $$9.g(1);
                  $$11 = (float)$$9.H() / (float)$$9.j();
               }

               $$2.a(null, $$3, avo.gy, avp.e, 1.0F, 0.7F + 0.5F * $$11);
               if ($$2 instanceof aqt $$13) {
                  $$13.a(lm.aX, (double)$$3.u() + 0.5, (double)$$3.v() + 1.2, (double)$$3.w() + 0.5, 7, 0.0, 0.0, 0.0, 0.0);
               }

               $$7.e();
               $$2.a($$4, dxw.c, $$3);
               return bqs.a;
            } else {
               return bqs.d;
            }
         }
      } else {
         return bqs.e;
      }
   }

   @Override
   protected bqq a(dta $$0, dcu $$1, jd $$2, cmv $$3, ews $$4) {
      if ($$1.c_($$2) instanceof dqv $$5) {
         $$1.a(null, $$2, avo.gz, avp.e, 1.0F, 1.0F);
         $$5.a(dqv.a.b);
         $$1.a($$3, dxw.c, $$2);
         return bqq.a;
      } else {
         return bqq.e;
      }
   }

   @Override
   protected boolean a(dta $$0, epn $$1) {
      return false;
   }

   @Override
   protected exp a(dta $$0, dca $$1, jd $$2, exb $$3) {
      return d;
   }

   @Override
   protected void a(dtb.a<dfw, dta> $$0) {
      $$0.a(e, f, c);
   }

   @Nullable
   @Override
   public dqf a(jd $$0, dta $$1) {
      return new dqv($$0, $$1);
   }

   @Override
   protected void a(dta $$0, dcu $$1, jd $$2, dta $$3, boolean $$4) {
      bqm.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected List<cuo> a(dta $$0, ero.a $$1) {
      dqf $$2 = $$1.b(euh.h);
      if ($$2 instanceof dqv $$3) {
         $$1.a(b, $$1x -> {
            for (cuj $$2x : $$3.l().a()) {
               $$1x.accept($$2x.w());
            }
         });
      }

      return super.a($$0, $$1);
   }

   @Override
   public dta a(dcu $$0, jd $$1, dta $$2, cmv $$3) {
      cuo $$4 = $$3.eU();
      dta $$5 = $$2;
      if ($$4.a(awm.bv) && !dac.a($$4, awg.r)) {
         $$5 = $$2.a(c, Boolean.valueOf(true));
         $$0.a($$1, $$5, 4);
      }

      return super.a($$0, $$1, $$5, $$3);
   }

   @Override
   protected eoy b_(dta $$0) {
      return $$0.c(f) ? eoz.c.a(false) : super.b_($$0);
   }

   @Override
   protected dnk g_(dta $$0) {
      return $$0.c(c) ? dnk.bc : dnk.bb;
   }

   @Override
   public void a(cuo $$0, cuj.b $$1, List<wy> $$2, cwk $$3) {
      super.a($$0, $$1, $$2, $$3);
      drk $$4 = $$0.a(kq.aa, drk.a);
      if (!$$4.equals(drk.a)) {
         $$2.add(wx.a);
         Stream.of($$4.e(), $$4.c(), $$4.d(), $$4.b()).forEach($$1x -> $$2.add(new cuo($$1x.orElse(cur.qL), 1).w().e().a(n.h)));
      }
   }

   @Override
   protected void a(dcu $$0, dta $$1, ews $$2, cnn $$3) {
      jd $$4 = $$2.a();
      if (!$$0.B && $$3.a($$0, $$4) && $$3.b($$0)) {
         $$0.a($$4, $$1.a(c, Boolean.valueOf(true)), 4);
         $$0.a($$4, true, $$3);
      }
   }

   @Override
   public cuo a(dcx $$0, jd $$1, dta $$2) {
      return $$0.c_($$1) instanceof dqv $$3 ? $$3.u() : super.a($$0, $$1, $$2);
   }

   @Override
   protected boolean c_(dta $$0) {
      return true;
   }

   @Override
   protected int a(dta $$0, dcu $$1, jd $$2) {
      return cps.a($$1.c_($$2));
   }

   @Override
   protected dta a(dta $$0, dmk $$1) {
      return $$0.a(e, $$1.a($$0.c(e)));
   }

   @Override
   protected dta a(dta $$0, dkt $$1) {
      return $$0.a($$1.a($$0.c(e)));
   }
}
