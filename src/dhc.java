import java.util.List;
import java.util.function.BooleanSupplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import javax.annotation.Nullable;

public class dhc extends dhh implements dhb {
   public static final int f = 8;
   public static final int g = 5;
   private io<cmh> h = io.a(5, cmh.f);
   private int i = -1;
   private long j;

   public dhc(hv $$0, dip $$1) {
      super(dgf.r, $$0, $$1);
   }

   @Override
   public void a(sj $$0) {
      super.a($$0);
      this.h = io.a(this.b(), cmh.f);
      if (!this.c_($$0)) {
         bjf.b($$0, this.h);
      }

      this.i = $$0.h("TransferCooldown");
   }

   @Override
   protected void b(sj $$0) {
      super.b($$0);
      if (!this.d_($$0)) {
         bjf.a($$0, this.h);
      }

      $$0.a("TransferCooldown", this.i);
   }

   @Override
   public int b() {
      return this.h.size();
   }

   @Override
   public cmh a(int $$0, int $$1) {
      this.e_(null);
      return bjf.a(this.k(), $$0, $$1);
   }

   @Override
   public void a(int $$0, cmh $$1) {
      this.e_(null);
      this.k().set($$0, $$1);
      if ($$1.L() > this.ak_()) {
         $$1.f(this.ak_());
      }
   }

   @Override
   protected vb l() {
      return vb.c("container.hopper");
   }

   public static void a(csy $$0, hv $$1, dip $$2, dhc $$3) {
      $$3.i--;
      $$3.j = $$0.W();
      if (!$$3.w()) {
         $$3.c(0);
         a($$0, $$1, $$2, $$3, () -> a($$0, (dhb)$$3));
      }
   }

   private static boolean a(csy $$0, hv $$1, dip $$2, dhc $$3, BooleanSupplier $$4) {
      if ($$0.B) {
         return false;
      } else {
         if (!$$3.w() && $$2.c(czt.c)) {
            boolean $$5 = false;
            if (!$$3.ai_()) {
               $$5 = a($$0, $$1, $$2, (bje)$$3);
            }

            if (!$$3.m()) {
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

   private boolean m() {
      for (cmh $$0 : this.h) {
         if ($$0.b() || $$0.L() != $$0.g()) {
            return false;
         }
      }

      return true;
   }

   private static boolean a(csy $$0, hv $$1, dip $$2, bje $$3) {
      bje $$4 = b($$0, $$1, $$2);
      if ($$4 == null) {
         return false;
      } else {
         ia $$5 = $$2.c(czt.b).g();
         if (b($$4, $$5)) {
            return false;
         } else {
            for (int $$6 = 0; $$6 < $$3.b(); $$6++) {
               if (!$$3.a($$6).b()) {
                  cmh $$7 = $$3.a($$6).p();
                  cmh $$8 = a($$3, $$4, $$3.a($$6, 1), $$5);
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

   private static IntStream a(bje $$0, ia $$1) {
      return $$0 instanceof bjw ? IntStream.of(((bjw)$$0).a($$1)) : IntStream.range(0, $$0.b());
   }

   private static boolean b(bje $$0, ia $$1) {
      return a($$0, $$1).allMatch($$1x -> {
         cmh $$2 = $$0.a($$1x);
         return $$2.L() >= $$2.g();
      });
   }

   private static boolean c(bje $$0, ia $$1) {
      return a($$0, $$1).allMatch($$1x -> $$0.a($$1x).b());
   }

   public static boolean a(csy $$0, dhb $$1) {
      bje $$2 = c($$0, $$1);
      if ($$2 != null) {
         ia $$3 = ia.a;
         return c($$2, $$3) ? false : a($$2, $$3).anyMatch($$3x -> a($$1, $$2, $$3x, $$3));
      } else {
         for (cbe $$4 : b($$0, $$1)) {
            if (a($$1, $$4)) {
               return true;
            }
         }

         return false;
      }
   }

   private static boolean a(dhb $$0, bje $$1, int $$2, ia $$3) {
      cmh $$4 = $$1.a($$2);
      if (!$$4.b() && a($$0, $$1, $$4, $$2, $$3)) {
         cmh $$5 = $$4.p();
         cmh $$6 = a($$1, $$0, $$1.a($$2, 1), null);
         if ($$6.b()) {
            $$1.e();
            return true;
         }

         $$1.a($$2, $$5);
      }

      return false;
   }

   public static boolean a(bje $$0, cbe $$1) {
      boolean $$2 = false;
      cmh $$3 = $$1.q().p();
      cmh $$4 = a(null, $$0, $$3, null);
      if ($$4.b()) {
         $$2 = true;
         $$1.a(cmh.f);
         $$1.am();
      } else {
         $$1.a($$4);
      }

      return $$2;
   }

   public static cmh a(@Nullable bje $$0, bje $$1, cmh $$2, @Nullable ia $$3) {
      if ($$1 instanceof bjw $$4 && $$3 != null) {
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

   private static boolean a(bje $$0, cmh $$1, int $$2, @Nullable ia $$3) {
      if (!$$0.b($$2, $$1)) {
         return false;
      } else {
         if ($$0 instanceof bjw $$4 && !$$4.a($$2, $$1, $$3)) {
            return false;
         }

         return true;
      }
   }

   private static boolean a(bje $$0, bje $$1, cmh $$2, int $$3, ia $$4) {
      if (!$$1.a($$0, $$3, $$2)) {
         return false;
      } else {
         if ($$1 instanceof bjw $$5 && !$$5.b($$3, $$2, $$4)) {
            return false;
         }

         return true;
      }
   }

   private static cmh b(@Nullable bje $$0, bje $$1, cmh $$2, int $$3, @Nullable ia $$4) {
      cmh $$5 = $$1.a($$3);
      if (a($$1, $$2, $$3, $$4)) {
         boolean $$6 = false;
         boolean $$7 = $$1.ai_();
         if ($$5.b()) {
            $$1.a($$3, $$2);
            $$2 = cmh.f;
            $$6 = true;
         } else if (a($$5, $$2)) {
            int $$8 = $$2.g() - $$5.L();
            int $$9 = Math.min($$2.L(), $$8);
            $$2.h($$9);
            $$5.g($$9);
            $$6 = $$9 > 0;
         }

         if ($$6) {
            if ($$7 && $$1 instanceof dhc $$10 && !$$10.x()) {
               int $$11 = 0;
               if ($$0 instanceof dhc $$12 && $$10.j >= $$12.j) {
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
   private static bje b(csy $$0, hv $$1, dip $$2) {
      ia $$3 = $$2.c(czt.b);
      return a($$0, $$1.a($$3));
   }

   @Nullable
   private static bje c(csy $$0, dhb $$1) {
      return a($$0, $$1.I(), $$1.J() + 1.0, $$1.K());
   }

   public static List<cbe> b(csy $$0, dhb $$1) {
      return $$1.aj_()
         .e()
         .stream()
         .flatMap($$2 -> $$0.a(cbe.class, $$2.d($$1.I() - 0.5, $$1.J() - 0.5, $$1.K() - 0.5), bli.a).stream())
         .collect(Collectors.toList());
   }

   @Nullable
   public static bje a(csy $$0, hv $$1) {
      return a($$0, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5);
   }

   @Nullable
   private static bje a(csy $$0, double $$1, double $$2, double $$3) {
      bje $$4 = null;
      hv $$5 = hv.a($$1, $$2, $$3);
      dip $$6 = $$0.a_($$5);
      cvz $$7 = $$6.b();
      if ($$7 instanceof bjx) {
         $$4 = ((bjx)$$7).a($$6, $$0, $$5);
      } else if ($$6.t()) {
         dgd $$8 = $$0.c_($$5);
         if ($$8 instanceof bje) {
            $$4 = (bje)$$8;
            if ($$4 instanceof dgk && $$7 instanceof cxc) {
               $$4 = cxc.a((cxc)$$7, $$6, $$0, $$5, true);
            }
         }
      }

      if ($$4 == null) {
         List<blf> $$9 = $$0.a((blf)null, new ekw($$1 - 0.5, $$2 - 0.5, $$3 - 0.5, $$1 + 0.5, $$2 + 0.5, $$3 + 0.5), bli.d);
         if (!$$9.isEmpty()) {
            $$4 = (bje)$$9.get($$0.z.a($$9.size()));
         }
      }

      return $$4;
   }

   private static boolean a(cmh $$0, cmh $$1) {
      return $$0.L() <= $$0.g() && cmh.c($$0, $$1);
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

   private boolean w() {
      return this.i > 0;
   }

   private boolean x() {
      return this.i > 8;
   }

   @Override
   protected io<cmh> k() {
      return this.h;
   }

   @Override
   protected void a(io<cmh> $$0) {
      this.h = $$0;
   }

   public static void a(csy $$0, hv $$1, dip $$2, blf $$3, dhc $$4) {
      if ($$3 instanceof cbe $$5 && !$$5.q().b() && elr.c(elr.a($$3.cH().d((double)(-$$1.u()), (double)(-$$1.v()), (double)(-$$1.w()))), $$4.aj_(), elf.i)) {
         a($$0, $$1, $$2, $$4, () -> a((bje)$$4, $$5));
      }
   }

   @Override
   protected chk a(int $$0, ceq $$1) {
      return new cij($$0, $$1, this);
   }
}
