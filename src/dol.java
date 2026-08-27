import java.util.List;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;

public class dol extends dor implements dok {
   public static final int d = 8;
   public static final int e = 5;
   private static final int[][] f = new int[54][];
   private jf<csz> g = jf.a(5, csz.i);
   private int h = -1;
   private long i;
   private is j;

   public dol(in $$0, dqh $$1) {
      super(dno.r, $$0, $$1);
      this.j = $$1.c(dgz.b);
   }

   @Override
   public void a(ua $$0, iy.a $$1) {
      super.a($$0, $$1);
      this.g = jf.a(this.b(), csz.i);
      if (!this.a_($$0)) {
         bpg.b($$0, this.g, $$1);
      }

      this.h = $$0.h("TransferCooldown");
   }

   @Override
   protected void b(ua $$0, iy.a $$1) {
      super.b($$0, $$1);
      if (!this.b_($$0)) {
         bpg.a($$0, this.g, $$1);
      }

      $$0.a("TransferCooldown", this.h);
   }

   @Override
   public int b() {
      return this.g.size();
   }

   @Override
   public csz a(int $$0, int $$1) {
      this.e_(null);
      return bpg.a(this.j(), $$0, $$1);
   }

   @Override
   public void a(int $$0, csz $$1) {
      this.e_(null);
      this.j().set($$0, $$1);
      $$1.f(this.a($$1));
   }

   @Override
   public void b(dqh $$0) {
      super.b($$0);
      this.j = $$0.c(dgz.b);
   }

   @Override
   protected wu k() {
      return wu.c("container.hopper");
   }

   public static void a(dad $$0, in $$1, dqh $$2, dol $$3) {
      $$3.h--;
      $$3.i = $$0.Y();
      if (!$$3.t()) {
         $$3.d(0);
         a($$0, $$1, $$2, $$3, () -> a($$0, (dok)$$3));
      }
   }

   private static boolean a(dad $$0, in $$1, dqh $$2, dol $$3, BooleanSupplier $$4) {
      if ($$0.B) {
         return false;
      } else {
         if (!$$3.t() && $$2.c(dgz.c)) {
            boolean $$5 = false;
            if (!$$3.c()) {
               $$5 = a($$0, $$1, $$3);
            }

            if (!$$3.l()) {
               $$5 |= $$4.getAsBoolean();
            }

            if ($$5) {
               $$3.d(8);
               a($$0, $$1, $$2);
               return true;
            }
         }

         return false;
      }
   }

   private boolean l() {
      for (csz $$0 : this.g) {
         if ($$0.d() || $$0.G() != $$0.i()) {
            return false;
         }
      }

      return true;
   }

   private static boolean a(dad $$0, in $$1, dol $$2) {
      bpf $$3 = b($$0, $$1, $$2);
      if ($$3 == null) {
         return false;
      } else {
         is $$4 = $$2.j.g();
         if (b($$3, $$4)) {
            return false;
         } else {
            for (int $$5 = 0; $$5 < $$2.b(); $$5++) {
               csz $$6 = $$2.a($$5);
               if (!$$6.d()) {
                  int $$7 = $$6.G();
                  csz $$8 = a($$2, $$3, $$2.a($$5, 1), $$4);
                  if ($$8.d()) {
                     $$3.e();
                     return true;
                  }

                  $$6.e($$7);
                  if ($$7 == 1) {
                     $$2.a($$5, $$6);
                  }
               }
            }

            return false;
         }
      }
   }

   private static int[] a(bpf $$0, is $$1) {
      if ($$0 instanceof bpy $$2) {
         return $$2.a($$1);
      } else {
         int $$3 = $$0.b();
         if ($$3 < f.length) {
            int[] $$4 = f[$$3];
            if ($$4 != null) {
               return $$4;
            } else {
               int[] $$5 = c($$3);
               f[$$3] = $$5;
               return $$5;
            }
         } else {
            return c($$3);
         }
      }
   }

   private static int[] c(int $$0) {
      int[] $$1 = new int[$$0];
      int $$2 = 0;

      while ($$2 < $$1.length) {
         $$1[$$2] = $$2++;
      }

      return $$1;
   }

   private static boolean b(bpf $$0, is $$1) {
      int[] $$2 = a($$0, $$1);

      for (int $$3 : $$2) {
         csz $$4 = $$0.a($$3);
         if ($$4.G() < $$4.i()) {
            return false;
         }
      }

      return true;
   }

   public static boolean a(dad $$0, dok $$1) {
      in $$2 = in.a($$1.H(), $$1.I() + 1.0, $$1.J());
      dqh $$3 = $$0.a_($$2);
      bpf $$4 = a($$0, $$1, $$2, $$3);
      if ($$4 != null) {
         is $$5 = is.a;

         for (int $$6 : a($$4, $$5)) {
            if (a($$1, $$4, $$6, $$5)) {
               return true;
            }
         }

         return false;
      } else {
         boolean $$7 = $$1.K() && $$3.r($$0, $$2) && !$$3.a(avr.cz);
         if (!$$7) {
            for (chr $$8 : b($$0, $$1)) {
               if (a($$1, $$8)) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   private static boolean a(dok $$0, bpf $$1, int $$2, is $$3) {
      csz $$4 = $$1.a($$2);
      if (!$$4.d() && a($$0, $$1, $$4, $$2, $$3)) {
         int $$5 = $$4.G();
         csz $$6 = a($$1, $$0, $$1.a($$2, 1), null);
         if ($$6.d()) {
            $$1.e();
            return true;
         }

         $$4.e($$5);
         if ($$5 == 1) {
            $$1.a($$2, $$4);
         }
      }

      return false;
   }

   public static boolean a(bpf $$0, chr $$1) {
      boolean $$2 = false;
      csz $$3 = $$1.p().r();
      csz $$4 = a(null, $$0, $$3, null);
      if ($$4.d()) {
         $$2 = true;
         $$1.a(csz.i);
         $$1.am();
      } else {
         $$1.a($$4);
      }

      return $$2;
   }

   public static csz a(@Nullable bpf $$0, bpf $$1, csz $$2, @Nullable is $$3) {
      if ($$1 instanceof bpy $$4 && $$3 != null) {
         int[] $$5 = $$4.a($$3);

         for (int $$6 = 0; $$6 < $$5.length && !$$2.d(); $$6++) {
            $$2 = b($$0, $$1, $$2, $$5[$$6], $$3);
         }

         return $$2;
      }

      int $$7 = $$1.b();

      for (int $$8 = 0; $$8 < $$7 && !$$2.d(); $$8++) {
         $$2 = b($$0, $$1, $$2, $$8, $$3);
      }

      return $$2;
   }

   private static boolean a(bpf $$0, csz $$1, int $$2, @Nullable is $$3) {
      if (!$$0.b($$2, $$1)) {
         return false;
      } else {
         if ($$0 instanceof bpy $$4 && !$$4.a($$2, $$1, $$3)) {
            return false;
         }

         return true;
      }
   }

   private static boolean a(bpf $$0, bpf $$1, csz $$2, int $$3, is $$4) {
      if (!$$1.a($$0, $$3, $$2)) {
         return false;
      } else {
         if ($$1 instanceof bpy $$5 && !$$5.b($$3, $$2, $$4)) {
            return false;
         }

         return true;
      }
   }

   private static csz b(@Nullable bpf $$0, bpf $$1, csz $$2, int $$3, @Nullable is $$4) {
      csz $$5 = $$1.a($$3);
      if (a($$1, $$2, $$3, $$4)) {
         boolean $$6 = false;
         boolean $$7 = $$1.c();
         if ($$5.d()) {
            $$1.a($$3, $$2);
            $$2 = csz.i;
            $$6 = true;
         } else if (a($$5, $$2)) {
            int $$8 = $$2.i() - $$5.G();
            int $$9 = Math.min($$2.G(), $$8);
            $$2.h($$9);
            $$5.g($$9);
            $$6 = $$9 > 0;
         }

         if ($$6) {
            if ($$7 && $$1 instanceof dol $$10 && !$$10.u()) {
               int $$11 = 0;
               if ($$0 instanceof dol $$12 && $$10.i >= $$12.i) {
                  $$11 = 1;
               }

               $$10.d(8 - $$11);
            }

            $$1.e();
         }
      }

      return $$2;
   }

   @Nullable
   private static bpf b(dad $$0, in $$1, dol $$2) {
      return a($$0, $$1.a($$2.j));
   }

   @Nullable
   private static bpf a(dad $$0, dok $$1, in $$2, dqh $$3) {
      return a($$0, $$2, $$3, $$1.H(), $$1.I() + 1.0, $$1.J());
   }

   public static List<chr> b(dad $$0, dok $$1) {
      etk $$2 = $$1.ai_().d($$1.H() - 0.5, $$1.I() - 0.5, $$1.J() - 0.5);
      return $$0.a(chr.class, $$2, brm.a);
   }

   @Nullable
   public static bpf a(dad $$0, in $$1) {
      return a($$0, $$1, $$0.a_($$1), (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5);
   }

   @Nullable
   private static bpf a(dad $$0, in $$1, dqh $$2, double $$3, double $$4, double $$5) {
      bpf $$6 = b($$0, $$1, $$2);
      if ($$6 == null) {
         $$6 = a($$0, $$3, $$4, $$5);
      }

      return $$6;
   }

   @Nullable
   private static bpf b(dad $$0, in $$1, dqh $$2) {
      dde $$3 = $$2.b();
      if ($$3 instanceof bpz) {
         return ((bpz)$$3).a($$2, $$0, $$1);
      } else if ($$2.t() && $$0.c_($$1) instanceof bpf $$5) {
         if ($$5 instanceof dnt && $$3 instanceof deh) {
            $$5 = deh.a((deh)$$3, $$2, $$0, $$1, true);
         }

         return $$5;
      } else {
         return null;
      }
   }

   @Nullable
   private static bpf a(dad $$0, double $$1, double $$2, double $$3) {
      List<brh> $$4 = $$0.a((brh)null, new etk($$1 - 0.5, $$2 - 0.5, $$3 - 0.5, $$1 + 0.5, $$2 + 0.5, $$3 + 0.5), brm.d);
      return !$$4.isEmpty() ? (bpf)$$4.get($$0.z.a($$4.size())) : null;
   }

   private static boolean a(csz $$0, csz $$1) {
      return $$0.G() <= $$0.i() && csz.c($$0, $$1);
   }

   @Override
   public double H() {
      return (double)this.o.u() + 0.5;
   }

   @Override
   public double I() {
      return (double)this.o.v() + 0.5;
   }

   @Override
   public double J() {
      return (double)this.o.w() + 0.5;
   }

   @Override
   public boolean K() {
      return true;
   }

   private void d(int $$0) {
      this.h = $$0;
   }

   private boolean t() {
      return this.h > 0;
   }

   private boolean u() {
      return this.h > 8;
   }

   @Override
   protected jf<csz> j() {
      return this.g;
   }

   @Override
   protected void a(jf<csz> $$0) {
      this.g = $$0;
   }

   public static void a(dad $$0, in $$1, dqh $$2, brh $$3, dol $$4) {
      if ($$3 instanceof chr $$5 && !$$5.p().d() && $$3.cI().d((double)(-$$1.u()), (double)(-$$1.v()), (double)(-$$1.w())).c($$4.ai_())) {
         a($$0, $$1, $$2, $$4, () -> a((bpf)$$4, $$5));
      }
   }

   @Override
   protected cod a(int $$0, clg $$1) {
      return new cpd($$0, $$1, this);
   }
}
