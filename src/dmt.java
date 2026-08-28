import com.mojang.serialization.MapCodec;
import java.util.Set;

public class dmt extends djq implements dqb {
   public static final MapCodec<dmt> a = b(dmt::new);
   private static final fcr b = dke.b(16.0, 6.0, 12.0);

   @Override
   public MapCodec<dmt> a() {
      return a;
   }

   protected dmt(dxp.d $$0) {
      super($$0);
   }

   @Override
   public dus a(ji $$0, dxq $$1) {
      return new dwm($$0, $$1);
   }

   @Override
   protected fcr a(dxq $$0, dgf $$1, ji $$2, fcc $$3) {
      return b;
   }

   @Override
   protected fcr a_(dxq $$0, dgz $$1, ji $$2) {
      return $$0.f($$1, $$2);
   }

   @Override
   protected void a(dxq $$0, dgz $$1, ji $$2, bva $$3) {
      if ($$3.n(false)) {
         if (!$$1.C && $$1.aj() == dgz.k && $$3 instanceof are $$4 && !$$4.i) {
            $$4.n();
            return;
         }

         $$3.a(this, $$2);
      }
   }

   @Override
   public euw a(ard $$0, bva $$1, ji $$2) {
      akt<dgz> $$3 = $$0.aj() == dgz.k ? dgz.i : dgz.k;
      ard $$4 = $$0.p().a($$3);
      if ($$4 == null) {
         return null;
      } else {
         boolean $$5 = $$3 == dgz.k;
         ji $$6 = $$5 ? ard.a : $$4.aa();
         fbx $$7 = $$6.c();
         float $$8;
         Set<bwm> $$9;
         if ($$5) {
            egs.a($$4, ji.a((kb)$$7).e(), true);
            $$8 = jn.e.p();
            $$9 = bwm.a(bwm.l, Set.of(bwm.e));
            if ($$1 instanceof are) {
               $$7 = $$7.a(0.0, 1.0, 0.0);
            }
         } else {
            $$8 = 0.0F;
            $$9 = bwm.a(bwm.l, bwm.k);
            if ($$1 instanceof are $$12) {
               return $$12.a(false, euw.a);
            }

            $$7 = $$1.a($$4, $$6).c();
         }

         return new euw($$4, $$7, fbx.c, $$8, 0.0F, $$9, euw.b.then(euw.c));
      }
   }

   @Override
   public void a(dxq $$0, dgz $$1, ji $$2, azh $$3) {
      double $$4 = (double)$$2.u() + $$3.j();
      double $$5 = (double)$$2.v() + 0.8;
      double $$6 = (double)$$2.w() + $$3.j();
      $$1.a(lt.ah, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }

   @Override
   protected cxh a(dhc $$0, ji $$1, dxq $$2, boolean $$3) {
      return cxh.k;
   }

   @Override
   protected boolean a(dxq $$0, etv $$1) {
      return false;
   }

   @Override
   protected dqp a_(dxq $$0) {
      return dqp.a;
   }
}
