import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dif extends dfi {
   public static final MapCodec<dif> a = b(dif::new);
   public static final dtl b = dtb.aQ;
   protected static final exa c = dfi.a(0.0, 0.0, 0.0, 16.0, 15.0, 16.0);
   public static final int d = 7;

   @Override
   public MapCodec<dif> a() {
      return a;
   }

   protected dif(dsk.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Integer.valueOf(0)));
   }

   @Override
   protected dsl a(dsl $$0, jf $$1, dsl $$2, dch $$3, ja $$4, ja $$5) {
      if ($$1 == jf.b && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dsl $$0, dcj $$1, ja $$2) {
      dsl $$3 = $$1.a_($$2.c());
      return !$$3.e() || $$3.b() instanceof dih || $$3.b() instanceof dsd;
   }

   @Override
   public dsl a(cxn $$0) {
      return !this.o().a((dcj)$$0.q(), $$0.a()) ? dfk.j.o() : super.a($$0);
   }

   @Override
   protected boolean f_(dsl $$0) {
      return true;
   }

   @Override
   protected exa a(dsl $$0, dbm $$1, ja $$2, ewm $$3) {
      return c;
   }

   @Override
   protected void a(dsl $$0, aqm $$1, ja $$2, ayo $$3) {
      if (!$$0.a($$1, $$2)) {
         a(null, $$0, $$1, $$2);
      }
   }

   @Override
   protected void b(dsl $$0, aqm $$1, ja $$2, ayo $$3) {
      int $$4 = $$0.c(b);
      if (!a((dcj)$$1, $$2) && !$$1.r($$2.c())) {
         if ($$4 > 0) {
            $$1.a($$2, $$0.a(b, Integer.valueOf($$4 - 1)), 2);
         } else if (!a((dbm)$$1, $$2)) {
            a(null, $$0, $$1, $$2);
         }
      } else if ($$4 < 7) {
         $$1.a($$2, $$0.a(b, Integer.valueOf(7)), 2);
      }
   }

   @Override
   public void a(dcg $$0, dsl $$1, ja $$2, bsh $$3, float $$4) {
      if (!$$0.B && $$0.z.i() < $$4 - 0.5F && $$3 instanceof btc && ($$3 instanceof cml || $$0.ab().b(dcc.c)) && $$3.dl() * $$3.dl() * $$3.dm() > 0.512F) {
         a($$3, $$1, $$0, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static void a(@Nullable bsh $$0, dsl $$1, dcg $$2, ja $$3) {
      dsl $$4 = a($$1, dfk.j.o(), $$2, $$3);
      $$2.b($$3, $$4);
      $$2.a(dxh.c, $$3, dxh.a.a($$0, $$4));
   }

   private static boolean a(dbm $$0, ja $$1) {
      return $$0.a_($$1.c()).a(avw.cx);
   }

   private static boolean a(dcj $$0, ja $$1) {
      for (ja $$2 : ja.c($$1.b(-4, 0, -4), $$1.b(4, 1, 4))) {
         if ($$0.b_($$2).a(awc.a)) {
            return true;
         }
      }

      return false;
   }

   @Override
   protected void a(dsm.a<dfi, dsl> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(dsl $$0, eoy $$1) {
      return false;
   }
}
