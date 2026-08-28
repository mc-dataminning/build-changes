import com.mojang.serialization.MapCodec;
import java.util.Set;

public class dnc extends djy implements dqh {
   public static final MapCodec<dnc> a = b(dnc::new);
   protected static final fcs b = dkm.a(0.0, 6.0, 0.0, 16.0, 12.0, 16.0);

   @Override
   public MapCodec<dnc> a() {
      return a;
   }

   protected dnc(dxu.d $$0) {
      super($$0);
   }

   @Override
   public dux a(jh $$0, dxv $$1) {
      return new dwr($$0, $$1);
   }

   @Override
   protected fcs a(dxv $$0, dgn $$1, jh $$2, fcd $$3) {
      return b;
   }

   @Override
   protected fcs a_(dxv $$0, dhi $$1, jh $$2) {
      return $$0.f($$1, $$2);
   }

   @Override
   protected void a(dxv $$0, dhi $$1, jh $$2, bvk $$3) {
      if ($$3.o(false)) {
         if (!$$1.C && $$1.ah() == dhi.k && $$3 instanceof asi $$4 && !$$4.i) {
            $$4.n();
            return;
         }

         $$3.a(this, $$2);
      }
   }

   @Override
   public eux a(ash $$0, bvk $$1, jh $$2) {
      aly<dhi> $$3 = $$0.ah() == dhi.k ? dhi.i : dhi.k;
      ash $$4 = $$0.p().a($$3);
      if ($$4 == null) {
         return null;
      } else {
         boolean $$5 = $$3 == dhi.k;
         jh $$6 = $$5 ? ash.a : $$4.Y();
         fby $$7 = $$6.c();
         float $$8;
         Set<bwu> $$9;
         if ($$5) {
            egu.a($$4, jh.a((ka)$$7).e(), true);
            $$8 = jm.e.p();
            $$9 = bwu.a(bwu.l, Set.of(bwu.e));
            if ($$1 instanceof asi) {
               $$7 = $$7.a(0.0, 1.0, 0.0);
            }
         } else {
            $$8 = 0.0F;
            $$9 = bwu.a(bwu.l, bwu.k);
            if ($$1 instanceof asi $$12) {
               return $$12.a(false, eux.a);
            }

            $$7 = $$1.a($$4, $$6).c();
         }

         return new eux($$4, $$7, fby.c, $$8, 0.0F, $$9, eux.b.then(eux.c));
      }
   }

   @Override
   public void a(dxv $$0, dhi $$1, jh $$2, bam $$3) {
      double $$4 = (double)$$2.u() + $$3.j();
      double $$5 = (double)$$2.v() + 0.8;
      double $$6 = (double)$$2.w() + $$3.j();
      $$1.a(ls.af, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }

   @Override
   public cxp a(dhl $$0, jh $$1, dxv $$2) {
      return cxp.j;
   }

   @Override
   protected boolean a(dxv $$0, etw $$1) {
      return false;
   }
}
