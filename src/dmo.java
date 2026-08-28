import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class dmo extends djy implements drq {
   public static final MapCodec<dmo> a = b(dmo::new);
   public static final alz b = alz.b("sherds");
   private static final fcs d = dkm.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);
   private static final dys<jm> e = dyl.S;
   public static final dym c = dyl.bx;
   private static final dym f = dyl.D;

   @Override
   public MapCodec<dmo> a() {
      return a;
   }

   protected dmo(dxu.d $$0) {
      super($$0);
      this.l(this.F.b().b(e, jm.c).b(f, Boolean.valueOf(false)).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected dxv a(dxv $$0, dhl $$1, dhx $$2, jh $$3, jm $$4, jh $$5, dxv $$6, bam $$7) {
      if ($$0.c(f)) {
         $$2.a($$3, ety.c, ety.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public dxv a(dbg $$0) {
      etx $$1 = $$0.q().b_($$0.a());
      return this.m().b(e, $$0.g()).b(f, Boolean.valueOf($$1.a() == ety.c)).b(c, Boolean.valueOf(false));
   }

   @Override
   protected btj a(cxp $$0, dxv $$1, dhi $$2, jh $$3, cpx $$4, bti $$5, fbu $$6) {
      if ($$2.c_($$3) instanceof dvo $$7) {
         if ($$2.C) {
            return btj.a;
         } else {
            cxp $$9 = $$7.f();
            if (!$$0.f() && ($$9.f() || cxp.c($$9, $$0) && $$9.L() < $$9.k())) {
               $$7.a(dvo.a.a);
               $$4.b(axp.c.b($$0.h()));
               cxp $$10 = $$0.b(1, $$4);
               float $$11;
               if ($$7.c()) {
                  $$7.b($$10);
                  $$11 = (float)$$10.L() / (float)$$10.k();
               } else {
                  $$9.g(1);
                  $$11 = (float)$$9.L() / (float)$$9.k();
               }

               $$2.a(null, $$3, axf.gS, axg.e, 1.0F, 0.7F + 0.5F * $$11);
               if ($$2 instanceof ash $$13) {
                  $$13.a(ls.aY, (double)$$3.u() + 0.5, (double)$$3.v() + 1.2, (double)$$3.w() + 0.5, 7, 0.0, 0.0, 0.0, 0.0);
               }

               $$7.e();
               $$2.a($$4, ecr.c, $$3);
               return btj.a;
            } else {
               return btj.f;
            }
         }
      } else {
         return btj.e;
      }
   }

   @Override
   protected btj a(dxv $$0, dhi $$1, jh $$2, cpx $$3, fbu $$4) {
      if ($$1.c_($$2) instanceof dvo $$5) {
         $$1.a(null, $$2, axf.gT, axg.e, 1.0F, 1.0F);
         $$5.a(dvo.a.b);
         $$1.a($$3, ecr.c, $$2);
         return btj.a;
      } else {
         return btj.e;
      }
   }

   @Override
   protected boolean a(dxv $$0, eum $$1) {
      return false;
   }

   @Override
   protected fcs a(dxv $$0, dgn $$1, jh $$2, fcd $$3) {
      return d;
   }

   @Override
   protected void a(dxw.a<dkm, dxv> $$0) {
      $$0.a(e, f, c);
   }

   @Nullable
   @Override
   public dux a(jh $$0, dxv $$1) {
      return new dvo($$0, $$1);
   }

   @Override
   protected void a(dxv $$0, dhi $$1, jh $$2, dxv $$3, boolean $$4) {
      btf.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected List<cxp> a(dxv $$0, ews.a $$1) {
      dux $$2 = $$1.b(ezj.h);
      if ($$2 instanceof dvo $$3) {
         $$1.a(b, $$1x -> {
            for (cxl $$2x : $$3.t().a()) {
               $$1x.accept($$2x.n());
            }
         });
      }

      return super.a($$0, $$1);
   }

   @Override
   public dxv a(dhi $$0, jh $$1, dxv $$2, cpx $$3) {
      cxp $$4 = $$3.eZ();
      dxv $$5 = $$2;
      if ($$4.a(ayd.bO) && !deb.a($$4, axx.r)) {
         $$5 = $$2.b(c, Boolean.valueOf(true));
         $$0.a($$1, $$5, 4);
      }

      return super.a($$0, $$1, $$5, $$3);
   }

   @Override
   protected etx b_(dxv $$0) {
      return $$0.c(f) ? ety.c.a(false) : super.b_($$0);
   }

   @Override
   protected dsc h_(dxv $$0) {
      return $$0.c(c) ? dsc.bc : dsc.bb;
   }

   @Override
   public void a(cxp $$0, cxl.b $$1, List<xv> $$2, czh $$3) {
      super.a($$0, $$1, $$2, $$3);
      dwe $$4 = $$0.a(ku.ak, dwe.a);
      if (!$$4.equals(dwe.a)) {
         $$2.add(xu.a);
         Stream.of($$4.e(), $$4.c(), $$4.d(), $$4.b()).forEach($$1x -> $$2.add(new cxp($$1x.orElse(cxt.rj), 1).y().e().a(n.h)));
      }
   }

   @Override
   protected void a(dhi $$0, dxv $$1, fbu $$2, cqq $$3) {
      jh $$4 = $$2.b();
      if ($$0 instanceof ash $$5 && $$3.c($$5, $$4) && $$3.a($$5)) {
         $$0.a($$4, $$1.b(c, Boolean.valueOf(true)), 4);
         $$0.a($$4, true, $$3);
      }
   }

   @Override
   public cxp a(dhl $$0, jh $$1, dxv $$2) {
      return $$0.c_($$1) instanceof dvo $$3 ? $$3.u() : super.a($$0, $$1, $$2);
   }

   @Override
   protected boolean c_(dxv $$0) {
      return true;
   }

   @Override
   protected int a(dxv $$0, dhi $$1, jh $$2) {
      return ctc.a($$1.c_($$2));
   }

   @Override
   protected dxv a(dxv $$0, drc $$1) {
      return $$0.b(e, $$1.a($$0.c(e)));
   }

   @Override
   protected dxv a(dxv $$0, dpl $$1) {
      return $$0.a($$1.a($$0.c(e)));
   }
}
