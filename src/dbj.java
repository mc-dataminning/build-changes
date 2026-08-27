import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dbj extends ctc {
   public static final MapCodec<dbj> a = b(dbj::new);
   public static final dfu b = dft.B;

   @Override
   public MapCodec<dbj> a() {
      return a;
   }

   public dbj(dfc.d $$0) {
      super($$0);
      this.k(this.o().a(b, Boolean.valueOf(false)));
   }

   @Override
   public void b(dfd $$0, cqb $$1, gw $$2, dfd $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         if ($$1.B($$2)) {
            a($$1, $$2);
            $$1.a($$2, false);
         }
      }
   }

   @Override
   public void a(dfd $$0, cqb $$1, gw $$2, ctc $$3, gw $$4, boolean $$5) {
      if ($$1.B($$2)) {
         a($$1, $$2);
         $$1.a($$2, false);
      }
   }

   @Override
   public dfd a(cqb $$0, gw $$1, dfd $$2, cca $$3) {
      if (!$$0.w_() && !$$3.f() && $$2.c(b)) {
         a($$0, $$1);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(cqb $$0, gw $$1, cpt $$2) {
      if (!$$0.B) {
         byu $$3 = new byu($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2.e());
         int $$4 = $$3.s();
         $$3.b((short)($$0.z.a($$4 / 4) + $$4 / 8));
         $$0.b($$3);
      }
   }

   public static void a(cqb $$0, gw $$1) {
      a($$0, $$1, null);
   }

   private static void a(cqb $$0, gw $$1, @Nullable bjm $$2) {
      if (!$$0.B) {
         byu $$3 = new byu($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2);
         $$0.b($$3);
         $$0.a(null, $$3.dq(), $$3.ds(), $$3.dw(), apg.xL, aph.e, 1.0F, 1.0F);
         $$0.a($$2, djn.I, $$1);
      }
   }

   @Override
   public bhe a(dfd $$0, cqb $$1, gw $$2, cca $$3, bhd $$4, ehd $$5) {
      cjl $$6 = $$3.b($$4);
      if (!$$6.a(cjo.nE) && !$$6.a(cjo.tf)) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         a($$1, $$2, $$3);
         $$1.a($$2, cte.a.o(), 11);
         cjg $$7 = $$6.d();
         if (!$$3.f()) {
            if ($$6.a(cjo.nE)) {
               $$6.a(1, $$3, $$1x -> $$1x.d($$4));
            } else {
               $$6.h(1);
            }
         }

         $$3.b(apq.c.b($$7));
         return bhe.a($$1.B);
      }
   }

   @Override
   public void a(cqb $$0, dfd $$1, ehd $$2, ccs $$3) {
      if (!$$0.B) {
         gw $$4 = $$2.a();
         biw $$5 = $$3.v();
         if ($$3.bM() && $$3.a($$0, $$4)) {
            a($$0, $$4, $$5 instanceof bjm ? (bjm)$$5 : null);
            $$0.a($$4, false);
         }
      }
   }

   @Override
   public boolean a(cpt $$0) {
      return false;
   }

   @Override
   protected void a(dfe.a<ctc, dfd> $$0) {
      $$0.a(b);
   }
}
