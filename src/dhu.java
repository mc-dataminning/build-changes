import java.util.List;
import java.util.function.BooleanSupplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import javax.annotation.Nullable;

public class dhu extends dhz implements dht {
   public static final int f = 8;
   public static final int g = 5;
   private iq<cmy> h = iq.a(5, cmy.f);
   private int i = -1;
   private long j;

   public dhu(hx $$0, djh $$1) {
      super(dgx.r, $$0, $$1);
   }

   @Override
   public void a(sn $$0) {
      super.a($$0);
      this.h = iq.a(this.b(), cmy.f);
      if (!this.c_($$0)) {
         bjv.b($$0, this.h);
      }

      this.i = $$0.h("TransferCooldown");
   }

   @Override
   protected void b(sn $$0) {
      super.b($$0);
      if (!this.d_($$0)) {
         bjv.a($$0, this.h);
      }

      $$0.a("TransferCooldown", this.i);
   }

   @Override
   public int b() {
      return this.h.size();
   }

   @Override
   public cmy a(int $$0, int $$1) {
      this.e_(null);
      return bjv.a(this.k(), $$0, $$1);
   }

   @Override
   public void a(int $$0, cmy $$1) {
      this.e_(null);
      this.k().set($$0, $$1);
      if ($$1.L() > this.ak_()) {
         $$1.f(this.ak_());
      }
   }

   @Override
   protected vf l() {
      return vf.c("container.hopper");
   }

   public static void a(ctp $$0, hx $$1, djh $$2, dhu $$3) {
      $$3.i--;
      $$3.j = $$0.X();
      if (!$$3.w()) {
         $$3.c(0);
         a($$0, $$1, $$2, $$3, () -> a($$0, (dht)$$3));
      }
   }

   private static boolean a(ctp $$0, hx $$1, djh $$2, dhu $$3, BooleanSupplier $$4) {
      if ($$0.B) {
         return false;
      } else {
         if (!$$3.w() && $$2.c(dak.c)) {
            boolean $$5 = false;
            if (!$$3.ai_()) {
               $$5 = a($$0, $$1, $$2, (bju)$$3);
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
      for (cmy $$0 : this.h) {
         if ($$0.b() || $$0.L() != $$0.g()) {
            return false;
         }
      }

      return true;
   }

   private static boolean a(ctp $$0, hx $$1, djh $$2, bju $$3) {
      bju $$4 = b($$0, $$1, $$2);
      if ($$4 == null) {
         return false;
      } else {
         ic $$5 = $$2.c(dak.b).g();
         if (b($$4, $$5)) {
            return false;
         } else {
            for (int $$6 = 0; $$6 < $$3.b(); $$6++) {
               if (!$$3.a($$6).b()) {
                  cmy $$7 = $$3.a($$6).p();
                  cmy $$8 = a($$3, $$4, $$3.a($$6, 1), $$5);
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

   private static IntStream a(bju $$0, ic $$1) {
      return $$0 instanceof bkm ? IntStream.of(((bkm)$$0).a($$1)) : IntStream.range(0, $$0.b());
   }

   private static boolean b(bju $$0, ic $$1) {
      return a($$0, $$1).allMatch($$1x -> {
         cmy $$2 = $$0.a($$1x);
         return $$2.L() >= $$2.g();
      });
   }

   private static boolean c(bju $$0, ic $$1) {
      return a($$0, $$1).allMatch($$1x -> $$0.a($$1x).b());
   }

   public static boolean a(ctp $$0, dht $$1) {
      bju $$2 = c($$0, $$1);
      if ($$2 != null) {
         ic $$3 = ic.a;
         return c($$2, $$3) ? false : a($$2, $$3).anyMatch($$3x -> a($$1, $$2, $$3x, $$3));
      } else {
         for (cbu $$4 : b($$0, $$1)) {
            if (a($$1, $$4)) {
               return true;
            }
         }

         return false;
      }
   }

   private static boolean a(dht $$0, bju $$1, int $$2, ic $$3) {
      cmy $$4 = $$1.a($$2);
      if (!$$4.b() && a($$0, $$1, $$4, $$2, $$3)) {
         cmy $$5 = $$4.p();
         cmy $$6 = a($$1, $$0, $$1.a($$2, 1), null);
         if ($$6.b()) {
            $$1.e();
            return true;
         }

         $$1.a($$2, $$5);
      }

      return false;
   }

   public static boolean a(bju $$0, cbu $$1) {
      boolean $$2 = false;
      cmy $$3 = $$1.q().p();
      cmy $$4 = a(null, $$0, $$3, null);
      if ($$4.b()) {
         $$2 = true;
         $$1.a(cmy.f);
         $$1.am();
      } else {
         $$1.a($$4);
      }

      return $$2;
   }

   public static cmy a(@Nullable bju $$0, bju $$1, cmy $$2, @Nullable ic $$3) {
      if ($$1 instanceof bkm $$4 && $$3 != null) {
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

   private static boolean a(bju $$0, cmy $$1, int $$2, @Nullable ic $$3) {
      if (!$$0.b($$2, $$1)) {
         return false;
      } else {
         if ($$0 instanceof bkm $$4 && !$$4.a($$2, $$1, $$3)) {
            return false;
         }

         return true;
      }
   }

   private static boolean a(bju $$0, bju $$1, cmy $$2, int $$3, ic $$4) {
      if (!$$1.a($$0, $$3, $$2)) {
         return false;
      } else {
         if ($$1 instanceof bkm $$5 && !$$5.b($$3, $$2, $$4)) {
            return false;
         }

         return true;
      }
   }

   private static cmy b(@Nullable bju $$0, bju $$1, cmy $$2, int $$3, @Nullable ic $$4) {
      cmy $$5 = $$1.a($$3);
      if (a($$1, $$2, $$3, $$4)) {
         boolean $$6 = false;
         boolean $$7 = $$1.ai_();
         if ($$5.b()) {
            $$1.a($$3, $$2);
            $$2 = cmy.f;
            $$6 = true;
         } else if (a($$5, $$2)) {
            int $$8 = $$2.g() - $$5.L();
            int $$9 = Math.min($$2.L(), $$8);
            $$2.h($$9);
            $$5.g($$9);
            $$6 = $$9 > 0;
         }

         if ($$6) {
            if ($$7 && $$1 instanceof dhu $$10 && !$$10.x()) {
               int $$11 = 0;
               if ($$0 instanceof dhu $$12 && $$10.j >= $$12.j) {
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
   private static bju b(ctp $$0, hx $$1, djh $$2) {
      ic $$3 = $$2.c(dak.b);
      return a($$0, $$1.a($$3));
   }

   @Nullable
   private static bju c(ctp $$0, dht $$1) {
      return a($$0, $$1.I(), $$1.J() + 1.0, $$1.K());
   }

   public static List<cbu> b(ctp $$0, dht $$1) {
      return $$1.aj_()
         .e()
         .stream()
         .flatMap($$2 -> $$0.a(cbu.class, $$2.d($$1.I() - 0.5, $$1.J() - 0.5, $$1.K() - 0.5), bly.a).stream())
         .collect(Collectors.toList());
   }

   @Nullable
   public static bju a(ctp $$0, hx $$1) {
      return a($$0, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5);
   }

   @Nullable
   private static bju a(ctp $$0, double $$1, double $$2, double $$3) {
      bju $$4 = null;
      hx $$5 = hx.a($$1, $$2, $$3);
      djh $$6 = $$0.a_($$5);
      cwq $$7 = $$6.b();
      if ($$7 instanceof bkn) {
         $$4 = ((bkn)$$7).a($$6, $$0, $$5);
      } else if ($$6.t()) {
         dgv $$8 = $$0.c_($$5);
         if ($$8 instanceof bju) {
            $$4 = (bju)$$8;
            if ($$4 instanceof dhc && $$7 instanceof cxt) {
               $$4 = cxt.a((cxt)$$7, $$6, $$0, $$5, true);
            }
         }
      }

      if ($$4 == null) {
         List<blv> $$9 = $$0.a((blv)null, new elo($$1 - 0.5, $$2 - 0.5, $$3 - 0.5, $$1 + 0.5, $$2 + 0.5, $$3 + 0.5), bly.d);
         if (!$$9.isEmpty()) {
            $$4 = (bju)$$9.get($$0.z.a($$9.size()));
         }
      }

      return $$4;
   }

   private static boolean a(cmy $$0, cmy $$1) {
      return $$0.L() <= $$0.g() && cmy.c($$0, $$1);
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
   protected iq<cmy> k() {
      return this.h;
   }

   @Override
   protected void a(iq<cmy> $$0) {
      this.h = $$0;
   }

   public static void a(ctp $$0, hx $$1, djh $$2, blv $$3, dhu $$4) {
      if ($$3 instanceof cbu $$5 && !$$5.q().b() && emj.c(emj.a($$3.cH().d((double)(-$$1.u()), (double)(-$$1.v()), (double)(-$$1.w()))), $$4.aj_(), elx.i)) {
         a($$0, $$1, $$2, $$4, () -> a((bju)$$4, $$5));
      }
   }

   @Override
   protected cib a(int $$0, cfh $$1) {
      return new cja($$0, $$1, this);
   }
}
