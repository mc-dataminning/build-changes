import java.util.List;
import java.util.function.BooleanSupplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import javax.annotation.Nullable;

public class dkk extends dkp implements dkj {
   public static final int f = 8;
   public static final int g = 5;
   private iu<cpq> h = iu.a(5, cpq.h);
   private int i = -1;
   private long j;

   public dkk(ib $$0, dme $$1) {
      super(djn.r, $$0, $$1);
   }

   @Override
   public void a(sy $$0, in.a $$1) {
      super.a($$0, $$1);
      this.h = iu.a(this.b(), cpq.h);
      if (!this.c_($$0)) {
         bmf.b($$0, this.h);
      }

      this.i = $$0.h("TransferCooldown");
   }

   @Override
   protected void b(sy $$0, in.a $$1) {
      super.b($$0, $$1);
      if (!this.b($$0)) {
         bmf.a($$0, this.h);
      }

      $$0.a("TransferCooldown", this.i);
   }

   @Override
   public int b() {
      return this.h.size();
   }

   @Override
   public cpq a(int $$0, int $$1) {
      this.e_(null);
      return bmf.a(this.j(), $$0, $$1);
   }

   @Override
   public void a(int $$0, cpq $$1) {
      this.e_(null);
      this.j().set($$0, $$1);
      if ($$1.M() > this.al_()) {
         $$1.f(this.al_());
      }
   }

   @Override
   protected vs k() {
      return vs.c("container.hopper");
   }

   public static void a(cwe $$0, ib $$1, dme $$2, dkk $$3) {
      $$3.i--;
      $$3.j = $$0.X();
      if (!$$3.s()) {
         $$3.c(0);
         a($$0, $$1, $$2, $$3, () -> a($$0, (dkj)$$3));
      }
   }

   private static boolean a(cwe $$0, ib $$1, dme $$2, dkk $$3, BooleanSupplier $$4) {
      if ($$0.B) {
         return false;
      } else {
         if (!$$3.s() && $$2.c(dcz.c)) {
            boolean $$5 = false;
            if (!$$3.aj_()) {
               $$5 = a($$0, $$1, $$2, (bme)$$3);
            }

            if (!$$3.l()) {
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

   private boolean l() {
      for (cpq $$0 : this.h) {
         if ($$0.b() || $$0.M() != $$0.g()) {
            return false;
         }
      }

      return true;
   }

   private static boolean a(cwe $$0, ib $$1, dme $$2, bme $$3) {
      bme $$4 = b($$0, $$1, $$2);
      if ($$4 == null) {
         return false;
      } else {
         ih $$5 = $$2.c(dcz.b).g();
         if (b($$4, $$5)) {
            return false;
         } else {
            for (int $$6 = 0; $$6 < $$3.b(); $$6++) {
               if (!$$3.a($$6).b()) {
                  cpq $$7 = $$3.a($$6).q();
                  cpq $$8 = a($$3, $$4, $$3.a($$6, 1), $$5);
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

   private static IntStream a(bme $$0, ih $$1) {
      return $$0 instanceof bmx ? IntStream.of(((bmx)$$0).a($$1)) : IntStream.range(0, $$0.b());
   }

   private static boolean b(bme $$0, ih $$1) {
      return a($$0, $$1).allMatch($$1x -> {
         cpq $$2 = $$0.a($$1x);
         return $$2.M() >= $$2.g();
      });
   }

   private static boolean c(bme $$0, ih $$1) {
      return a($$0, $$1).allMatch($$1x -> $$0.a($$1x).b());
   }

   public static boolean a(cwe $$0, dkj $$1) {
      bme $$2 = c($$0, $$1);
      if ($$2 != null) {
         ih $$3 = ih.a;
         return c($$2, $$3) ? false : a($$2, $$3).anyMatch($$3x -> a($$1, $$2, $$3x, $$3));
      } else {
         for (cel $$4 : b($$0, $$1)) {
            if (a($$1, $$4)) {
               return true;
            }
         }

         return false;
      }
   }

   private static boolean a(dkj $$0, bme $$1, int $$2, ih $$3) {
      cpq $$4 = $$1.a($$2);
      if (!$$4.b() && a($$0, $$1, $$4, $$2, $$3)) {
         cpq $$5 = $$4.q();
         cpq $$6 = a($$1, $$0, $$1.a($$2, 1), null);
         if ($$6.b()) {
            $$1.e();
            return true;
         }

         $$1.a($$2, $$5);
      }

      return false;
   }

   public static boolean a(bme $$0, cel $$1) {
      boolean $$2 = false;
      cpq $$3 = $$1.q().q();
      cpq $$4 = a(null, $$0, $$3, null);
      if ($$4.b()) {
         $$2 = true;
         $$1.a(cpq.h);
         $$1.am();
      } else {
         $$1.a($$4);
      }

      return $$2;
   }

   public static cpq a(@Nullable bme $$0, bme $$1, cpq $$2, @Nullable ih $$3) {
      if ($$1 instanceof bmx $$4 && $$3 != null) {
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

   private static boolean a(bme $$0, cpq $$1, int $$2, @Nullable ih $$3) {
      if (!$$0.b($$2, $$1)) {
         return false;
      } else {
         if ($$0 instanceof bmx $$4 && !$$4.a($$2, $$1, $$3)) {
            return false;
         }

         return true;
      }
   }

   private static boolean a(bme $$0, bme $$1, cpq $$2, int $$3, ih $$4) {
      if (!$$1.a($$0, $$3, $$2)) {
         return false;
      } else {
         if ($$1 instanceof bmx $$5 && !$$5.b($$3, $$2, $$4)) {
            return false;
         }

         return true;
      }
   }

   private static cpq b(@Nullable bme $$0, bme $$1, cpq $$2, int $$3, @Nullable ih $$4) {
      cpq $$5 = $$1.a($$3);
      if (a($$1, $$2, $$3, $$4)) {
         boolean $$6 = false;
         boolean $$7 = $$1.aj_();
         if ($$5.b()) {
            $$1.a($$3, $$2);
            $$2 = cpq.h;
            $$6 = true;
         } else if (a($$5, $$2)) {
            int $$8 = $$2.g() - $$5.M();
            int $$9 = Math.min($$2.M(), $$8);
            $$2.h($$9);
            $$5.g($$9);
            $$6 = $$9 > 0;
         }

         if ($$6) {
            if ($$7 && $$1 instanceof dkk $$10 && !$$10.t()) {
               int $$11 = 0;
               if ($$0 instanceof dkk $$12 && $$10.j >= $$12.j) {
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
   private static bme b(cwe $$0, ib $$1, dme $$2) {
      ih $$3 = $$2.c(dcz.b);
      return a($$0, $$1.a($$3));
   }

   @Nullable
   private static bme c(cwe $$0, dkj $$1) {
      return a($$0, $$1.I(), $$1.J() + 1.0, $$1.K());
   }

   public static List<cel> b(cwe $$0, dkj $$1) {
      return $$1.ak_()
         .e()
         .stream()
         .flatMap($$2 -> $$0.a(cel.class, $$2.d($$1.I() - 0.5, $$1.J() - 0.5, $$1.K() - 0.5), bok.a).stream())
         .collect(Collectors.toList());
   }

   @Nullable
   public static bme a(cwe $$0, ib $$1) {
      return a($$0, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5);
   }

   @Nullable
   private static bme a(cwe $$0, double $$1, double $$2, double $$3) {
      bme $$4 = null;
      ib $$5 = ib.a($$1, $$2, $$3);
      dme $$6 = $$0.a_($$5);
      czf $$7 = $$6.b();
      if ($$7 instanceof bmy) {
         $$4 = ((bmy)$$7).a($$6, $$0, $$5);
      } else if ($$6.t()) {
         djl $$8 = $$0.c_($$5);
         if ($$8 instanceof bme) {
            $$4 = (bme)$$8;
            if ($$4 instanceof djs && $$7 instanceof dai) {
               $$4 = dai.a((dai)$$7, $$6, $$0, $$5, true);
            }
         }
      }

      if ($$4 == null) {
         List<bof> $$9 = $$0.a((bof)null, new eoq($$1 - 0.5, $$2 - 0.5, $$3 - 0.5, $$1 + 0.5, $$2 + 0.5, $$3 + 0.5), bok.d);
         if (!$$9.isEmpty()) {
            $$4 = (bme)$$9.get($$0.z.a($$9.size()));
         }
      }

      return $$4;
   }

   private static boolean a(cpq $$0, cpq $$1) {
      return $$0.M() <= $$0.g() && cpq.c($$0, $$1);
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

   private boolean s() {
      return this.i > 0;
   }

   private boolean t() {
      return this.i > 8;
   }

   @Override
   protected iu<cpq> j() {
      return this.h;
   }

   @Override
   protected void a(iu<cpq> $$0) {
      this.h = $$0;
   }

   public static void a(cwe $$0, ib $$1, dme $$2, bof $$3, dkk $$4) {
      if ($$3 instanceof cel $$5 && !$$5.q().b() && epl.c(epl.a($$3.cE().d((double)(-$$1.u()), (double)(-$$1.v()), (double)(-$$1.w()))), $$4.ak_(), eoz.i)) {
         a($$0, $$1, $$2, $$4, () -> a((bme)$$4, $$5));
      }
   }

   @Override
   protected cku a(int $$0, chz $$1) {
      return new clt($$0, $$1, this);
   }
}
