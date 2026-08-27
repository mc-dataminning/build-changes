import java.util.List;
import java.util.function.BooleanSupplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import javax.annotation.Nullable;

public class dgh extends dgm implements dgg {
   public static final int f = 8;
   public static final int g = 5;
   private ip<clo> h = ip.a(5, clo.b);
   private int i = -1;
   private long j;

   public dgh(hx $$0, dhn $$1) {
      super(dfk.r, $$0, $$1);
   }

   @Override
   public void a(sd $$0) {
      super.a($$0);
      this.h = ip.a(this.b(), clo.b);
      if (!this.c_($$0)) {
         biv.b($$0, this.h);
      }

      this.i = $$0.h("TransferCooldown");
   }

   @Override
   protected void b(sd $$0) {
      super.b($$0);
      if (!this.d_($$0)) {
         biv.a($$0, this.h);
      }

      $$0.a("TransferCooldown", this.i);
   }

   @Override
   public int b() {
      return this.h.size();
   }

   @Override
   public clo a(int $$0, int $$1) {
      this.e_(null);
      return biv.a(this.k(), $$0, $$1);
   }

   @Override
   public void a(int $$0, clo $$1) {
      this.e_(null);
      this.k().set($$0, $$1);
      if ($$1.L() > this.al_()) {
         $$1.f(this.al_());
      }
   }

   @Override
   protected uv l() {
      return uv.c("container.hopper");
   }

   public static void a(csf $$0, hx $$1, dhn $$2, dgh $$3) {
      $$3.i--;
      $$3.j = $$0.W();
      if (!$$3.w()) {
         $$3.c(0);
         a($$0, $$1, $$2, $$3, () -> a($$0, (dgg)$$3));
      }
   }

   private static boolean a(csf $$0, hx $$1, dhn $$2, dgh $$3, BooleanSupplier $$4) {
      if ($$0.B) {
         return false;
      } else {
         if (!$$3.w() && $$2.c(cyz.c)) {
            boolean $$5 = false;
            if (!$$3.aj_()) {
               $$5 = a($$0, $$1, $$2, (biu)$$3);
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
      for (clo $$0 : this.h) {
         if ($$0.b() || $$0.L() != $$0.g()) {
            return false;
         }
      }

      return true;
   }

   private static boolean a(csf $$0, hx $$1, dhn $$2, biu $$3) {
      biu $$4 = b($$0, $$1, $$2);
      if ($$4 == null) {
         return false;
      } else {
         ib $$5 = $$2.c(cyz.b).g();
         if (b($$4, $$5)) {
            return false;
         } else {
            for (int $$6 = 0; $$6 < $$3.b(); $$6++) {
               if (!$$3.a($$6).b()) {
                  clo $$7 = $$3.a($$6).p();
                  clo $$8 = a($$3, $$4, $$3.a($$6, 1), $$5);
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

   private static IntStream a(biu $$0, ib $$1) {
      return $$0 instanceof bjm ? IntStream.of(((bjm)$$0).a($$1)) : IntStream.range(0, $$0.b());
   }

   private static boolean b(biu $$0, ib $$1) {
      return a($$0, $$1).allMatch($$1x -> {
         clo $$2 = $$0.a($$1x);
         return $$2.L() >= $$2.g();
      });
   }

   private static boolean c(biu $$0, ib $$1) {
      return a($$0, $$1).allMatch($$1x -> $$0.a($$1x).b());
   }

   public static boolean a(csf $$0, dgg $$1) {
      biu $$2 = c($$0, $$1);
      if ($$2 != null) {
         ib $$3 = ib.a;
         return c($$2, $$3) ? false : a($$2, $$3).anyMatch($$3x -> a($$1, $$2, $$3x, $$3));
      } else {
         for (cas $$4 : b($$0, $$1)) {
            if (a($$1, $$4)) {
               return true;
            }
         }

         return false;
      }
   }

   private static boolean a(dgg $$0, biu $$1, int $$2, ib $$3) {
      clo $$4 = $$1.a($$2);
      if (!$$4.b() && a($$0, $$1, $$4, $$2, $$3)) {
         clo $$5 = $$4.p();
         clo $$6 = a($$1, $$0, $$1.a($$2, 1), null);
         if ($$6.b()) {
            $$1.e();
            return true;
         }

         $$1.a($$2, $$5);
      }

      return false;
   }

   public static boolean a(biu $$0, cas $$1) {
      boolean $$2 = false;
      clo $$3 = $$1.q().p();
      clo $$4 = a(null, $$0, $$3, null);
      if ($$4.b()) {
         $$2 = true;
         $$1.a(clo.b);
         $$1.am();
      } else {
         $$1.a($$4);
      }

      return $$2;
   }

   public static clo a(@Nullable biu $$0, biu $$1, clo $$2, @Nullable ib $$3) {
      if ($$1 instanceof bjm $$4 && $$3 != null) {
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

   private static boolean a(biu $$0, clo $$1, int $$2, @Nullable ib $$3) {
      if (!$$0.b($$2, $$1)) {
         return false;
      } else {
         if ($$0 instanceof bjm $$4 && !$$4.a($$2, $$1, $$3)) {
            return false;
         }

         return true;
      }
   }

   private static boolean a(biu $$0, biu $$1, clo $$2, int $$3, ib $$4) {
      if (!$$1.a($$0, $$3, $$2)) {
         return false;
      } else {
         if ($$1 instanceof bjm $$5 && !$$5.b($$3, $$2, $$4)) {
            return false;
         }

         return true;
      }
   }

   private static clo b(@Nullable biu $$0, biu $$1, clo $$2, int $$3, @Nullable ib $$4) {
      clo $$5 = $$1.a($$3);
      if (a($$1, $$2, $$3, $$4)) {
         boolean $$6 = false;
         boolean $$7 = $$1.aj_();
         if ($$5.b()) {
            $$1.a($$3, $$2);
            $$2 = clo.b;
            $$6 = true;
         } else if (a($$5, $$2)) {
            int $$8 = $$2.g() - $$5.L();
            int $$9 = Math.min($$2.L(), $$8);
            $$2.h($$9);
            $$5.g($$9);
            $$6 = $$9 > 0;
         }

         if ($$6) {
            if ($$7 && $$1 instanceof dgh $$10 && !$$10.x()) {
               int $$11 = 0;
               if ($$0 instanceof dgh $$12 && $$10.j >= $$12.j) {
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
   private static biu b(csf $$0, hx $$1, dhn $$2) {
      ib $$3 = $$2.c(cyz.b);
      return a($$0, $$1.a($$3));
   }

   @Nullable
   private static biu c(csf $$0, dgg $$1) {
      return a($$0, $$1.I(), $$1.J() + 1.0, $$1.K());
   }

   public static List<cas> b(csf $$0, dgg $$1) {
      return $$1.ak_()
         .e()
         .stream()
         .flatMap($$2 -> $$0.a(cas.class, $$2.d($$1.I() - 0.5, $$1.J() - 0.5, $$1.K() - 0.5), bky.a).stream())
         .collect(Collectors.toList());
   }

   @Nullable
   public static biu a(csf $$0, hx $$1) {
      return a($$0, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5);
   }

   @Nullable
   private static biu a(csf $$0, double $$1, double $$2, double $$3) {
      biu $$4 = null;
      hx $$5 = hx.a($$1, $$2, $$3);
      dhn $$6 = $$0.a_($$5);
      cvf $$7 = $$6.b();
      if ($$7 instanceof bjn) {
         $$4 = ((bjn)$$7).a($$6, $$0, $$5);
      } else if ($$6.t()) {
         dfi $$8 = $$0.c_($$5);
         if ($$8 instanceof biu) {
            $$4 = (biu)$$8;
            if ($$4 instanceof dfp && $$7 instanceof cwi) {
               $$4 = cwi.a((cwi)$$7, $$6, $$0, $$5, true);
            }
         }
      }

      if ($$4 == null) {
         List<bkv> $$9 = $$0.a((bkv)null, new eju($$1 - 0.5, $$2 - 0.5, $$3 - 0.5, $$1 + 0.5, $$2 + 0.5, $$3 + 0.5), bky.d);
         if (!$$9.isEmpty()) {
            $$4 = (biu)$$9.get($$0.z.a($$9.size()));
         }
      }

      return $$4;
   }

   private static boolean a(clo $$0, clo $$1) {
      return $$0.L() <= $$0.g() && clo.c($$0, $$1);
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
   protected ip<clo> k() {
      return this.h;
   }

   @Override
   protected void a(ip<clo> $$0) {
      this.h = $$0;
   }

   public static void a(csf $$0, hx $$1, dhn $$2, bkv $$3, dgh $$4) {
      if ($$3 instanceof cas $$5 && !$$5.q().b() && ekp.c(ekp.a($$3.cH().d((double)(-$$1.u()), (double)(-$$1.v()), (double)(-$$1.w()))), $$4.ak_(), ekd.i)) {
         a($$0, $$1, $$2, $$4, () -> a((biu)$$4, $$5));
      }
   }

   @Override
   protected cgr a(int $$0, cdy $$1) {
      return new chq($$0, $$1, this);
   }
}
