import java.util.List;
import java.util.function.BooleanSupplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import javax.annotation.Nullable;

public class ddi extends ddn implements ddh {
   public static final int f = 8;
   public static final int g = 5;
   private ho<ciw> j = ho.a(5, ciw.b);
   private int k = -1;
   private long l;

   public ddi(gv $$0, dey $$1) {
      super(dcm.r, $$0, $$1);
   }

   @Override
   public void a(qs $$0) {
      super.a($$0);
      this.j = ho.a(this.b(), ciw.b);
      if (!this.d($$0)) {
         bgi.b($$0, this.j);
      }

      this.k = $$0.h("TransferCooldown");
   }

   @Override
   protected void b(qs $$0) {
      super.b($$0);
      if (!this.e($$0)) {
         bgi.a($$0, this.j);
      }

      $$0.a("TransferCooldown", this.k);
   }

   @Override
   public int b() {
      return this.j.size();
   }

   @Override
   public ciw a(int $$0, int $$1) {
      this.e(null);
      return bgi.a(this.f(), $$0, $$1);
   }

   @Override
   public void a(int $$0, ciw $$1) {
      this.e(null);
      this.f().set($$0, $$1);
      if ($$1.L() > this.ac_()) {
         $$1.f(this.ac_());
      }
   }

   @Override
   protected te g() {
      return te.c("container.hopper");
   }

   public static void a(cpk $$0, gv $$1, dey $$2, ddi $$3) {
      $$3.k--;
      $$3.l = $$0.V();
      if (!$$3.j()) {
         $$3.c(0);
         a($$0, $$1, $$2, $$3, () -> a($$0, (ddh)$$3));
      }
   }

   private static boolean a(cpk $$0, gv $$1, dey $$2, ddi $$3, BooleanSupplier $$4) {
      if ($$0.B) {
         return false;
      } else {
         if (!$$3.j() && $$2.c(cwc.b)) {
            boolean $$5 = false;
            if (!$$3.ab_()) {
               $$5 = a($$0, $$1, $$2, (bgh)$$3);
            }

            if (!$$3.i()) {
               $$5 |= $$4.getAsBoolean();
            }

            if ($$5) {
               $$3.c(8);
               a($$0, $$1, $$2);
               return true;
            }
         }

         return false;
      }
   }

   private boolean i() {
      for (ciw $$0 : this.j) {
         if ($$0.b() || $$0.L() != $$0.g()) {
            return false;
         }
      }

      return true;
   }

   private static boolean a(cpk $$0, gv $$1, dey $$2, bgh $$3) {
      bgh $$4 = b($$0, $$1, $$2);
      if ($$4 == null) {
         return false;
      } else {
         hb $$5 = $$2.c(cwc.a).g();
         if (b($$4, $$5)) {
            return false;
         } else {
            for (int $$6 = 0; $$6 < $$3.b(); $$6++) {
               if (!$$3.a($$6).b()) {
                  ciw $$7 = $$3.a($$6).p();
                  ciw $$8 = a($$3, $$4, $$3.a($$6, 1), $$5);
                  if ($$8.b()) {
                     $$4.e();
                     return true;
                  }

                  $$3.a($$6, $$7);
               }
            }

            return false;
         }
      }
   }

   private static IntStream a(bgh $$0, hb $$1) {
      return $$0 instanceof bgx ? IntStream.of(((bgx)$$0).a($$1)) : IntStream.range(0, $$0.b());
   }

   private static boolean b(bgh $$0, hb $$1) {
      return a($$0, $$1).allMatch($$1x -> {
         ciw $$2 = $$0.a($$1x);
         return $$2.L() >= $$2.g();
      });
   }

   private static boolean c(bgh $$0, hb $$1) {
      return a($$0, $$1).allMatch($$1x -> $$0.a($$1x).b());
   }

   public static boolean a(cpk $$0, ddh $$1) {
      bgh $$2 = c($$0, $$1);
      if ($$2 != null) {
         hb $$3 = hb.a;
         return c($$2, $$3) ? false : a($$2, $$3).anyMatch($$3x -> a($$1, $$2, $$3x, $$3));
      } else {
         for (bye $$4 : b($$0, $$1)) {
            if (a($$1, $$4)) {
               return true;
            }
         }

         return false;
      }
   }

   private static boolean a(ddh $$0, bgh $$1, int $$2, hb $$3) {
      ciw $$4 = $$1.a($$2);
      if (!$$4.b() && a($$0, $$1, $$4, $$2, $$3)) {
         ciw $$5 = $$4.p();
         ciw $$6 = a($$1, $$0, $$1.a($$2, 1), null);
         if ($$6.b()) {
            $$1.e();
            return true;
         }

         $$1.a($$2, $$5);
      }

      return false;
   }

   public static boolean a(bgh $$0, bye $$1) {
      boolean $$2 = false;
      ciw $$3 = $$1.j().p();
      ciw $$4 = a(null, $$0, $$3, null);
      if ($$4.b()) {
         $$2 = true;
         $$1.ak();
      } else {
         $$1.a($$4);
      }

      return $$2;
   }

   public static ciw a(@Nullable bgh $$0, bgh $$1, ciw $$2, @Nullable hb $$3) {
      if ($$1 instanceof bgx $$4 && $$3 != null) {
         int[] $$5 = $$4.a($$3);

         for (int $$6 = 0; $$6 < $$5.length && !$$2.b(); $$6++) {
            $$2 = b($$0, $$1, $$2, $$5[$$6], $$3);
         }

         return $$2;
      }

      int $$7 = $$1.b();

      for (int $$8 = 0; $$8 < $$7 && !$$2.b(); $$8++) {
         $$2 = b($$0, $$1, $$2, $$8, $$3);
      }

      return $$2;
   }

   private static boolean a(bgh $$0, ciw $$1, int $$2, @Nullable hb $$3) {
      if (!$$0.b($$2, $$1)) {
         return false;
      } else {
         if ($$0 instanceof bgx $$4 && !$$4.a($$2, $$1, $$3)) {
            return false;
         }

         return true;
      }
   }

   private static boolean a(bgh $$0, bgh $$1, ciw $$2, int $$3, hb $$4) {
      if (!$$1.a($$0, $$3, $$2)) {
         return false;
      } else {
         if ($$1 instanceof bgx $$5 && !$$5.b($$3, $$2, $$4)) {
            return false;
         }

         return true;
      }
   }

   private static ciw b(@Nullable bgh $$0, bgh $$1, ciw $$2, int $$3, @Nullable hb $$4) {
      ciw $$5 = $$1.a($$3);
      if (a($$1, $$2, $$3, $$4)) {
         boolean $$6 = false;
         boolean $$7 = $$1.ab_();
         if ($$5.b()) {
            $$1.a($$3, $$2);
            $$2 = ciw.b;
            $$6 = true;
         } else if (a($$5, $$2)) {
            int $$8 = $$2.g() - $$5.L();
            int $$9 = Math.min($$2.L(), $$8);
            $$2.h($$9);
            $$5.g($$9);
            $$6 = $$9 > 0;
         }

         if ($$6) {
            if ($$7 && $$1 instanceof ddi $$10 && !$$10.v()) {
               int $$11 = 0;
               if ($$0 instanceof ddi $$12 && $$10.l >= $$12.l) {
                  $$11 = 1;
               }

               $$10.c(8 - $$11);
            }

            $$1.e();
         }
      }

      return $$2;
   }

   @Nullable
   private static bgh b(cpk $$0, gv $$1, dey $$2) {
      hb $$3 = $$2.c(cwc.a);
      return a($$0, $$1.a($$3));
   }

   @Nullable
   private static bgh c(cpk $$0, ddh $$1) {
      return a($$0, $$1.G(), $$1.H() + 1.0, $$1.J());
   }

   public static List<bye> b(cpk $$0, ddh $$1) {
      return $$1.aq_()
         .e()
         .stream()
         .flatMap($$2 -> $$0.a(bye.class, $$2.d($$1.G() - 0.5, $$1.H() - 0.5, $$1.J() - 0.5), bij.a).stream())
         .collect(Collectors.toList());
   }

   @Nullable
   public static bgh a(cpk $$0, gv $$1) {
      return a($$0, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5);
   }

   @Nullable
   private static bgh a(cpk $$0, double $$1, double $$2, double $$3) {
      bgh $$4 = null;
      gv $$5 = gv.a($$1, $$2, $$3);
      dey $$6 = $$0.a_($$5);
      csk $$7 = $$6.b();
      if ($$7 instanceof bgy) {
         $$4 = ((bgy)$$7).a($$6, $$0, $$5);
      } else if ($$6.t()) {
         dck $$8 = $$0.c_($$5);
         if ($$8 instanceof bgh) {
            $$4 = (bgh)$$8;
            if ($$4 instanceof dcr && $$7 instanceof ctm) {
               $$4 = ctm.a((ctm)$$7, $$6, $$0, $$5, true);
            }
         }
      }

      if ($$4 == null) {
         List<big> $$9 = $$0.a((big)null, new eha($$1 - 0.5, $$2 - 0.5, $$3 - 0.5, $$1 + 0.5, $$2 + 0.5, $$3 + 0.5), bij.d);
         if (!$$9.isEmpty()) {
            $$4 = (bgh)$$9.get($$0.z.a($$9.size()));
         }
      }

      return $$4;
   }

   private static boolean a(ciw $$0, ciw $$1) {
      return $$0.L() <= $$0.g() && ciw.c($$0, $$1);
   }

   @Override
   public double G() {
      return (double)this.p.u() + 0.5;
   }

   @Override
   public double H() {
      return (double)this.p.v() + 0.5;
   }

   @Override
   public double J() {
      return (double)this.p.w() + 0.5;
   }

   private void c(int $$0) {
      this.k = $$0;
   }

   private boolean j() {
      return this.k > 0;
   }

   private boolean v() {
      return this.k > 8;
   }

   @Override
   protected ho<ciw> f() {
      return this.j;
   }

   @Override
   protected void a(ho<ciw> $$0) {
      this.j = $$0;
   }

   public static void a(cpk $$0, gv $$1, dey $$2, big $$3, ddi $$4) {
      if ($$3 instanceof bye && ehv.c(ehv.a($$3.cG().d((double)(-$$1.u()), (double)(-$$1.v()), (double)(-$$1.w()))), $$4.aq_(), ehj.i)) {
         a($$0, $$1, $$2, $$4, () -> a($$4, (bye)$$3));
      }
   }

   @Override
   protected cec a(int $$0, cbk $$1) {
      return new cez($$0, $$1, this);
   }
}
