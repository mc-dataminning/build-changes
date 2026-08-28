import com.mojang.serialization.MapCodec;
import java.util.Set;

public class dop extends dlm implements dry {
   public static final MapCodec<dop> a = b(dop::new);
   private static final ffc b = dma.b(16.0, 6.0, 12.0);

   @Override
   public MapCodec<dop> a() {
      return a;
   }

   protected dop(dzy.d $$0) {
      super($$0);
   }

   @Override
   public dwx a(iu $$0, dzz $$1) {
      return new dyu($$0, $$1);
   }

   @Override
   protected ffc a(dzz $$0, dib $$1, iu $$2, fen $$3) {
      return b;
   }

   @Override
   protected ffc a(dzz $$0, dib $$1, iu $$2, bwd $$3) {
      return $$0.f($$1, $$2);
   }

   @Override
   protected void a(dzz $$0, div $$1, iu $$2, bwd $$3) {
      if ($$3.n(false)) {
         if (!$$1.C && $$1.aj() == div.k && $$3 instanceof arr $$4 && !$$4.i) {
            $$4.n();
            return;
         }

         $$3.a(this, $$2);
      }
   }

   @Override
   public exg a(arq $$0, bwd $$1, iu $$2) {
      alf<div> $$3 = $$0.aj() == div.k ? div.i : div.k;
      arq $$4 = $$0.p().a($$3);
      if ($$4 == null) {
         return null;
      } else {
         boolean $$5 = $$3 == div.k;
         iu $$6 = $$5 ? arq.a : $$4.aa();
         fei $$7 = $$6.c();
         float $$8;
         Set<bxq> $$9;
         if ($$5) {
            ejc.a($$4, iu.a((jo)$$7).e(), true);
            $$8 = ja.e.p();
            $$9 = bxq.a(bxq.l, Set.of(bxq.e));
            if ($$1 instanceof arr) {
               $$7 = $$7.a(0.0, 1.0, 0.0);
            }
         } else {
            $$8 = 0.0F;
            $$9 = bxq.a(bxq.l, bxq.k);
            if ($$1 instanceof arr $$12) {
               return $$12.a(false, exg.a);
            }

            $$7 = $$1.a($$4, $$6).c();
         }

         return new exg($$4, $$7, fei.c, $$8, 0.0F, $$9, exg.b.then(exg.c));
      }
   }

   @Override
   public void a(dzz $$0, div $$1, iu $$2, azv $$3) {
      double $$4 = (double)$$2.u() + $$3.j();
      double $$5 = (double)$$2.v() + 0.8;
      double $$6 = (double)$$2.w() + $$3.j();
      $$1.a(lx.ah, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }

   @Override
   protected cyy a(diy $$0, iu $$1, dzz $$2, boolean $$3) {
      return cyy.k;
   }

   @Override
   protected boolean a(dzz $$0, ewf $$1) {
      return false;
   }

   @Override
   protected dsm a_(dzz $$0) {
      return dsm.a;
   }
}
