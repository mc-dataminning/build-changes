import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class dmn extends djx implements drp {
   public static final MapCodec<dmn> a = b(dmn::new);
   public static final alz b = alz.b("sherds");
   private static final fcr d = dkl.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);
   private static final dyr<jm> e = dyk.S;
   public static final dyl c = dyk.bx;
   private static final dyl f = dyk.D;

   @Override
   public MapCodec<dmn> a() {
      return a;
   }

   protected dmn(dxt.d $$0) {
      super($$0);
      this.l(this.F.b().b(e, jm.c).b(f, Boolean.valueOf(false)).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected dxu a(dxu $$0, dhk $$1, dhw $$2, jh $$3, jm $$4, jh $$5, dxu $$6, bam $$7) {
      if ($$0.c(f)) {
         $$2.a($$3, etx.c, etx.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public dxu a(dbf $$0) {
      etw $$1 = $$0.q().b_($$0.a());
      return this.m().b(e, $$0.g()).b(f, Boolean.valueOf($$1.a() == etx.c)).b(c, Boolean.valueOf(false));
   }

   @Override
   protected bti a(cxo $$0, dxu $$1, dhh $$2, jh $$3, cpw $$4, bth $$5, fbt $$6) {
      if ($$2.c_($$3) instanceof dvn $$7) {
         if ($$2.C) {
            return bti.a;
         } else {
            cxo $$9 = $$7.f();
            if (!$$0.f() && ($$9.f() || cxo.c($$9, $$0) && $$9.L() < $$9.k())) {
               $$7.a(dvn.a.a);
               $$4.b(axp.c.b($$0.h()));
               cxo $$10 = $$0.b(1, $$4);
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
               $$2.a($$4, ecq.c, $$3);
               return bti.a;
            } else {
               return bti.f;
            }
         }
      } else {
         return bti.e;
      }
   }

   @Override
   protected bti a(dxu $$0, dhh $$1, jh $$2, cpw $$3, fbt $$4) {
      if ($$1.c_($$2) instanceof dvn $$5) {
         $$1.a(null, $$2, axf.gT, axg.e, 1.0F, 1.0F);
         $$5.a(dvn.a.b);
         $$1.a($$3, ecq.c, $$2);
         return bti.a;
      } else {
         return bti.e;
      }
   }

   @Override
   protected boolean a(dxu $$0, eul $$1) {
      return false;
   }

   @Override
   protected fcr a(dxu $$0, dgm $$1, jh $$2, fcc $$3) {
      return d;
   }

   @Override
   protected void a(dxv.a<dkl, dxu> $$0) {
      $$0.a(e, f, c);
   }

   @Nullable
   @Override
   public duw a(jh $$0, dxu $$1) {
      return new dvn($$0, $$1);
   }

   @Override
   protected void a(dxu $$0, dhh $$1, jh $$2, dxu $$3, boolean $$4) {
      bte.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected List<cxo> a(dxu $$0, ewr.a $$1) {
      duw $$2 = $$1.b(ezi.h);
      if ($$2 instanceof dvn $$3) {
         $$1.a(b, $$1x -> {
            for (cxk $$2x : $$3.t().a()) {
               $$1x.accept($$2x.n());
            }
         });
      }

      return super.a($$0, $$1);
   }

   @Override
   public dxu a(dhh $$0, jh $$1, dxu $$2, cpw $$3) {
      cxo $$4 = $$3.eZ();
      dxu $$5 = $$2;
      if ($$4.a(ayd.bO) && !dea.a($$4, axx.r)) {
         $$5 = $$2.b(c, Boolean.valueOf(true));
         $$0.a($$1, $$5, 4);
      }

      return super.a($$0, $$1, $$5, $$3);
   }

   @Override
   protected etw b_(dxu $$0) {
      return $$0.c(f) ? etx.c.a(false) : super.b_($$0);
   }

   @Override
   protected dsb h_(dxu $$0) {
      return $$0.c(c) ? dsb.bc : dsb.bb;
   }

   @Override
   public void a(cxo $$0, cxk.b $$1, List<xv> $$2, czg $$3) {
      super.a($$0, $$1, $$2, $$3);
      dwd $$4 = $$0.a(ku.ak, dwd.a);
      if (!$$4.equals(dwd.a)) {
         $$2.add(xu.a);
         Stream.of($$4.e(), $$4.c(), $$4.d(), $$4.b()).forEach($$1x -> $$2.add(new cxo($$1x.orElse(cxs.rj), 1).y().e().a(n.h)));
      }
   }

   @Override
   protected void a(dhh $$0, dxu $$1, fbt $$2, cqp $$3) {
      jh $$4 = $$2.b();
      if ($$0 instanceof ash $$5 && $$3.c($$5, $$4) && $$3.a($$5)) {
         $$0.a($$4, $$1.b(c, Boolean.valueOf(true)), 4);
         $$0.a($$4, true, $$3);
      }
   }

   @Override
   public cxo a(dhk $$0, jh $$1, dxu $$2) {
      return $$0.c_($$1) instanceof dvn $$3 ? $$3.u() : super.a($$0, $$1, $$2);
   }

   @Override
   protected boolean c_(dxu $$0) {
      return true;
   }

   @Override
   protected int a(dxu $$0, dhh $$1, jh $$2) {
      return ctb.a($$1.c_($$2));
   }

   @Override
   protected dxu a(dxu $$0, drb $$1) {
      return $$0.b(e, $$1.a($$0.c(e)));
   }

   @Override
   protected dxu a(dxu $$0, dpk $$1) {
      return $$0.a($$1.a($$0.c(e)));
   }
}
