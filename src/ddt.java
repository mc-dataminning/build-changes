import java.util.List;
import java.util.function.BooleanSupplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import javax.annotation.Nullable;

public class ddt extends ddy implements dds {
   public static final int f = 8;
   public static final int g = 5;
   private hn<cjf> j = hn.a(5, cjf.b);
   private int k = -1;
   private long l;

   public ddt(gw $$0, dfj $$1) {
      super(dcx.r, $$0, $$1);
   }

   @Override
   public void a(qw $$0) {
      super.a($$0);
      this.j = hn.a(this.b(), cjf.b);
      if (!this.d($$0)) {
         bgs.b($$0, this.j);
      }

      this.k = $$0.h("TransferCooldown");
   }

   @Override
   protected void b(qw $$0) {
      super.b($$0);
      if (!this.e($$0)) {
         bgs.a($$0, this.j);
      }

      $$0.a("TransferCooldown", this.k);
   }

   @Override
   public int b() {
      return this.j.size();
   }

   @Override
   public cjf a(int $$0, int $$1) {
      this.e(null);
      return bgs.a(this.f(), $$0, $$1);
   }

   @Override
   public void a(int $$0, cjf $$1) {
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

   public static void a(cpv $$0, gw $$1, dfj $$2, ddt $$3) {
      $$3.k--;
      $$3.l = $$0.V();
      if (!$$3.j()) {
         $$3.c(0);
         a($$0, $$1, $$2, $$3, () -> a($$0, (dds)$$3));
      }
   }

   private static boolean a(cpv $$0, gw $$1, dfj $$2, ddt $$3, BooleanSupplier $$4) {
      if ($$0.B) {
         return false;
      } else {
         if (!$$3.j() && $$2.c(cwn.b)) {
            boolean $$5 = false;
            if (!$$3.af_()) {
               $$5 = a($$0, $$1, $$2, (bgr)$$3);
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
      for (cjf $$0 : this.j) {
         if ($$0.b() || $$0.L() != $$0.g()) {
            return false;
         }
      }

      return true;
   }

   private static boolean a(cpv $$0, gw $$1, dfj $$2, bgr $$3) {
      bgr $$4 = b($$0, $$1, $$2);
      if ($$4 == null) {
         return false;
      } else {
         ha $$5 = $$2.c(cwn.a).g();
         if (b($$4, $$5)) {
            return false;
         } else {
            for (int $$6 = 0; $$6 < $$3.b(); $$6++) {
               if (!$$3.a($$6).b()) {
                  cjf $$7 = $$3.a($$6).p();
                  cjf $$8 = a($$3, $$4, $$3.a($$6, 1), $$5);
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

   private static IntStream a(bgr $$0, ha $$1) {
      return $$0 instanceof bhh ? IntStream.of(((bhh)$$0).a($$1)) : IntStream.range(0, $$0.b());
   }

   private static boolean b(bgr $$0, ha $$1) {
      return a($$0, $$1).allMatch($$1x -> {
         cjf $$2 = $$0.a($$1x);
         return $$2.L() >= $$2.g();
      });
   }

   private static boolean c(bgr $$0, ha $$1) {
      return a($$0, $$1).allMatch($$1x -> $$0.a($$1x).b());
   }

   public static boolean a(cpv $$0, dds $$1) {
      bgr $$2 = c($$0, $$1);
      if ($$2 != null) {
         ha $$3 = ha.a;
         return c($$2, $$3) ? false : a($$2, $$3).anyMatch($$3x -> a($$1, $$2, $$3x, $$3));
      } else {
         for (byn $$4 : b($$0, $$1)) {
            if (a($$1, $$4)) {
               return true;
            }
         }

         return false;
      }
   }

   private static boolean a(dds $$0, bgr $$1, int $$2, ha $$3) {
      cjf $$4 = $$1.a($$2);
      if (!$$4.b() && a($$0, $$1, $$4, $$2, $$3)) {
         cjf $$5 = $$4.p();
         cjf $$6 = a($$1, $$0, $$1.a($$2, 1), null);
         if ($$6.b()) {
            $$1.e();
            return true;
         }

         $$1.a($$2, $$5);
      }

      return false;
   }

   public static boolean a(bgr $$0, byn $$1) {
      boolean $$2 = false;
      cjf $$3 = $$1.q().p();
      cjf $$4 = a(null, $$0, $$3, null);
      if ($$4.b()) {
         $$2 = true;
         $$1.a(cjf.b);
         $$1.ak();
      } else {
         $$1.a($$4);
      }

      return $$2;
   }

   public static cjf a(@Nullable bgr $$0, bgr $$1, cjf $$2, @Nullable ha $$3) {
      if ($$1 instanceof bhh $$4 && $$3 != null) {
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

   private static boolean a(bgr $$0, cjf $$1, int $$2, @Nullable ha $$3) {
      if (!$$0.b($$2, $$1)) {
         return false;
      } else {
         if ($$0 instanceof bhh $$4 && !$$4.a($$2, $$1, $$3)) {
            return false;
         }

         return true;
      }
   }

   private static boolean a(bgr $$0, bgr $$1, cjf $$2, int $$3, ha $$4) {
      if (!$$1.a($$0, $$3, $$2)) {
         return false;
      } else {
         if ($$1 instanceof bhh $$5 && !$$5.b($$3, $$2, $$4)) {
            return false;
         }

         return true;
      }
   }

   private static cjf b(@Nullable bgr $$0, bgr $$1, cjf $$2, int $$3, @Nullable ha $$4) {
      cjf $$5 = $$1.a($$3);
      if (a($$1, $$2, $$3, $$4)) {
         boolean $$6 = false;
         boolean $$7 = $$1.af_();
         if ($$5.b()) {
            $$1.a($$3, $$2);
            $$2 = cjf.b;
            $$6 = true;
         } else if (a($$5, $$2)) {
            int $$8 = $$2.g() - $$5.L();
            int $$9 = Math.min($$2.L(), $$8);
            $$2.h($$9);
            $$5.g($$9);
            $$6 = $$9 > 0;
         }

         if ($$6) {
            if ($$7 && $$1 instanceof ddt $$10 && !$$10.v()) {
               int $$11 = 0;
               if ($$0 instanceof ddt $$12 && $$10.l >= $$12.l) {
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
   private static bgr b(cpv $$0, gw $$1, dfj $$2) {
      ha $$3 = $$2.c(cwn.a);
      return a($$0, $$1.a($$3));
   }

   @Nullable
   private static bgr c(cpv $$0, dds $$1) {
      return a($$0, $$1.M(), $$1.N() + 1.0, $$1.O());
   }

   public static List<byn> b(cpv $$0, dds $$1) {
      return $$1.au_()
         .e()
         .stream()
         .flatMap($$2 -> $$0.a(byn.class, $$2.d($$1.M() - 0.5, $$1.N() - 0.5, $$1.O() - 0.5), bit.a).stream())
         .collect(Collectors.toList());
   }

   @Nullable
   public static bgr a(cpv $$0, gw $$1) {
      return a($$0, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5);
   }

   @Nullable
   private static bgr a(cpv $$0, double $$1, double $$2, double $$3) {
      bgr $$4 = null;
      gw $$5 = gw.a($$1, $$2, $$3);
      dfj $$6 = $$0.a_($$5);
      csv $$7 = $$6.b();
      if ($$7 instanceof bhi) {
         $$4 = ((bhi)$$7).a($$6, $$0, $$5);
      } else if ($$6.t()) {
         dcv $$8 = $$0.c_($$5);
         if ($$8 instanceof bgr) {
            $$4 = (bgr)$$8;
            if ($$4 instanceof ddc && $$7 instanceof ctx) {
               $$4 = ctx.a((ctx)$$7, $$6, $$0, $$5, true);
            }
         }
      }

      if ($$4 == null) {
         List<biq> $$9 = $$0.a((biq)null, new ehi($$1 - 0.5, $$2 - 0.5, $$3 - 0.5, $$1 + 0.5, $$2 + 0.5, $$3 + 0.5), bit.d);
         if (!$$9.isEmpty()) {
            $$4 = (bgr)$$9.get($$0.z.a($$9.size()));
         }
      }

      return $$4;
   }

   private static boolean a(cjf $$0, cjf $$1) {
      return $$0.L() <= $$0.g() && cjf.c($$0, $$1);
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
   protected hn<cjf> f() {
      return this.j;
   }

   @Override
   protected void a(hn<cjf> $$0) {
      this.j = $$0;
   }

   public static void a(cpv $$0, gw $$1, dfj $$2, biq $$3, ddt $$4) {
      if ($$3 instanceof byn $$5 && !$$5.q().b() && eid.c(eid.a($$3.cG().d((double)(-$$1.u()), (double)(-$$1.v()), (double)(-$$1.w()))), $$4.au_(), ehr.i)) {
         a($$0, $$1, $$2, $$4, () -> a((bgr)$$4, $$5));
      }
   }

   @Override
   protected cel a(int $$0, cbt $$1) {
      return new cfi($$0, $$1, this);
   }
}
