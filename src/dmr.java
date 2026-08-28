import com.mojang.serialization.MapCodec;
import java.util.Set;
import javax.annotation.Nullable;

public class dmr extends djp implements dqa {
   public static final MapCodec<dmr> a = b(dmr::new);

   @Override
   public MapCodec<dmr> a() {
      return a;
   }

   protected dmr(dxn.d $$0) {
      super($$0);
   }

   @Override
   public duq a(jh $$0, dxo $$1) {
      return new dwj($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends duq> dur<T> a(dgz $$0, dxo $$1, dus<T> $$2) {
      return a($$2, dus.w, $$0.C ? dwj::a : dwj::b);
   }

   @Override
   public void a(dxo $$0, dgz $$1, jh $$2, bac $$3) {
      duq $$4 = $$1.c_($$2);
      if ($$4 instanceof dwj) {
         int $$5 = ((dwj)$$4).f();

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

            $$1.a(ls.ae, $$7, $$8, $$9, $$10, $$11, $$12);
         }
      }
   }

   @Override
   protected cxg a(dhc $$0, jh $$1, dxo $$2) {
      return cxg.j;
   }

   @Override
   protected boolean a(dxo $$0, etp $$1) {
      return false;
   }

   @Override
   protected void a(dxo $$0, dgz $$1, jh $$2, bvb $$3) {
      if ($$3.o(false) && !$$1.C && $$1.c_($$2) instanceof dwj $$5 && !$$5.c()) {
         $$3.a(this, $$2);
         dwj.c($$1, $$2, $$0, $$5);
      }
   }

   @Nullable
   @Override
   public euq a(arx $$0, bvb $$1, jh $$2) {
      if ($$0.c_($$2) instanceof dwj $$4) {
         fbr $$6 = $$4.a($$0, $$2);
         if ($$6 == null) {
            return null;
         } else {
            return $$1 instanceof cqr
               ? new euq($$0, $$6, fbr.c, 0.0F, 0.0F, Set.of(), euq.c)
               : new euq($$0, $$6, fbr.c, 0.0F, 0.0F, bwl.a(bwl.l, bwl.k), euq.c);
         }
      } else {
         return null;
      }
   }
}
