import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class dmg extends djq implements dri {
   public static final MapCodec<dmg> a = b(dmg::new);
   public static final alz b = alz.b("sherds");
   private static final fcm d = dke.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);
   private static final dyk<jm> e = dyd.S;
   public static final dye c = dyd.bx;
   private static final dye f = dyd.D;

   @Override
   public MapCodec<dmg> a() {
      return a;
   }

   protected dmg(dxm.d $$0) {
      super($$0);
      this.l(this.F.b().b(e, jm.c).b(f, Boolean.valueOf(false)).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected dxn a(dxn $$0, dhd $$1, dhp $$2, jh $$3, jm $$4, jh $$5, dxn $$6, bam $$7) {
      if ($$0.c(f)) {
         $$2.a($$3, etq.c, etq.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public dxn a(dbb $$0) {
      etp $$1 = $$0.q().b_($$0.a());
      return this.m().b(e, $$0.g()).b(f, Boolean.valueOf($$1.a() == etq.c)).b(c, Boolean.valueOf(false));
   }

   @Override
   protected bte a(cxk $$0, dxn $$1, dha $$2, jh $$3, cps $$4, btd $$5, fbo $$6) {
      if ($$2.c_($$3) instanceof dvg $$7) {
         if ($$2.C) {
            return bte.a;
         } else {
            cxk $$9 = $$7.f();
            if (!$$0.f() && ($$9.f() || cxk.c($$9, $$0) && $$9.L() < $$9.k())) {
               $$7.a(dvg.a.a);
               $$4.b(axp.c.b($$0.h()));
               cxk $$10 = $$0.b(1, $$4);
               float $$11;
               if ($$7.c()) {
                  $$7.b($$10);
                  $$11 = (float)$$10.L() / (float)$$10.k();
               } else {
                  $$9.g(1);
                  $$11 = (float)$$9.L() / (float)$$9.k();
               }

               $$2.a(null, $$3, axf.gR, axg.e, 1.0F, 0.7F + 0.5F * $$11);
               if ($$2 instanceof ash $$13) {
                  $$13.a(ls.aY, (double)$$3.u() + 0.5, (double)$$3.v() + 1.2, (double)$$3.w() + 0.5, 7, 0.0, 0.0, 0.0, 0.0);
               }

               $$7.e();
               $$2.a($$4, ecj.c, $$3);
               return bte.a;
            } else {
               return bte.f;
            }
         }
      } else {
         return bte.e;
      }
   }

   @Override
   protected bte a(dxn $$0, dha $$1, jh $$2, cps $$3, fbo $$4) {
      if ($$1.c_($$2) instanceof dvg $$5) {
         $$1.a(null, $$2, axf.gS, axg.e, 1.0F, 1.0F);
         $$5.a(dvg.a.b);
         $$1.a($$3, ecj.c, $$2);
         return bte.a;
      } else {
         return bte.e;
      }
   }

   @Override
   protected boolean a(dxn $$0, eue $$1) {
      return false;
   }

   @Override
   protected fcm a(dxn $$0, dgf $$1, jh $$2, fbx $$3) {
      return d;
   }

   @Override
   protected void a(dxo.a<dke, dxn> $$0) {
      $$0.a(e, f, c);
   }

   @Nullable
   @Override
   public dup a(jh $$0, dxn $$1) {
      return new dvg($$0, $$1);
   }

   @Override
   protected void a(dxn $$0, dha $$1, jh $$2, dxn $$3, boolean $$4) {
      bta.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected List<cxk> a(dxn $$0, ewk.a $$1) {
      dup $$2 = $$1.b(ezd.h);
      if ($$2 instanceof dvg $$3) {
         $$1.a(b, $$1x -> {
            for (cxg $$2x : $$3.t().a()) {
               $$1x.accept($$2x.n());
            }
         });
      }

      return super.a($$0, $$1);
   }

   @Override
   public dxn a(dha $$0, jh $$1, dxn $$2, cps $$3) {
      cxk $$4 = $$3.eX();
      dxn $$5 = $$2;
      if ($$4.a(ayd.bO) && !ddt.a($$4, axx.r)) {
         $$5 = $$2.b(c, Boolean.valueOf(true));
         $$0.a($$1, $$5, 4);
      }

      return super.a($$0, $$1, $$5, $$3);
   }

   @Override
   protected etp b_(dxn $$0) {
      return $$0.c(f) ? etq.c.a(false) : super.b_($$0);
   }

   @Override
   protected dru h_(dxn $$0) {
      return $$0.c(c) ? dru.bc : dru.bb;
   }

   @Override
   public void a(cxk $$0, cxg.b $$1, List<xv> $$2, czc $$3) {
      super.a($$0, $$1, $$2, $$3);
      dvw $$4 = $$0.a(ku.ak, dvw.a);
      if (!$$4.equals(dvw.a)) {
         $$2.add(xu.a);
         Stream.of($$4.e(), $$4.c(), $$4.d(), $$4.b()).forEach($$1x -> $$2.add(new cxk($$1x.orElse(cxo.rj), 1).y().e().a(n.h)));
      }
   }

   @Override
   protected void a(dha $$0, dxn $$1, fbo $$2, cql $$3) {
      jh $$4 = $$2.b();
      if ($$0 instanceof ash $$5 && $$3.c($$5, $$4) && $$3.a($$5)) {
         $$0.a($$4, $$1.b(c, Boolean.valueOf(true)), 4);
         $$0.a($$4, true, $$3);
      }
   }

   @Override
   public cxk a(dhd $$0, jh $$1, dxn $$2) {
      return $$0.c_($$1) instanceof dvg $$3 ? $$3.u() : super.a($$0, $$1, $$2);
   }

   @Override
   protected boolean c_(dxn $$0) {
      return true;
   }

   @Override
   protected int a(dxn $$0, dha $$1, jh $$2) {
      return csx.a($$1.c_($$2));
   }

   @Override
   protected dxn a(dxn $$0, dqu $$1) {
      return $$0.b(e, $$1.a($$0.c(e)));
   }

   @Override
   protected dxn a(dxn $$0, dpd $$1) {
      return $$0.a($$1.a($$0.c(e)));
   }
}
