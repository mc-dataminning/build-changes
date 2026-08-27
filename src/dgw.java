import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dgw extends cyo {
   public static final MapCodec<dgw> a = b(dgw::new);
   public static final dlw b = dlv.B;

   @Override
   public MapCodec<dgw> a() {
      return a;
   }

   public dgw(dle.d $$0) {
      super($$0);
      this.k(this.o().a(b, Boolean.valueOf(false)));
   }

   @Override
   protected void b(dlf $$0, cvn $$1, hz $$2, dlf $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         if ($$1.C($$2)) {
            a($$1, $$2);
            $$1.a($$2, false);
         }
      }
   }

   @Override
   protected void a(dlf $$0, cvn $$1, hz $$2, cyo $$3, hz $$4, boolean $$5) {
      if ($$1.C($$2)) {
         a($$1, $$2);
         $$1.a($$2, false);
      }
   }

   @Override
   public dlf a(cvn $$0, hz $$1, dlf $$2, chh $$3) {
      if (!$$0.y_() && !$$3.f() && $$2.c(b)) {
         a($$0, $$1);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(cvn $$0, hz $$1, cvf $$2) {
      if (!$$0.B) {
         cdt $$3 = new cdt($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2.f());
         int $$4 = $$3.s();
         $$3.b((short)($$0.z.a($$4 / 4) + $$4 / 8));
         $$0.b($$3);
      }
   }

   public static void a(cvn $$0, hz $$1) {
      a($$0, $$1, null);
   }

   private static void a(cvn $$0, hz $$1, @Nullable bog $$2) {
      if (!$$0.B) {
         cdt $$3 = new cdt($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2);
         $$0.b($$3);
         $$0.a(null, $$3.dr(), $$3.dt(), $$3.dx(), atk.yQ, atl.e, 1.0F, 1.0F);
         $$0.a($$2, dpp.I, $$1);
      }
   }

   @Override
   protected blw a(coz $$0, dlf $$1, cvn $$2, hz $$3, chh $$4, blt $$5, eno $$6) {
      if (!$$0.a(cpc.or) && !$$0.a(cpc.tV)) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      } else {
         a($$2, $$3, $$4);
         $$2.a($$3, cyq.a.o(), 11);
         cou $$7 = $$0.d();
         if (!$$4.f()) {
            if ($$0.a(cpc.or)) {
               $$0.a(1, $$4, bog.d($$5));
            } else {
               $$0.h(1);
            }
         }

         $$4.b(atu.c.b($$7));
         return blw.a($$2.B);
      }
   }

   @Override
   protected void a(cvn $$0, dlf $$1, eno $$2, chz $$3) {
      if (!$$0.B) {
         hz $$4 = $$2.a();
         bno $$5 = $$3.w();
         if ($$3.bN() && $$3.a($$0, $$4)) {
            a($$0, $$4, $$5 instanceof bog ? (bog)$$5 : null);
            $$0.a($$4, false);
         }
      }
   }

   @Override
   public boolean a(cvf $$0) {
      return false;
   }

   @Override
   protected void a(dlg.a<cyo, dlf> $$0) {
      $$0.a(b);
   }
}
