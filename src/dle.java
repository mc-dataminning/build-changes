import com.mojang.serialization.MapCodec;
import java.util.Set;

public class dle extends dic implements doi {
   public static final MapCodec<dle> a = b(dle::new);
   protected static final fas b = diq.a(0.0, 6.0, 0.0, 16.0, 12.0, 16.0);

   @Override
   public MapCodec<dle> a() {
      return a;
   }

   protected dle(dvu.d $$0) {
      super($$0);
   }

   @Override
   public dsy a(jh $$0, dvv $$1) {
      return new dur($$0, $$1);
   }

   @Override
   protected fas a(dvv $$0, der $$1, jh $$2, fad $$3) {
      return b;
   }

   @Override
   protected fas a_(dvv $$0, dfm $$1, jh $$2) {
      return $$0.f($$1, $$2);
   }

   @Override
   protected void a(dvv $$0, dfm $$1, jh $$2, bul $$3) {
      if ($$3.o(false)) {
         if (!$$1.C && $$1.ag() == dfm.k && $$3 instanceof arq $$4 && !$$4.i) {
            $$4.n();
            return;
         }

         $$3.a(this, $$2);
      }
   }

   @Override
   public est a(arp $$0, bul $$1, jh $$2) {
      ali<dfm> $$3 = $$0.ag() == dfm.k ? dfm.i : dfm.k;
      arp $$4 = $$0.p().a($$3);
      if ($$4 == null) {
         return null;
      } else {
         boolean $$5 = $$3 == dfm.k;
         jh $$6 = $$5 ? arp.a : $$4.X();
         ezy $$7 = $$6.c();
         float $$8;
         Set<bvv> $$9;
         if ($$5) {
            eeu.a($$4, jh.a((ka)$$7).e(), true);
            $$8 = jm.e.p();
            $$9 = bvv.a(bvv.l, Set.of(bvv.e));
            if ($$1 instanceof arq) {
               $$7 = $$7.a(0.0, 1.0, 0.0);
            }
         } else {
            $$8 = 0.0F;
            $$9 = bvv.a(bvv.l, bvv.k);
            if ($$1 instanceof arq $$12) {
               return $$12.a(false, est.a);
            }

            $$7 = $$1.a($$4, $$6).c();
         }

         return new est($$4, $$7, ezy.c, $$8, 0.0F, $$9, est.b.then(est.c));
      }
   }

   @Override
   public void a(dvv $$0, dfm $$1, jh $$2, azu $$3) {
      double $$4 = (double)$$2.u() + $$3.j();
      double $$5 = (double)$$2.v() + 0.8;
      double $$6 = (double)$$2.w() + $$3.j();
      $$1.a(ls.ae, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }

   @Override
   public cwm a(dfp $$0, jh $$1, dvv $$2) {
      return cwm.k;
   }

   @Override
   protected boolean a(dvv $$0, eru $$1) {
      return false;
   }
}
