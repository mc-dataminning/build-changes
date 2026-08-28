import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class djs extends dgv {
   public static final MapCodec<djs> a = b(djs::new);
   public static final dva b = duq.aQ;
   protected static final eyx c = dgv.a(0.0, 0.0, 0.0, 16.0, 15.0, 16.0);
   public static final int d = 7;

   @Override
   public MapCodec<djs> a() {
      return a;
   }

   protected djs(dtz.d $$0) {
      super($$0);
      this.l(this.E.b().b(b, Integer.valueOf(0)));
   }

   @Override
   protected dua a(dua $$0, jj $$1, dua $$2, ddt $$3, je $$4, je $$5) {
      if ($$1 == jj.b && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dua $$0, ddv $$1, je $$2) {
      dua $$3 = $$1.a_($$2.d());
      return !$$3.e() || $$3.b() instanceof dju || $$3.b() instanceof dts;
   }

   @Override
   public dua a(cyw $$0) {
      return !this.o().a((ddv)$$0.q(), $$0.a()) ? dgx.j.o() : super.a($$0);
   }

   @Override
   protected boolean g_(dua $$0) {
      return true;
   }

   @Override
   protected eyx a(dua $$0, dcx $$1, je $$2, eyj $$3) {
      return c;
   }

   @Override
   protected void a(dua $$0, arg $$1, je $$2, azk $$3) {
      if (!$$0.a($$1, $$2)) {
         a(null, $$0, $$1, $$2);
      }
   }

   @Override
   protected void b(dua $$0, arg $$1, je $$2, azk $$3) {
      int $$4 = $$0.c(b);
      if (!a((ddv)$$1, $$2) && !$$1.r($$2.d())) {
         if ($$4 > 0) {
            $$1.a($$2, $$0.b(b, Integer.valueOf($$4 - 1)), 2);
         } else if (!a((dcx)$$1, $$2)) {
            a(null, $$0, $$1, $$2);
         }
      } else if ($$4 < 7) {
         $$1.a($$2, $$0.b(b, Integer.valueOf(7)), 2);
      }
   }

   @Override
   public void a(dds $$0, dua $$1, je $$2, btj $$3, float $$4) {
      if (!$$0.B && $$0.z.i() < $$4 - 0.5F && $$3 instanceof buf && ($$3 instanceof cnp || $$0.ac().b(ddo.c)) && $$3.dn() * $$3.dn() * $$3.do() > 0.512F) {
         a($$3, $$1, $$0, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static void a(@Nullable btj $$0, dua $$1, dds $$2, je $$3) {
      dua $$4 = a($$1, dgx.j.o(), $$2, $$3);
      $$2.b($$3, $$4);
      $$2.a(dyx.c, $$3, dyx.a.a($$0, $$4));
   }

   private static boolean a(dcx $$0, je $$1) {
      return $$0.a_($$1.d()).a(aws.cy);
   }

   private static boolean a(ddv $$0, je $$1) {
      for (je $$2 : je.c($$1.b(-4, 0, -4), $$1.b(4, 1, 4))) {
         if ($$0.b_($$2).a(awy.a)) {
            return true;
         }
      }

      return false;
   }

   @Override
   protected void a(dub.a<dgv, dua> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(dua $$0, eqq $$1) {
      return false;
   }
}
