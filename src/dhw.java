import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dhw extends dez {
   public static final MapCodec<dhw> a = b(dhw::new);
   public static final dtc b = dss.aQ;
   protected static final ewk c = dez.a(0.0, 0.0, 0.0, 16.0, 15.0, 16.0);
   public static final int d = 7;

   @Override
   public MapCodec<dhw> a() {
      return a;
   }

   protected dhw(dsb.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Integer.valueOf(0)));
   }

   @Override
   protected dsc a(dsc $$0, je $$1, dsc $$2, dbz $$3, iz $$4, iz $$5) {
      if ($$1 == je.b && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dsc $$0, dcb $$1, iz $$2) {
      dsc $$3 = $$1.a_($$2.c());
      return !$$3.e() || $$3.b() instanceof dhy || $$3.b() instanceof dru;
   }

   @Override
   public dsc a(cya $$0) {
      return !this.o().a((dcb)$$0.q(), $$0.a()) ? dfb.j.o() : super.a($$0);
   }

   @Override
   protected boolean f_(dsc $$0) {
      return true;
   }

   @Override
   protected ewk a(dsc $$0, dbe $$1, iz $$2, evw $$3) {
      return c;
   }

   @Override
   protected void a(dsc $$0, arf $$1, iz $$2, azh $$3) {
      if (!$$0.a($$1, $$2)) {
         a(null, $$0, $$1, $$2);
      }
   }

   @Override
   protected void b(dsc $$0, arf $$1, iz $$2, azh $$3) {
      int $$4 = $$0.c(b);
      if (!a((dcb)$$1, $$2) && !$$1.r($$2.c())) {
         if ($$4 > 0) {
            $$1.a($$2, $$0.a(b, Integer.valueOf($$4 - 1)), 2);
         } else if (!a((dbe)$$1, $$2)) {
            a(null, $$0, $$1, $$2);
         }
      } else if ($$4 < 7) {
         $$1.a($$2, $$0.a(b, Integer.valueOf(7)), 2);
      }
   }

   @Override
   public void a(dby $$0, dsc $$1, iz $$2, bsu $$3, float $$4) {
      if (!$$0.B && $$0.z.i() < $$4 - 0.5F && $$3 instanceof btp && ($$3 instanceof cmx || $$0.ab().b(dbu.c)) && $$3.dj() * $$3.dj() * $$3.dk() > 0.512F) {
         a($$3, $$1, $$0, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static void a(@Nullable bsu $$0, dsc $$1, dby $$2, iz $$3) {
      dsc $$4 = a($$1, dfb.j.o(), $$2, $$3);
      $$2.b($$3, $$4);
      $$2.a(dwv.c, $$3, dwv.a.a($$0, $$4));
   }

   private static boolean a(dbe $$0, iz $$1) {
      return $$0.a_($$1.c()).a(awp.cx);
   }

   private static boolean a(dcb $$0, iz $$1) {
      for (iz $$2 : iz.c($$1.b(-4, 0, -4), $$1.b(4, 1, 4))) {
         if ($$0.b_($$2).a(awv.a)) {
            return true;
         }
      }

      return false;
   }

   @Override
   protected void a(dsd.a<dez, dsc> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(dsc $$0, eok $$1) {
      return false;
   }
}
