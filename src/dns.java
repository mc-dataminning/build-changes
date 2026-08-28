import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dns extends dku {
   public static final MapCodec<dns> a = b(dns::new);
   public static final dzm b = dzc.aT;
   private static final fdo d = dku.b(16.0, 0.0, 15.0);
   public static final int c = 7;

   @Override
   public MapCodec<dns> a() {
      return a;
   }

   protected dns(dyl.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, Integer.valueOf(0)));
   }

   @Override
   protected dym a(dym $$0, dhs $$1, die $$2, jj $$3, jo $$4, jj $$5, dym $$6, azs $$7) {
      if ($$4 == jo.b && !$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dym $$0, dhs $$1, jj $$2) {
      dym $$3 = $$1.a_($$2.d());
      return !$$3.e() || $$3.b() instanceof dnu || $$3.b() instanceof dye;
   }

   @Override
   public dym a(dbn $$0) {
      return !this.m().a((dhs)$$0.q(), $$0.a()) ? dkw.j.m() : super.a($$0);
   }

   @Override
   protected boolean g_(dym $$0) {
      return true;
   }

   @Override
   protected fdo a(dym $$0, dgv $$1, jj $$2, fcz $$3) {
      return d;
   }

   @Override
   protected void a(dym $$0, arn $$1, jj $$2, azs $$3) {
      if (!$$0.a($$1, $$2)) {
         a(null, $$0, $$1, $$2);
      }
   }

   @Override
   protected void b(dym $$0, arn $$1, jj $$2, azs $$3) {
      int $$4 = $$0.c(b);
      if (!a((dhs)$$1, $$2) && !$$1.r($$2.d())) {
         if ($$4 > 0) {
            $$1.a($$2, $$0.b(b, Integer.valueOf($$4 - 1)), 2);
         } else if (!a((dgv)$$1, $$2)) {
            a(null, $$0, $$1, $$2);
         }
      } else if ($$4 < 7) {
         $$1.a($$2, $$0.b(b, Integer.valueOf(7)), 2);
      }
   }

   @Override
   public void a(dhp $$0, dym $$1, jj $$2, bvs $$3, double $$4) {
      if ($$0 instanceof arn $$5
         && (double)$$0.A.i() < $$4 - 0.5
         && $$3 instanceof bwr
         && ($$3 instanceof cqi || $$5.O().c(dhl.c))
         && $$3.dq() * $$3.dq() * $$3.dr() > 0.512F) {
         a($$3, $$1, $$0, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static void a(@Nullable bvs $$0, dym $$1, dhp $$2, jj $$3) {
      dym $$4 = a($$1, dkw.j.m(), $$2, $$3);
      $$2.b($$3, $$4);
      $$2.a(edm.c, $$3, edm.a.a($$0, $$4));
   }

   private static boolean a(dgv $$0, jj $$1) {
      return $$0.a_($$1.d()).a(awz.cC);
   }

   private static boolean a(dhs $$0, jj $$1) {
      for (jj $$2 : jj.c($$1.b(-4, 0, -4), $$1.b(4, 1, 4))) {
         if ($$0.b_($$2).a(axf.a)) {
            return true;
         }
      }

      return false;
   }

   @Override
   protected void a(dyn.a<dku, dym> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(dym $$0, evi $$1) {
      return false;
   }
}
