import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class djt extends djm implements dju {
   public static final MapCodec<djt> a = b(djt::new);
   public static final dxo b = dxn.i;
   private static final int c = 5;

   @Override
   public MapCodec<djt> a() {
      return a;
   }

   public djt(dww.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(true)));
   }

   @Override
   protected void a(dwx $$0, dgi $$1, ji $$2, buk $$3) {
      dwx $$4 = $$1.a_($$2.d());
      if ($$4.l()) {
         $$3.l($$0.c(b));
         if (!$$1.C) {
            arc $$5 = (arc)$$1;

            for (int $$6 = 0; $$6 < 2; $$6++) {
               $$5.a(lt.ao, (double)$$2.u() + $$1.A.j(), (double)($$2.v() + 1), (double)$$2.w() + $$1.A.j(), 1, 0.0, 0.0, 0.0, 1.0);
               $$5.a(lt.d, (double)$$2.u() + $$1.A.j(), (double)($$2.v() + 1), (double)$$2.w() + $$1.A.j(), 1, 0.0, 0.01, 0.0, 0.2);
            }
         }
      } else {
         $$3.m($$0.c(b));
      }
   }

   @Override
   protected void a(dwx $$0, arc $$1, ji $$2, azh $$3) {
      a($$1, $$2, $$0, $$1.a_($$2.e()));
   }

   @Override
   protected esz b_(dwx $$0) {
      return eta.c.a(false);
   }

   public static void b(dgj $$0, ji $$1, dwx $$2) {
      a($$0, $$1, $$0.a_($$1), $$2);
   }

   public static void a(dgj $$0, ji $$1, dwx $$2, dwx $$3) {
      if (o($$2)) {
         dwx $$4 = q($$3);
         $$0.a($$1, $$4, 2);
         ji.a $$5 = $$1.k().c(jn.b);

         while (o($$0.a_($$5))) {
            if (!$$0.a($$5, $$4, 2)) {
               return;
            }

            $$5.c(jn.b);
         }
      }
   }

   private static boolean o(dwx $$0) {
      return $$0.a(djo.nF) || $$0.a(djo.J) && $$0.y().e() >= 8 && $$0.y().b();
   }

   private static dwx q(dwx $$0) {
      if ($$0.a(djo.nF)) {
         return $$0;
      } else if ($$0.a(djo.ej)) {
         return djo.nF.m().b(b, Boolean.valueOf(false));
      } else {
         return $$0.a(djo.ll) ? djo.nF.m().b(b, Boolean.valueOf(true)) : djo.J.m();
      }
   }

   @Override
   public void a(dwx $$0, dgi $$1, ji $$2, azh $$3) {
      double $$4 = (double)$$2.u();
      double $$5 = (double)$$2.v();
      double $$6 = (double)$$2.w();
      if ($$0.c(b)) {
         $$1.b(lt.ar, $$4 + 0.5, $$5 + 0.8, $$6, 0.0, 0.0, 0.0);
         if ($$3.a(200) == 0) {
            $$1.a($$4, $$5, $$6, awa.da, awb.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      } else {
         $$1.b(lt.as, $$4 + 0.5, $$5, $$6 + 0.5, 0.0, 0.04, 0.0);
         $$1.b(lt.as, $$4 + (double)$$3.i(), $$5 + (double)$$3.i(), $$6 + (double)$$3.i(), 0.0, 0.04, 0.0);
         if ($$3.a(200) == 0) {
            $$1.a($$4, $$5, $$6, awa.cY, awb.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      }
   }

   @Override
   protected dwx a(dwx $$0, dgl $$1, dgx $$2, ji $$3, jn $$4, ji $$5, dwx $$6, azh $$7) {
      $$2.a($$3, eta.c, eta.c.a($$1));
      if (!$$0.a($$1, $$3) || $$4 == jn.a || $$4 == jn.b && !$$6.a(djo.nF) && o($$6)) {
         $$2.a($$3, this, 5);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dwx $$0, dgl $$1, ji $$2) {
      dwx $$3 = $$1.a_($$2.e());
      return $$3.a(djo.nF) || $$3.a(djo.ll) || $$3.a(djo.ej);
   }

   @Override
   protected fbu a(dwx $$0, dfn $$1, ji $$2, fbf $$3) {
      return fbr.a();
   }

   @Override
   protected dpx a_(dwx $$0) {
      return dpx.a;
   }

   @Override
   protected void a(dwy.a<djm, dwx> $$0) {
      $$0.a(b);
   }

   @Override
   public cwp a(@Nullable cox $$0, dgj $$1, ji $$2, dwx $$3) {
      $$1.a($$2, djo.a.m(), 11);
      return new cwp(cwt.rg);
   }

   @Override
   public Optional<avz> as_() {
      return eta.c.j();
   }
}
