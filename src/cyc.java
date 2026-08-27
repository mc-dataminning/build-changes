import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cyc extends cvf {
   public static final MapCodec<cyc> a = b(cyc::new);
   public static final din b = did.aQ;
   protected static final eks c = cvf.a(0.0, 0.0, 0.0, 16.0, 15.0, 16.0);
   public static final int d = 7;

   @Override
   public MapCodec<cyc> a() {
      return a;
   }

   protected cyc(dhm.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Integer.valueOf(0)));
   }

   @Override
   public dhn a(dhn $$0, ib $$1, dhn $$2, csg $$3, hx $$4, hx $$5) {
      if ($$1 == ib.b && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dhn $$0, csi $$1, hx $$2) {
      dhn $$3 = $$1.a_($$2.c());
      return !$$3.e() || $$3.b() instanceof cye || $$3.b() instanceof dhf;
   }

   @Override
   public dhn a(cnw $$0) {
      return !this.o().a((csi)$$0.q(), $$0.a()) ? cvh.j.o() : super.a($$0);
   }

   @Override
   public boolean g_(dhn $$0) {
      return true;
   }

   @Override
   public eks a(dhn $$0, crl $$1, hx $$2, eke $$3) {
      return c;
   }

   @Override
   public void a(dhn $$0, ami $$1, hx $$2, atw $$3) {
      if (!$$0.a($$1, $$2)) {
         a(null, $$0, $$1, $$2);
      }
   }

   @Override
   public void b(dhn $$0, ami $$1, hx $$2, atw $$3) {
      int $$4 = $$0.c(b);
      if (!a((csi)$$1, $$2) && !$$1.q($$2.c())) {
         if ($$4 > 0) {
            $$1.a($$2, $$0.a(b, Integer.valueOf($$4 - 1)), 2);
         } else if (!a((crl)$$1, $$2)) {
            a(null, $$0, $$1, $$2);
         }
      } else if ($$4 < 7) {
         $$1.a($$2, $$0.a(b, Integer.valueOf(7)), 2);
      }
   }

   @Override
   public void a(csf $$0, dhn $$1, hx $$2, bkv $$3, float $$4) {
      if (!$$0.B && $$0.z.i() < $$4 - 0.5F && $$3 instanceof bll && ($$3 instanceof cdz || $$0.Y().b(csb.c)) && $$3.dh() * $$3.dh() * $$3.di() > 0.512F) {
         a($$3, $$1, $$0, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static void a(@Nullable bkv $$0, dhn $$1, csf $$2, hx $$3) {
      dhn $$4 = a($$1, cvh.j.o(), $$2, $$3);
      $$2.b($$3, $$4);
      $$2.a(dlx.c, $$3, dlx.a.a($$0, $$4));
   }

   private static boolean a(crl $$0, hx $$1) {
      return $$0.a_($$1.c()).a(ark.cp);
   }

   private static boolean a(csi $$0, hx $$1) {
      for (hx $$2 : hx.a($$1.b(-4, 0, -4), $$1.b(4, 1, 4))) {
         if ($$0.b_($$2).a(arp.a)) {
            return true;
         }
      }

      return false;
   }

   @Override
   protected void a(dho.a<cvf, dhn> $$0) {
      $$0.a(b);
   }

   @Override
   public boolean a(dhn $$0, crl $$1, hx $$2, edn $$3) {
      return false;
   }
}
