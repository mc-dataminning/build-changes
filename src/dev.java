import java.util.List;
import java.util.function.BooleanSupplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import javax.annotation.Nullable;

public class dev extends dfa implements deu {
   public static final int f = 8;
   public static final int g = 5;
   private il<ckj> j = il.a(5, ckj.b);
   private int k = -1;
   private long l;

   public dev(ht $$0, dgb $$1) {
      super(ddz.r, $$0, $$1);
   }

   @Override
   public void a(rt $$0) {
      super.a($$0);
      this.j = il.a(this.b(), ckj.b);
      if (!this.d($$0)) {
         bhv.b($$0, this.j);
      }

      this.k = $$0.h("TransferCooldown");
   }

   @Override
   protected void b(rt $$0) {
      super.b($$0);
      if (!this.e($$0)) {
         bhv.a($$0, this.j);
      }

      $$0.a("TransferCooldown", this.k);
   }

   @Override
   public int b() {
      return this.j.size();
   }

   @Override
   public ckj a(int $$0, int $$1) {
      this.e(null);
      return bhv.a(this.f(), $$0, $$1);
   }

   @Override
   public void a(int $$0, ckj $$1) {
      this.e(null);
      this.f().set($$0, $$1);
      if ($$1.L() > this.aj_()) {
         $$1.f(this.aj_());
      }
   }

   @Override
   protected ui g() {
      return ui.c("container.hopper");
   }

   public static void a(cqz $$0, ht $$1, dgb $$2, dev $$3) {
      $$3.k--;
      $$3.l = $$0.V();
      if (!$$3.j()) {
         $$3.c(0);
         a($$0, $$1, $$2, $$3, () -> a($$0, (deu)$$3));
      }
   }

   private static boolean a(cqz $$0, ht $$1, dgb $$2, dev $$3, BooleanSupplier $$4) {
      if ($$0.B) {
         return false;
      } else {
         if (!$$3.j() && $$2.c(cxt.c)) {
            boolean $$5 = false;
            if (!$$3.ai_()) {
               $$5 = a($$0, $$1, $$2, (bhu)$$3);
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
      for (ckj $$0 : this.j) {
         if ($$0.b() || $$0.L() != $$0.g()) {
            return false;
         }
      }

      return true;
   }

   private static boolean a(cqz $$0, ht $$1, dgb $$2, bhu $$3) {
      bhu $$4 = b($$0, $$1, $$2);
      if ($$4 == null) {
         return false;
      } else {
         hx $$5 = $$2.c(cxt.b).g();
         if (b($$4, $$5)) {
            return false;
         } else {
            for (int $$6 = 0; $$6 < $$3.b(); $$6++) {
               if (!$$3.a($$6).b()) {
                  ckj $$7 = $$3.a($$6).p();
                  ckj $$8 = a($$3, $$4, $$3.a($$6, 1), $$5);
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

   private static IntStream a(bhu $$0, hx $$1) {
      return $$0 instanceof bik ? IntStream.of(((bik)$$0).a($$1)) : IntStream.range(0, $$0.b());
   }

   private static boolean b(bhu $$0, hx $$1) {
      return a($$0, $$1).allMatch($$1x -> {
         ckj $$2 = $$0.a($$1x);
         return $$2.L() >= $$2.g();
      });
   }

   private static boolean c(bhu $$0, hx $$1) {
      return a($$0, $$1).allMatch($$1x -> $$0.a($$1x).b());
   }

   public static boolean a(cqz $$0, deu $$1) {
      bhu $$2 = c($$0, $$1);
      if ($$2 != null) {
         hx $$3 = hx.a;
         return c($$2, $$3) ? false : a($$2, $$3).anyMatch($$3x -> a($$1, $$2, $$3x, $$3));
      } else {
         for (bzq $$4 : b($$0, $$1)) {
            if (a($$1, $$4)) {
               return true;
            }
         }

         return false;
      }
   }

   private static boolean a(deu $$0, bhu $$1, int $$2, hx $$3) {
      ckj $$4 = $$1.a($$2);
      if (!$$4.b() && a($$0, $$1, $$4, $$2, $$3)) {
         ckj $$5 = $$4.p();
         ckj $$6 = a($$1, $$0, $$1.a($$2, 1), null);
         if ($$6.b()) {
            $$1.e();
            return true;
         }

         $$1.a($$2, $$5);
      }

      return false;
   }

   public static boolean a(bhu $$0, bzq $$1) {
      boolean $$2 = false;
      ckj $$3 = $$1.q().p();
      ckj $$4 = a(null, $$0, $$3, null);
      if ($$4.b()) {
         $$2 = true;
         $$1.a(ckj.b);
         $$1.ak();
      } else {
         $$1.a($$4);
      }

      return $$2;
   }

   public static ckj a(@Nullable bhu $$0, bhu $$1, ckj $$2, @Nullable hx $$3) {
      if ($$1 instanceof bik $$4 && $$3 != null) {
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

   private static boolean a(bhu $$0, ckj $$1, int $$2, @Nullable hx $$3) {
      if (!$$0.b($$2, $$1)) {
         return false;
      } else {
         if ($$0 instanceof bik $$4 && !$$4.a($$2, $$1, $$3)) {
            return false;
         }

         return true;
      }
   }

   private static boolean a(bhu $$0, bhu $$1, ckj $$2, int $$3, hx $$4) {
      if (!$$1.a($$0, $$3, $$2)) {
         return false;
      } else {
         if ($$1 instanceof bik $$5 && !$$5.b($$3, $$2, $$4)) {
            return false;
         }

         return true;
      }
   }

   private static ckj b(@Nullable bhu $$0, bhu $$1, ckj $$2, int $$3, @Nullable hx $$4) {
      ckj $$5 = $$1.a($$3);
      if (a($$1, $$2, $$3, $$4)) {
         boolean $$6 = false;
         boolean $$7 = $$1.ai_();
         if ($$5.b()) {
            $$1.a($$3, $$2);
            $$2 = ckj.b;
            $$6 = true;
         } else if (a($$5, $$2)) {
            int $$8 = $$2.g() - $$5.L();
            int $$9 = Math.min($$2.L(), $$8);
            $$2.h($$9);
            $$5.g($$9);
            $$6 = $$9 > 0;
         }

         if ($$6) {
            if ($$7 && $$1 instanceof dev $$10 && !$$10.v()) {
               int $$11 = 0;
               if ($$0 instanceof dev $$12 && $$10.l >= $$12.l) {
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
   private static bhu b(cqz $$0, ht $$1, dgb $$2) {
      hx $$3 = $$2.c(cxt.b);
      return a($$0, $$1.a($$3));
   }

   @Nullable
   private static bhu c(cqz $$0, deu $$1) {
      return a($$0, $$1.H(), $$1.I() + 1.0, $$1.K());
   }

   public static List<bzq> b(cqz $$0, deu $$1) {
      return $$1.ay_()
         .e()
         .stream()
         .flatMap($$2 -> $$0.a(bzq.class, $$2.d($$1.H() - 0.5, $$1.I() - 0.5, $$1.K() - 0.5), bjw.a).stream())
         .collect(Collectors.toList());
   }

   @Nullable
   public static bhu a(cqz $$0, ht $$1) {
      return a($$0, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5);
   }

   @Nullable
   private static bhu a(cqz $$0, double $$1, double $$2, double $$3) {
      bhu $$4 = null;
      ht $$5 = ht.a($$1, $$2, $$3);
      dgb $$6 = $$0.a_($$5);
      cua $$7 = $$6.b();
      if ($$7 instanceof bil) {
         $$4 = ((bil)$$7).a($$6, $$0, $$5);
      } else if ($$6.t()) {
         ddx $$8 = $$0.c_($$5);
         if ($$8 instanceof bhu) {
            $$4 = (bhu)$$8;
            if ($$4 instanceof dee && $$7 instanceof cvd) {
               $$4 = cvd.a((cvd)$$7, $$6, $$0, $$5, true);
            }
         }
      }

      if ($$4 == null) {
         List<bjt> $$9 = $$0.a((bjt)null, new eia($$1 - 0.5, $$2 - 0.5, $$3 - 0.5, $$1 + 0.5, $$2 + 0.5, $$3 + 0.5), bjw.d);
         if (!$$9.isEmpty()) {
            $$4 = (bhu)$$9.get($$0.z.a($$9.size()));
         }
      }

      return $$4;
   }

   private static boolean a(ckj $$0, ckj $$1) {
      return $$0.L() <= $$0.g() && ckj.c($$0, $$1);
   }

   @Override
   public double H() {
      return (double)this.p.u() + 0.5;
   }

   @Override
   public double I() {
      return (double)this.p.v() + 0.5;
   }

   @Override
   public double K() {
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
   protected il<ckj> f() {
      return this.j;
   }

   @Override
   protected void a(il<ckj> $$0) {
      this.j = $$0;
   }

   public static void a(cqz $$0, ht $$1, dgb $$2, bjt $$3, dev $$4) {
      if ($$3 instanceof bzq $$5 && !$$5.q().b() && eiv.c(eiv.a($$3.cG().d((double)(-$$1.u()), (double)(-$$1.v()), (double)(-$$1.w()))), $$4.ay_(), eij.i)) {
         a($$0, $$1, $$2, $$4, () -> a((bhu)$$4, $$5));
      }
   }

   @Override
   protected cfp a(int $$0, ccw $$1) {
      return new cgm($$0, $$1, this);
   }
}
