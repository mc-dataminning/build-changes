import java.util.List;
import java.util.function.BooleanSupplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import javax.annotation.Nullable;

public class dfq extends dfv implements dfp {
   public static final int f = 8;
   public static final int g = 5;
   private il<clb> h = il.a(5, clb.b);
   private int i = -1;
   private long j;

   public dfq(ht $$0, dgw $$1) {
      super(det.r, $$0, $$1);
   }

   @Override
   public void a(rz $$0) {
      super.a($$0);
      this.h = il.a(this.b(), clb.b);
      if (!this.d($$0)) {
         bik.b($$0, this.h);
      }

      this.i = $$0.h("TransferCooldown");
   }

   @Override
   protected void b(rz $$0) {
      super.b($$0);
      if (!this.e($$0)) {
         bik.a($$0, this.h);
      }

      $$0.a("TransferCooldown", this.i);
   }

   @Override
   public int b() {
      return this.h.size();
   }

   @Override
   public clb a(int $$0, int $$1) {
      this.e(null);
      return bik.a(this.f(), $$0, $$1);
   }

   @Override
   public void a(int $$0, clb $$1) {
      this.e(null);
      this.f().set($$0, $$1);
      if ($$1.L() > this.aj_()) {
         $$1.f(this.aj_());
      }
   }

   @Override
   protected ur g() {
      return ur.c("container.hopper");
   }

   public static void a(crs $$0, ht $$1, dgw $$2, dfq $$3) {
      $$3.i--;
      $$3.j = $$0.V();
      if (!$$3.j()) {
         $$3.c(0);
         a($$0, $$1, $$2, $$3, () -> a($$0, (dfp)$$3));
      }
   }

   private static boolean a(crs $$0, ht $$1, dgw $$2, dfq $$3, BooleanSupplier $$4) {
      if ($$0.B) {
         return false;
      } else {
         if (!$$3.j() && $$2.c(cyn.c)) {
            boolean $$5 = false;
            if (!$$3.ai_()) {
               $$5 = a($$0, $$1, $$2, (bij)$$3);
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
      for (clb $$0 : this.h) {
         if ($$0.b() || $$0.L() != $$0.g()) {
            return false;
         }
      }

      return true;
   }

   private static boolean a(crs $$0, ht $$1, dgw $$2, bij $$3) {
      bij $$4 = b($$0, $$1, $$2);
      if ($$4 == null) {
         return false;
      } else {
         hx $$5 = $$2.c(cyn.b).g();
         if (b($$4, $$5)) {
            return false;
         } else {
            for (int $$6 = 0; $$6 < $$3.b(); $$6++) {
               if (!$$3.a($$6).b()) {
                  clb $$7 = $$3.a($$6).p();
                  clb $$8 = a($$3, $$4, $$3.a($$6, 1), $$5);
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

   private static IntStream a(bij $$0, hx $$1) {
      return $$0 instanceof biz ? IntStream.of(((biz)$$0).a($$1)) : IntStream.range(0, $$0.b());
   }

   private static boolean b(bij $$0, hx $$1) {
      return a($$0, $$1).allMatch($$1x -> {
         clb $$2 = $$0.a($$1x);
         return $$2.L() >= $$2.g();
      });
   }

   private static boolean c(bij $$0, hx $$1) {
      return a($$0, $$1).allMatch($$1x -> $$0.a($$1x).b());
   }

   public static boolean a(crs $$0, dfp $$1) {
      bij $$2 = c($$0, $$1);
      if ($$2 != null) {
         hx $$3 = hx.a;
         return c($$2, $$3) ? false : a($$2, $$3).anyMatch($$3x -> a($$1, $$2, $$3x, $$3));
      } else {
         for (caf $$4 : b($$0, $$1)) {
            if (a($$1, $$4)) {
               return true;
            }
         }

         return false;
      }
   }

   private static boolean a(dfp $$0, bij $$1, int $$2, hx $$3) {
      clb $$4 = $$1.a($$2);
      if (!$$4.b() && a($$0, $$1, $$4, $$2, $$3)) {
         clb $$5 = $$4.p();
         clb $$6 = a($$1, $$0, $$1.a($$2, 1), null);
         if ($$6.b()) {
            $$1.e();
            return true;
         }

         $$1.a($$2, $$5);
      }

      return false;
   }

   public static boolean a(bij $$0, caf $$1) {
      boolean $$2 = false;
      clb $$3 = $$1.q().p();
      clb $$4 = a(null, $$0, $$3, null);
      if ($$4.b()) {
         $$2 = true;
         $$1.a(clb.b);
         $$1.ak();
      } else {
         $$1.a($$4);
      }

      return $$2;
   }

   public static clb a(@Nullable bij $$0, bij $$1, clb $$2, @Nullable hx $$3) {
      if ($$1 instanceof biz $$4 && $$3 != null) {
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

   private static boolean a(bij $$0, clb $$1, int $$2, @Nullable hx $$3) {
      if (!$$0.b($$2, $$1)) {
         return false;
      } else {
         if ($$0 instanceof biz $$4 && !$$4.a($$2, $$1, $$3)) {
            return false;
         }

         return true;
      }
   }

   private static boolean a(bij $$0, bij $$1, clb $$2, int $$3, hx $$4) {
      if (!$$1.a($$0, $$3, $$2)) {
         return false;
      } else {
         if ($$1 instanceof biz $$5 && !$$5.b($$3, $$2, $$4)) {
            return false;
         }

         return true;
      }
   }

   private static clb b(@Nullable bij $$0, bij $$1, clb $$2, int $$3, @Nullable hx $$4) {
      clb $$5 = $$1.a($$3);
      if (a($$1, $$2, $$3, $$4)) {
         boolean $$6 = false;
         boolean $$7 = $$1.ai_();
         if ($$5.b()) {
            $$1.a($$3, $$2);
            $$2 = clb.b;
            $$6 = true;
         } else if (a($$5, $$2)) {
            int $$8 = $$2.g() - $$5.L();
            int $$9 = Math.min($$2.L(), $$8);
            $$2.h($$9);
            $$5.g($$9);
            $$6 = $$9 > 0;
         }

         if ($$6) {
            if ($$7 && $$1 instanceof dfq $$10 && !$$10.v()) {
               int $$11 = 0;
               if ($$0 instanceof dfq $$12 && $$10.j >= $$12.j) {
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
   private static bij b(crs $$0, ht $$1, dgw $$2) {
      hx $$3 = $$2.c(cyn.b);
      return a($$0, $$1.a($$3));
   }

   @Nullable
   private static bij c(crs $$0, dfp $$1) {
      return a($$0, $$1.H(), $$1.I() + 1.0, $$1.K());
   }

   public static List<caf> b(crs $$0, dfp $$1) {
      return $$1.h()
         .e()
         .stream()
         .flatMap($$2 -> $$0.a(caf.class, $$2.d($$1.H() - 0.5, $$1.I() - 0.5, $$1.K() - 0.5), bkl.a).stream())
         .collect(Collectors.toList());
   }

   @Nullable
   public static bij a(crs $$0, ht $$1) {
      return a($$0, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5);
   }

   @Nullable
   private static bij a(crs $$0, double $$1, double $$2, double $$3) {
      bij $$4 = null;
      ht $$5 = ht.a($$1, $$2, $$3);
      dgw $$6 = $$0.a_($$5);
      cut $$7 = $$6.b();
      if ($$7 instanceof bja) {
         $$4 = ((bja)$$7).a($$6, $$0, $$5);
      } else if ($$6.t()) {
         der $$8 = $$0.c_($$5);
         if ($$8 instanceof bij) {
            $$4 = (bij)$$8;
            if ($$4 instanceof dey && $$7 instanceof cvw) {
               $$4 = cvw.a((cvw)$$7, $$6, $$0, $$5, true);
            }
         }
      }

      if ($$4 == null) {
         List<bki> $$9 = $$0.a((bki)null, new ejd($$1 - 0.5, $$2 - 0.5, $$3 - 0.5, $$1 + 0.5, $$2 + 0.5, $$3 + 0.5), bkl.d);
         if (!$$9.isEmpty()) {
            $$4 = (bij)$$9.get($$0.z.a($$9.size()));
         }
      }

      return $$4;
   }

   private static boolean a(clb $$0, clb $$1) {
      return $$0.L() <= $$0.g() && clb.c($$0, $$1);
   }

   @Override
   public double H() {
      return (double)this.p.u() + 0.5;
   }

   @Override
   public double I() {
      return (double)this.p.v() + 0.5;
   }

   @Override
   public double K() {
      return (double)this.p.w() + 0.5;
   }

   private void c(int $$0) {
      this.i = $$0;
   }

   private boolean j() {
      return this.i > 0;
   }

   private boolean v() {
      return this.i > 8;
   }

   @Override
   protected il<clb> f() {
      return this.h;
   }

   @Override
   protected void a(il<clb> $$0) {
      this.h = $$0;
   }

   public static void a(crs $$0, ht $$1, dgw $$2, bki $$3, dfq $$4) {
      if ($$3 instanceof caf $$5 && !$$5.q().b() && ejy.c(ejy.a($$3.cG().d((double)(-$$1.u()), (double)(-$$1.v()), (double)(-$$1.w()))), $$4.h(), ejm.i)) {
         a($$0, $$1, $$2, $$4, () -> a((bij)$$4, $$5));
      }
   }

   @Override
   protected cge a(int $$0, cdl $$1) {
      return new chd($$0, $$1, this);
   }
}
