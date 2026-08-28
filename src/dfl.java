import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dfl extends dff implements dfm {
   public static final MapCodec<dfl> a = b(dfl::new);
   public static final dsy b = dsx.e;
   private static final int c = 5;

   @Override
   public MapCodec<dfl> a() {
      return a;
   }

   public dfl(dsg.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(true)));
   }

   @Override
   protected void a(dsh $$0, dcd $$1, ja $$2, bsd $$3) {
      dsh $$4 = $$1.a_($$2.c());
      if ($$4.i()) {
         $$3.l($$0.c(b));
         if (!$$1.B) {
            aqk $$5 = (aqk)$$1;

            for (int $$6 = 0; $$6 < 2; $$6++) {
               $$5.a(lj.am, (double)$$2.u() + $$1.z.j(), (double)($$2.v() + 1), (double)$$2.w() + $$1.z.j(), 1, 0.0, 0.0, 0.0, 1.0);
               $$5.a(lj.d, (double)$$2.u() + $$1.z.j(), (double)($$2.v() + 1), (double)$$2.w() + $$1.z.j(), 1, 0.0, 0.01, 0.0, 0.2);
            }
         }
      } else {
         $$3.m($$0.c(b));
      }
   }

   @Override
   protected void a(dsh $$0, aqk $$1, ja $$2, aym $$3) {
      a($$1, $$2, $$0, $$1.a_($$2.d()));
   }

   @Override
   protected eob b_(dsh $$0) {
      return eoc.c.a(false);
   }

   public static void b(dce $$0, ja $$1, dsh $$2) {
      a($$0, $$1, $$0.a_($$1), $$2);
   }

   public static void a(dce $$0, ja $$1, dsh $$2, dsh $$3) {
      if (m($$2)) {
         dsh $$4 = n($$3);
         $$0.a($$1, $$4, 2);
         ja.a $$5 = $$1.j().c(jf.b);

         while (m($$0.a_($$5))) {
            if (!$$0.a($$5, $$4, 2)) {
               return;
            }

            $$5.c(jf.b);
         }
      }
   }

   private static boolean m(dsh $$0) {
      return $$0.a(dfh.nd) || $$0.a(dfh.G) && $$0.u().e() >= 8 && $$0.u().b();
   }

   private static dsh n(dsh $$0) {
      if ($$0.a(dfh.nd)) {
         return $$0;
      } else if ($$0.a(dfh.dW)) {
         return dfh.nd.o().a(b, Boolean.valueOf(false));
      } else {
         return $$0.a(dfh.kJ) ? dfh.nd.o().a(b, Boolean.valueOf(true)) : dfh.G.o();
      }
   }

   @Override
   public void a(dsh $$0, dcd $$1, ja $$2, aym $$3) {
      double $$4 = (double)$$2.u();
      double $$5 = (double)$$2.v();
      double $$6 = (double)$$2.w();
      if ($$0.c(b)) {
         $$1.b(lj.ap, $$4 + 0.5, $$5 + 0.8, $$6, 0.0, 0.0, 0.0);
         if ($$3.a(200) == 0) {
            $$1.a($$4, $$5, $$6, avf.da, avg.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      } else {
         $$1.b(lj.aq, $$4 + 0.5, $$5, $$6 + 0.5, 0.0, 0.04, 0.0);
         $$1.b(lj.aq, $$4 + (double)$$3.i(), $$5 + (double)$$3.i(), $$6 + (double)$$3.i(), 0.0, 0.04, 0.0);
         if ($$3.a(200) == 0) {
            $$1.a($$4, $$5, $$6, avf.cY, avg.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      }
   }

   @Override
   protected dsh a(dsh $$0, jf $$1, dsh $$2, dce $$3, ja $$4, ja $$5) {
      $$3.a($$4, eoc.c, eoc.c.a($$3));
      if (!$$0.a($$3, $$4) || $$1 == jf.a || $$1 == jf.b && !$$2.a(dfh.nd) && m($$2)) {
         $$3.a($$4, this, 5);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dsh $$0, dcg $$1, ja $$2) {
      dsh $$3 = $$1.a_($$2.d());
      return $$3.a(dfh.nd) || $$3.a(dfh.kJ) || $$3.a(dfh.dW);
   }

   @Override
   protected ews a(dsh $$0, dbj $$1, ja $$2, ewe $$3) {
      return ewp.a();
   }

   @Override
   protected dll a_(dsh $$0) {
      return dll.a;
   }

   @Override
   protected void a(dsi.a<dff, dsh> $$0) {
      $$0.a(b);
   }

   @Override
   public cua a(@Nullable cmh $$0, dce $$1, ja $$2, dsh $$3) {
      $$1.a($$2, dfh.a.o(), 11);
      return new cua(cud.qz);
   }

   @Override
   public Optional<ave> as_() {
      return eoc.c.j();
   }
}
