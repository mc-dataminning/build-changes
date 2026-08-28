import com.mojang.serialization.MapCodec;
import java.util.Set;

public class dov extends dlr implements dse {
   public static final MapCodec<dov> a = b(dov::new);
   private static final ffk b = dmf.b(16.0, 6.0, 12.0);

   @Override
   public MapCodec<dov> a() {
      return a;
   }

   protected dov(eag.d $$0) {
      super($$0);
   }

   @Override
   public dxf a(iu $$0, eah $$1) {
      return new dzc($$0, $$1);
   }

   @Override
   protected ffk a(eah $$0, dig $$1, iu $$2, fev $$3) {
      return b;
   }

   @Override
   protected ffk a(eah $$0, dig $$1, iu $$2, bwf $$3) {
      return $$0.f($$1, $$2);
   }

   @Override
   protected void a(eah $$0, dja $$1, iu $$2, bwf $$3) {
      if ($$3.n(false)) {
         if (!$$1.C && $$1.aj() == dja.k && $$3 instanceof arr $$4 && !$$4.i) {
            $$4.n();
            return;
         }

         $$3.a(this, $$2);
      }
   }

   @Override
   public exo a(arq $$0, bwf $$1, iu $$2) {
      alf<dja> $$3 = $$0.aj() == dja.k ? dja.i : dja.k;
      arq $$4 = $$0.p().a($$3);
      if ($$4 == null) {
         return null;
      } else {
         boolean $$5 = $$3 == dja.k;
         iu $$6 = $$5 ? arq.a : $$4.aa();
         feq $$7 = $$6.c();
         float $$8;
         Set<bxs> $$9;
         if ($$5) {
            ejk.a($$4, iu.a((jo)$$7).e(), true);
            $$8 = ja.e.p();
            $$9 = bxs.a(bxs.l, Set.of(bxs.e));
            if ($$1 instanceof arr) {
               $$7 = $$7.a(0.0, 1.0, 0.0);
            }
         } else {
            $$8 = 0.0F;
            $$9 = bxs.a(bxs.l, bxs.k);
            if ($$1 instanceof arr $$12) {
               return $$12.a(false, exo.a);
            }

            $$7 = $$1.a($$4, $$6).c();
         }

         return new exo($$4, $$7, feq.c, $$8, 0.0F, $$9, exo.b.then(exo.c));
      }
   }

   @Override
   public void a(eah $$0, dja $$1, iu $$2, azv $$3) {
      double $$4 = (double)$$2.u() + $$3.j();
      double $$5 = (double)$$2.v() + 0.8;
      double $$6 = (double)$$2.w() + $$3.j();
      $$1.a(lx.ah, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }

   @Override
   protected czd a(djd $$0, iu $$1, eah $$2, boolean $$3) {
      return czd.k;
   }

   @Override
   protected boolean a(eah $$0, ewn $$1) {
      return false;
   }

   @Override
   protected dss a_(eah $$0) {
      return dss.a;
   }
}
