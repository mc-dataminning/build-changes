import com.mojang.serialization.MapCodec;
import java.util.Set;
import javax.annotation.Nullable;

public class dms extends djq implements dqb {
   public static final MapCodec<dms> a = b(dms::new);

   @Override
   public MapCodec<dms> a() {
      return a;
   }

   protected dms(dxp.d $$0) {
      super($$0);
   }

   @Override
   public dus a(ji $$0, dxq $$1) {
      return new dwl($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dus> dut<T> a(dgz $$0, dxq $$1, duu<T> $$2) {
      return a($$2, duu.w, $$0.C ? dwl::a : dwl::b);
   }

   @Override
   public void a(dxq $$0, dgz $$1, ji $$2, azh $$3) {
      dus $$4 = $$1.c_($$2);
      if ($$4 instanceof dwl) {
         int $$5 = ((dwl)$$4).f();

         for (int $$6 = 0; $$6 < $$5; $$6++) {
            double $$7 = (double)$$2.u() + $$3.j();
            double $$8 = (double)$$2.v() + $$3.j();
            double $$9 = (double)$$2.w() + $$3.j();
            double $$10 = ($$3.j() - 0.5) * 0.5;
            double $$11 = ($$3.j() - 0.5) * 0.5;
            double $$12 = ($$3.j() - 0.5) * 0.5;
            int $$13 = $$3.a(2) * 2 - 1;
            if ($$3.h()) {
               $$9 = (double)$$2.w() + 0.5 + 0.25 * (double)$$13;
               $$12 = (double)($$3.i() * 2.0F * (float)$$13);
            } else {
               $$7 = (double)$$2.u() + 0.5 + 0.25 * (double)$$13;
               $$10 = (double)($$3.i() * 2.0F * (float)$$13);
            }

            $$1.a(lt.af, $$7, $$8, $$9, $$10, $$11, $$12);
         }
      }
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
   protected void a(dxq $$0, dgz $$1, ji $$2, bva $$3) {
      if ($$3.n(false) && !$$1.C && $$1.c_($$2) instanceof dwl $$5 && !$$5.c()) {
         $$3.a(this, $$2);
         dwl.c($$1, $$2, $$0, $$5);
      }
   }

   @Nullable
   @Override
   public euw a(ard $$0, bva $$1, ji $$2) {
      if ($$0.c_($$2) instanceof dwl $$4) {
         fbx $$6 = $$4.a($$0, $$2);
         if ($$6 == null) {
            return null;
         } else {
            return $$1 instanceof cqu
               ? new euw($$0, $$6, fbx.c, 0.0F, 0.0F, Set.of(), euw.c)
               : new euw($$0, $$6, fbx.c, 0.0F, 0.0F, bwm.a(bwm.l, bwm.k), euw.c);
         }
      } else {
         return null;
      }
   }

   @Override
   protected dqp a_(dxq $$0) {
      return dqp.a;
   }
}
