import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dee extends ddy implements def {
   public static final MapCodec<dee> a = b(dee::new);
   public static final drs b = drr.e;
   private static final int c = 5;

   @Override
   public MapCodec<dee> a() {
      return a;
   }

   public dee(dra.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(true)));
   }

   @Override
   protected void a(drb $$0, dax $$1, io $$2, bru $$3) {
      drb $$4 = $$1.a_($$2.c());
      if ($$4.i()) {
         $$3.l($$0.c(b));
         if (!$$1.B) {
            aqm $$5 = (aqm)$$1;

            for (int $$6 = 0; $$6 < 2; $$6++) {
               $$5.a(ky.am, (double)$$2.u() + $$1.z.j(), (double)($$2.v() + 1), (double)$$2.w() + $$1.z.j(), 1, 0.0, 0.0, 0.0, 1.0);
               $$5.a(ky.d, (double)$$2.u() + $$1.z.j(), (double)($$2.v() + 1), (double)$$2.w() + $$1.z.j(), 1, 0.0, 0.01, 0.0, 0.2);
            }
         }
      } else {
         $$3.m($$0.c(b));
      }
   }

   @Override
   protected void a(drb $$0, aqm $$1, io $$2, ayk $$3) {
      a($$1, $$2, $$0, $$1.a_($$2.d()));
   }

   @Override
   protected emu b_(drb $$0) {
      return emv.c.a(false);
   }

   public static void b(day $$0, io $$1, drb $$2) {
      a($$0, $$1, $$0.a_($$1), $$2);
   }

   public static void a(day $$0, io $$1, drb $$2, drb $$3) {
      if (m($$2)) {
         drb $$4 = n($$3);
         $$0.a($$1, $$4, 2);
         io.a $$5 = $$1.j().c(it.b);

         while (m($$0.a_($$5))) {
            if (!$$0.a($$5, $$4, 2)) {
               return;
            }

            $$5.c(it.b);
         }
      }
   }

   private static boolean m(drb $$0) {
      return $$0.a(dea.nd) || $$0.a(dea.G) && $$0.u().e() >= 8 && $$0.u().b();
   }

   private static drb n(drb $$0) {
      if ($$0.a(dea.nd)) {
         return $$0;
      } else if ($$0.a(dea.dW)) {
         return dea.nd.n().a(b, Boolean.valueOf(false));
      } else {
         return $$0.a(dea.kJ) ? dea.nd.n().a(b, Boolean.valueOf(true)) : dea.G.n();
      }
   }

   @Override
   public void a(drb $$0, dax $$1, io $$2, ayk $$3) {
      double $$4 = (double)$$2.u();
      double $$5 = (double)$$2.v();
      double $$6 = (double)$$2.w();
      if ($$0.c(b)) {
         $$1.b(ky.ap, $$4 + 0.5, $$5 + 0.8, $$6, 0.0, 0.0, 0.0);
         if ($$3.a(200) == 0) {
            $$1.a($$4, $$5, $$6, avh.da, avi.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      } else {
         $$1.b(ky.aq, $$4 + 0.5, $$5, $$6 + 0.5, 0.0, 0.04, 0.0);
         $$1.b(ky.aq, $$4 + (double)$$3.i(), $$5 + (double)$$3.i(), $$6 + (double)$$3.i(), 0.0, 0.04, 0.0);
         if ($$3.a(200) == 0) {
            $$1.a($$4, $$5, $$6, avh.cY, avi.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      }
   }

   @Override
   protected drb a(drb $$0, it $$1, drb $$2, day $$3, io $$4, io $$5) {
      $$3.a($$4, emv.c, emv.c.a($$3));
      if (!$$0.a($$3, $$4) || $$1 == it.a || $$1 == it.b && !$$2.a(dea.nd) && m($$2)) {
         $$3.a($$4, this, 5);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(drb $$0, dba $$1, io $$2) {
      drb $$3 = $$1.a_($$2.d());
      return $$3.a(dea.nd) || $$3.a(dea.kJ) || $$3.a(dea.dW);
   }

   @Override
   protected evd a(drb $$0, dad $$1, io $$2, eup $$3) {
      return eva.a();
   }

   @Override
   protected dke a_(drb $$0) {
      return dke.a;
   }

   @Override
   protected void a(drc.a<ddy, drb> $$0) {
      $$0.a(b);
   }

   @Override
   public cto a(@Nullable clw $$0, day $$1, io $$2, drb $$3) {
      $$1.a($$2, dea.a.n(), 11);
      return new cto(ctr.qz);
   }

   @Override
   public Optional<avg> as_() {
      return emv.c.j();
   }
}
