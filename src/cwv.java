import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class cwv extends cwp implements cww {
   public static final MapCodec<cwv> a = b(cwv::new);
   public static final djx b = djw.e;
   private static final int c = 5;

   @Override
   public MapCodec<cwv> a() {
      return a;
   }

   public cwv(djf.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(true)));
   }

   @Override
   public void a(djg $$0, cto $$1, hx $$2, blu $$3) {
      djg $$4 = $$1.a_($$2.c());
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
   public void a(djg $$0, and $$1, hx $$2, auu $$3) {
      a($$1, $$2, $$0, $$1.a_($$2.d()));
   }

   @Override
   public eeq c_(djg $$0) {
      return eer.c.a(false);
   }

   public static void b(ctp $$0, hx $$1, djg $$2) {
      a($$0, $$1, $$0.a_($$1), $$2);
   }

   public static void a(ctp $$0, hx $$1, djg $$2, djg $$3) {
      if (h($$2)) {
         djg $$4 = n($$3);
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

   private static boolean h(djg $$0) {
      return $$0.a(cwr.nd) || $$0.a(cwr.G) && $$0.u().e() >= 8 && $$0.u().b();
   }

   private static djg n(djg $$0) {
      if ($$0.a(cwr.nd)) {
         return $$0;
      } else if ($$0.a(cwr.dW)) {
         return cwr.nd.o().a(b, Boolean.valueOf(false));
      } else {
         return $$0.a(cwr.kJ) ? cwr.nd.o().a(b, Boolean.valueOf(true)) : cwr.G.o();
      }
   }

   @Override
   public void a(djg $$0, cto $$1, hx $$2, auu $$3) {
      double $$4 = (double)$$2.u();
      double $$5 = (double)$$2.v();
      double $$6 = (double)$$2.w();
      if ($$0.c(b)) {
         $$1.b(jx.am, $$4 + 0.5, $$5 + 0.8, $$6, 0.0, 0.0, 0.0);
         if ($$3.a(200) == 0) {
            $$1.a($$4, $$5, $$6, arr.cC, ars.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      } else {
         $$1.b(jx.an, $$4 + 0.5, $$5, $$6 + 0.5, 0.0, 0.04, 0.0);
         $$1.b(jx.an, $$4 + (double)$$3.i(), $$5 + (double)$$3.i(), $$6 + (double)$$3.i(), 0.0, 0.04, 0.0);
         if ($$3.a(200) == 0) {
            $$1.a($$4, $$5, $$6, arr.cA, ars.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      }
   }

   @Override
   public djg a(djg $$0, ic $$1, djg $$2, ctp $$3, hx $$4, hx $$5) {
      $$3.a($$4, eer.c, eer.c.a($$3));
      if (!$$0.a($$3, $$4) || $$1 == ic.a || $$1 == ic.b && !$$2.a(cwr.nd) && h($$2)) {
         $$3.a($$4, this, 5);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(djg $$0, ctr $$1, hx $$2) {
      djg $$3 = $$1.a_($$2.d());
      return $$3.a(cwr.nd) || $$3.a(cwr.kJ) || $$3.a(cwr.dW);
   }

   @Override
   public eml a(djg $$0, csu $$1, hx $$2, elx $$3) {
      return emi.a();
   }

   @Override
   public dcu b_(djg $$0) {
      return dcu.a;
   }

   @Override
   protected void a(djh.a<cwp, djg> $$0) {
      $$0.a(b);
   }

   @Override
   public cmx a(@Nullable cfh $$0, ctp $$1, hx $$2, djg $$3) {
      $$1.a($$2, cwr.a.o(), 11);
      return new cmx(cna.qw);
   }

   @Override
   public Optional<arq> au_() {
      return eer.c.j();
   }
}
