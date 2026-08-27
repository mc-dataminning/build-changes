import com.mojang.serialization.MapCodec;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dex extends den {
   public static final MapCodec<dex> a = b(dex::new);
   public static final dtw b = djc.aE;
   public static final dua<dtq> c = dts.V;
   public static final dtt d = dts.w;
   private static final exn f = dfc.a(0.0, 0.0, 4.0, 16.0, 16.0, 12.0);
   private static final exn g = dfc.a(4.0, 0.0, 0.0, 12.0, 16.0, 16.0);
   private static final exn h = dfc.a(5.0, 6.0, 5.0, 11.0, 13.0, 11.0);
   private static final exn i = dfc.a(4.0, 4.0, 4.0, 12.0, 6.0, 12.0);
   private static final exn j = exk.a(i, h);
   private static final exn k = exk.a(j, dfc.a(7.0, 13.0, 0.0, 9.0, 15.0, 16.0));
   private static final exn l = exk.a(j, dfc.a(0.0, 13.0, 7.0, 16.0, 15.0, 9.0));
   private static final exn m = exk.a(j, dfc.a(0.0, 13.0, 7.0, 13.0, 15.0, 9.0));
   private static final exn n = exk.a(j, dfc.a(3.0, 13.0, 7.0, 16.0, 15.0, 9.0));
   private static final exn o = exk.a(j, dfc.a(7.0, 13.0, 0.0, 9.0, 15.0, 13.0));
   private static final exn F = exk.a(j, dfc.a(7.0, 13.0, 3.0, 9.0, 15.0, 16.0));
   private static final exn G = exk.a(j, dfc.a(7.0, 13.0, 7.0, 9.0, 16.0, 9.0));
   public static final int e = 1;

   @Override
   public MapCodec<dex> a() {
      return a;
   }

   public dex(dtb.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, iw.c).a(c, dtq.a).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dtc $$0, dca $$1, ir $$2, dfc $$3, ir $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2);
      if ($$6 != $$0.c(d)) {
         if ($$6) {
            this.a($$1, $$2, null);
         }

         $$1.a($$2, $$0.a(d, Boolean.valueOf($$6)), 3);
      }
   }

   @Override
   protected void a(dca $$0, dtc $$1, ewq $$2, cms $$3) {
      brv $$4 = $$3.t();
      cly $$5 = $$4 instanceof cly ? (cly)$$4 : null;
      this.a($$0, $$1, $$2, $$5, true);
   }

   @Override
   protected bqa a(dtc $$0, dca $$1, ir $$2, cly $$3, ewq $$4) {
      return this.a($$1, $$0, $$4, $$3, true) ? bqa.a($$1.C) : bqa.d;
   }

   public boolean a(dca $$0, dtc $$1, ewq $$2, @Nullable cly $$3, boolean $$4) {
      iw $$5 = $$2.b();
      ir $$6 = $$2.a();
      boolean $$7 = !$$4 || this.a($$1, $$5, $$2.e().d - (double)$$6.v());
      if ($$7) {
         boolean $$8 = this.a($$3, $$0, $$6, $$5);
         if ($$8 && $$3 != null) {
            $$3.a(avz.aA);
         }

         return true;
      } else {
         return false;
      }
   }

   private boolean a(dtc $$0, iw $$1, double $$2) {
      if ($$1.o() != iw.a.b && !($$2 > 0.8124F)) {
         iw $$3 = $$0.c(b);
         dtq $$4 = $$0.c(c);
         switch ($$4) {
            case a:
               return $$3.o() == $$1.o();
            case c:
            case d:
               return $$3.o() != $$1.o();
            case b:
               return true;
            default:
               return false;
         }
      } else {
         return false;
      }
   }

   public boolean a(dca $$0, ir $$1, @Nullable iw $$2) {
      return this.a(null, $$0, $$1, $$2);
   }

   public boolean a(@Nullable brv $$0, dca $$1, ir $$2, @Nullable iw $$3) {
      dqc $$4 = $$1.c_($$2);
      if (!$$1.C && $$4 instanceof dpz) {
         if ($$3 == null) {
            $$3 = $$1.a_($$2).c(b);
         }

         ((dpz)$$4).a($$3);
         $$1.a(null, $$2, avo.ce, avq.e, 2.0F, 1.0F);
         $$1.a($$0, dxv.c, $$2);
         return true;
      } else {
         return false;
      }
   }

   private exn m(dtc $$0) {
      iw $$1 = $$0.c(b);
      dtq $$2 = $$0.c(c);
      if ($$2 == dtq.a) {
         return $$1 != iw.c && $$1 != iw.d ? g : f;
      } else if ($$2 == dtq.b) {
         return G;
      } else if ($$2 == dtq.d) {
         return $$1 != iw.c && $$1 != iw.d ? l : k;
      } else if ($$1 == iw.c) {
         return o;
      } else if ($$1 == iw.d) {
         return F;
      } else {
         return $$1 == iw.f ? n : m;
      }
   }

   @Override
   protected exn b(dtc $$0, dbg $$1, ir $$2, ewz $$3) {
      return this.m($$0);
   }

   @Override
   protected exn a(dtc $$0, dbg $$1, ir $$2, ewz $$3) {
      return this.m($$0);
   }

   @Override
   protected dlw a_(dtc $$0) {
      return dlw.c;
   }

   @Nullable
   @Override
   public dtc a(cyd $$0) {
      iw $$1 = $$0.k();
      ir $$2 = $$0.a();
      dca $$3 = $$0.q();
      iw.a $$4 = $$1.o();
      if ($$4 == iw.a.b) {
         dtc $$5 = this.n().a(c, $$1 == iw.a ? dtq.b : dtq.a).a(b, $$0.g());
         if ($$5.a((dcd)$$0.q(), $$2)) {
            return $$5;
         }
      } else {
         boolean $$6 = $$4 == iw.a.a && $$3.a_($$2.g()).d($$3, $$2.g(), iw.f) && $$3.a_($$2.h()).d($$3, $$2.h(), iw.e)
            || $$4 == iw.a.c && $$3.a_($$2.e()).d($$3, $$2.e(), iw.d) && $$3.a_($$2.f()).d($$3, $$2.f(), iw.c);
         dtc $$7 = this.n().a(b, $$1.g()).a(c, $$6 ? dtq.d : dtq.c);
         if ($$7.a((dcd)$$0.q(), $$0.a())) {
            return $$7;
         }

         boolean $$8 = $$3.a_($$2.d()).d($$3, $$2.d(), iw.b);
         $$7 = $$7.a(c, $$8 ? dtq.a : dtq.b);
         if ($$7.a((dcd)$$0.q(), $$0.a())) {
            return $$7;
         }
      }

      return null;
   }

   @Override
   protected void a(dtc $$0, dca $$1, ir $$2, dbs $$3, BiConsumer<cuh, ir> $$4) {
      if ($$3.j() == dbs.a.d && !$$1.x_()) {
         this.a($$1, $$2, null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected dtc a(dtc $$0, iw $$1, dtc $$2, dcb $$3, ir $$4, ir $$5) {
      dtq $$6 = $$0.c(c);
      iw $$7 = n($$0).g();
      if ($$7 == $$1 && !$$0.a($$3, $$4) && $$6 != dtq.d) {
         return dfe.a.n();
      } else {
         if ($$1.o() == $$0.c(b).o()) {
            if ($$6 == dtq.d && !$$2.d($$3, $$5, $$1)) {
               return $$0.a(c, dtq.c).a(b, $$1.g());
            }

            if ($$6 == dtq.c && $$7.g() == $$1 && $$2.d($$3, $$5, $$0.c(b))) {
               return $$0.a(c, dtq.d);
            }
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   protected boolean a(dtc $$0, dcd $$1, ir $$2) {
      iw $$3 = n($$0).g();
      return $$3 == iw.b ? dfc.a($$1, $$2.c(), iw.a) : dhz.b($$1, $$2, $$3);
   }

   private static iw n(dtc $$0) {
      switch ((dtq)$$0.c(c)) {
         case a:
            return iw.b;
         case b:
            return iw.a;
         default:
            return $$0.c(b).g();
      }
   }

   @Override
   protected void a(dtd.a<dfc, dtc> $$0) {
      $$0.a(b, c, d);
   }

   @Nullable
   @Override
   public dqc a(ir $$0, dtc $$1) {
      return new dpz($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dqc> dqd<T> a(dca $$0, dtc $$1, dqe<T> $$2) {
      return a($$2, dqe.F, $$0.C ? dpz::a : dpz::b);
   }

   @Override
   protected boolean a(dtc $$0, ept $$1) {
      return false;
   }

   @Override
   public dtc a(dtc $$0, dmd $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dtc a(dtc $$0, dke $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }
}
