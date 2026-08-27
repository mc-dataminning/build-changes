import java.util.List;
import java.util.function.BooleanSupplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import javax.annotation.Nullable;

public class ddv extends dea implements ddu {
   public static final int f = 8;
   public static final int g = 5;
   private hp<cjh> j = hp.a(5, cjh.b);
   private int k = -1;
   private long l;

   public ddv(gw $$0, dfl $$1) {
      super(dcz.r, $$0, $$1);
   }

   @Override
   public void a(qy $$0) {
      super.a($$0);
      this.j = hp.a(this.b(), cjh.b);
      if (!this.d($$0)) {
         bgu.b($$0, this.j);
      }

      this.k = $$0.h("TransferCooldown");
   }

   @Override
   protected void b(qy $$0) {
      super.b($$0);
      if (!this.e($$0)) {
         bgu.a($$0, this.j);
      }

      $$0.a("TransferCooldown", this.k);
   }

   @Override
   public int b() {
      return this.j.size();
   }

   @Override
   public cjh a(int $$0, int $$1) {
      this.e(null);
      return bgu.a(this.f(), $$0, $$1);
   }

   @Override
   public void a(int $$0, cjh $$1) {
      this.e(null);
      this.f().set($$0, $$1);
      if ($$1.L() > this.ag_()) {
         $$1.f(this.ag_());
      }
   }

   @Override
   protected tn g() {
      return tn.c("container.hopper");
   }

   public static void a(cpx $$0, gw $$1, dfl $$2, ddv $$3) {
      $$3.k--;
      $$3.l = $$0.V();
      if (!$$3.j()) {
         $$3.c(0);
         a($$0, $$1, $$2, $$3, () -> a($$0, (ddu)$$3));
      }
   }

   private static boolean a(cpx $$0, gw $$1, dfl $$2, ddv $$3, BooleanSupplier $$4) {
      if ($$0.B) {
         return false;
      } else {
         if (!$$3.j() && $$2.c(cwp.b)) {
            boolean $$5 = false;
            if (!$$3.af_()) {
               $$5 = a($$0, $$1, $$2, (bgt)$$3);
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
      for (cjh $$0 : this.j) {
         if ($$0.b() || $$0.L() != $$0.g()) {
            return false;
         }
      }

      return true;
   }

   private static boolean a(cpx $$0, gw $$1, dfl $$2, bgt $$3) {
      bgt $$4 = b($$0, $$1, $$2);
      if ($$4 == null) {
         return false;
      } else {
         hc $$5 = $$2.c(cwp.a).g();
         if (b($$4, $$5)) {
            return false;
         } else {
            for (int $$6 = 0; $$6 < $$3.b(); $$6++) {
               if (!$$3.a($$6).b()) {
                  cjh $$7 = $$3.a($$6).p();
                  cjh $$8 = a($$3, $$4, $$3.a($$6, 1), $$5);
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

   private static IntStream a(bgt $$0, hc $$1) {
      return $$0 instanceof bhj ? IntStream.of(((bhj)$$0).a($$1)) : IntStream.range(0, $$0.b());
   }

   private static boolean b(bgt $$0, hc $$1) {
      return a($$0, $$1).allMatch($$1x -> {
         cjh $$2 = $$0.a($$1x);
         return $$2.L() >= $$2.g();
      });
   }

   private static boolean c(bgt $$0, hc $$1) {
      return a($$0, $$1).allMatch($$1x -> $$0.a($$1x).b());
   }

   public static boolean a(cpx $$0, ddu $$1) {
      bgt $$2 = c($$0, $$1);
      if ($$2 != null) {
         hc $$3 = hc.a;
         return c($$2, $$3) ? false : a($$2, $$3).anyMatch($$3x -> a($$1, $$2, $$3x, $$3));
      } else {
         for (byp $$4 : b($$0, $$1)) {
            if (a($$1, $$4)) {
               return true;
            }
         }

         return false;
      }
   }

   private static boolean a(ddu $$0, bgt $$1, int $$2, hc $$3) {
      cjh $$4 = $$1.a($$2);
      if (!$$4.b() && a($$0, $$1, $$4, $$2, $$3)) {
         cjh $$5 = $$4.p();
         cjh $$6 = a($$1, $$0, $$1.a($$2, 1), null);
         if ($$6.b()) {
            $$1.e();
            return true;
         }

         $$1.a($$2, $$5);
      }

      return false;
   }

   public static boolean a(bgt $$0, byp $$1) {
      boolean $$2 = false;
      cjh $$3 = $$1.q().p();
      cjh $$4 = a(null, $$0, $$3, null);
      if ($$4.b()) {
         $$2 = true;
         $$1.a(cjh.b);
         $$1.ak();
      } else {
         $$1.a($$4);
      }

      return $$2;
   }

   public static cjh a(@Nullable bgt $$0, bgt $$1, cjh $$2, @Nullable hc $$3) {
      if ($$1 instanceof bhj $$4 && $$3 != null) {
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

   private static boolean a(bgt $$0, cjh $$1, int $$2, @Nullable hc $$3) {
      if (!$$0.b($$2, $$1)) {
         return false;
      } else {
         if ($$0 instanceof bhj $$4 && !$$4.a($$2, $$1, $$3)) {
            return false;
         }

         return true;
      }
   }

   private static boolean a(bgt $$0, bgt $$1, cjh $$2, int $$3, hc $$4) {
      if (!$$1.a($$0, $$3, $$2)) {
         return false;
      } else {
         if ($$1 instanceof bhj $$5 && !$$5.b($$3, $$2, $$4)) {
            return false;
         }

         return true;
      }
   }

   private static cjh b(@Nullable bgt $$0, bgt $$1, cjh $$2, int $$3, @Nullable hc $$4) {
      cjh $$5 = $$1.a($$3);
      if (a($$1, $$2, $$3, $$4)) {
         boolean $$6 = false;
         boolean $$7 = $$1.af_();
         if ($$5.b()) {
            $$1.a($$3, $$2);
            $$2 = cjh.b;
            $$6 = true;
         } else if (a($$5, $$2)) {
            int $$8 = $$2.g() - $$5.L();
            int $$9 = Math.min($$2.L(), $$8);
            $$2.h($$9);
            $$5.g($$9);
            $$6 = $$9 > 0;
         }

         if ($$6) {
            if ($$7 && $$1 instanceof ddv $$10 && !$$10.v()) {
               int $$11 = 0;
               if ($$0 instanceof ddv $$12 && $$10.l >= $$12.l) {
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
   private static bgt b(cpx $$0, gw $$1, dfl $$2) {
      hc $$3 = $$2.c(cwp.a);
      return a($$0, $$1.a($$3));
   }

   @Nullable
   private static bgt c(cpx $$0, ddu $$1) {
      return a($$0, $$1.M(), $$1.N() + 1.0, $$1.O());
   }

   public static List<byp> b(cpx $$0, ddu $$1) {
      return $$1.au_()
         .e()
         .stream()
         .flatMap($$2 -> $$0.a(byp.class, $$2.d($$1.M() - 0.5, $$1.N() - 0.5, $$1.O() - 0.5), biv.a).stream())
         .collect(Collectors.toList());
   }

   @Nullable
   public static bgt a(cpx $$0, gw $$1) {
      return a($$0, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5);
   }

   @Nullable
   private static bgt a(cpx $$0, double $$1, double $$2, double $$3) {
      bgt $$4 = null;
      gw $$5 = gw.a($$1, $$2, $$3);
      dfl $$6 = $$0.a_($$5);
      csx $$7 = $$6.b();
      if ($$7 instanceof bhk) {
         $$4 = ((bhk)$$7).a($$6, $$0, $$5);
      } else if ($$6.t()) {
         dcx $$8 = $$0.c_($$5);
         if ($$8 instanceof bgt) {
            $$4 = (bgt)$$8;
            if ($$4 instanceof dde && $$7 instanceof ctz) {
               $$4 = ctz.a((ctz)$$7, $$6, $$0, $$5, true);
            }
         }
      }

      if ($$4 == null) {
         List<bis> $$9 = $$0.a((bis)null, new ehk($$1 - 0.5, $$2 - 0.5, $$3 - 0.5, $$1 + 0.5, $$2 + 0.5, $$3 + 0.5), biv.d);
         if (!$$9.isEmpty()) {
            $$4 = (bgt)$$9.get($$0.z.a($$9.size()));
         }
      }

      return $$4;
   }

   private static boolean a(cjh $$0, cjh $$1) {
      return $$0.L() <= $$0.g() && cjh.c($$0, $$1);
   }

   @Override
   public double M() {
      return (double)this.p.u() + 0.5;
   }

   @Override
   public double N() {
      return (double)this.p.v() + 0.5;
   }

   @Override
   public double O() {
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
   protected hp<cjh> f() {
      return this.j;
   }

   @Override
   protected void a(hp<cjh> $$0) {
      this.j = $$0;
   }

   public static void a(cpx $$0, gw $$1, dfl $$2, bis $$3, ddv $$4) {
      if ($$3 instanceof byp $$5 && !$$5.q().b() && eif.c(eif.a($$3.cG().d((double)(-$$1.u()), (double)(-$$1.v()), (double)(-$$1.w()))), $$4.au_(), eht.i)) {
         a($$0, $$1, $$2, $$4, () -> a((bgt)$$4, $$5));
      }
   }

   @Override
   protected cen a(int $$0, cbv $$1) {
      return new cfk($$0, $$1, this);
   }
}
