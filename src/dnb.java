import com.mojang.serialization.MapCodec;
import java.util.Set;

public class dnb extends djx implements dqg {
   public static final MapCodec<dnb> a = b(dnb::new);
   protected static final fcr b = dkl.a(0.0, 6.0, 0.0, 16.0, 12.0, 16.0);

   @Override
   public MapCodec<dnb> a() {
      return a;
   }

   protected dnb(dxt.d $$0) {
      super($$0);
   }

   @Override
   public duw a(jh $$0, dxu $$1) {
      return new dwq($$0, $$1);
   }

   @Override
   protected fcr a(dxu $$0, dgm $$1, jh $$2, fcc $$3) {
      return b;
   }

   @Override
   protected fcr a_(dxu $$0, dhh $$1, jh $$2) {
      return $$0.f($$1, $$2);
   }

   @Override
   protected void a(dxu $$0, dhh $$1, jh $$2, bvj $$3) {
      if ($$3.o(false)) {
         if (!$$1.C && $$1.ah() == dhh.k && $$3 instanceof asi $$4 && !$$4.i) {
            $$4.n();
            return;
         }

         $$3.a(this, $$2);
      }
   }

   @Override
   public euw a(ash $$0, bvj $$1, jh $$2) {
      aly<dhh> $$3 = $$0.ah() == dhh.k ? dhh.i : dhh.k;
      ash $$4 = $$0.p().a($$3);
      if ($$4 == null) {
         return null;
      } else {
         boolean $$5 = $$3 == dhh.k;
         jh $$6 = $$5 ? ash.a : $$4.Y();
         fbx $$7 = $$6.c();
         float $$8;
         Set<bwt> $$9;
         if ($$5) {
            egt.a($$4, jh.a((ka)$$7).e(), true);
            $$8 = jm.e.p();
            $$9 = bwt.a(bwt.l, Set.of(bwt.e));
            if ($$1 instanceof asi) {
               $$7 = $$7.a(0.0, 1.0, 0.0);
            }
         } else {
            $$8 = 0.0F;
            $$9 = bwt.a(bwt.l, bwt.k);
            if ($$1 instanceof asi $$12) {
               return $$12.a(false, euw.a);
            }

            $$7 = $$1.a($$4, $$6).c();
         }

         return new euw($$4, $$7, fbx.c, $$8, 0.0F, $$9, euw.b.then(euw.c));
      }
   }

   @Override
   public void a(dxu $$0, dhh $$1, jh $$2, bam $$3) {
      double $$4 = (double)$$2.u() + $$3.j();
      double $$5 = (double)$$2.v() + 0.8;
      double $$6 = (double)$$2.w() + $$3.j();
      $$1.a(ls.af, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }

   @Override
   public cxo a(dhk $$0, jh $$1, dxu $$2) {
      return cxo.k;
   }

   @Override
   protected boolean a(dxu $$0, etv $$1) {
      return false;
   }
}
