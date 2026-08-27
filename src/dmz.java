import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dmz extends dfc {
   public static final MapCodec<dmz> a = b(dmz::new);
   public static final int b = 8;
   public static final duc c = dts.aF;
   protected static final exn[] d = new exn[]{
      exk.a(),
      dfc.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      dfc.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      dfc.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      dfc.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      dfc.a(0.0, 0.0, 0.0, 16.0, 10.0, 16.0),
      dfc.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0),
      dfc.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0),
      dfc.a(0.0, 0.0, 0.0, 16.0, 16.0, 16.0)
   };
   public static final int e = 5;

   @Override
   public MapCodec<dmz> a() {
      return a;
   }

   protected dmz(dtb.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(1)));
   }

   @Override
   protected boolean a(dtc $$0, ept $$1) {
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
   protected exn a(dtc $$0, dbg $$1, ir $$2, ewz $$3) {
      return d[$$0.c(c)];
   }

   @Override
   protected exn b(dtc $$0, dbg $$1, ir $$2, ewz $$3) {
      return d[$$0.c(c) - 1];
   }

   @Override
   protected exn b_(dtc $$0, dbg $$1, ir $$2) {
      return d[$$0.c(c)];
   }

   @Override
   protected exn c(dtc $$0, dbg $$1, ir $$2, ewz $$3) {
      return d[$$0.c(c)];
   }

   @Override
   protected boolean f_(dtc $$0) {
      return true;
   }

   @Override
   protected float d(dtc $$0, dbg $$1, ir $$2) {
      return $$0.c(c) == 8 ? 0.2F : 1.0F;
   }

   @Override
   protected boolean a(dtc $$0, dcd $$1, ir $$2) {
      dtc $$3 = $$1.a_($$2.d());
      if ($$3.a(awe.cr)) {
         return false;
      } else {
         return $$3.a(awe.cs) ? true : dfc.a($$3.k($$1, $$2.d()), iw.b) || $$3.a(this) && $$3.c(c) == 8;
      }
   }

   @Override
   protected dtc a(dtc $$0, iw $$1, dtc $$2, dcb $$3, ir $$4, ir $$5) {
      return !$$0.a($$3, $$4) ? dfe.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void b(dtc $$0, aqt $$1, ir $$2, ayt $$3) {
      if ($$1.a(dcj.b, $$2) > 11) {
         c($$0, $$1, $$2);
         $$1.a($$2, false);
      }
   }

   @Override
   protected boolean a(dtc $$0, cyd $$1) {
      int $$2 = $$0.c(c);
      if (!$$1.n().a(this.q()) || $$2 >= 8) {
         return $$2 == 1;
      } else {
         return $$1.c() ? $$1.k() == iw.b : true;
      }
   }

   @Nullable
   @Override
   public dtc a(cyd $$0) {
      dtc $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         int $$2 = $$1.c(c);
         return $$1.a(c, Integer.valueOf(Math.min(8, $$2 + 1)));
      } else {
         return super.a($$0);
      }
   }

   @Override
   protected void a(dtd.a<dfc, dtc> $$0) {
      $$0.a(c);
   }
}
