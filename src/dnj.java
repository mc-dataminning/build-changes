import com.mojang.serialization.MapCodec;
import java.util.Set;

public class dnj extends dkg implements dqr {
   public static final MapCodec<dnj> a = b(dnj::new);
   private static final fdo b = dku.b(16.0, 6.0, 12.0);

   @Override
   public MapCodec<dnj> a() {
      return a;
   }

   protected dnj(dyl.d $$0) {
      super($$0);
   }

   @Override
   public dvl a(jj $$0, dym $$1) {
      return new dxi($$0, $$1);
   }

   @Override
   protected fdo a(dym $$0, dgv $$1, jj $$2, fcz $$3) {
      return b;
   }

   @Override
   protected fdo a_(dym $$0, dhp $$1, jj $$2) {
      return $$0.f($$1, $$2);
   }

   @Override
   protected void a(dym $$0, dhp $$1, jj $$2, bvs $$3) {
      if ($$3.n(false)) {
         if (!$$1.C && $$1.aj() == dhp.k && $$3 instanceof aro $$4 && !$$4.i) {
            $$4.n();
            return;
         }

         $$3.a(this, $$2);
      }
   }

   @Override
   public evt a(arn $$0, bvs $$1, jj $$2) {
      alc<dhp> $$3 = $$0.aj() == dhp.k ? dhp.i : dhp.k;
      arn $$4 = $$0.p().a($$3);
      if ($$4 == null) {
         return null;
      } else {
         boolean $$5 = $$3 == dhp.k;
         jj $$6 = $$5 ? arn.a : $$4.aa();
         fcu $$7 = $$6.c();
         float $$8;
         Set<bxf> $$9;
         if ($$5) {
            ehp.a($$4, jj.a((kc)$$7).e(), true);
            $$8 = jo.e.p();
            $$9 = bxf.a(bxf.l, Set.of(bxf.e));
            if ($$1 instanceof aro) {
               $$7 = $$7.a(0.0, 1.0, 0.0);
            }
         } else {
            $$8 = 0.0F;
            $$9 = bxf.a(bxf.l, bxf.k);
            if ($$1 instanceof aro $$12) {
               return $$12.a(false, evt.a);
            }

            $$7 = $$1.a($$4, $$6).c();
         }

         return new evt($$4, $$7, fcu.c, $$8, 0.0F, $$9, evt.b.then(evt.c));
      }
   }

   @Override
   public void a(dym $$0, dhp $$1, jj $$2, azs $$3) {
      double $$4 = (double)$$2.u() + $$3.j();
      double $$5 = (double)$$2.v() + 0.8;
      double $$6 = (double)$$2.w() + $$3.j();
      $$1.a(lv.ah, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }

   @Override
   protected cxy a(dhs $$0, jj $$1, dym $$2, boolean $$3) {
      return cxy.k;
   }

   @Override
   protected boolean a(dym $$0, eus $$1) {
      return false;
   }

   @Override
   protected drf a_(dym $$0) {
      return drf.a;
   }
}
