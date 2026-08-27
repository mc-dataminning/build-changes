import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class deg extends dea implements deh {
   public static final MapCodec<deg> a = b(deg::new);
   public static final dru b = drt.e;
   private static final int c = 5;

   @Override
   public MapCodec<deg> a() {
      return a;
   }

   public deg(drc.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(true)));
   }

   @Override
   protected void a(drd $$0, daz $$1, io $$2, brw $$3) {
      drd $$4 = $$1.a_($$2.c());
      if ($$4.i()) {
         $$3.l($$0.c(b));
         if (!$$1.B) {
            aqn $$5 = (aqn)$$1;

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
   protected void a(drd $$0, aqn $$1, io $$2, aym $$3) {
      a($$1, $$2, $$0, $$1.a_($$2.d()));
   }

   @Override
   protected emw b_(drd $$0) {
      return emx.c.a(false);
   }

   public static void b(dba $$0, io $$1, drd $$2) {
      a($$0, $$1, $$0.a_($$1), $$2);
   }

   public static void a(dba $$0, io $$1, drd $$2, drd $$3) {
      if (m($$2)) {
         drd $$4 = n($$3);
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

   private static boolean m(drd $$0) {
      return $$0.a(dec.nd) || $$0.a(dec.G) && $$0.u().e() >= 8 && $$0.u().b();
   }

   private static drd n(drd $$0) {
      if ($$0.a(dec.nd)) {
         return $$0;
      } else if ($$0.a(dec.dW)) {
         return dec.nd.n().a(b, Boolean.valueOf(false));
      } else {
         return $$0.a(dec.kJ) ? dec.nd.n().a(b, Boolean.valueOf(true)) : dec.G.n();
      }
   }

   @Override
   public void a(drd $$0, daz $$1, io $$2, aym $$3) {
      double $$4 = (double)$$2.u();
      double $$5 = (double)$$2.v();
      double $$6 = (double)$$2.w();
      if ($$0.c(b)) {
         $$1.b(ky.ap, $$4 + 0.5, $$5 + 0.8, $$6, 0.0, 0.0, 0.0);
         if ($$3.a(200) == 0) {
            $$1.a($$4, $$5, $$6, avi.da, avj.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      } else {
         $$1.b(ky.aq, $$4 + 0.5, $$5, $$6 + 0.5, 0.0, 0.04, 0.0);
         $$1.b(ky.aq, $$4 + (double)$$3.i(), $$5 + (double)$$3.i(), $$6 + (double)$$3.i(), 0.0, 0.04, 0.0);
         if ($$3.a(200) == 0) {
            $$1.a($$4, $$5, $$6, avi.cY, avj.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      }
   }

   @Override
   protected drd a(drd $$0, it $$1, drd $$2, dba $$3, io $$4, io $$5) {
      $$3.a($$4, emx.c, emx.c.a($$3));
      if (!$$0.a($$3, $$4) || $$1 == it.a || $$1 == it.b && !$$2.a(dec.nd) && m($$2)) {
         $$3.a($$4, this, 5);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(drd $$0, dbc $$1, io $$2) {
      drd $$3 = $$1.a_($$2.d());
      return $$3.a(dec.nd) || $$3.a(dec.kJ) || $$3.a(dec.dW);
   }

   @Override
   protected evf a(drd $$0, daf $$1, io $$2, eur $$3) {
      return evc.a();
   }

   @Override
   protected dkg a_(drd $$0) {
      return dkg.a;
   }

   @Override
   protected void a(dre.a<dea, drd> $$0) {
      $$0.a(b);
   }

   @Override
   public ctq a(@Nullable cly $$0, dba $$1, io $$2, drd $$3) {
      $$1.a($$2, dec.a.n(), 11);
      return new ctq(ctt.qz);
   }

   @Override
   public Optional<avh> at_() {
      return emx.c.j();
   }
}
