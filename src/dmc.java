import com.mojang.serialization.MapCodec;
import java.util.Set;

public class dmc extends diz implements dpk {
   public static final MapCodec<dmc> a = b(dmc::new);
   protected static final fbv b = djn.a(0.0, 6.0, 0.0, 16.0, 12.0, 16.0);

   @Override
   public MapCodec<dmc> a() {
      return a;
   }

   protected dmc(dwx.d $$0) {
      super($$0);
   }

   @Override
   public dua a(ji $$0, dwy $$1) {
      return new dvu($$0, $$1);
   }

   @Override
   protected fbv a(dwy $$0, dfo $$1, ji $$2, fbg $$3) {
      return b;
   }

   @Override
   protected fbv a_(dwy $$0, dgj $$1, ji $$2) {
      return $$0.f($$1, $$2);
   }

   @Override
   protected void a(dwy $$0, dgj $$1, ji $$2, bum $$3) {
      if ($$3.o(false)) {
         if (!$$1.C && $$1.ai() == dgj.k && $$3 instanceof are $$4 && !$$4.i) {
            $$4.n();
            return;
         }

         $$3.a(this, $$2);
      }
   }

   @Override
   public eua a(ard $$0, bum $$1, ji $$2) {
      aku<dgj> $$3 = $$0.ai() == dgj.k ? dgj.i : dgj.k;
      ard $$4 = $$0.p().a($$3);
      if ($$4 == null) {
         return null;
      } else {
         boolean $$5 = $$3 == dgj.k;
         ji $$6 = $$5 ? ard.a : $$4.Z();
         fbb $$7 = $$6.c();
         float $$8;
         Set<bvw> $$9;
         if ($$5) {
            efx.a($$4, ji.a((kb)$$7).e(), true);
            $$8 = jn.e.p();
            $$9 = bvw.a(bvw.l, Set.of(bvw.e));
            if ($$1 instanceof are) {
               $$7 = $$7.a(0.0, 1.0, 0.0);
            }
         } else {
            $$8 = 0.0F;
            $$9 = bvw.a(bvw.l, bvw.k);
            if ($$1 instanceof are $$12) {
               return $$12.a(false, eua.a);
            }

            $$7 = $$1.a($$4, $$6).c();
         }

         return new eua($$4, $$7, fbb.c, $$8, 0.0F, $$9, eua.b.then(eua.c));
      }
   }

   @Override
   public void a(dwy $$0, dgj $$1, ji $$2, azh $$3) {
      double $$4 = (double)$$2.u() + $$3.j();
      double $$5 = (double)$$2.v() + 0.8;
      double $$6 = (double)$$2.w() + $$3.j();
      $$1.a(lt.ag, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }

   @Override
   protected cwq a(dgm $$0, ji $$1, dwy $$2, boolean $$3) {
      return cwq.j;
   }

   @Override
   protected boolean a(dwy $$0, esz $$1) {
      return false;
   }

   @Override
   protected dpy a_(dwy $$0) {
      return dpy.a;
   }
}
