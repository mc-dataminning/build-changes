import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dkd extends dfc {
   public static final MapCodec<dkd> a = b(dkd::new);
   private static final float e = 0.9F;
   private static final float f = 1.5F;
   public static final int b = 8;
   public static final duc c = dts.aF;
   protected static final exn[] d = dmz.d;

   @Override
   protected MapCodec<dkd> a() {
      return a;
   }

   protected dkd(dtb.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(1)));
   }

   @Override
   protected boolean a(dtc $$0, ept $$1) {
      return true;
   }

   @Override
   protected exn a(dtc $$0, dbg $$1, ir $$2, ewz $$3) {
      return d[$$0.c(c)];
   }

   @Override
   protected exn b_(dtc $$0, dbg $$1, ir $$2) {
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

   @Override
   protected exn g(dtc $$0, dbg $$1, ir $$2) {
      return exk.a();
   }

   @Override
   protected exn b(dtc $$0, dbg $$1, ir $$2, ewz $$3) {
      return exk.a();
   }

   @Override
   protected exn c(dtc $$0, dbg $$1, ir $$2, ewz $$3) {
      return exk.a();
   }

   @Override
   protected void a(dtc $$0, dca $$1, ir $$2, brv $$3) {
      if (!($$3 instanceof bso) || $$3.dv().a(this)) {
         $$3.a($$0, new ewu(0.9F, 1.5, 0.9F));
      }

      int $$4 = $$0.c(c);
      if ($$3 instanceof bso $$5) {
         $$5.b(new brh(brj.I, 100 + $$4 * 20));
      }
   }

   @Override
   protected bqc a(cuh $$0, dtc $$1, dca $$2, ir $$3, cly $$4, bpz $$5, ewq $$6) {
      return $$0.a(this.q()) ? bqc.e : bqc.d;
   }

   @Override
   protected bqa a(dtc $$0, dca $$1, ir $$2, cly $$3, ewq $$4) {
      if (!$$3.t(false)) {
         return bqa.d;
      } else {
         $$3.gx().a(2, 0.1F);
         int $$5 = $$0.c(c);
         $$1.a($$3, dxv.m, $$2);
         if ($$5 > 1) {
            $$1.a($$2, $$0.a(c, Integer.valueOf($$5 - 1)), 3);
         } else {
            $$1.a($$2, false);
            $$1.a($$3, dxv.f, $$2);
         }

         return bqa.a($$1.x_());
      }
   }
}
