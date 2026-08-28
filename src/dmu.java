import com.mojang.serialization.MapCodec;
import java.util.Set;

public class dmu extends djq implements dpz {
   public static final MapCodec<dmu> a = b(dmu::new);
   protected static final fcm b = dke.a(0.0, 6.0, 0.0, 16.0, 12.0, 16.0);

   @Override
   public MapCodec<dmu> a() {
      return a;
   }

   protected dmu(dxm.d $$0) {
      super($$0);
   }

   @Override
   public dup a(jh $$0, dxn $$1) {
      return new dwj($$0, $$1);
   }

   @Override
   protected fcm a(dxn $$0, dgf $$1, jh $$2, fbx $$3) {
      return b;
   }

   @Override
   protected fcm a_(dxn $$0, dha $$1, jh $$2) {
      return $$0.f($$1, $$2);
   }

   @Override
   protected void a(dxn $$0, dha $$1, jh $$2, bvf $$3) {
      if ($$3.o(false)) {
         if (!$$1.C && $$1.ah() == dha.k && $$3 instanceof asi $$4 && !$$4.i) {
            $$4.n();
            return;
         }

         $$3.a(this, $$2);
      }
   }

   @Override
   public eup a(ash $$0, bvf $$1, jh $$2) {
      aly<dha> $$3 = $$0.ah() == dha.k ? dha.i : dha.k;
      ash $$4 = $$0.p().a($$3);
      if ($$4 == null) {
         return null;
      } else {
         boolean $$5 = $$3 == dha.k;
         jh $$6 = $$5 ? ash.a : $$4.Y();
         fbs $$7 = $$6.c();
         float $$8;
         Set<bwp> $$9;
         if ($$5) {
            egm.a($$4, jh.a((ka)$$7).e(), true);
            $$8 = jm.e.p();
            $$9 = bwp.a(bwp.l, Set.of(bwp.e));
            if ($$1 instanceof asi) {
               $$7 = $$7.a(0.0, 1.0, 0.0);
            }
         } else {
            $$8 = 0.0F;
            $$9 = bwp.a(bwp.l, bwp.k);
            if ($$1 instanceof asi $$12) {
               return $$12.a(false, eup.a);
            }

            $$7 = $$1.a($$4, $$6).c();
         }

         return new eup($$4, $$7, fbs.c, $$8, 0.0F, $$9, eup.b.then(eup.c));
      }
   }

   @Override
   public void a(dxn $$0, dha $$1, jh $$2, bam $$3) {
      double $$4 = (double)$$2.u() + $$3.j();
      double $$5 = (double)$$2.v() + 0.8;
      double $$6 = (double)$$2.w() + $$3.j();
      $$1.a(ls.af, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }

   @Override
   public cxk a(dhd $$0, jh $$1, dxn $$2) {
      return cxk.k;
   }

   @Override
   protected boolean a(dxn $$0, eto $$1) {
      return false;
   }
}
