import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class dme extends djp implements drj {
   public static final MapCodec<dme> a = b(dme::new);
   public static final alp b = alp.b("sherds");
   private static final fcl d = dkd.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);
   private static final dyl<jm> e = dye.U;
   public static final dyf c = dye.bz;
   private static final dyf f = dye.J;

   @Override
   public MapCodec<dme> a() {
      return a;
   }

   protected dme(dxn.d $$0) {
      super($$0);
      this.l(this.F.b().b(e, jm.c).b(f, Boolean.valueOf(false)).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected dxo a(dxo $$0, dhc $$1, dho $$2, jh $$3, jm $$4, jh $$5, dxo $$6, bac $$7) {
      if ($$0.c(f)) {
         $$2.a($$3, etr.c, etr.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public dxo a(dax $$0) {
      etq $$1 = $$0.q().b_($$0.a());
      return this.m().b(e, $$0.g()).b(f, Boolean.valueOf($$1.a() == etr.c)).b(c, Boolean.valueOf(false));
   }

   @Override
   protected bta a(cxg $$0, dxo $$1, dgz $$2, jh $$3, cpo $$4, bsz $$5, fbn $$6) {
      if ($$2.c_($$3) instanceof dvh $$7) {
         if ($$2.C) {
            return bta.a;
         } else {
            cxg $$9 = $$7.f();
            if (!$$0.f() && ($$9.f() || cxg.c($$9, $$0) && $$9.M() < $$9.k())) {
               $$7.a(dvh.a.a);
               $$4.b(axf.c.b($$0.h()));
               cxg $$10 = $$0.b(1, $$4);
               float $$11;
               if ($$7.c()) {
                  $$7.b($$10);
                  $$11 = (float)$$10.M() / (float)$$10.k();
               } else {
                  $$9.g(1);
                  $$11 = (float)$$9.M() / (float)$$9.k();
               }

               $$2.a(null, $$3, awv.gT, aww.e, 1.0F, 0.7F + 0.5F * $$11);
               if ($$2 instanceof arx $$13) {
                  $$13.a(ls.aZ, (double)$$3.u() + 0.5, (double)$$3.v() + 1.2, (double)$$3.w() + 0.5, 7, 0.0, 0.0, 0.0, 0.0);
               }

               $$7.e();
               $$2.a($$4, eck.c, $$3);
               return bta.a;
            } else {
               return bta.f;
            }
         }
      } else {
         return bta.e;
      }
   }

   @Override
   protected bta a(dxo $$0, dgz $$1, jh $$2, cpo $$3, fbn $$4) {
      if ($$1.c_($$2) instanceof dvh $$5) {
         $$1.a(null, $$2, awv.gU, aww.e, 1.0F, 1.0F);
         $$5.a(dvh.a.b);
         $$1.a($$3, eck.c, $$2);
         return bta.a;
      } else {
         return bta.e;
      }
   }

   @Override
   protected boolean a(dxo $$0, euf $$1) {
      return false;
   }

   @Override
   protected fcl a(dxo $$0, dge $$1, jh $$2, fbw $$3) {
      return d;
   }

   @Override
   protected void a(dxp.a<dkd, dxo> $$0) {
      $$0.a(e, f, c);
   }

   @Nullable
   @Override
   public duq a(jh $$0, dxo $$1) {
      return new dvh($$0, $$1);
   }

   @Override
   protected void a(dxo $$0, dgz $$1, jh $$2, dxo $$3, boolean $$4) {
      bsw.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected List<cxg> a(dxo $$0, ewl.a $$1) {
      duq $$2 = $$1.b(ezc.h);
      if ($$2 instanceof dvh $$3) {
         $$1.a(b, $$1x -> {
            for (cxc $$2x : $$3.s().a()) {
               $$1x.accept($$2x.n());
            }
         });
      }

      return super.a($$0, $$1);
   }

   @Override
   public dxo a(dgz $$0, jh $$1, dxo $$2, cpo $$3) {
      cxg $$4 = $$3.eZ();
      dxo $$5 = $$2;
      if ($$4.a(axt.bO) && !dds.a($$4, axn.r)) {
         $$5 = $$2.b(c, Boolean.valueOf(true));
         $$0.a($$1, $$5, 4);
      }

      return super.a($$0, $$1, $$5, $$3);
   }

   @Override
   protected etq b_(dxo $$0) {
      return $$0.c(f) ? etr.c.a(false) : super.b_($$0);
   }

   @Override
   protected drv h_(dxo $$0) {
      return $$0.c(c) ? drv.bc : drv.bb;
   }

   @Override
   public void a(cxg $$0, cxc.b $$1, List<xk> $$2, cyy $$3) {
      super.a($$0, $$1, $$2, $$3);
      dvx $$4 = $$0.a(ku.ak, dvx.a);
      if (!$$4.equals(dvx.a)) {
         $$2.add(xj.a);
         Stream.of($$4.e(), $$4.c(), $$4.d(), $$4.b()).forEach($$1x -> $$2.add(new cxg($$1x.orElse(cxk.rs), 1).y().e().a(n.h)));
      }
   }

   @Override
   protected void a(dgz $$0, dxo $$1, fbn $$2, cqh $$3) {
      jh $$4 = $$2.b();
      if ($$0 instanceof arx $$5 && $$3.c($$5, $$4) && $$3.a($$5)) {
         $$0.a($$4, $$1.b(c, Boolean.valueOf(true)), 4);
         $$0.a($$4, true, $$3);
      }
   }

   @Override
   protected cxg a(dhc $$0, jh $$1, dxo $$2) {
      return $$0.c_($$1) instanceof dvh $$3 ? $$3.t() : super.a($$0, $$1, $$2);
   }

   @Override
   protected boolean c_(dxo $$0) {
      return true;
   }

   @Override
   protected int a(dxo $$0, dgz $$1, jh $$2) {
      return cst.a($$1.c_($$2));
   }

   @Override
   protected dxo a(dxo $$0, dqv $$1) {
      return $$0.b(e, $$1.a($$0.c(e)));
   }

   @Override
   protected dxo a(dxo $$0, dpc $$1) {
      return $$0.a($$1.a($$0.c(e)));
   }
}
