import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class dfa extends djc implements dff, dmr {
   public static final MapCodec<dfa> a = b(dfa::new);
   private static final dtt f = dts.C;
   private static final int g = 6;
   protected static final exn b = dfc.a(5.0, 0.0, 9.0, 11.0, 16.0, 15.0);
   protected static final exn c = dfc.a(5.0, 0.0, 1.0, 11.0, 16.0, 7.0);
   protected static final exn d = dfc.a(1.0, 0.0, 5.0, 7.0, 16.0, 11.0);
   protected static final exn e = dfc.a(9.0, 0.0, 5.0, 15.0, 16.0, 11.0);

   @Override
   public MapCodec<dfa> a() {
      return a;
   }

   protected dfa(dtb.d $$0) {
      super($$0);
      this.k(this.E.b().a(f, Boolean.valueOf(false)).a(aE, iw.c));
   }

   @Override
   protected exn a(dtc $$0, dbg $$1, ir $$2, ewz $$3) {
      switch ((iw)$$0.c(aE)) {
         case d:
            return c;
         case c:
         default:
            return b;
         case e:
            return e;
         case f:
            return d;
      }
   }

   @Override
   protected void a(dtd.a<dfc, dtc> $$0) {
      $$0.a(f, aE);
   }

   @Override
   protected epe b_(dtc $$0) {
      return $$0.c(f) ? epf.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dtc $$0, dcd $$1, ir $$2) {
      ir $$3 = $$2.d();
      dtc $$4 = $$1.a_($$3);
      dtc $$5 = $$1.a_($$2.c());
      return ($$4.a(this) || $$4.a(awe.bA)) && ($$5.a(this) || $$5.a(dfe.ua));
   }

   protected static boolean a(dcb $$0, ir $$1, epe $$2, iw $$3) {
      dtc $$4 = dfe.ub.n().a(f, Boolean.valueOf($$2.a(epf.c))).a(aE, $$3);
      return $$0.a($$1, $$4, 3);
   }

   @Override
   protected dtc a(dtc $$0, iw $$1, dtc $$2, dcb $$3, ir $$4, ir $$5) {
      if (($$1 == iw.a || $$1 == iw.b) && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      if ($$0.c(f)) {
         $$3.a($$4, epf.c, epf.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dtc $$0, aqt $$1, ir $$2, ayt $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   public boolean b(dcd $$0, ir $$1, dtc $$2) {
      Optional<ir> $$3 = l.a($$0, $$1, $$2.b(), iw.b, dfe.ua);
      if ($$3.isEmpty()) {
         return false;
      } else {
         ir $$4 = $$3.get().c();
         dtc $$5 = $$0.a_($$4);
         return dez.a($$0, $$4, $$5);
      }
   }

   @Override
   public boolean a(dca $$0, ayt $$1, ir $$2, dtc $$3) {
      return true;
   }

   @Override
   public void a(aqt $$0, ayt $$1, ir $$2, dtc $$3) {
      Optional<ir> $$4 = l.a($$0, $$2, $$3.b(), iw.b, dfe.ua);
      if (!$$4.isEmpty()) {
         ir $$5 = $$4.get();
         ir $$6 = $$5.c();
         iw $$7 = $$3.c(aE);
         a($$0, $$5, $$0.b_($$5), $$7);
         dez.a($$0, $$6, $$0.b_($$6), $$7);
      }
   }

   @Override
   public cuh a(dcd $$0, ir $$1, dtc $$2) {
      return new cuh(dfe.ua);
   }
}
