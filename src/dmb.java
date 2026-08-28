import com.mojang.serialization.MapCodec;
import java.util.Set;
import javax.annotation.Nullable;

public class dmb extends diz implements dpk {
   public static final MapCodec<dmb> a = b(dmb::new);

   @Override
   public MapCodec<dmb> a() {
      return a;
   }

   protected dmb(dwx.d $$0) {
      super($$0);
   }

   @Override
   public dua a(ji $$0, dwy $$1) {
      return new dvt($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dua> dub<T> a(dgj $$0, dwy $$1, duc<T> $$2) {
      return a($$2, duc.w, $$0.C ? dvt::a : dvt::b);
   }

   @Override
   public void a(dwy $$0, dgj $$1, ji $$2, azh $$3) {
      dua $$4 = $$1.c_($$2);
      if ($$4 instanceof dvt) {
         int $$5 = ((dvt)$$4).f();

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

            $$1.a(lt.ae, $$7, $$8, $$9, $$10, $$11, $$12);
         }
      }
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
   protected void a(dwy $$0, dgj $$1, ji $$2, bum $$3) {
      if ($$3.o(false) && !$$1.C && $$1.c_($$2) instanceof dvt $$5 && !$$5.c()) {
         $$3.a(this, $$2);
         dvt.c($$1, $$2, $$0, $$5);
      }
   }

   @Nullable
   @Override
   public eua a(ard $$0, bum $$1, ji $$2) {
      if ($$0.c_($$2) instanceof dvt $$4) {
         fbb $$6 = $$4.a($$0, $$2);
         if ($$6 == null) {
            return null;
         } else {
            return $$1 instanceof cqb
               ? new eua($$0, $$6, fbb.c, 0.0F, 0.0F, Set.of(), eua.c)
               : new eua($$0, $$6, fbb.c, 0.0F, 0.0F, bvw.a(bvw.l, bvw.k), eua.c);
         }
      } else {
         return null;
      }
   }

   @Override
   protected dpy a_(dwy $$0) {
      return dpy.a;
   }
}
