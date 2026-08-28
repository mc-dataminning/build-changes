import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dmr extends dfi {
   public static final MapCodec<dmr> a = b(dmr::new);
   public static final int b = 8;
   public static final dtl c = dtb.aF;
   protected static final exa[] d = new exa[]{
      ewx.a(),
      dfi.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      dfi.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      dfi.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      dfi.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      dfi.a(0.0, 0.0, 0.0, 16.0, 10.0, 16.0),
      dfi.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0),
      dfi.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0),
      dfi.a(0.0, 0.0, 0.0, 16.0, 16.0, 16.0)
   };
   public static final int e = 5;

   @Override
   public MapCodec<dmr> a() {
      return a;
   }

   protected dmr(dsk.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(1)));
   }

   @Override
   protected boolean a(dsl $$0, eoy $$1) {
      switch ($$1) {
         case a:
            return $$0.c(c) < 5;
         case b:
            return false;
         case c:
            return false;
         default:
            return false;
      }
   }

   @Override
   protected exa a(dsl $$0, dbm $$1, ja $$2, ewm $$3) {
      return d[$$0.c(c)];
   }

   @Override
   protected exa b(dsl $$0, dbm $$1, ja $$2, ewm $$3) {
      return d[$$0.c(c) - 1];
   }

   @Override
   protected exa b_(dsl $$0, dbm $$1, ja $$2) {
      return d[$$0.c(c)];
   }

   @Override
   protected exa c(dsl $$0, dbm $$1, ja $$2, ewm $$3) {
      return d[$$0.c(c)];
   }

   @Override
   protected boolean f_(dsl $$0) {
      return true;
   }

   @Override
   protected float d(dsl $$0, dbm $$1, ja $$2) {
      return $$0.c(c) == 8 ? 0.2F : 1.0F;
   }

   @Override
   protected boolean a(dsl $$0, dcj $$1, ja $$2) {
      dsl $$3 = $$1.a_($$2.d());
      if ($$3.a(avw.co)) {
         return false;
      } else {
         return $$3.a(avw.cp) ? true : dfi.a($$3.k($$1, $$2.d()), jf.b) || $$3.a(this) && $$3.c(c) == 8;
      }
   }

   @Override
   protected dsl a(dsl $$0, jf $$1, dsl $$2, dch $$3, ja $$4, ja $$5) {
      return !$$0.a($$3, $$4) ? dfk.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void b(dsl $$0, aqm $$1, ja $$2, ayo $$3) {
      if ($$1.a(dcp.b, $$2) > 11) {
         c($$0, $$1, $$2);
         $$1.a($$2, false);
      }
   }

   @Override
   protected boolean a(dsl $$0, cxn $$1) {
      int $$2 = $$0.c(c);
      if (!$$1.n().a(this.r()) || $$2 >= 8) {
         return $$2 == 1;
      } else {
         return $$1.c() ? $$1.k() == jf.b : true;
      }
   }

   @Nullable
   @Override
   public dsl a(cxn $$0) {
      dsl $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         int $$2 = $$1.c(c);
         return $$1.a(c, Integer.valueOf(Math.min(8, $$2 + 1)));
      } else {
         return super.a($$0);
      }
   }

   @Override
   protected void a(dsm.a<dfi, dsl> $$0) {
      $$0.a(c);
   }
}
