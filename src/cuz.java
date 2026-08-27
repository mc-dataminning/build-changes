import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class cuz extends cut implements cva {
   public static final MapCodec<cuz> a = b(cuz::new);
   public static final dhn b = dhm.e;
   private static final int c = 5;

   @Override
   public MapCodec<cuz> a() {
      return a;
   }

   public cuz(dgv.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(true)));
   }

   @Override
   public void a(dgw $$0, crs $$1, ht $$2, bki $$3) {
      dgw $$4 = $$1.a_($$2.c());
      if ($$4.i()) {
         $$3.k($$0.c(b));
         if (!$$1.B) {
            ama $$5 = (ama)$$1;

            for (int $$6 = 0; $$6 < 2; $$6++) {
               $$5.a(js.ah, (double)$$2.u() + $$1.z.j(), (double)($$2.v() + 1), (double)$$2.w() + $$1.z.j(), 1, 0.0, 0.0, 0.0, 1.0);
               $$5.a(js.e, (double)$$2.u() + $$1.z.j(), (double)($$2.v() + 1), (double)$$2.w() + $$1.z.j(), 1, 0.0, 0.01, 0.0, 0.2);
            }
         }
      } else {
         $$3.l($$0.c(b));
      }
   }

   @Override
   public void a(dgw $$0, ama $$1, ht $$2, ato $$3) {
      a($$1, $$2, $$0, $$1.a_($$2.d()));
   }

   @Override
   public ecg c_(dgw $$0) {
      return ech.c.a(false);
   }

   public static void b(crt $$0, ht $$1, dgw $$2) {
      a($$0, $$1, $$0.a_($$1), $$2);
   }

   public static void a(crt $$0, ht $$1, dgw $$2, dgw $$3) {
      if (h($$2)) {
         dgw $$4 = n($$3);
         $$0.a($$1, $$4, 2);
         ht.a $$5 = $$1.j().c(hx.b);

         while (h($$0.a_($$5))) {
            if (!$$0.a($$5, $$4, 2)) {
               return;
            }

            $$5.c(hx.b);
         }
      }
   }

   private static boolean h(dgw $$0) {
      return $$0.a(cuv.nd) || $$0.a(cuv.G) && $$0.u().e() >= 8 && $$0.u().b();
   }

   private static dgw n(dgw $$0) {
      if ($$0.a(cuv.nd)) {
         return $$0;
      } else if ($$0.a(cuv.dW)) {
         return cuv.nd.o().a(b, Boolean.valueOf(false));
      } else {
         return $$0.a(cuv.kJ) ? cuv.nd.o().a(b, Boolean.valueOf(true)) : cuv.G.o();
      }
   }

   @Override
   public void a(dgw $$0, crs $$1, ht $$2, ato $$3) {
      double $$4 = (double)$$2.u();
      double $$5 = (double)$$2.v();
      double $$6 = (double)$$2.w();
      if ($$0.c(b)) {
         $$1.b(js.ak, $$4 + 0.5, $$5 + 0.8, $$6, 0.0, 0.0, 0.0);
         if ($$3.a(200) == 0) {
            $$1.a($$4, $$5, $$6, aqn.ct, aqo.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      } else {
         $$1.b(js.al, $$4 + 0.5, $$5, $$6 + 0.5, 0.0, 0.04, 0.0);
         $$1.b(js.al, $$4 + (double)$$3.i(), $$5 + (double)$$3.i(), $$6 + (double)$$3.i(), 0.0, 0.04, 0.0);
         if ($$3.a(200) == 0) {
            $$1.a($$4, $$5, $$6, aqn.cr, aqo.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      }
   }

   @Override
   public dgw a(dgw $$0, hx $$1, dgw $$2, crt $$3, ht $$4, ht $$5) {
      $$3.a($$4, ech.c, ech.c.a($$3));
      if (!$$0.a($$3, $$4) || $$1 == hx.a || $$1 == hx.b && !$$2.a(cuv.nd) && h($$2)) {
         $$3.a($$4, this, 5);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dgw $$0, crv $$1, ht $$2) {
      dgw $$3 = $$1.a_($$2.d());
      return $$3.a(cuv.nd) || $$3.a(cuv.kJ) || $$3.a(cuv.dW);
   }

   @Override
   public ekb a(dgw $$0, cqy $$1, ht $$2, ejn $$3) {
      return ejy.a();
   }

   @Override
   public day b_(dgw $$0) {
      return day.a;
   }

   @Override
   protected void a(dgx.a<cut, dgw> $$0) {
      $$0.a(b);
   }

   @Override
   public clb a(@Nullable cdm $$0, crt $$1, ht $$2, dgw $$3) {
      $$1.a($$2, cuv.a.o(), 11);
      return new clb(cle.pL);
   }

   @Override
   public Optional<aqm> at_() {
      return ech.c.j();
   }
}
