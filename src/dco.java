import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dco extends czo {
   public static final MapCodec<dco> a = b(dco::new);
   protected static final eqm b = dac.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0);
   public static final List<ib> c = ib.a(-2, 0, -2, 2, 1, 2).filter($$0 -> Math.abs($$0.u()) == 2 || Math.abs($$0.w()) == 2).map(ib::i).toList();

   @Override
   public MapCodec<dco> a() {
      return a;
   }

   protected dco(dna.d $$0) {
      super($$0);
   }

   public static boolean a(cxb $$0, ib $$1, ib $$2) {
      return $$0.a_($$1.a((jg)$$2)).a(aun.cp) && $$0.a_($$1.b($$2.u() / 2, $$2.v(), $$2.w() / 2)).a(aun.cq);
   }

   @Override
   protected boolean g_(dnb $$0) {
      return true;
   }

   @Override
   protected eqm a(dnb $$0, cwh $$1, ib $$2, epy $$3) {
      return b;
   }

   @Override
   public void a(dnb $$0, cxb $$1, ib $$2, axd $$3) {
      super.a($$0, $$1, $$2, $$3);

      for (ib $$4 : c) {
         if ($$3.a(16) == 0 && a($$1, $$2, $$4)) {
            $$1.a(
               kc.t,
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
   protected dgh b_(dnb $$0) {
      return dgh.c;
   }

   @Override
   public dki a(ib $$0, dnb $$1) {
      return new dlc($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dki> dkj<T> a(cxb $$0, dnb $$1, dkk<T> $$2) {
      return $$0.B ? a($$2, dkk.m, dlc::a) : null;
   }

   @Override
   protected bnd a(dnb $$0, cxb $$1, ib $$2, ciu $$3, epp $$4) {
      if ($$1.B) {
         return bnd.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         return bnd.b;
      }
   }

   @Nullable
   @Override
   protected bnh b(dnb $$0, cxb $$1, ib $$2) {
      dki $$3 = $$1.c_($$2);
      if ($$3 instanceof dlc) {
         vu $$4 = ((bni)$$3).O_();
         return new bnn(($$2x, $$3x, $$4x) -> new cmk($$2x, $$3x, cmb.a($$1, $$2)), $$4);
      } else {
         return null;
      }
   }

   @Override
   public void a(cxb $$0, ib $$1, dnb $$2, bpp $$3, cqm $$4) {
      if ($$4.B()) {
         dki $$5 = $$0.c_($$1);
         if ($$5 instanceof dlc) {
            ((dlc)$$5).a($$4.z());
         }
      }
   }

   @Override
   protected boolean a(dnb $$0, cwh $$1, ib $$2, eje $$3) {
      return false;
   }
}
