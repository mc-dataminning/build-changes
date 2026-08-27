import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dbr extends cyr {
   public static final MapCodec<dbr> a = b(dbr::new);
   protected static final epo b = czf.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0);
   public static final List<ib> c = ib.a(-2, 0, -2, 2, 1, 2).filter($$0 -> Math.abs($$0.u()) == 2 || Math.abs($$0.w()) == 2).map(ib::i).toList();

   @Override
   public MapCodec<dbr> a() {
      return a;
   }

   protected dbr(dmd.d $$0) {
      super($$0);
   }

   public static boolean a(cwe $$0, ib $$1, ib $$2) {
      return $$0.a_($$1.a((jf)$$2)).a(aue.co) && $$0.a_($$1.b($$2.u() / 2, $$2.v(), $$2.w() / 2)).a(aue.cp);
   }

   @Override
   protected boolean g_(dme $$0) {
      return true;
   }

   @Override
   protected epo a(dme $$0, cvk $$1, ib $$2, epa $$3) {
      return b;
   }

   @Override
   public void a(dme $$0, cwe $$1, ib $$2, awt $$3) {
      super.a($$0, $$1, $$2, $$3);

      for (ib $$4 : c) {
         if ($$3.a(16) == 0 && a($$1, $$2, $$4)) {
            $$1.a(
               kb.t,
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
   protected dfk b_(dme $$0) {
      return dfk.c;
   }

   @Override
   public djl a(ib $$0, dme $$1) {
      return new dkf($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends djl> djm<T> a(cwe $$0, dme $$1, djn<T> $$2) {
      return $$0.B ? a($$2, djn.m, dkf::a) : null;
   }

   @Override
   protected bml a(dme $$0, cwe $$1, ib $$2, cia $$3, eor $$4) {
      if ($$1.B) {
         return bml.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         return bml.b;
      }
   }

   @Nullable
   @Override
   protected bmp b(dme $$0, cwe $$1, ib $$2) {
      djl $$3 = $$1.c_($$2);
      if ($$3 instanceof dkf) {
         vs $$4 = ((bmq)$$3).Q_();
         return new bmv(($$2x, $$3x, $$4x) -> new clo($$2x, $$3x, clf.a($$1, $$2)), $$4);
      } else {
         return null;
      }
   }

   @Override
   public void a(cwe $$0, ib $$1, dme $$2, box $$3, cpq $$4) {
      if ($$4.B()) {
         djl $$5 = $$0.c_($$1);
         if ($$5 instanceof dkf) {
            ((dkf)$$5).a($$4.z());
         }
      }
   }

   @Override
   protected boolean a(dme $$0, cvk $$1, ib $$2, eih $$3) {
      return false;
   }
}
