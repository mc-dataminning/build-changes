import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class cww extends cwq implements cwx {
   public static final MapCodec<cww> a = b(cww::new);
   public static final djy b = djx.e;
   private static final int c = 5;

   @Override
   public MapCodec<cww> a() {
      return a;
   }

   public cww(djg.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(true)));
   }

   @Override
   public void a(djh $$0, ctp $$1, hx $$2, blv $$3) {
      djh $$4 = $$1.a_($$2.c());
      if ($$4.i()) {
         $$3.k($$0.c(b));
         if (!$$1.B) {
            and $$5 = (and)$$1;

            for (int $$6 = 0; $$6 < 2; $$6++) {
               $$5.a(jx.aj, (double)$$2.u() + $$1.z.j(), (double)($$2.v() + 1), (double)$$2.w() + $$1.z.j(), 1, 0.0, 0.0, 0.0, 1.0);
               $$5.a(jx.e, (double)$$2.u() + $$1.z.j(), (double)($$2.v() + 1), (double)$$2.w() + $$1.z.j(), 1, 0.0, 0.01, 0.0, 0.2);
            }
         }
      } else {
         $$3.l($$0.c(b));
      }
   }

   @Override
   public void a(djh $$0, and $$1, hx $$2, auv $$3) {
      a($$1, $$2, $$0, $$1.a_($$2.d()));
   }

   @Override
   public eer c_(djh $$0) {
      return ees.c.a(false);
   }

   public static void b(ctq $$0, hx $$1, djh $$2) {
      a($$0, $$1, $$0.a_($$1), $$2);
   }

   public static void a(ctq $$0, hx $$1, djh $$2, djh $$3) {
      if (h($$2)) {
         djh $$4 = n($$3);
         $$0.a($$1, $$4, 2);
         hx.a $$5 = $$1.j().c(ic.b);

         while (h($$0.a_($$5))) {
            if (!$$0.a($$5, $$4, 2)) {
               return;
            }

            $$5.c(ic.b);
         }
      }
   }

   private static boolean h(djh $$0) {
      return $$0.a(cws.nd) || $$0.a(cws.G) && $$0.u().e() >= 8 && $$0.u().b();
   }

   private static djh n(djh $$0) {
      if ($$0.a(cws.nd)) {
         return $$0;
      } else if ($$0.a(cws.dW)) {
         return cws.nd.o().a(b, Boolean.valueOf(false));
      } else {
         return $$0.a(cws.kJ) ? cws.nd.o().a(b, Boolean.valueOf(true)) : cws.G.o();
      }
   }

   @Override
   public void a(djh $$0, ctp $$1, hx $$2, auv $$3) {
      double $$4 = (double)$$2.u();
      double $$5 = (double)$$2.v();
      double $$6 = (double)$$2.w();
      if ($$0.c(b)) {
         $$1.b(jx.am, $$4 + 0.5, $$5 + 0.8, $$6, 0.0, 0.0, 0.0);
         if ($$3.a(200) == 0) {
            $$1.a($$4, $$5, $$6, ars.cC, art.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      } else {
         $$1.b(jx.an, $$4 + 0.5, $$5, $$6 + 0.5, 0.0, 0.04, 0.0);
         $$1.b(jx.an, $$4 + (double)$$3.i(), $$5 + (double)$$3.i(), $$6 + (double)$$3.i(), 0.0, 0.04, 0.0);
         if ($$3.a(200) == 0) {
            $$1.a($$4, $$5, $$6, ars.cA, art.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      }
   }

   @Override
   public djh a(djh $$0, ic $$1, djh $$2, ctq $$3, hx $$4, hx $$5) {
      $$3.a($$4, ees.c, ees.c.a($$3));
      if (!$$0.a($$3, $$4) || $$1 == ic.a || $$1 == ic.b && !$$2.a(cws.nd) && h($$2)) {
         $$3.a($$4, this, 5);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(djh $$0, cts $$1, hx $$2) {
      djh $$3 = $$1.a_($$2.d());
      return $$3.a(cws.nd) || $$3.a(cws.kJ) || $$3.a(cws.dW);
   }

   @Override
   public emm a(djh $$0, csv $$1, hx $$2, ely $$3) {
      return emj.a();
   }

   @Override
   public dcv b_(djh $$0) {
      return dcv.a;
   }

   @Override
   protected void a(dji.a<cwq, djh> $$0) {
      $$0.a(b);
   }

   @Override
   public cmy a(@Nullable cfi $$0, ctq $$1, hx $$2, djh $$3) {
      $$1.a($$2, cws.a.o(), 11);
      return new cmy(cnb.qw);
   }

   @Override
   public Optional<arr> au_() {
      return ees.c.j();
   }
}
