import java.util.List;
import java.util.function.BooleanSupplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import javax.annotation.Nullable;

public class ddk extends ddp implements ddj {
   public static final int f = 8;
   public static final int g = 5;
   private hn<ciy> j = hn.a(5, ciy.b);
   private int k = -1;
   private long l;

   public ddk(gu $$0, dfa $$1) {
      super(dco.r, $$0, $$1);
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      this.j = hn.a(this.b(), ciy.b);
      if (!this.d($$0)) {
         bgk.b($$0, this.j);
      }

      this.k = $$0.h("TransferCooldown");
   }

   @Override
   protected void b(qr $$0) {
      super.b($$0);
      if (!this.e($$0)) {
         bgk.a($$0, this.j);
      }

      $$0.a("TransferCooldown", this.k);
   }

   @Override
   public int b() {
      return this.j.size();
   }

   @Override
   public ciy a(int $$0, int $$1) {
      this.e(null);
      return bgk.a(this.f(), $$0, $$1);
   }

   @Override
   public void a(int $$0, ciy $$1) {
      this.e(null);
      this.f().set($$0, $$1);
      if ($$1.L() > this.ac_()) {
         $$1.f(this.ac_());
      }
   }

   @Override
   protected tf g() {
      return tf.c("container.hopper");
   }

   public static void a(cpm $$0, gu $$1, dfa $$2, ddk $$3) {
      $$3.k--;
      $$3.l = $$0.V();
      if (!$$3.j()) {
         $$3.c(0);
         a($$0, $$1, $$2, $$3, () -> a($$0, (ddj)$$3));
      }
   }

   private static boolean a(cpm $$0, gu $$1, dfa $$2, ddk $$3, BooleanSupplier $$4) {
      if ($$0.B) {
         return false;
      } else {
         if (!$$3.j() && $$2.c(cwe.b)) {
            boolean $$5 = false;
            if (!$$3.ab_()) {
               $$5 = a($$0, $$1, $$2, (bgj)$$3);
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
      for (ciy $$0 : this.j) {
         if ($$0.b() || $$0.L() != $$0.g()) {
            return false;
         }
      }

      return true;
   }

   private static boolean a(cpm $$0, gu $$1, dfa $$2, bgj $$3) {
      bgj $$4 = b($$0, $$1, $$2);
      if ($$4 == null) {
         return false;
      } else {
         ha $$5 = $$2.c(cwe.a).g();
         if (b($$4, $$5)) {
            return false;
         } else {
            for (int $$6 = 0; $$6 < $$3.b(); $$6++) {
               if (!$$3.a($$6).b()) {
                  ciy $$7 = $$3.a($$6).p();
                  ciy $$8 = a($$3, $$4, $$3.a($$6, 1), $$5);
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

   private static IntStream a(bgj $$0, ha $$1) {
      return $$0 instanceof bgz ? IntStream.of(((bgz)$$0).a($$1)) : IntStream.range(0, $$0.b());
   }

   private static boolean b(bgj $$0, ha $$1) {
      return a($$0, $$1).allMatch($$1x -> {
         ciy $$2 = $$0.a($$1x);
         return $$2.L() >= $$2.g();
      });
   }

   private static boolean c(bgj $$0, ha $$1) {
      return a($$0, $$1).allMatch($$1x -> $$0.a($$1x).b());
   }

   public static boolean a(cpm $$0, ddj $$1) {
      bgj $$2 = c($$0, $$1);
      if ($$2 != null) {
         ha $$3 = ha.a;
         return c($$2, $$3) ? false : a($$2, $$3).anyMatch($$3x -> a($$1, $$2, $$3x, $$3));
      } else {
         for (byg $$4 : b($$0, $$1)) {
            if (a($$1, $$4)) {
               return true;
            }
         }

         return false;
      }
   }

   private static boolean a(ddj $$0, bgj $$1, int $$2, ha $$3) {
      ciy $$4 = $$1.a($$2);
      if (!$$4.b() && a($$0, $$1, $$4, $$2, $$3)) {
         ciy $$5 = $$4.p();
         ciy $$6 = a($$1, $$0, $$1.a($$2, 1), null);
         if ($$6.b()) {
            $$1.e();
            return true;
         }

         $$1.a($$2, $$5);
      }

      return false;
   }

   public static boolean a(bgj $$0, byg $$1) {
      boolean $$2 = false;
      ciy $$3 = $$1.j().p();
      ciy $$4 = a(null, $$0, $$3, null);
      if ($$4.b()) {
         $$2 = true;
         $$1.ak();
      } else {
         $$1.a($$4);
      }

      return $$2;
   }

   public static ciy a(@Nullable bgj $$0, bgj $$1, ciy $$2, @Nullable ha $$3) {
      if ($$1 instanceof bgz $$4 && $$3 != null) {
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

   private static boolean a(bgj $$0, ciy $$1, int $$2, @Nullable ha $$3) {
      if (!$$0.b($$2, $$1)) {
         return false;
      } else {
         if ($$0 instanceof bgz $$4 && !$$4.a($$2, $$1, $$3)) {
            return false;
         }

         return true;
      }
   }

   private static boolean a(bgj $$0, bgj $$1, ciy $$2, int $$3, ha $$4) {
      if (!$$1.a($$0, $$3, $$2)) {
         return false;
      } else {
         if ($$1 instanceof bgz $$5 && !$$5.b($$3, $$2, $$4)) {
            return false;
         }

         return true;
      }
   }

   private static ciy b(@Nullable bgj $$0, bgj $$1, ciy $$2, int $$3, @Nullable ha $$4) {
      ciy $$5 = $$1.a($$3);
      if (a($$1, $$2, $$3, $$4)) {
         boolean $$6 = false;
         boolean $$7 = $$1.ab_();
         if ($$5.b()) {
            $$1.a($$3, $$2);
            $$2 = ciy.b;
            $$6 = true;
         } else if (a($$5, $$2)) {
            int $$8 = $$2.g() - $$5.L();
            int $$9 = Math.min($$2.L(), $$8);
            $$2.h($$9);
            $$5.g($$9);
            $$6 = $$9 > 0;
         }

         if ($$6) {
            if ($$7 && $$1 instanceof ddk $$10 && !$$10.v()) {
               int $$11 = 0;
               if ($$0 instanceof ddk $$12 && $$10.l >= $$12.l) {
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
   private static bgj b(cpm $$0, gu $$1, dfa $$2) {
      ha $$3 = $$2.c(cwe.a);
      return a($$0, $$1.a($$3));
   }

   @Nullable
   private static bgj c(cpm $$0, ddj $$1) {
      return a($$0, $$1.G(), $$1.H() + 1.0, $$1.J());
   }

   public static List<byg> b(cpm $$0, ddj $$1) {
      return $$1.aq_()
         .e()
         .stream()
         .flatMap($$2 -> $$0.a(byg.class, $$2.d($$1.G() - 0.5, $$1.H() - 0.5, $$1.J() - 0.5), bil.a).stream())
         .collect(Collectors.toList());
   }

   @Nullable
   public static bgj a(cpm $$0, gu $$1) {
      return a($$0, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5);
   }

   @Nullable
   private static bgj a(cpm $$0, double $$1, double $$2, double $$3) {
      bgj $$4 = null;
      gu $$5 = gu.a($$1, $$2, $$3);
      dfa $$6 = $$0.a_($$5);
      csm $$7 = $$6.b();
      if ($$7 instanceof bha) {
         $$4 = ((bha)$$7).a($$6, $$0, $$5);
      } else if ($$6.t()) {
         dcm $$8 = $$0.c_($$5);
         if ($$8 instanceof bgj) {
            $$4 = (bgj)$$8;
            if ($$4 instanceof dct && $$7 instanceof cto) {
               $$4 = cto.a((cto)$$7, $$6, $$0, $$5, true);
            }
         }
      }

      if ($$4 == null) {
         List<bii> $$9 = $$0.a((bii)null, new egz($$1 - 0.5, $$2 - 0.5, $$3 - 0.5, $$1 + 0.5, $$2 + 0.5, $$3 + 0.5), bil.d);
         if (!$$9.isEmpty()) {
            $$4 = (bgj)$$9.get($$0.z.a($$9.size()));
         }
      }

      return $$4;
   }

   private static boolean a(ciy $$0, ciy $$1) {
      return $$0.L() <= $$0.g() && ciy.c($$0, $$1);
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
   protected hn<ciy> f() {
      return this.j;
   }

   @Override
   protected void a(hn<ciy> $$0) {
      this.j = $$0;
   }

   public static void a(cpm $$0, gu $$1, dfa $$2, bii $$3, ddk $$4) {
      if ($$3 instanceof byg && ehu.c(ehu.a($$3.cG().d((double)(-$$1.u()), (double)(-$$1.v()), (double)(-$$1.w()))), $$4.aq_(), ehi.i)) {
         a($$0, $$1, $$2, $$4, () -> a($$4, (byg)$$3));
      }
   }

   @Override
   protected cee a(int $$0, cbm $$1) {
      return new cfb($$0, $$1, this);
   }
}
