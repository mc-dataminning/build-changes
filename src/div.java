import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class div extends dfy {
   public static final MapCodec<div> a = b(div::new);
   public static final duc b = dts.aQ;
   protected static final exv c = dfy.a(0.0, 0.0, 0.0, 16.0, 15.0, 16.0);
   public static final int d = 7;

   @Override
   public MapCodec<div> a() {
      return a;
   }

   protected div(dtb.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Integer.valueOf(0)));
   }

   @Override
   protected dtc a(dtc $$0, ji $$1, dtc $$2, dcx $$3, jd $$4, jd $$5) {
      if ($$1 == ji.b && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dtc $$0, dcz $$1, jd $$2) {
      dtc $$3 = $$1.a_($$2.d());
      return !$$3.e() || $$3.b() instanceof dix || $$3.b() instanceof dsu;
   }

   @Override
   public dtc a(cyd $$0) {
      return !this.o().a((dcz)$$0.q(), $$0.a()) ? dga.j.o() : super.a($$0);
   }

   @Override
   protected boolean f_(dtc $$0) {
      return true;
   }

   @Override
   protected exv a(dtc $$0, dcc $$1, jd $$2, exh $$3) {
      return c;
   }

   @Override
   protected void a(dtc $$0, aqu $$1, jd $$2, ayw $$3) {
      if (!$$0.a($$1, $$2)) {
         a(null, $$0, $$1, $$2);
      }
   }

   @Override
   protected void b(dtc $$0, aqu $$1, jd $$2, ayw $$3) {
      int $$4 = $$0.c(b);
      if (!a((dcz)$$1, $$2) && !$$1.r($$2.d())) {
         if ($$4 > 0) {
            $$1.a($$2, $$0.a(b, Integer.valueOf($$4 - 1)), 2);
         } else if (!a((dcc)$$1, $$2)) {
            a(null, $$0, $$1, $$2);
         }
      } else if ($$4 < 7) {
         $$1.a($$2, $$0.a(b, Integer.valueOf(7)), 2);
      }
   }

   @Override
   public void a(dcw $$0, dtc $$1, jd $$2, bsr $$3, float $$4) {
      if (!$$0.B && $$0.z.i() < $$4 - 0.5F && $$3 instanceof btn && ($$3 instanceof cmx || $$0.ab().b(dcs.c)) && $$3.dj() * $$3.dj() * $$3.dk() > 0.512F) {
         a($$3, $$1, $$0, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static void a(@Nullable bsr $$0, dtc $$1, dcw $$2, jd $$3) {
      dtc $$4 = a($$1, dga.j.o(), $$2, $$3);
      $$2.b($$3, $$4);
      $$2.a(dxz.c, $$3, dxz.a.a($$0, $$4));
   }

   private static boolean a(dcc $$0, jd $$1) {
      return $$0.a_($$1.d()).a(awe.cy);
   }

   private static boolean a(dcz $$0, jd $$1) {
      for (jd $$2 : jd.c($$1.b(-4, 0, -4), $$1.b(4, 1, 4))) {
         if ($$0.b_($$2).a(awk.a)) {
            return true;
         }
      }

      return false;
   }

   @Override
   protected void a(dtd.a<dfy, dtc> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(dtc $$0, ept $$1) {
      return false;
   }
}
