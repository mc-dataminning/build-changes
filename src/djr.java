import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class djr extends djk implements djs {
   public static final MapCodec<djr> a = b(djr::new);
   public static final dxm b = dxl.i;
   private static final int c = 5;

   @Override
   public MapCodec<djr> a() {
      return a;
   }

   public djr(dwu.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(true)));
   }

   @Override
   protected void a(dwv $$0, dgg $$1, ji $$2, buj $$3) {
      dwv $$4 = $$1.a_($$2.d());
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
   protected void a(dwv $$0, arc $$1, ji $$2, azg $$3) {
      a($$1, $$2, $$0, $$1.a_($$2.e()));
   }

   @Override
   protected esx b_(dwv $$0) {
      return esy.c.a(false);
   }

   public static void b(dgh $$0, ji $$1, dwv $$2) {
      a($$0, $$1, $$0.a_($$1), $$2);
   }

   public static void a(dgh $$0, ji $$1, dwv $$2, dwv $$3) {
      if (o($$2)) {
         dwv $$4 = q($$3);
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

   private static boolean o(dwv $$0) {
      return $$0.a(djm.nF) || $$0.a(djm.J) && $$0.y().e() >= 8 && $$0.y().b();
   }

   private static dwv q(dwv $$0) {
      if ($$0.a(djm.nF)) {
         return $$0;
      } else if ($$0.a(djm.ej)) {
         return djm.nF.m().b(b, Boolean.valueOf(false));
      } else {
         return $$0.a(djm.ll) ? djm.nF.m().b(b, Boolean.valueOf(true)) : djm.J.m();
      }
   }

   @Override
   public void a(dwv $$0, dgg $$1, ji $$2, azg $$3) {
      double $$4 = (double)$$2.u();
      double $$5 = (double)$$2.v();
      double $$6 = (double)$$2.w();
      if ($$0.c(b)) {
         $$1.b(lt.ar, $$4 + 0.5, $$5 + 0.8, $$6, 0.0, 0.0, 0.0);
         if ($$3.a(200) == 0) {
            $$1.a($$4, $$5, $$6, avz.da, awa.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      } else {
         $$1.b(lt.as, $$4 + 0.5, $$5, $$6 + 0.5, 0.0, 0.04, 0.0);
         $$1.b(lt.as, $$4 + (double)$$3.i(), $$5 + (double)$$3.i(), $$6 + (double)$$3.i(), 0.0, 0.04, 0.0);
         if ($$3.a(200) == 0) {
            $$1.a($$4, $$5, $$6, avz.cY, awa.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      }
   }

   @Override
   protected dwv a(dwv $$0, dgj $$1, dgv $$2, ji $$3, jn $$4, ji $$5, dwv $$6, azg $$7) {
      $$2.a($$3, esy.c, esy.c.a($$1));
      if (!$$0.a($$1, $$3) || $$4 == jn.a || $$4 == jn.b && !$$6.a(djm.nF) && o($$6)) {
         $$2.a($$3, this, 5);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dwv $$0, dgj $$1, ji $$2) {
      dwv $$3 = $$1.a_($$2.e());
      return $$3.a(djm.nF) || $$3.a(djm.ll) || $$3.a(djm.ej);
   }

   @Override
   protected fbs a(dwv $$0, dfl $$1, ji $$2, fbd $$3) {
      return fbp.a();
   }

   @Override
   protected dpv a_(dwv $$0) {
      return dpv.a;
   }

   @Override
   protected void a(dww.a<djk, dwv> $$0) {
      $$0.a(b);
   }

   @Override
   public cwn a(@Nullable cov $$0, dgh $$1, ji $$2, dwv $$3) {
      $$1.a($$2, djm.a.m(), 11);
      return new cwn(cwr.rg);
   }

   @Override
   public Optional<avy> as_() {
      return esy.c.j();
   }
}
