import java.util.List;
import java.util.function.BooleanSupplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import javax.annotation.Nullable;

public class ddo extends ddt implements ddn {
   public static final int f = 8;
   public static final int g = 5;
   private hp<cja> j = hp.a(5, cja.b);
   private int k = -1;
   private long l;

   public ddo(gw $$0, dfe $$1) {
      super(dcs.r, $$0, $$1);
   }

   @Override
   public void a(qu $$0) {
      super.a($$0);
      this.j = hp.a(this.b(), cja.b);
      if (!this.d($$0)) {
         bgn.b($$0, this.j);
      }

      this.k = $$0.h("TransferCooldown");
   }

   @Override
   protected void b(qu $$0) {
      super.b($$0);
      if (!this.e($$0)) {
         bgn.a($$0, this.j);
      }

      $$0.a("TransferCooldown", this.k);
   }

   @Override
   public int b() {
      return this.j.size();
   }

   @Override
   public cja a(int $$0, int $$1) {
      this.e(null);
      return bgn.a(this.f(), $$0, $$1);
   }

   @Override
   public void a(int $$0, cja $$1) {
      this.e(null);
      this.f().set($$0, $$1);
      if ($$1.L() > this.ab_()) {
         $$1.f(this.ab_());
      }
   }

   @Override
   protected ti g() {
      return ti.c("container.hopper");
   }

   public static void a(cpq $$0, gw $$1, dfe $$2, ddo $$3) {
      $$3.k--;
      $$3.l = $$0.V();
      if (!$$3.j()) {
         $$3.c(0);
         a($$0, $$1, $$2, $$3, () -> a($$0, (ddn)$$3));
      }
   }

   private static boolean a(cpq $$0, gw $$1, dfe $$2, ddo $$3, BooleanSupplier $$4) {
      if ($$0.B) {
         return false;
      } else {
         if (!$$3.j() && $$2.c(cwi.b)) {
            boolean $$5 = false;
            if (!$$3.aa_()) {
               $$5 = a($$0, $$1, $$2, (bgm)$$3);
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
      for (cja $$0 : this.j) {
         if ($$0.b() || $$0.L() != $$0.g()) {
            return false;
         }
      }

      return true;
   }

   private static boolean a(cpq $$0, gw $$1, dfe $$2, bgm $$3) {
      bgm $$4 = b($$0, $$1, $$2);
      if ($$4 == null) {
         return false;
      } else {
         hc $$5 = $$2.c(cwi.a).g();
         if (b($$4, $$5)) {
            return false;
         } else {
            for (int $$6 = 0; $$6 < $$3.b(); $$6++) {
               if (!$$3.a($$6).b()) {
                  cja $$7 = $$3.a($$6).p();
                  cja $$8 = a($$3, $$4, $$3.a($$6, 1), $$5);
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

   private static IntStream a(bgm $$0, hc $$1) {
      return $$0 instanceof bhc ? IntStream.of(((bhc)$$0).a($$1)) : IntStream.range(0, $$0.b());
   }

   private static boolean b(bgm $$0, hc $$1) {
      return a($$0, $$1).allMatch($$1x -> {
         cja $$2 = $$0.a($$1x);
         return $$2.L() >= $$2.g();
      });
   }

   private static boolean c(bgm $$0, hc $$1) {
      return a($$0, $$1).allMatch($$1x -> $$0.a($$1x).b());
   }

   public static boolean a(cpq $$0, ddn $$1) {
      bgm $$2 = c($$0, $$1);
      if ($$2 != null) {
         hc $$3 = hc.a;
         return c($$2, $$3) ? false : a($$2, $$3).anyMatch($$3x -> a($$1, $$2, $$3x, $$3));
      } else {
         for (byi $$4 : b($$0, $$1)) {
            if (a($$1, $$4)) {
               return true;
            }
         }

         return false;
      }
   }

   private static boolean a(ddn $$0, bgm $$1, int $$2, hc $$3) {
      cja $$4 = $$1.a($$2);
      if (!$$4.b() && a($$0, $$1, $$4, $$2, $$3)) {
         cja $$5 = $$4.p();
         cja $$6 = a($$1, $$0, $$1.a($$2, 1), null);
         if ($$6.b()) {
            $$1.e();
            return true;
         }

         $$1.a($$2, $$5);
      }

      return false;
   }

   public static boolean a(bgm $$0, byi $$1) {
      boolean $$2 = false;
      cja $$3 = $$1.j().p();
      cja $$4 = a(null, $$0, $$3, null);
      if ($$4.b()) {
         $$2 = true;
         $$1.a(cja.b);
         $$1.ak();
      } else {
         $$1.a($$4);
      }

      return $$2;
   }

   public static cja a(@Nullable bgm $$0, bgm $$1, cja $$2, @Nullable hc $$3) {
      if ($$1 instanceof bhc $$4 && $$3 != null) {
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

   private static boolean a(bgm $$0, cja $$1, int $$2, @Nullable hc $$3) {
      if (!$$0.b($$2, $$1)) {
         return false;
      } else {
         if ($$0 instanceof bhc $$4 && !$$4.a($$2, $$1, $$3)) {
            return false;
         }

         return true;
      }
   }

   private static boolean a(bgm $$0, bgm $$1, cja $$2, int $$3, hc $$4) {
      if (!$$1.a($$0, $$3, $$2)) {
         return false;
      } else {
         if ($$1 instanceof bhc $$5 && !$$5.b($$3, $$2, $$4)) {
            return false;
         }

         return true;
      }
   }

   private static cja b(@Nullable bgm $$0, bgm $$1, cja $$2, int $$3, @Nullable hc $$4) {
      cja $$5 = $$1.a($$3);
      if (a($$1, $$2, $$3, $$4)) {
         boolean $$6 = false;
         boolean $$7 = $$1.aa_();
         if ($$5.b()) {
            $$1.a($$3, $$2);
            $$2 = cja.b;
            $$6 = true;
         } else if (a($$5, $$2)) {
            int $$8 = $$2.g() - $$5.L();
            int $$9 = Math.min($$2.L(), $$8);
            $$2.h($$9);
            $$5.g($$9);
            $$6 = $$9 > 0;
         }

         if ($$6) {
            if ($$7 && $$1 instanceof ddo $$10 && !$$10.v()) {
               int $$11 = 0;
               if ($$0 instanceof ddo $$12 && $$10.l >= $$12.l) {
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
   private static bgm b(cpq $$0, gw $$1, dfe $$2) {
      hc $$3 = $$2.c(cwi.a);
      return a($$0, $$1.a($$3));
   }

   @Nullable
   private static bgm c(cpq $$0, ddn $$1) {
      return a($$0, $$1.G(), $$1.H() + 1.0, $$1.J());
   }

   public static List<byi> b(cpq $$0, ddn $$1) {
      return $$1.ap_()
         .e()
         .stream()
         .flatMap($$2 -> $$0.a(byi.class, $$2.d($$1.G() - 0.5, $$1.H() - 0.5, $$1.J() - 0.5), bio.a).stream())
         .collect(Collectors.toList());
   }

   @Nullable
   public static bgm a(cpq $$0, gw $$1) {
      return a($$0, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5);
   }

   @Nullable
   private static bgm a(cpq $$0, double $$1, double $$2, double $$3) {
      bgm $$4 = null;
      gw $$5 = gw.a($$1, $$2, $$3);
      dfe $$6 = $$0.a_($$5);
      csq $$7 = $$6.b();
      if ($$7 instanceof bhd) {
         $$4 = ((bhd)$$7).a($$6, $$0, $$5);
      } else if ($$6.t()) {
         dcq $$8 = $$0.c_($$5);
         if ($$8 instanceof bgm) {
            $$4 = (bgm)$$8;
            if ($$4 instanceof dcx && $$7 instanceof cts) {
               $$4 = cts.a((cts)$$7, $$6, $$0, $$5, true);
            }
         }
      }

      if ($$4 == null) {
         List<bil> $$9 = $$0.a((bil)null, new ehd($$1 - 0.5, $$2 - 0.5, $$3 - 0.5, $$1 + 0.5, $$2 + 0.5, $$3 + 0.5), bio.d);
         if (!$$9.isEmpty()) {
            $$4 = (bgm)$$9.get($$0.z.a($$9.size()));
         }
      }

      return $$4;
   }

   private static boolean a(cja $$0, cja $$1) {
      return $$0.L() <= $$0.g() && cja.c($$0, $$1);
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
   protected hp<cja> f() {
      return this.j;
   }

   @Override
   protected void a(hp<cja> $$0) {
      this.j = $$0;
   }

   public static void a(cpq $$0, gw $$1, dfe $$2, bil $$3, ddo $$4) {
      if ($$3 instanceof byi $$5 && !$$5.j().b() && ehy.c(ehy.a($$3.cG().d((double)(-$$1.u()), (double)(-$$1.v()), (double)(-$$1.w()))), $$4.ap_(), ehm.i)) {
         a($$0, $$1, $$2, $$4, () -> a((bgm)$$4, $$5));
      }
   }

   @Override
   protected ceg a(int $$0, cbo $$1) {
      return new cfd($$0, $$1, this);
   }
}
