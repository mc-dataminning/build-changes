import com.mojang.serialization.MapCodec;
import java.util.Set;

public class dpu extends dmq implements dtd {
   public static final MapCodec<dpu> a = b(dpu::new);
   private static final fgm b = dne.b(16.0, 6.0, 12.0);

   @Override
   public MapCodec<dpu> a() {
      return a;
   }

   protected dpu(ebf.d $$0) {
      super($$0);
   }

   @Override
   public dye a(iw $$0, ebg $$1) {
      return new eab($$0, $$1);
   }

   @Override
   protected fgm a(ebg $$0, djd $$1, iw $$2, ffx $$3) {
      return b;
   }

   @Override
   protected fgm a(ebg $$0, djd $$1, iw $$2, bwv $$3) {
      return $$0.f($$1, $$2);
   }

   @Override
   protected void a(ebg $$0, djz $$1, iw $$2, bwv $$3, bxo $$4) {
      if ($$3.n(false)) {
         if (!$$1.C && $$1.aj() == djz.k && $$3 instanceof arv $$5 && !$$5.i) {
            $$5.n();
            return;
         }

         $$3.a(this, $$2);
      }
   }

   @Override
   public eyq a(aru $$0, bwv $$1, iw $$2) {
      alj<djz> $$3 = $$0.aj() == djz.k ? djz.i : djz.k;
      aru $$4 = $$0.p().a($$3);
      if ($$4 == null) {
         return null;
      } else {
         boolean $$5 = $$3 == djz.k;
         iw $$6 = $$5 ? aru.a : $$4.aa();
         ffs $$7 = $$6.c();
         float $$8;
         Set<byk> $$9;
         if ($$5) {
            ekj.a($$4, iw.a((jq)$$7).e(), true);
            $$8 = jc.e.p();
            $$9 = byk.a(byk.l, Set.of(byk.e));
            if ($$1 instanceof arv) {
               $$7 = $$7.a(0.0, 1.0, 0.0);
            }
         } else {
            $$8 = 0.0F;
            $$9 = byk.a(byk.l, byk.k);
            if ($$1 instanceof arv $$12) {
               return $$12.a(false, eyq.a);
            }

            $$7 = $$1.a($$4, $$6).c();
         }

         return new eyq($$4, $$7, ffs.c, $$8, 0.0F, $$9, eyq.b.then(eyq.c));
      }
   }

   @Override
   public void a(ebg $$0, djz $$1, iw $$2, azz $$3) {
      double $$4 = (double)$$2.u() + $$3.j();
      double $$5 = (double)$$2.v() + 0.8;
      double $$6 = (double)$$2.w() + $$3.j();
      $$1.a(lz.ah, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }

   @Override
   protected daa a(dkc $$0, iw $$1, ebg $$2, boolean $$3) {
      return daa.k;
   }

   @Override
   protected boolean a(ebg $$0, exp $$1) {
      return false;
   }

   @Override
   protected dtr a_(ebg $$0) {
      return dtr.a;
   }
}
