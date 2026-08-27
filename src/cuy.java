import java.util.List;
import javax.annotation.Nullable;

public class cuy extends csd {
   protected static final eib a = csq.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0);
   public static final List<gw> b = gw.a(-2, 0, -2, 2, 1, 2).filter($$0 -> Math.abs($$0.u()) == 2 || Math.abs($$0.w()) == 2).map(gw::i).toList();

   protected cuy(dfd.d $$0) {
      super($$0);
   }

   public static boolean a(cpq $$0, gw $$1, gw $$2) {
      return $$0.a_($$1.a((ib)$$2)).a(apo.cn) && $$0.a_($$1.b($$2.u() / 2, $$2.v(), $$2.w() / 2)).a(apo.co);
   }

   @Override
   public boolean g_(dfe $$0) {
      return true;
   }

   @Override
   public eib a(dfe $$0, cow $$1, gw $$2, ehn $$3) {
      return a;
   }

   @Override
   public void a(dfe $$0, cpq $$1, gw $$2, arx $$3) {
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
   public cyv b_(dfe $$0) {
      return cyv.c;
   }

   @Override
   public dcq a(gw $$0, dfe $$1) {
      return new ddj($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dcq> dcr<T> a(cpq $$0, dfe $$1, dcs<T> $$2) {
      return $$0.B ? a($$2, dcs.m, ddj::a) : null;
   }

   @Override
   public bgt a(dfe $$0, cpq $$1, gw $$2, cbp $$3, bgs $$4, ehe $$5) {
      if ($$1.B) {
         return bgt.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         return bgt.b;
      }
   }

   @Nullable
   @Override
   public bgw b(dfe $$0, cpq $$1, gw $$2) {
      dcq $$3 = $$1.c_($$2);
      if ($$3 instanceof ddj) {
         ti $$4 = ((bgx)$$3).H_();
         return new bhb(($$2x, $$3x, $$4x) -> new cey($$2x, $$3x, cer.a($$1, $$2)), $$4);
      } else {
         return null;
      }
   }

   @Override
   public void a(cpq $$0, gw $$1, dfe $$2, bjb $$3, cja $$4) {
      if ($$4.A()) {
         dcq $$5 = $$0.c_($$1);
         if ($$5 instanceof ddj) {
            ((ddj)$$5).a($$4.y());
         }
      }
   }

   @Override
   public boolean a(dfe $$0, cow $$1, gw $$2, eax $$3) {
      return false;
   }
}
