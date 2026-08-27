import java.util.List;
import java.util.function.BooleanSupplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import javax.annotation.Nullable;

public class djw extends dkb implements djv {
   public static final int f = 8;
   public static final int g = 5;
   private is<cpd> h = is.a(5, cpd.h);
   private int i = -1;
   private long j;

   public djw(hz $$0, dlj $$1) {
      super(diz.r, $$0, $$1);
   }

   @Override
   public void a(sw $$0) {
      super.a($$0);
      this.h = is.a(this.b(), cpd.h);
      if (!this.c_($$0)) {
         blq.b($$0, this.h);
      }

      this.i = $$0.h("TransferCooldown");
   }

   @Override
   protected void b(sw $$0) {
      super.b($$0);
      if (!this.d_($$0)) {
         blq.a($$0, this.h);
      }

      $$0.a("TransferCooldown", this.i);
   }

   @Override
   public int b() {
      return this.h.size();
   }

   @Override
   public cpd a(int $$0, int $$1) {
      this.e_(null);
      return blq.a(this.k(), $$0, $$1);
   }

   @Override
   public void a(int $$0, cpd $$1) {
      this.e_(null);
      this.k().set($$0, $$1);
      if ($$1.M() > this.al_()) {
         $$1.f(this.al_());
      }
   }

   @Override
   protected vq l() {
      return vq.c("container.hopper");
   }

   public static void a(cvr $$0, hz $$1, dlj $$2, djw $$3) {
      $$3.i--;
      $$3.j = $$0.X();
      if (!$$3.w()) {
         $$3.c(0);
         a($$0, $$1, $$2, $$3, () -> a($$0, (djv)$$3));
      }
   }

   private static boolean a(cvr $$0, hz $$1, dlj $$2, djw $$3, BooleanSupplier $$4) {
      if ($$0.B) {
         return false;
      } else {
         if (!$$3.w() && $$2.c(dcm.c)) {
            boolean $$5 = false;
            if (!$$3.aj_()) {
               $$5 = a($$0, $$1, $$2, (blp)$$3);
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
      for (cpd $$0 : this.h) {
         if ($$0.b() || $$0.M() != $$0.g()) {
            return false;
         }
      }

      return true;
   }

   private static boolean a(cvr $$0, hz $$1, dlj $$2, blp $$3) {
      blp $$4 = b($$0, $$1, $$2);
      if ($$4 == null) {
         return false;
      } else {
         ie $$5 = $$2.c(dcm.b).g();
         if (b($$4, $$5)) {
            return false;
         } else {
            for (int $$6 = 0; $$6 < $$3.b(); $$6++) {
               if (!$$3.a($$6).b()) {
                  cpd $$7 = $$3.a($$6).q();
                  cpd $$8 = a($$3, $$4, $$3.a($$6, 1), $$5);
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

   private static IntStream a(blp $$0, ie $$1) {
      return $$0 instanceof bmi ? IntStream.of(((bmi)$$0).a($$1)) : IntStream.range(0, $$0.b());
   }

   private static boolean b(blp $$0, ie $$1) {
      return a($$0, $$1).allMatch($$1x -> {
         cpd $$2 = $$0.a($$1x);
         return $$2.M() >= $$2.g();
      });
   }

   private static boolean c(blp $$0, ie $$1) {
      return a($$0, $$1).allMatch($$1x -> $$0.a($$1x).b());
   }

   public static boolean a(cvr $$0, djv $$1) {
      blp $$2 = c($$0, $$1);
      if ($$2 != null) {
         ie $$3 = ie.a;
         return c($$2, $$3) ? false : a($$2, $$3).anyMatch($$3x -> a($$1, $$2, $$3x, $$3));
      } else {
         for (cdw $$4 : b($$0, $$1)) {
            if (a($$1, $$4)) {
               return true;
            }
         }

         return false;
      }
   }

   private static boolean a(djv $$0, blp $$1, int $$2, ie $$3) {
      cpd $$4 = $$1.a($$2);
      if (!$$4.b() && a($$0, $$1, $$4, $$2, $$3)) {
         cpd $$5 = $$4.q();
         cpd $$6 = a($$1, $$0, $$1.a($$2, 1), null);
         if ($$6.b()) {
            $$1.e();
            return true;
         }

         $$1.a($$2, $$5);
      }

      return false;
   }

   public static boolean a(blp $$0, cdw $$1) {
      boolean $$2 = false;
      cpd $$3 = $$1.q().q();
      cpd $$4 = a(null, $$0, $$3, null);
      if ($$4.b()) {
         $$2 = true;
         $$1.a(cpd.h);
         $$1.am();
      } else {
         $$1.a($$4);
      }

      return $$2;
   }

   public static cpd a(@Nullable blp $$0, blp $$1, cpd $$2, @Nullable ie $$3) {
      if ($$1 instanceof bmi $$4 && $$3 != null) {
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

   private static boolean a(blp $$0, cpd $$1, int $$2, @Nullable ie $$3) {
      if (!$$0.b($$2, $$1)) {
         return false;
      } else {
         if ($$0 instanceof bmi $$4 && !$$4.a($$2, $$1, $$3)) {
            return false;
         }

         return true;
      }
   }

   private static boolean a(blp $$0, blp $$1, cpd $$2, int $$3, ie $$4) {
      if (!$$1.a($$0, $$3, $$2)) {
         return false;
      } else {
         if ($$1 instanceof bmi $$5 && !$$5.b($$3, $$2, $$4)) {
            return false;
         }

         return true;
      }
   }

   private static cpd b(@Nullable blp $$0, blp $$1, cpd $$2, int $$3, @Nullable ie $$4) {
      cpd $$5 = $$1.a($$3);
      if (a($$1, $$2, $$3, $$4)) {
         boolean $$6 = false;
         boolean $$7 = $$1.aj_();
         if ($$5.b()) {
            $$1.a($$3, $$2);
            $$2 = cpd.h;
            $$6 = true;
         } else if (a($$5, $$2)) {
            int $$8 = $$2.g() - $$5.M();
            int $$9 = Math.min($$2.M(), $$8);
            $$2.h($$9);
            $$5.g($$9);
            $$6 = $$9 > 0;
         }

         if ($$6) {
            if ($$7 && $$1 instanceof djw $$10 && !$$10.x()) {
               int $$11 = 0;
               if ($$0 instanceof djw $$12 && $$10.j >= $$12.j) {
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
   private static blp b(cvr $$0, hz $$1, dlj $$2) {
      ie $$3 = $$2.c(dcm.b);
      return a($$0, $$1.a($$3));
   }

   @Nullable
   private static blp c(cvr $$0, djv $$1) {
      return a($$0, $$1.I(), $$1.J() + 1.0, $$1.K());
   }

   public static List<cdw> b(cvr $$0, djv $$1) {
      return $$1.ak_()
         .e()
         .stream()
         .flatMap($$2 -> $$0.a(cdw.class, $$2.d($$1.I() - 0.5, $$1.J() - 0.5, $$1.K() - 0.5), bnv.a).stream())
         .collect(Collectors.toList());
   }

   @Nullable
   public static blp a(cvr $$0, hz $$1) {
      return a($$0, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5);
   }

   @Nullable
   private static blp a(cvr $$0, double $$1, double $$2, double $$3) {
      blp $$4 = null;
      hz $$5 = hz.a($$1, $$2, $$3);
      dlj $$6 = $$0.a_($$5);
      cys $$7 = $$6.b();
      if ($$7 instanceof bmj) {
         $$4 = ((bmj)$$7).a($$6, $$0, $$5);
      } else if ($$6.t()) {
         dix $$8 = $$0.c_($$5);
         if ($$8 instanceof blp) {
            $$4 = (blp)$$8;
            if ($$4 instanceof dje && $$7 instanceof czv) {
               $$4 = czv.a((czv)$$7, $$6, $$0, $$5, true);
            }
         }
      }

      if ($$4 == null) {
         List<bnq> $$9 = $$0.a((bnq)null, new enu($$1 - 0.5, $$2 - 0.5, $$3 - 0.5, $$1 + 0.5, $$2 + 0.5, $$3 + 0.5), bnv.d);
         if (!$$9.isEmpty()) {
            $$4 = (blp)$$9.get($$0.z.a($$9.size()));
         }
      }

      return $$4;
   }

   private static boolean a(cpd $$0, cpd $$1) {
      return $$0.M() <= $$0.g() && cpd.c($$0, $$1);
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
   protected is<cpd> k() {
      return this.h;
   }

   @Override
   protected void a(is<cpd> $$0) {
      this.h = $$0;
   }

   public static void a(cvr $$0, hz $$1, dlj $$2, bnq $$3, djw $$4) {
      if ($$3 instanceof cdw $$5 && !$$5.q().b() && eop.c(eop.a($$3.cH().d((double)(-$$1.u()), (double)(-$$1.v()), (double)(-$$1.w()))), $$4.ak_(), eod.i)) {
         a($$0, $$1, $$2, $$4, () -> a((blp)$$4, $$5));
      }
   }

   @Override
   protected ckf a(int $$0, chk $$1) {
      return new cle($$0, $$1, this);
   }
}
