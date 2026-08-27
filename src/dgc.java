import java.util.List;
import java.util.function.BooleanSupplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import javax.annotation.Nullable;

public class dgc extends dgh implements dgb {
   public static final int f = 8;
   public static final int g = 5;
   private il<clj> h = il.a(5, clj.b);
   private int i = -1;
   private long j;

   public dgc(ht $$0, dhi $$1) {
      super(dff.r, $$0, $$1);
   }

   @Override
   public void a(rz $$0) {
      super.a($$0);
      this.h = il.a(this.b(), clj.b);
      if (!this.d($$0)) {
         bir.b($$0, this.h);
      }

      this.i = $$0.h("TransferCooldown");
   }

   @Override
   protected void b(rz $$0) {
      super.b($$0);
      if (!this.e($$0)) {
         bir.a($$0, this.h);
      }

      $$0.a("TransferCooldown", this.i);
   }

   @Override
   public int b() {
      return this.h.size();
   }

   @Override
   public clj a(int $$0, int $$1) {
      this.e(null);
      return bir.a(this.f(), $$0, $$1);
   }

   @Override
   public void a(int $$0, clj $$1) {
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

   public static void a(csa $$0, ht $$1, dhi $$2, dgc $$3) {
      $$3.i--;
      $$3.j = $$0.W();
      if (!$$3.j()) {
         $$3.c(0);
         a($$0, $$1, $$2, $$3, () -> a($$0, (dgb)$$3));
      }
   }

   private static boolean a(csa $$0, ht $$1, dhi $$2, dgc $$3, BooleanSupplier $$4) {
      if ($$0.B) {
         return false;
      } else {
         if (!$$3.j() && $$2.c(cyu.c)) {
            boolean $$5 = false;
            if (!$$3.ai_()) {
               $$5 = a($$0, $$1, $$2, (biq)$$3);
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
      for (clj $$0 : this.h) {
         if ($$0.b() || $$0.L() != $$0.g()) {
            return false;
         }
      }

      return true;
   }

   private static boolean a(csa $$0, ht $$1, dhi $$2, biq $$3) {
      biq $$4 = b($$0, $$1, $$2);
      if ($$4 == null) {
         return false;
      } else {
         hx $$5 = $$2.c(cyu.b).g();
         if (b($$4, $$5)) {
            return false;
         } else {
            for (int $$6 = 0; $$6 < $$3.b(); $$6++) {
               if (!$$3.a($$6).b()) {
                  clj $$7 = $$3.a($$6).p();
                  clj $$8 = a($$3, $$4, $$3.a($$6, 1), $$5);
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

   private static IntStream a(biq $$0, hx $$1) {
      return $$0 instanceof bjh ? IntStream.of(((bjh)$$0).a($$1)) : IntStream.range(0, $$0.b());
   }

   private static boolean b(biq $$0, hx $$1) {
      return a($$0, $$1).allMatch($$1x -> {
         clj $$2 = $$0.a($$1x);
         return $$2.L() >= $$2.g();
      });
   }

   private static boolean c(biq $$0, hx $$1) {
      return a($$0, $$1).allMatch($$1x -> $$0.a($$1x).b());
   }

   public static boolean a(csa $$0, dgb $$1) {
      biq $$2 = c($$0, $$1);
      if ($$2 != null) {
         hx $$3 = hx.a;
         return c($$2, $$3) ? false : a($$2, $$3).anyMatch($$3x -> a($$1, $$2, $$3x, $$3));
      } else {
         for (can $$4 : b($$0, $$1)) {
            if (a($$1, $$4)) {
               return true;
            }
         }

         return false;
      }
   }

   private static boolean a(dgb $$0, biq $$1, int $$2, hx $$3) {
      clj $$4 = $$1.a($$2);
      if (!$$4.b() && a($$0, $$1, $$4, $$2, $$3)) {
         clj $$5 = $$4.p();
         clj $$6 = a($$1, $$0, $$1.a($$2, 1), null);
         if ($$6.b()) {
            $$1.e();
            return true;
         }

         $$1.a($$2, $$5);
      }

      return false;
   }

   public static boolean a(biq $$0, can $$1) {
      boolean $$2 = false;
      clj $$3 = $$1.q().p();
      clj $$4 = a(null, $$0, $$3, null);
      if ($$4.b()) {
         $$2 = true;
         $$1.a(clj.b);
         $$1.am();
      } else {
         $$1.a($$4);
      }

      return $$2;
   }

   public static clj a(@Nullable biq $$0, biq $$1, clj $$2, @Nullable hx $$3) {
      if ($$1 instanceof bjh $$4 && $$3 != null) {
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

   private static boolean a(biq $$0, clj $$1, int $$2, @Nullable hx $$3) {
      if (!$$0.b($$2, $$1)) {
         return false;
      } else {
         if ($$0 instanceof bjh $$4 && !$$4.a($$2, $$1, $$3)) {
            return false;
         }

         return true;
      }
   }

   private static boolean a(biq $$0, biq $$1, clj $$2, int $$3, hx $$4) {
      if (!$$1.a($$0, $$3, $$2)) {
         return false;
      } else {
         if ($$1 instanceof bjh $$5 && !$$5.b($$3, $$2, $$4)) {
            return false;
         }

         return true;
      }
   }

   private static clj b(@Nullable biq $$0, biq $$1, clj $$2, int $$3, @Nullable hx $$4) {
      clj $$5 = $$1.a($$3);
      if (a($$1, $$2, $$3, $$4)) {
         boolean $$6 = false;
         boolean $$7 = $$1.ai_();
         if ($$5.b()) {
            $$1.a($$3, $$2);
            $$2 = clj.b;
            $$6 = true;
         } else if (a($$5, $$2)) {
            int $$8 = $$2.g() - $$5.L();
            int $$9 = Math.min($$2.L(), $$8);
            $$2.h($$9);
            $$5.g($$9);
            $$6 = $$9 > 0;
         }

         if ($$6) {
            if ($$7 && $$1 instanceof dgc $$10 && !$$10.v()) {
               int $$11 = 0;
               if ($$0 instanceof dgc $$12 && $$10.j >= $$12.j) {
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
   private static biq b(csa $$0, ht $$1, dhi $$2) {
      hx $$3 = $$2.c(cyu.b);
      return a($$0, $$1.a($$3));
   }

   @Nullable
   private static biq c(csa $$0, dgb $$1) {
      return a($$0, $$1.I(), $$1.J() + 1.0, $$1.K());
   }

   public static List<can> b(csa $$0, dgb $$1) {
      return $$1.h()
         .e()
         .stream()
         .flatMap($$2 -> $$0.a(can.class, $$2.d($$1.I() - 0.5, $$1.J() - 0.5, $$1.K() - 0.5), bkt.a).stream())
         .collect(Collectors.toList());
   }

   @Nullable
   public static biq a(csa $$0, ht $$1) {
      return a($$0, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5);
   }

   @Nullable
   private static biq a(csa $$0, double $$1, double $$2, double $$3) {
      biq $$4 = null;
      ht $$5 = ht.a($$1, $$2, $$3);
      dhi $$6 = $$0.a_($$5);
      cva $$7 = $$6.b();
      if ($$7 instanceof bji) {
         $$4 = ((bji)$$7).a($$6, $$0, $$5);
      } else if ($$6.t()) {
         dfd $$8 = $$0.c_($$5);
         if ($$8 instanceof biq) {
            $$4 = (biq)$$8;
            if ($$4 instanceof dfk && $$7 instanceof cwd) {
               $$4 = cwd.a((cwd)$$7, $$6, $$0, $$5, true);
            }
         }
      }

      if ($$4 == null) {
         List<bkq> $$9 = $$0.a((bkq)null, new ejp($$1 - 0.5, $$2 - 0.5, $$3 - 0.5, $$1 + 0.5, $$2 + 0.5, $$3 + 0.5), bkt.d);
         if (!$$9.isEmpty()) {
            $$4 = (biq)$$9.get($$0.z.a($$9.size()));
         }
      }

      return $$4;
   }

   private static boolean a(clj $$0, clj $$1) {
      return $$0.L() <= $$0.g() && clj.c($$0, $$1);
   }

   @Override
   public double I() {
      return (double)this.p.u() + 0.5;
   }

   @Override
   public double J() {
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
   protected il<clj> f() {
      return this.h;
   }

   @Override
   protected void a(il<clj> $$0) {
      this.h = $$0;
   }

   public static void a(csa $$0, ht $$1, dhi $$2, bkq $$3, dgc $$4) {
      if ($$3 instanceof can $$5 && !$$5.q().b() && ekk.c(ekk.a($$3.cH().d((double)(-$$1.u()), (double)(-$$1.v()), (double)(-$$1.w()))), $$4.h(), ejy.i)) {
         a($$0, $$1, $$2, $$4, () -> a((biq)$$4, $$5));
      }
   }

   @Override
   protected cgm a(int $$0, cdt $$1) {
      return new chl($$0, $$1, this);
   }
}
