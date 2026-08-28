import com.mojang.serialization.MapCodec;
import java.util.Set;

public class dlz extends diw implements dph {
   public static final MapCodec<dlz> a = b(dlz::new);
   protected static final fbs b = djk.a(0.0, 6.0, 0.0, 16.0, 12.0, 16.0);

   @Override
   public MapCodec<dlz> a() {
      return a;
   }

   protected dlz(dwu.d $$0) {
      super($$0);
   }

   @Override
   public dtx a(ji $$0, dwv $$1) {
      return new dvr($$0, $$1);
   }

   @Override
   protected fbs a(dwv $$0, dfl $$1, ji $$2, fbd $$3) {
      return b;
   }

   @Override
   protected fbs a_(dwv $$0, dgg $$1, ji $$2) {
      return $$0.f($$1, $$2);
   }

   @Override
   protected void a(dwv $$0, dgg $$1, ji $$2, buj $$3) {
      if ($$3.o(false)) {
         if (!$$1.C && $$1.ai() == dgg.k && $$3 instanceof ard $$4 && !$$4.i) {
            $$4.n();
            return;
         }

         $$3.a(this, $$2);
      }
   }

   @Override
   public etx a(arc $$0, buj $$1, ji $$2) {
      akt<dgg> $$3 = $$0.ai() == dgg.k ? dgg.i : dgg.k;
      arc $$4 = $$0.p().a($$3);
      if ($$4 == null) {
         return null;
      } else {
         boolean $$5 = $$3 == dgg.k;
         ji $$6 = $$5 ? arc.a : $$4.Z();
         fay $$7 = $$6.c();
         float $$8;
         Set<bvt> $$9;
         if ($$5) {
            efu.a($$4, ji.a((kb)$$7).e(), true);
            $$8 = jn.e.p();
            $$9 = bvt.a(bvt.l, Set.of(bvt.e));
            if ($$1 instanceof ard) {
               $$7 = $$7.a(0.0, 1.0, 0.0);
            }
         } else {
            $$8 = 0.0F;
            $$9 = bvt.a(bvt.l, bvt.k);
            if ($$1 instanceof ard $$12) {
               return $$12.a(false, etx.a);
            }

            $$7 = $$1.a($$4, $$6).c();
         }

         return new etx($$4, $$7, fay.c, $$8, 0.0F, $$9, etx.b.then(etx.c));
      }
   }

   @Override
   public void a(dwv $$0, dgg $$1, ji $$2, azg $$3) {
      double $$4 = (double)$$2.u() + $$3.j();
      double $$5 = (double)$$2.v() + 0.8;
      double $$6 = (double)$$2.w() + $$3.j();
      $$1.a(lt.ag, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }

   @Override
   protected cwn a(dgj $$0, ji $$1, dwv $$2, boolean $$3) {
      return cwn.j;
   }

   @Override
   protected boolean a(dwv $$0, esw $$1) {
      return false;
   }

   @Override
   protected dpv a_(dwv $$0) {
      return dpv.a;
   }
}
