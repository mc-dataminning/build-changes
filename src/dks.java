import com.mojang.serialization.MapCodec;
import java.util.Set;

public class dks extends dhq implements dnw {
   public static final MapCodec<dks> a = b(dks::new);
   protected static final fah b = die.a(0.0, 6.0, 0.0, 16.0, 12.0, 16.0);

   @Override
   public MapCodec<dks> a() {
      return a;
   }

   protected dks(dvi.d $$0) {
      super($$0);
   }

   @Override
   public dsm a(jh $$0, dvj $$1) {
      return new duf($$0, $$1);
   }

   @Override
   protected fah a(dvj $$0, deg $$1, jh $$2, ezs $$3) {
      return b;
   }

   @Override
   protected fah a_(dvj $$0, dfb $$1, jh $$2) {
      return $$0.f($$1, $$2);
   }

   @Override
   protected void a(dvj $$0, dfb $$1, jh $$2, bue $$3) {
      if ($$3.o(false)) {
         if (!$$1.C && $$1.ag() == dfb.k && $$3 instanceof aro $$4 && !$$4.j) {
            $$4.q();
            return;
         }

         $$3.a(this, $$2);
      }
   }

   @Override
   public esi a(arn $$0, bue $$1, jh $$2) {
      alh<dfb> $$3 = $$0.ag() == dfb.k ? dfb.i : dfb.k;
      arn $$4 = $$0.o().a($$3);
      if ($$4 == null) {
         return null;
      } else {
         boolean $$5 = $$3 == dfb.k;
         jh $$6 = $$5 ? arn.a : $$4.W();
         ezn $$7 = $$6.c();
         float $$8;
         Set<bvo> $$9;
         if ($$5) {
            eej.a($$4, jh.a((ka)$$7).e(), true);
            $$8 = jm.e.p();
            $$9 = bvo.a(bvo.l, Set.of(bvo.e));
            if ($$1 instanceof aro) {
               $$7 = $$7.a(0.0, 1.0, 0.0);
            }
         } else {
            $$8 = 0.0F;
            $$9 = bvo.a(bvo.l, bvo.k);
            if ($$1 instanceof aro $$12) {
               return $$12.a(false, esi.a);
            }

            $$7 = $$1.a($$4, $$6).c();
         }

         return new esi($$4, $$7, ezn.c, $$8, 0.0F, $$9, esi.b.then(esi.c));
      }
   }

   @Override
   public void a(dvj $$0, dfb $$1, jh $$2, azs $$3) {
      double $$4 = (double)$$2.u() + $$3.j();
      double $$5 = (double)$$2.v() + 0.8;
      double $$6 = (double)$$2.w() + $$3.j();
      $$1.a(lr.ae, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }

   @Override
   public cwb a(dfe $$0, jh $$1, dvj $$2) {
      return cwb.k;
   }

   @Override
   protected boolean a(dvj $$0, erj $$1) {
      return false;
   }
}
