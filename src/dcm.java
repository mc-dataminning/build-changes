import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dcm extends czm {
   public static final MapCodec<dcm> a = b(dcm::new);
   protected static final eqk b = daa.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0);
   public static final List<ib> c = ib.a(-2, 0, -2, 2, 1, 2).filter($$0 -> Math.abs($$0.u()) == 2 || Math.abs($$0.w()) == 2).map(ib::i).toList();

   @Override
   public MapCodec<dcm> a() {
      return a;
   }

   protected dcm(dmy.d $$0) {
      super($$0);
   }

   public static boolean a(cwz $$0, ib $$1, ib $$2) {
      return $$0.a_($$1.a((jg)$$2)).a(aun.cp) && $$0.a_($$1.b($$2.u() / 2, $$2.v(), $$2.w() / 2)).a(aun.cq);
   }

   @Override
   protected boolean g_(dmz $$0) {
      return true;
   }

   @Override
   protected eqk a(dmz $$0, cwf $$1, ib $$2, epw $$3) {
      return b;
   }

   @Override
   public void a(dmz $$0, cwz $$1, ib $$2, axd $$3) {
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
   protected dgf b_(dmz $$0) {
      return dgf.c;
   }

   @Override
   public dkg a(ib $$0, dmz $$1) {
      return new dla($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dkg> dkh<T> a(cwz $$0, dmz $$1, dki<T> $$2) {
      return $$0.B ? a($$2, dki.m, dla::a) : null;
   }

   @Override
   protected bnc a(dmz $$0, cwz $$1, ib $$2, cis $$3, epn $$4) {
      if ($$1.B) {
         return bnc.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         return bnc.b;
      }
   }

   @Nullable
   @Override
   protected bng b(dmz $$0, cwz $$1, ib $$2) {
      dkg $$3 = $$1.c_($$2);
      if ($$3 instanceof dla) {
         vu $$4 = ((bnh)$$3).O_();
         return new bnm(($$2x, $$3x, $$4x) -> new cmi($$2x, $$3x, clz.a($$1, $$2)), $$4);
      } else {
         return null;
      }
   }

   @Override
   public void a(cwz $$0, ib $$1, dmz $$2, bpo $$3, cqk $$4) {
      if ($$4.B()) {
         dkg $$5 = $$0.c_($$1);
         if ($$5 instanceof dla) {
            ((dla)$$5).a($$4.z());
         }
      }
   }

   @Override
   protected boolean a(dmz $$0, cwf $$1, ib $$2, ejd $$3) {
      return false;
   }
}
