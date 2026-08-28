import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dos extends dlu {
   public static final MapCodec<dos> a = b(dos::new);
   public static final eao b = eae.aT;
   private static final feq d = dlu.b(16.0, 0.0, 15.0);
   public static final int c = 7;

   @Override
   public MapCodec<dos> a() {
      return a;
   }

   protected dos(dzn.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, Integer.valueOf(0)));
   }

   @Override
   protected dzo a(dzo $$0, dis $$1, dje $$2, iu $$3, ja $$4, iu $$5, dzo $$6, azt $$7) {
      if ($$4 == ja.b && !$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dzo $$0, dis $$1, iu $$2) {
      dzo $$3 = $$1.a_($$2.d());
      return !$$3.e() || $$3.b() instanceof dou || $$3.b() instanceof dzg;
   }

   @Override
   public dzo a(dcl $$0) {
      return !this.m().a((dis)$$0.q(), $$0.a()) ? dlw.j.m() : super.a($$0);
   }

   @Override
   protected boolean g_(dzo $$0) {
      return true;
   }

   @Override
   protected feq a(dzo $$0, dhv $$1, iu $$2, feb $$3) {
      return d;
   }

   @Override
   protected void a(dzo $$0, aro $$1, iu $$2, azt $$3) {
      if (!$$0.a($$1, $$2)) {
         a(null, $$0, $$1, $$2);
      }
   }

   @Override
   protected void b(dzo $$0, aro $$1, iu $$2, azt $$3) {
      int $$4 = $$0.c(b);
      if (!a((dis)$$1, $$2) && !$$1.r($$2.d())) {
         if ($$4 > 0) {
            $$1.a($$2, $$0.b(b, Integer.valueOf($$4 - 1)), 2);
         } else if (!a((dhv)$$1, $$2)) {
            a(null, $$0, $$1, $$2);
         }
      } else if ($$4 < 7) {
         $$1.a($$2, $$0.b(b, Integer.valueOf(7)), 2);
      }
   }

   @Override
   public void a(dip $$0, dzo $$1, iu $$2, bwa $$3, double $$4) {
      if ($$0 instanceof aro $$5
         && (double)$$0.A.i() < $$4 - 0.5
         && $$3 instanceof bwz
         && ($$3 instanceof cqs || $$5.O().c(dil.c))
         && $$3.dq() * $$3.dq() * $$3.dr() > 0.512F) {
         a($$3, $$1, $$0, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static void a(@Nullable bwa $$0, dzo $$1, dip $$2, iu $$3) {
      dzo $$4 = a($$1, dlw.j.m(), $$2, $$3);
      $$2.b($$3, $$4);
      $$2.a(eeo.c, $$3, eeo.a.a($$0, $$4));
   }

   private static boolean a(dhv $$0, iu $$1) {
      return $$0.a_($$1.d()).a(axa.cC);
   }

   private static boolean a(dis $$0, iu $$1) {
      for (iu $$2 : iu.c($$1.b(-4, 0, -4), $$1.b(4, 1, 4))) {
         if ($$0.b_($$2).a(axf.a)) {
            return true;
         }
      }

      return false;
   }

   @Override
   protected void a(dzp.a<dlu, dzo> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(dzo $$0, ewk $$1) {
      return false;
   }
}
