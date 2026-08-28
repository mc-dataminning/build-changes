import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dkg extends dhj {
   public static final MapCodec<dkg> a = b(dkg::new);
   public static final dvo b = dve.aQ;
   protected static final ezm c = dhj.a(0.0, 0.0, 0.0, 16.0, 15.0, 16.0);
   public static final int d = 7;

   @Override
   public MapCodec<dkg> a() {
      return a;
   }

   protected dkg(dun.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Integer.valueOf(0)));
   }

   @Override
   protected duo a(duo $$0, jj $$1, duo $$2, deh $$3, je $$4, je $$5) {
      if ($$1 == jj.b && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(duo $$0, dej $$1, je $$2) {
      duo $$3 = $$1.a_($$2.d());
      return !$$3.e() || $$3.b() instanceof dki || $$3.b() instanceof dug;
   }

   @Override
   public duo a(czk $$0) {
      return !this.o().a((dej)$$0.q(), $$0.a()) ? dhl.j.o() : super.a($$0);
   }

   @Override
   protected boolean g_(duo $$0) {
      return true;
   }

   @Override
   protected ezm a(duo $$0, ddl $$1, je $$2, eyx $$3) {
      return c;
   }

   @Override
   protected void a(duo $$0, arh $$1, je $$2, azl $$3) {
      if (!$$0.a($$1, $$2)) {
         a(null, $$0, $$1, $$2);
      }
   }

   @Override
   protected void b(duo $$0, arh $$1, je $$2, azl $$3) {
      int $$4 = $$0.c(b);
      if (!a((dej)$$1, $$2) && !$$1.r($$2.d())) {
         if ($$4 > 0) {
            $$1.a($$2, $$0.b(b, Integer.valueOf($$4 - 1)), 2);
         } else if (!a((ddl)$$1, $$2)) {
            a(null, $$0, $$1, $$2);
         }
      } else if ($$4 < 7) {
         $$1.a($$2, $$0.b(b, Integer.valueOf(7)), 2);
      }
   }

   @Override
   public void a(deg $$0, duo $$1, je $$2, bto $$3, float $$4) {
      if (!$$0.B && $$0.z.i() < $$4 - 0.5F && $$3 instanceof buk && ($$3 instanceof cnu || $$0.ac().b(dec.c)) && $$3.dn() * $$3.dn() * $$3.do() > 0.512F) {
         a($$3, $$1, $$0, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static void a(@Nullable bto $$0, duo $$1, deg $$2, je $$3) {
      duo $$4 = a($$1, dhl.j.o(), $$2, $$3);
      $$2.b($$3, $$4);
      $$2.a(dzl.c, $$3, dzl.a.a($$0, $$4));
   }

   private static boolean a(ddl $$0, je $$1) {
      return $$0.a_($$1.d()).a(awt.cy);
   }

   private static boolean a(dej $$0, je $$1) {
      for (je $$2 : je.c($$1.b(-4, 0, -4), $$1.b(4, 1, 4))) {
         if ($$0.b_($$2).a(awz.a)) {
            return true;
         }
      }

      return false;
   }

   @Override
   protected void a(dup.a<dhj, duo> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(duo $$0, ere $$1) {
      return false;
   }
}
