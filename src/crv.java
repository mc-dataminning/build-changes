import java.util.List;
import javax.annotation.Nullable;

public class crv extends cpa {
   protected static final efb a = cpn.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0);
   public static final List<gu> b = gu.a(-2, 0, -2, 2, 1, 2).filter($$0 -> Math.abs($$0.u()) == 2 || Math.abs($$0.w()) == 2).map(gu::i).toList();

   protected crv(dca.d $$0) {
      super($$0);
   }

   public static boolean a(cmm $$0, gu $$1, gu $$2) {
      return $$0.a_($$1.a((hz)$$2)).a(amw.cl) && $$0.a_($$1.b($$2.u() / 2, $$2.v(), $$2.w() / 2)).a(amw.cm);
   }

   @Override
   public boolean g_(dcb $$0) {
      return true;
   }

   @Override
   public efb a(dcb $$0, cls $$1, gu $$2, een $$3) {
      return a;
   }

   @Override
   public void a(dcb $$0, cmm $$1, gu $$2, apf $$3) {
      super.a($$0, $$1, $$2, $$3);

      for (gu $$4 : b) {
         if ($$3.a(16) == 0 && a($$1, $$2, $$4)) {
            $$1.a(
               iv.t,
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
   public cvs b_(dcb $$0) {
      return cvs.c;
   }

   @Override
   public czn a(gu $$0, dcb $$1) {
      return new dag($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends czn> czo<T> a(cmm $$0, dcb $$1, czp<T> $$2) {
      return $$0.B ? a($$2, czp.m, dag::a) : null;
   }

   @Override
   public bdx a(dcb $$0, cmm $$1, gu $$2, byo $$3, bdw $$4, eee $$5) {
      if ($$1.B) {
         return bdx.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         return bdx.b;
      }
   }

   @Nullable
   @Override
   public bea b(dcb $$0, cmm $$1, gu $$2) {
      czn $$3 = $$1.c_($$2);
      if ($$3 instanceof dag) {
         sw $$4 = ((beb)$$3).H_();
         return new bef(($$2x, $$3x, $$4x) -> new cbx($$2x, $$3x, cbq.a($$1, $$2)), $$4);
      } else {
         return null;
      }
   }

   @Override
   public void a(cmm $$0, gu $$1, dcb $$2, bfz $$3, cfz $$4) {
      if ($$4.A()) {
         czn $$5 = $$0.c_($$1);
         if ($$5 instanceof dag) {
            ((dag)$$5).a($$4.y());
         }
      }
   }

   @Override
   public boolean a(dcb $$0, cls $$1, gu $$2, dxu $$3) {
      return false;
   }
}
