import java.util.List;
import java.util.function.BooleanSupplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import javax.annotation.Nullable;

public class ddx extends dec implements ddw {
   public static final int f = 8;
   public static final int g = 5;
   private hn<cjl> j = hn.a(5, cjl.b);
   private int k = -1;
   private long l;

   public ddx(gw $$0, dfd $$1) {
      super(ddb.r, $$0, $$1);
   }

   @Override
   public void a(qw $$0) {
      super.a($$0);
      this.j = hn.a(this.b(), cjl.b);
      if (!this.d($$0)) {
         bgy.b($$0, this.j);
      }

      this.k = $$0.h("TransferCooldown");
   }

   @Override
   protected void b(qw $$0) {
      super.b($$0);
      if (!this.e($$0)) {
         bgy.a($$0, this.j);
      }

      $$0.a("TransferCooldown", this.k);
   }

   @Override
   public int b() {
      return this.j.size();
   }

   @Override
   public cjl a(int $$0, int $$1) {
      this.e(null);
      return bgy.a(this.f(), $$0, $$1);
   }

   @Override
   public void a(int $$0, cjl $$1) {
      this.e(null);
      this.f().set($$0, $$1);
      if ($$1.L() > this.ag_()) {
         $$1.f(this.ag_());
      }
   }

   @Override
   protected tl g() {
      return tl.c("container.hopper");
   }

   public static void a(cqb $$0, gw $$1, dfd $$2, ddx $$3) {
      $$3.k--;
      $$3.l = $$0.V();
      if (!$$3.j()) {
         $$3.c(0);
         a($$0, $$1, $$2, $$3, () -> a($$0, (ddw)$$3));
      }
   }

   private static boolean a(cqb $$0, gw $$1, dfd $$2, ddx $$3, BooleanSupplier $$4) {
      if ($$0.B) {
         return false;
      } else {
         if (!$$3.j() && $$2.c(cwv.c)) {
            boolean $$5 = false;
            if (!$$3.af_()) {
               $$5 = a($$0, $$1, $$2, (bgx)$$3);
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
      for (cjl $$0 : this.j) {
         if ($$0.b() || $$0.L() != $$0.g()) {
            return false;
         }
      }

      return true;
   }

   private static boolean a(cqb $$0, gw $$1, dfd $$2, bgx $$3) {
      bgx $$4 = b($$0, $$1, $$2);
      if ($$4 == null) {
         return false;
      } else {
         ha $$5 = $$2.c(cwv.b).g();
         if (b($$4, $$5)) {
            return false;
         } else {
            for (int $$6 = 0; $$6 < $$3.b(); $$6++) {
               if (!$$3.a($$6).b()) {
                  cjl $$7 = $$3.a($$6).p();
                  cjl $$8 = a($$3, $$4, $$3.a($$6, 1), $$5);
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

   private static IntStream a(bgx $$0, ha $$1) {
      return $$0 instanceof bhn ? IntStream.of(((bhn)$$0).a($$1)) : IntStream.range(0, $$0.b());
   }

   private static boolean b(bgx $$0, ha $$1) {
      return a($$0, $$1).allMatch($$1x -> {
         cjl $$2 = $$0.a($$1x);
         return $$2.L() >= $$2.g();
      });
   }

   private static boolean c(bgx $$0, ha $$1) {
      return a($$0, $$1).allMatch($$1x -> $$0.a($$1x).b());
   }

   public static boolean a(cqb $$0, ddw $$1) {
      bgx $$2 = c($$0, $$1);
      if ($$2 != null) {
         ha $$3 = ha.a;
         return c($$2, $$3) ? false : a($$2, $$3).anyMatch($$3x -> a($$1, $$2, $$3x, $$3));
      } else {
         for (byt $$4 : b($$0, $$1)) {
            if (a($$1, $$4)) {
               return true;
            }
         }

         return false;
      }
   }

   private static boolean a(ddw $$0, bgx $$1, int $$2, ha $$3) {
      cjl $$4 = $$1.a($$2);
      if (!$$4.b() && a($$0, $$1, $$4, $$2, $$3)) {
         cjl $$5 = $$4.p();
         cjl $$6 = a($$1, $$0, $$1.a($$2, 1), null);
         if ($$6.b()) {
            $$1.e();
            return true;
         }

         $$1.a($$2, $$5);
      }

      return false;
   }

   public static boolean a(bgx $$0, byt $$1) {
      boolean $$2 = false;
      cjl $$3 = $$1.q().p();
      cjl $$4 = a(null, $$0, $$3, null);
      if ($$4.b()) {
         $$2 = true;
         $$1.a(cjl.b);
         $$1.ak();
      } else {
         $$1.a($$4);
      }

      return $$2;
   }

   public static cjl a(@Nullable bgx $$0, bgx $$1, cjl $$2, @Nullable ha $$3) {
      if ($$1 instanceof bhn $$4 && $$3 != null) {
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

   private static boolean a(bgx $$0, cjl $$1, int $$2, @Nullable ha $$3) {
      if (!$$0.b($$2, $$1)) {
         return false;
      } else {
         if ($$0 instanceof bhn $$4 && !$$4.a($$2, $$1, $$3)) {
            return false;
         }

         return true;
      }
   }

   private static boolean a(bgx $$0, bgx $$1, cjl $$2, int $$3, ha $$4) {
      if (!$$1.a($$0, $$3, $$2)) {
         return false;
      } else {
         if ($$1 instanceof bhn $$5 && !$$5.b($$3, $$2, $$4)) {
            return false;
         }

         return true;
      }
   }

   private static cjl b(@Nullable bgx $$0, bgx $$1, cjl $$2, int $$3, @Nullable ha $$4) {
      cjl $$5 = $$1.a($$3);
      if (a($$1, $$2, $$3, $$4)) {
         boolean $$6 = false;
         boolean $$7 = $$1.af_();
         if ($$5.b()) {
            $$1.a($$3, $$2);
            $$2 = cjl.b;
            $$6 = true;
         } else if (a($$5, $$2)) {
            int $$8 = $$2.g() - $$5.L();
            int $$9 = Math.min($$2.L(), $$8);
            $$2.h($$9);
            $$5.g($$9);
            $$6 = $$9 > 0;
         }

         if ($$6) {
            if ($$7 && $$1 instanceof ddx $$10 && !$$10.v()) {
               int $$11 = 0;
               if ($$0 instanceof ddx $$12 && $$10.l >= $$12.l) {
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
   private static bgx b(cqb $$0, gw $$1, dfd $$2) {
      ha $$3 = $$2.c(cwv.b);
      return a($$0, $$1.a($$3));
   }

   @Nullable
   private static bgx c(cqb $$0, ddw $$1) {
      return a($$0, $$1.M(), $$1.N() + 1.0, $$1.O());
   }

   public static List<byt> b(cqb $$0, ddw $$1) {
      return $$1.au_()
         .e()
         .stream()
         .flatMap($$2 -> $$0.a(byt.class, $$2.d($$1.M() - 0.5, $$1.N() - 0.5, $$1.O() - 0.5), biz.a).stream())
         .collect(Collectors.toList());
   }

   @Nullable
   public static bgx a(cqb $$0, gw $$1) {
      return a($$0, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5);
   }

   @Nullable
   private static bgx a(cqb $$0, double $$1, double $$2, double $$3) {
      bgx $$4 = null;
      gw $$5 = gw.a($$1, $$2, $$3);
      dfd $$6 = $$0.a_($$5);
      ctc $$7 = $$6.b();
      if ($$7 instanceof bho) {
         $$4 = ((bho)$$7).a($$6, $$0, $$5);
      } else if ($$6.t()) {
         dcz $$8 = $$0.c_($$5);
         if ($$8 instanceof bgx) {
            $$4 = (bgx)$$8;
            if ($$4 instanceof ddg && $$7 instanceof cuf) {
               $$4 = cuf.a((cuf)$$7, $$6, $$0, $$5, true);
            }
         }
      }

      if ($$4 == null) {
         List<biw> $$9 = $$0.a((biw)null, new ehc($$1 - 0.5, $$2 - 0.5, $$3 - 0.5, $$1 + 0.5, $$2 + 0.5, $$3 + 0.5), biz.d);
         if (!$$9.isEmpty()) {
            $$4 = (bgx)$$9.get($$0.z.a($$9.size()));
         }
      }

      return $$4;
   }

   private static boolean a(cjl $$0, cjl $$1) {
      return $$0.L() <= $$0.g() && cjl.c($$0, $$1);
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
   protected hn<cjl> f() {
      return this.j;
   }

   @Override
   protected void a(hn<cjl> $$0) {
      this.j = $$0;
   }

   public static void a(cqb $$0, gw $$1, dfd $$2, biw $$3, ddx $$4) {
      if ($$3 instanceof byt $$5 && !$$5.q().b() && ehx.c(ehx.a($$3.cG().d((double)(-$$1.u()), (double)(-$$1.v()), (double)(-$$1.w()))), $$4.au_(), ehl.i)) {
         a($$0, $$1, $$2, $$4, () -> a((bgx)$$4, $$5));
      }
   }

   @Override
   protected cer a(int $$0, cbz $$1) {
      return new cfo($$0, $$1, this);
   }
}
