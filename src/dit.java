import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dit extends dfw {
   public static final MapCodec<dit> a = b(dit::new);
   public static final dua b = dtq.aQ;
   protected static final exp c = dfw.a(0.0, 0.0, 0.0, 16.0, 15.0, 16.0);
   public static final int d = 7;

   @Override
   public MapCodec<dit> a() {
      return a;
   }

   protected dit(dsz.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Integer.valueOf(0)));
   }

   @Override
   protected dta a(dta $$0, ji $$1, dta $$2, dcv $$3, jd $$4, jd $$5) {
      if ($$1 == ji.b && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dta $$0, dcx $$1, jd $$2) {
      dta $$3 = $$1.a_($$2.c());
      return !$$3.e() || $$3.b() instanceof div || $$3.b() instanceof dss;
   }

   @Override
   public dta a(cyb $$0) {
      return !this.o().a((dcx)$$0.q(), $$0.a()) ? dfy.j.o() : super.a($$0);
   }

   @Override
   protected boolean f_(dta $$0) {
      return true;
   }

   @Override
   protected exp a(dta $$0, dca $$1, jd $$2, exb $$3) {
      return c;
   }

   @Override
   protected void a(dta $$0, aqt $$1, jd $$2, ayv $$3) {
      if (!$$0.a($$1, $$2)) {
         a(null, $$0, $$1, $$2);
      }
   }

   @Override
   protected void b(dta $$0, aqt $$1, jd $$2, ayv $$3) {
      int $$4 = $$0.c(b);
      if (!a((dcx)$$1, $$2) && !$$1.r($$2.c())) {
         if ($$4 > 0) {
            $$1.a($$2, $$0.a(b, Integer.valueOf($$4 - 1)), 2);
         } else if (!a((dca)$$1, $$2)) {
            a(null, $$0, $$1, $$2);
         }
      } else if ($$4 < 7) {
         $$1.a($$2, $$0.a(b, Integer.valueOf(7)), 2);
      }
   }

   @Override
   public void a(dcu $$0, dta $$1, jd $$2, bsq $$3, float $$4) {
      if (!$$0.B && $$0.z.i() < $$4 - 0.5F && $$3 instanceof btl && ($$3 instanceof cmv || $$0.ab().b(dcq.c)) && $$3.dk() * $$3.dk() * $$3.dl() > 0.512F) {
         a($$3, $$1, $$0, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static void a(@Nullable bsq $$0, dta $$1, dcu $$2, jd $$3) {
      dta $$4 = a($$1, dfy.j.o(), $$2, $$3);
      $$2.b($$3, $$4);
      $$2.a(dxw.c, $$3, dxw.a.a($$0, $$4));
   }

   private static boolean a(dca $$0, jd $$1) {
      return $$0.a_($$1.c()).a(awd.cx);
   }

   private static boolean a(dcx $$0, jd $$1) {
      for (jd $$2 : jd.c($$1.b(-4, 0, -4), $$1.b(4, 1, 4))) {
         if ($$0.b_($$2).a(awj.a)) {
            return true;
         }
      }

      return false;
   }

   @Override
   protected void a(dtb.a<dfw, dta> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(dta $$0, epn $$1) {
      return false;
   }
}
