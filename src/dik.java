import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dik extends dac {
   public static final MapCodec<dik> a = b(dik::new);
   public static final dns b = dnr.B;

   @Override
   public MapCodec<dik> a() {
      return a;
   }

   public dik(dna.d $$0) {
      super($$0);
      this.k(this.o().a(b, Boolean.valueOf(false)));
   }

   @Override
   protected void b(dnb $$0, cxb $$1, ib $$2, dnb $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         if ($$1.C($$2)) {
            a($$1, $$2);
            $$1.a($$2, false);
         }
      }
   }

   @Override
   protected void a(dnb $$0, cxb $$1, ib $$2, dac $$3, ib $$4, boolean $$5) {
      if ($$1.C($$2)) {
         a($$1, $$2);
         $$1.a($$2, false);
      }
   }

   @Override
   public dnb a(cxb $$0, ib $$1, dnb $$2, ciu $$3) {
      if (!$$0.x_() && !$$3.f() && $$2.c(b)) {
         a($$0, $$1);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(cxb $$0, ib $$1, cwt $$2) {
      if (!$$0.B) {
         cff $$3 = new cff($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2.f());
         int $$4 = $$3.r();
         $$3.b((short)($$0.z.a($$4 / 4) + $$4 / 8));
         $$0.b($$3);
      }
   }

   public static void a(cxb $$0, ib $$1) {
      a($$0, $$1, null);
   }

   private static void a(cxb $$0, ib $$1, @Nullable bpp $$2) {
      if (!$$0.B) {
         cff $$3 = new cff($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2);
         $$0.b($$3);
         $$0.a(null, $$3.dr(), $$3.dt(), $$3.dx(), aty.yZ, atz.e, 1.0F, 1.0F);
         $$0.a($$2, drp.I, $$1);
      }
   }

   @Override
   protected bnf a(cqm $$0, dnb $$1, cxb $$2, ib $$3, ciu $$4, bnc $$5, epp $$6) {
      if (!$$0.a(cqp.or) && !$$0.a(cqp.tW)) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      } else {
         a($$2, $$3, $$4);
         $$2.a($$3, dae.a.o(), 11);
         cqh $$7 = $$0.d();
         if (!$$4.f()) {
            if ($$0.a(cqp.or)) {
               $$0.a(1, $$4, bpp.d($$5));
            } else {
               $$0.h(1);
            }
         }

         $$4.b(aui.c.b($$7));
         return bnf.a($$2.B);
      }
   }

   @Override
   protected void a(cxb $$0, dnb $$1, epp $$2, cjm $$3) {
      if (!$$0.B) {
         ib $$4 = $$2.a();
         box $$5 = $$3.af_();
         if ($$3.bN() && $$3.a($$0, $$4)) {
            a($$0, $$4, $$5 instanceof bpp ? (bpp)$$5 : null);
            $$0.a($$4, false);
         }
      }
   }

   @Override
   public boolean a(cwt $$0) {
      return false;
   }

   @Override
   protected void a(dnc.a<dac, dnb> $$0) {
      $$0.a(b);
   }
}
