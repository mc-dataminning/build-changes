import com.mojang.serialization.MapCodec;
import java.util.Set;

public class dms extends djp implements dqa {
   public static final MapCodec<dms> a = b(dms::new);
   protected static final fcl b = dkd.a(0.0, 6.0, 0.0, 16.0, 12.0, 16.0);

   @Override
   public MapCodec<dms> a() {
      return a;
   }

   protected dms(dxn.d $$0) {
      super($$0);
   }

   @Override
   public duq a(jh $$0, dxo $$1) {
      return new dwk($$0, $$1);
   }

   @Override
   protected fcl a(dxo $$0, dge $$1, jh $$2, fbw $$3) {
      return b;
   }

   @Override
   protected fcl a_(dxo $$0, dgz $$1, jh $$2) {
      return $$0.f($$1, $$2);
   }

   @Override
   protected void a(dxo $$0, dgz $$1, jh $$2, bvb $$3) {
      if ($$3.o(false)) {
         if (!$$1.C && $$1.ai() == dgz.k && $$3 instanceof ary $$4 && !$$4.i) {
            $$4.n();
            return;
         }

         $$3.a(this, $$2);
      }
   }

   @Override
   public euq a(arx $$0, bvb $$1, jh $$2) {
      alo<dgz> $$3 = $$0.ai() == dgz.k ? dgz.i : dgz.k;
      arx $$4 = $$0.p().a($$3);
      if ($$4 == null) {
         return null;
      } else {
         boolean $$5 = $$3 == dgz.k;
         jh $$6 = $$5 ? arx.a : $$4.Z();
         fbr $$7 = $$6.c();
         float $$8;
         Set<bwl> $$9;
         if ($$5) {
            egn.a($$4, jh.a((ka)$$7).e(), true);
            $$8 = jm.e.p();
            $$9 = bwl.a(bwl.l, Set.of(bwl.e));
            if ($$1 instanceof ary) {
               $$7 = $$7.a(0.0, 1.0, 0.0);
            }
         } else {
            $$8 = 0.0F;
            $$9 = bwl.a(bwl.l, bwl.k);
            if ($$1 instanceof ary $$12) {
               return $$12.a(false, euq.a);
            }

            $$7 = $$1.a($$4, $$6).c();
         }

         return new euq($$4, $$7, fbr.c, $$8, 0.0F, $$9, euq.b.then(euq.c));
      }
   }

   @Override
   public void a(dxo $$0, dgz $$1, jh $$2, bac $$3) {
      double $$4 = (double)$$2.u() + $$3.j();
      double $$5 = (double)$$2.v() + 0.8;
      double $$6 = (double)$$2.w() + $$3.j();
      $$1.a(ls.ag, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }

   @Override
   protected cxg a(dhc $$0, jh $$1, dxo $$2) {
      return cxg.j;
   }

   @Override
   protected boolean a(dxo $$0, etp $$1) {
      return false;
   }
}
