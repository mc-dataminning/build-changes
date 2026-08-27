import java.util.List;
import javax.annotation.Nullable;

public class cvf extends csk {
   protected static final eii a = csx.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0);
   public static final List<gw> b = gw.a(-2, 0, -2, 2, 1, 2).filter($$0 -> Math.abs($$0.u()) == 2 || Math.abs($$0.w()) == 2).map(gw::i).toList();

   protected cvf(dfk.d $$0) {
      super($$0);
   }

   public static boolean a(cpx $$0, gw $$1, gw $$2) {
      return $$0.a_($$1.a((ib)$$2)).a(apu.cn) && $$0.a_($$1.b($$2.u() / 2, $$2.v(), $$2.w() / 2)).a(apu.co);
   }

   @Override
   public boolean g_(dfl $$0) {
      return true;
   }

   @Override
   public eii a(dfl $$0, cpd $$1, gw $$2, ehu $$3) {
      return a;
   }

   @Override
   public void a(dfl $$0, cpx $$1, gw $$2, ase $$3) {
      super.a($$0, $$1, $$2, $$3);

      for (gw $$4 : b) {
         if ($$3.a(16) == 0 && a($$1, $$2, $$4)) {
            $$1.a(
               ix.t,
               (double)$$2.u() + 0.5,
               (double)$$2.v() + 2.0,
               (double)$$2.w() + 0.5,
               (double)((float)$$4.u() + $$3.i()) - 0.5,
               (double)((float)$$4.v() - $$3.i() - 1.0F),
               (double)((float)$$4.w() + $$3.i()) - 0.5
            );
         }
      }
   }

   @Override
   public czc b_(dfl $$0) {
      return czc.c;
   }

   @Override
   public dcx a(gw $$0, dfl $$1) {
      return new ddq($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dcx> dcy<T> a(cpx $$0, dfl $$1, dcz<T> $$2) {
      return $$0.B ? a($$2, dcz.m, ddq::a) : null;
   }

   @Override
   public bha a(dfl $$0, cpx $$1, gw $$2, cbw $$3, bgz $$4, ehl $$5) {
      if ($$1.B) {
         return bha.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         return bha.b;
      }
   }

   @Nullable
   @Override
   public bhd b(dfl $$0, cpx $$1, gw $$2) {
      dcx $$3 = $$1.c_($$2);
      if ($$3 instanceof ddq) {
         tn $$4 = ((bhe)$$3).N_();
         return new bhi(($$2x, $$3x, $$4x) -> new cff($$2x, $$3x, cey.a($$1, $$2)), $$4);
      } else {
         return null;
      }
   }

   @Override
   public void a(cpx $$0, gw $$1, dfl $$2, bji $$3, cjh $$4) {
      if ($$4.A()) {
         dcx $$5 = $$0.c_($$1);
         if ($$5 instanceof ddq) {
            ((ddq)$$5).a($$4.y());
         }
      }
   }

   @Override
   public boolean a(dfl $$0, cpd $$1, gw $$2, ebe $$3) {
      return false;
   }
}
