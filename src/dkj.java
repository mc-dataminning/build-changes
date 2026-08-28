import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dkj extends dhm {
   public static final MapCodec<dkj> a = b(dkj::new);
   public static final dvs b = dvi.aQ;
   protected static final ezq c = dhm.a(0.0, 0.0, 0.0, 16.0, 15.0, 16.0);
   public static final int d = 7;

   @Override
   public MapCodec<dkj> a() {
      return a;
   }

   protected dkj(dur.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Integer.valueOf(0)));
   }

   @Override
   protected dus a(dus $$0, jk $$1, dus $$2, dek $$3, jf $$4, jf $$5) {
      if ($$1 == jk.b && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dus $$0, dem $$1, jf $$2) {
      dus $$3 = $$1.a_($$2.d());
      return !$$3.e() || $$3.b() instanceof dkl || $$3.b() instanceof duk;
   }

   @Override
   public dus a(czn $$0) {
      return !this.n().a((dem)$$0.q(), $$0.a()) ? dho.j.n() : super.a($$0);
   }

   @Override
   protected boolean g_(dus $$0) {
      return true;
   }

   @Override
   protected ezq a(dus $$0, ddo $$1, jf $$2, ezb $$3) {
      return c;
   }

   @Override
   protected void a(dus $$0, arj $$1, jf $$2, azn $$3) {
      if (!$$0.a($$1, $$2)) {
         a(null, $$0, $$1, $$2);
      }
   }

   @Override
   protected void b(dus $$0, arj $$1, jf $$2, azn $$3) {
      int $$4 = $$0.c(b);
      if (!a((dem)$$1, $$2) && !$$1.r($$2.d())) {
         if ($$4 > 0) {
            $$1.a($$2, $$0.b(b, Integer.valueOf($$4 - 1)), 2);
         } else if (!a((ddo)$$1, $$2)) {
            a(null, $$0, $$1, $$2);
         }
      } else if ($$4 < 7) {
         $$1.a($$2, $$0.b(b, Integer.valueOf(7)), 2);
      }
   }

   @Override
   public void a(dej $$0, dus $$1, jf $$2, btr $$3, float $$4) {
      if (!$$0.B && $$0.z.i() < $$4 - 0.5F && $$3 instanceof bun && ($$3 instanceof cnx || $$0.ac().b(def.c)) && $$3.dn() * $$3.dn() * $$3.do() > 0.512F) {
         a($$3, $$1, $$0, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static void a(@Nullable btr $$0, dus $$1, dej $$2, jf $$3) {
      dus $$4 = a($$1, dho.j.n(), $$2, $$3);
      $$2.b($$3, $$4);
      $$2.a(dzp.c, $$3, dzp.a.a($$0, $$4));
   }

   private static boolean a(ddo $$0, jf $$1) {
      return $$0.a_($$1.d()).a(awv.cy);
   }

   private static boolean a(dem $$0, jf $$1) {
      for (jf $$2 : jf.c($$1.b(-4, 0, -4), $$1.b(4, 1, 4))) {
         if ($$0.b_($$2).a(axb.a)) {
            return true;
         }
      }

      return false;
   }

   @Override
   protected void a(dut.a<dhm, dus> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(dus $$0, eri $$1) {
      return false;
   }
}
