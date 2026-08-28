import com.mojang.serialization.MapCodec;
import java.util.Set;

public class dkx extends dhv implements dob {
   public static final MapCodec<dkx> a = b(dkx::new);
   protected static final fal b = dij.a(0.0, 6.0, 0.0, 16.0, 12.0, 16.0);

   @Override
   public MapCodec<dkx> a() {
      return a;
   }

   protected dkx(dvn.d $$0) {
      super($$0);
   }

   @Override
   public dsr a(jh $$0, dvo $$1) {
      return new duk($$0, $$1);
   }

   @Override
   protected fal a(dvo $$0, dek $$1, jh $$2, ezw $$3) {
      return b;
   }

   @Override
   protected fal a_(dvo $$0, dff $$1, jh $$2) {
      return $$0.f($$1, $$2);
   }

   @Override
   protected void a(dvo $$0, dff $$1, jh $$2, bui $$3) {
      if ($$3.o(false)) {
         if (!$$1.C && $$1.ag() == dff.k && $$3 instanceof arr $$4 && !$$4.j) {
            $$4.q();
            return;
         }

         $$3.a(this, $$2);
      }
   }

   @Override
   public esm a(arq $$0, bui $$1, jh $$2) {
      alk<dff> $$3 = $$0.ag() == dff.k ? dff.i : dff.k;
      arq $$4 = $$0.o().a($$3);
      if ($$4 == null) {
         return null;
      } else {
         boolean $$5 = $$3 == dff.k;
         jh $$6 = $$5 ? arq.a : $$4.W();
         ezr $$7 = $$6.c();
         float $$8;
         Set<bvs> $$9;
         if ($$5) {
            een.a($$4, jh.a((ka)$$7).e(), true);
            $$8 = jm.e.p();
            $$9 = bvs.a(bvs.l, Set.of(bvs.e));
            if ($$1 instanceof arr) {
               $$7 = $$7.a(0.0, 1.0, 0.0);
            }
         } else {
            $$8 = 0.0F;
            $$9 = bvs.a(bvs.l, bvs.k);
            if ($$1 instanceof arr $$12) {
               return $$12.a(false, esm.a);
            }

            $$7 = $$1.a($$4, $$6).c();
         }

         return new esm($$4, $$7, ezr.c, $$8, 0.0F, $$9, esm.b.then(esm.c));
      }
   }

   @Override
   public void a(dvo $$0, dff $$1, jh $$2, azv $$3) {
      double $$4 = (double)$$2.u() + $$3.j();
      double $$5 = (double)$$2.v() + 0.8;
      double $$6 = (double)$$2.w() + $$3.j();
      $$1.a(ls.ae, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }

   @Override
   public cwf a(dfi $$0, jh $$1, dvo $$2) {
      return cwf.k;
   }

   @Override
   protected boolean a(dvo $$0, ern $$1) {
      return false;
   }
}
