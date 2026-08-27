import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dbl extends cyo {
   public static final MapCodec<dbl> a = b(dbl::new);
   public static final dmf b = dlv.aQ;
   protected static final eol c = cyo.a(0.0, 0.0, 0.0, 16.0, 15.0, 16.0);
   public static final int d = 7;

   @Override
   public MapCodec<dbl> a() {
      return a;
   }

   protected dbl(dle.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Integer.valueOf(0)));
   }

   @Override
   protected dlf a(dlf $$0, ie $$1, dlf $$2, cvo $$3, hz $$4, hz $$5) {
      if ($$1 == ie.b && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dlf $$0, cvq $$1, hz $$2) {
      dlf $$3 = $$1.a_($$2.c());
      return !$$3.e() || $$3.b() instanceof dbn || $$3.b() instanceof dkx;
   }

   @Override
   public dlf a(crg $$0) {
      return !this.o().a((cvq)$$0.q(), $$0.a()) ? cyq.j.o() : super.a($$0);
   }

   @Override
   protected boolean g_(dlf $$0) {
      return true;
   }

   @Override
   protected eol a(dlf $$0, cut $$1, hz $$2, enx $$3) {
      return c;
   }

   @Override
   protected void a(dlf $$0, aov $$1, hz $$2, awo $$3) {
      if (!$$0.a($$1, $$2)) {
         a(null, $$0, $$1, $$2);
      }
   }

   @Override
   protected void b(dlf $$0, aov $$1, hz $$2, awo $$3) {
      int $$4 = $$0.c(b);
      if (!a((cvq)$$1, $$2) && !$$1.r($$2.c())) {
         if ($$4 > 0) {
            $$1.a($$2, $$0.a(b, Integer.valueOf($$4 - 1)), 2);
         } else if (!a((cut)$$1, $$2)) {
            a(null, $$0, $$1, $$2);
         }
      } else if ($$4 < 7) {
         $$1.a($$2, $$0.a(b, Integer.valueOf(7)), 2);
      }
   }

   @Override
   public void a(cvn $$0, dlf $$1, hz $$2, bno $$3, float $$4) {
      if (!$$0.B && $$0.z.i() < $$4 - 0.5F && $$3 instanceof bog && ($$3 instanceof chh || $$0.Z().b(cvj.c)) && $$3.dg() * $$3.dg() * $$3.dh() > 0.512F) {
         a($$3, $$1, $$0, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static void a(@Nullable bno $$0, dlf $$1, cvn $$2, hz $$3) {
      dlf $$4 = a($$1, cyq.j.o(), $$2, $$3);
      $$2.b($$3, $$4);
      $$2.a(dpp.c, $$3, dpp.a.a($$0, $$4));
   }

   private static boolean a(cut $$0, hz $$1) {
      return $$0.a_($$1.c()).a(atz.cq);
   }

   private static boolean a(cvq $$0, hz $$1) {
      for (hz $$2 : hz.a($$1.b(-4, 0, -4), $$1.b(4, 1, 4))) {
         if ($$0.b_($$2).a(aue.a)) {
            return true;
         }
      }

      return false;
   }

   @Override
   protected void a(dlg.a<cyo, dlf> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(dlf $$0, cut $$1, hz $$2, ehf $$3) {
      return false;
   }
}
