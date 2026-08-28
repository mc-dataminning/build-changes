import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class die extends dfh {
   public static final MapCodec<die> a = b(die::new);
   public static final dtk b = dta.aQ;
   protected static final ewy c = dfh.a(0.0, 0.0, 0.0, 16.0, 15.0, 16.0);
   public static final int d = 7;

   @Override
   public MapCodec<die> a() {
      return a;
   }

   protected die(dsj.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Integer.valueOf(0)));
   }

   @Override
   protected dsk a(dsk $$0, jf $$1, dsk $$2, dcg $$3, ja $$4, ja $$5) {
      if ($$1 == jf.b && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dsk $$0, dci $$1, ja $$2) {
      dsk $$3 = $$1.a_($$2.c());
      return !$$3.e() || $$3.b() instanceof dig || $$3.b() instanceof dsc;
   }

   @Override
   public dsk a(cxm $$0) {
      return !this.o().a((dci)$$0.q(), $$0.a()) ? dfj.j.o() : super.a($$0);
   }

   @Override
   protected boolean f_(dsk $$0) {
      return true;
   }

   @Override
   protected ewy a(dsk $$0, dbl $$1, ja $$2, ewk $$3) {
      return c;
   }

   @Override
   protected void a(dsk $$0, aqm $$1, ja $$2, ayo $$3) {
      if (!$$0.a($$1, $$2)) {
         a(null, $$0, $$1, $$2);
      }
   }

   @Override
   protected void b(dsk $$0, aqm $$1, ja $$2, ayo $$3) {
      int $$4 = $$0.c(b);
      if (!a((dci)$$1, $$2) && !$$1.r($$2.c())) {
         if ($$4 > 0) {
            $$1.a($$2, $$0.a(b, Integer.valueOf($$4 - 1)), 2);
         } else if (!a((dbl)$$1, $$2)) {
            a(null, $$0, $$1, $$2);
         }
      } else if ($$4 < 7) {
         $$1.a($$2, $$0.a(b, Integer.valueOf(7)), 2);
      }
   }

   @Override
   public void a(dcf $$0, dsk $$1, ja $$2, bsg $$3, float $$4) {
      if (!$$0.B && $$0.z.i() < $$4 - 0.5F && $$3 instanceof btb && ($$3 instanceof cmk || $$0.ab().b(dcb.c)) && $$3.dk() * $$3.dk() * $$3.dl() > 0.512F) {
         a($$3, $$1, $$0, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static void a(@Nullable bsg $$0, dsk $$1, dcf $$2, ja $$3) {
      dsk $$4 = a($$1, dfj.j.o(), $$2, $$3);
      $$2.b($$3, $$4);
      $$2.a(dxg.c, $$3, dxg.a.a($$0, $$4));
   }

   private static boolean a(dbl $$0, ja $$1) {
      return $$0.a_($$1.c()).a(avw.cx);
   }

   private static boolean a(dci $$0, ja $$1) {
      for (ja $$2 : ja.c($$1.b(-4, 0, -4), $$1.b(4, 1, 4))) {
         if ($$0.b_($$2).a(awc.a)) {
            return true;
         }
      }

      return false;
   }

   @Override
   protected void a(dsl.a<dfh, dsk> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(dsk $$0, eow $$1) {
      return false;
   }
}
