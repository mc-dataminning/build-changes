import com.mojang.serialization.MapCodec;
import java.util.Set;
import javax.annotation.Nullable;

public class doi extends dlg implements drr {
   public static final MapCodec<doi> a = b(doi::new);

   @Override
   public MapCodec<doi> a() {
      return a;
   }

   protected doi(dzn.d $$0) {
      super($$0);
   }

   @Override
   public dwn a(iu $$0, dzo $$1) {
      return new dyj($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dwn> dwo<T> a(dip $$0, dzo $$1, dwp<T> $$2) {
      return a($$2, dwp.w, $$0.C ? dyj::a : dyj::b);
   }

   @Override
   public void a(dzo $$0, dip $$1, iu $$2, azt $$3) {
      dwn $$4 = $$1.c_($$2);
      if ($$4 instanceof dyj) {
         int $$5 = ((dyj)$$4).f();

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

            $$1.a(lx.af, $$7, $$8, $$9, $$10, $$11, $$12);
         }
      }
   }

   @Override
   protected cys a(dis $$0, iu $$1, dzo $$2, boolean $$3) {
      return cys.k;
   }

   @Override
   protected boolean a(dzo $$0, evu $$1) {
      return false;
   }

   @Override
   protected void a(dzo $$0, dip $$1, iu $$2, bwa $$3) {
      if ($$3.n(false) && !$$1.C && $$1.c_($$2) instanceof dyj $$5 && !$$5.c()) {
         $$3.a(this, $$2);
         dyj.c($$1, $$2, $$0, $$5);
      }
   }

   @Nullable
   @Override
   public ewv a(aro $$0, bwa $$1, iu $$2) {
      if ($$0.c_($$2) instanceof dyj $$4) {
         fdw $$6 = $$4.a($$0, $$2);
         if ($$6 == null) {
            return null;
         } else {
            return $$1 instanceof crw
               ? new ewv($$0, $$6, fdw.c, 0.0F, 0.0F, Set.of(), ewv.c)
               : new ewv($$0, $$6, fdw.c, 0.0F, 0.0F, bxn.a(bxn.l, bxn.k), ewv.c);
         }
      } else {
         return null;
      }
   }

   @Override
   protected dsf a_(dzo $$0) {
      return dsf.a;
   }
}
