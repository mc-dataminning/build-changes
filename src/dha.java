import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dha extends cys {
   public static final MapCodec<dha> a = b(dha::new);
   public static final dma b = dlz.B;

   @Override
   public MapCodec<dha> a() {
      return a;
   }

   public dha(dli.d $$0) {
      super($$0);
      this.k(this.o().a(b, Boolean.valueOf(false)));
   }

   @Override
   protected void b(dlj $$0, cvr $$1, hz $$2, dlj $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         if ($$1.C($$2)) {
            a($$1, $$2);
            $$1.a($$2, false);
         }
      }
   }

   @Override
   protected void a(dlj $$0, cvr $$1, hz $$2, cys $$3, hz $$4, boolean $$5) {
      if ($$1.C($$2)) {
         a($$1, $$2);
         $$1.a($$2, false);
      }
   }

   @Override
   public dlj a(cvr $$0, hz $$1, dlj $$2, chl $$3) {
      if (!$$0.y_() && !$$3.f() && $$2.c(b)) {
         a($$0, $$1);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(cvr $$0, hz $$1, cvj $$2) {
      if (!$$0.B) {
         cdx $$3 = new cdx($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2.f());
         int $$4 = $$3.s();
         $$3.b((short)($$0.z.a($$4 / 4) + $$4 / 8));
         $$0.b($$3);
      }
   }

   public static void a(cvr $$0, hz $$1) {
      a($$0, $$1, null);
   }

   private static void a(cvr $$0, hz $$1, @Nullable boi $$2) {
      if (!$$0.B) {
         cdx $$3 = new cdx($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2);
         $$0.b($$3);
         $$0.a(null, $$3.dr(), $$3.dt(), $$3.dx(), atl.yR, atm.e, 1.0F, 1.0F);
         $$0.a($$2, dpw.I, $$1);
      }
   }

   @Override
   protected bly a(cpd $$0, dlj $$1, cvr $$2, hz $$3, chl $$4, blv $$5, env $$6) {
      if (!$$0.a(cpg.or) && !$$0.a(cpg.tV)) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      } else {
         a($$2, $$3, $$4);
         $$2.a($$3, cyu.a.o(), 11);
         coy $$7 = $$0.d();
         if (!$$4.f()) {
            if ($$0.a(cpg.or)) {
               $$0.a(1, $$4, boi.d($$5));
            } else {
               $$0.h(1);
            }
         }

         $$4.b(atv.c.b($$7));
         return bly.a($$2.B);
      }
   }

   @Override
   protected void a(cvr $$0, dlj $$1, env $$2, cid $$3) {
      if (!$$0.B) {
         hz $$4 = $$2.a();
         bnq $$5 = $$3.w();
         if ($$3.bN() && $$3.a($$0, $$4)) {
            a($$0, $$4, $$5 instanceof boi ? (boi)$$5 : null);
            $$0.a($$4, false);
         }
      }
   }

   @Override
   public boolean a(cvj $$0) {
      return false;
   }

   @Override
   protected void a(dlk.a<cys, dlj> $$0) {
      $$0.a(b);
   }
}
