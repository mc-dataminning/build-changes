import com.mojang.serialization.MapCodec;
import java.util.Set;

public class dpc extends dly implements dsl {
   public static final MapCodec<dpc> a = b(dpc::new);
   private static final ffr b = dmm.b(16.0, 6.0, 12.0);

   @Override
   public MapCodec<dpc> a() {
      return a;
   }

   protected dpc(ean.d $$0) {
      super($$0);
   }

   @Override
   public dxm a(iv $$0, eao $$1) {
      return new dzj($$0, $$1);
   }

   @Override
   protected ffr a(eao $$0, din $$1, iv $$2, ffc $$3) {
      return b;
   }

   @Override
   protected ffr a(eao $$0, din $$1, iv $$2, bwi $$3) {
      return $$0.f($$1, $$2);
   }

   @Override
   protected void a(eao $$0, djh $$1, iv $$2, bwi $$3, bxb $$4) {
      if ($$3.n(false)) {
         if (!$$1.C && $$1.aj() == djh.k && $$3 instanceof arr $$5 && !$$5.i) {
            $$5.n();
            return;
         }

         $$3.a(this, $$2);
      }
   }

   @Override
   public exv a(arq $$0, bwi $$1, iv $$2) {
      alf<djh> $$3 = $$0.aj() == djh.k ? djh.i : djh.k;
      arq $$4 = $$0.p().a($$3);
      if ($$4 == null) {
         return null;
      } else {
         boolean $$5 = $$3 == djh.k;
         iv $$6 = $$5 ? arq.a : $$4.aa();
         fex $$7 = $$6.c();
         float $$8;
         Set<bxx> $$9;
         if ($$5) {
            ejr.a($$4, iv.a((jp)$$7).e(), true);
            $$8 = jb.e.p();
            $$9 = bxx.a(bxx.l, Set.of(bxx.e));
            if ($$1 instanceof arr) {
               $$7 = $$7.a(0.0, 1.0, 0.0);
            }
         } else {
            $$8 = 0.0F;
            $$9 = bxx.a(bxx.l, bxx.k);
            if ($$1 instanceof arr $$12) {
               return $$12.a(false, exv.a);
            }

            $$7 = $$1.a($$4, $$6).c();
         }

         return new exv($$4, $$7, fex.c, $$8, 0.0F, $$9, exv.b.then(exv.c));
      }
   }

   @Override
   public void a(eao $$0, djh $$1, iv $$2, azv $$3) {
      double $$4 = (double)$$2.u() + $$3.j();
      double $$5 = (double)$$2.v() + 0.8;
      double $$6 = (double)$$2.w() + $$3.j();
      $$1.a(ly.ah, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }

   @Override
   protected czk a(djk $$0, iv $$1, eao $$2, boolean $$3) {
      return czk.k;
   }

   @Override
   protected boolean a(eao $$0, ewu $$1) {
      return false;
   }

   @Override
   protected dsz a_(eao $$0) {
      return dsz.a;
   }
}
